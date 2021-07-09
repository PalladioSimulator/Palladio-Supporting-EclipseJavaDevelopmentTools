/*******************************************************************************
 * Copyright (c) 2006-2015
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Dresden, Amtsgericht Dresden, HRB 34001
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Dresden, Germany
 *      - initial API and implementation
 *   Martin Armbruster
 *      - Extension for loading the standard library in Java 9+
 ******************************************************************************/

package org.emftext.language.java;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.zip.ZipFile;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.emftext.language.java.classifiers.ClassifiersFactory;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.containers.JavaRoot;
import org.emftext.language.java.members.Member;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * This class is responsible for managing and retrieving Java resources to establish inter-model references between
 * different Java classes represented as EMF-models.
 */
public class JavaClasspath {
	/**
	 * Singleton instance.
	 */
	private static JavaClasspath globalClasspath = null;

	public static JavaClasspath get() {
		if (globalClasspath == null) {
			globalClasspath = new JavaClasspath();
			globalClasspath.registerStdLib();
		}
		return globalClasspath;
	}
	
	private HashSet<org.emftext.language.java.containers.Module> modules = new HashSet<>();
	private HashSet<org.emftext.language.java.containers.Package> packages = new HashSet<>();
	private HashSet<ConcreteClassifier> classifiers = new HashSet<>();
	private Map<String, Set<String>> packageClassifierMap = new LinkedHashMap<>();

	public void clear() {
		modules.clear();
		packages.clear();
		classifiers.clear();
		packageClassifierMap.clear();
		for (Iterator<Map.Entry<URI, URI>> iter = getURIMap().entrySet().iterator();
				iter.hasNext();) {
			String fileExt = iter.next().getKey().fileExtension();
			if ("java".equals(fileExt) || "class".equals(fileExt)) {
				iter.remove();
			}
		}
	}
	
	public void registerJavaRoot(JavaRoot root, URI physicalUri) {
		if (root instanceof CompilationUnit) {
			registerClassifier((CompilationUnit) root, physicalUri);
		} else if (root instanceof org.emftext.language.java.containers.Package) {
			registerPackage((org.emftext.language.java.containers.Package) root, physicalUri);
		} else if (root instanceof org.emftext.language.java.containers.Module) {
			registerModule((org.emftext.language.java.containers.Module) root, physicalUri);
		}
	}

	public void registerPackage(org.emftext.language.java.containers.Package pack,
			URI physicalUri) {
		packages.add(pack);
		URI logicalURI = LogicalJavaURIGenerator.getPackageURI(pack.getNamespacesAsString());
		updateMapping(logicalURI, physicalUri);
		List<String> names = pack.getNamespaces();
		StringBuilder parentName = new StringBuilder();
		registerPackage("");
		for (int index = 0; index < names.size() - 1; index++) {
			parentName.append(names.get(index));
			parentName.append(LogicalJavaURIGenerator.PACKAGE_SEPARATOR);
			String parentNameString = parentName.toString();
			if (getPackage(parentNameString) == null) {
				registerPackage(parentNameString);
			}
		}
	}
	
	public void registerPackage(String packageName, URI physicalUri) {
		org.emftext.language.java.containers.Package pack = getPackage(packageName);
		if (pack != null) {
			registerPackage(pack, physicalUri);
		} else {
			updateMapping(LogicalJavaURIGenerator.getPackageURI(packageName), physicalUri);
		}
	}

	public void registerModule(org.emftext.language.java.containers.Module module,
			URI physicalUri) {
		modules.add(module);
		URI logicalURI = LogicalJavaURIGenerator.getModuleURI(module.getNamespacesAsString());
		updateMapping(logicalURI, physicalUri);
	}
	
	public void registerModule(String moduleName, URI physicalUri) {
		org.emftext.language.java.containers.Module mod = getModule(moduleName);
		if (mod != null) {
			registerModule(mod, physicalUri);
		} else {
			updateMapping(LogicalJavaURIGenerator.getModuleURI(moduleName), physicalUri);
		}
	}
	
	public org.emftext.language.java.containers.Package getPackage(String packageName) {
		return packages.stream().filter(p -> p.getNamespacesAsString().equals(packageName)).findFirst().orElse(null);
	}
	
	public org.emftext.language.java.containers.Module getModule(String moduleName) {
		return modules.stream().filter(m -> m.getNamespacesAsString().equals(moduleName)).findFirst().orElse(null);
	}
	
	public ConcreteClassifier getConcreteClassifier(String fullQualifiedClassifierName) {
		String actualName;
		if (fullQualifiedClassifierName.startsWith(LogicalJavaURIGenerator.PACKAGE_SEPARATOR)) {
			actualName = fullQualifiedClassifierName.substring(1);
		} else {
			actualName = fullQualifiedClassifierName;
		}
		String potSecondName = actualName.replaceAll("\\" + LogicalJavaURIGenerator.CLASSIFIER_SEPARATOR,
				LogicalJavaURIGenerator.PACKAGE_SEPARATOR);
		return classifiers.stream().filter(c -> c.getQualifiedName().equals(actualName)
				|| c.getQualifiedName().equals(potSecondName))
			.findFirst().orElse(getProxyConcreteClassifier(potSecondName));
	}
	
	public Collection<ConcreteClassifier> getConcreteClassifiers(String packageName) {
		String actualPackName = checkPackageName(packageName);
		return this.getPackageContents(actualPackName).stream().map(c -> actualPackName + c)
			.map(this::getConcreteClassifier).filter(c -> c != null).collect(Collectors.toList());
	}
	
	private ConcreteClassifier getProxyConcreteClassifier(String fullQualifiedClassifierName) {
		ConcreteClassifier result = ClassifiersFactory.eINSTANCE.createClass();
		((InternalEObject) result).eSetProxyURI(LogicalJavaURIGenerator.getClassifierURI(fullQualifiedClassifierName));
		result.setName(LogicalJavaURIGenerator.getSimpleClassName(fullQualifiedClassifierName));
		return result;
	}
	
	/**
	 * Registers all classes of the Java standard library (<code>src.zip</code> for Java 9+)
	 * located at <code>System.getProperty("java.home")</code>.
	 */
	public void registerStdLib() {
		String classpath = System.getProperty("java.home") + File.separator + "lib" + File.separator + "src.zip";
		internalRegisterJDK9AndUpSrcZip(URI.createFileURI(classpath));
	}
	
	/**
	 * Registers the standard library and JDK classes for JDK 9+ based on the "<JAVA_HOME>/lib/src.zip" file.
	 * 
	 * @param zipURI URI pointing to the zip file containing the source files of the JDK.
	 */
	private void internalRegisterJDK9AndUpSrcZip(URI zipURI) {
		registerZip(zipURI, true);
	}
	
	/**
	 * Registers all source and class files within a zip file.
	 * 
	 * @param zipURI URI pointing to the zip file.
	 */
	public void registerZip(URI zipURI) {
		registerZip(zipURI, false);
	}
	
	/**
	 * Registers all source and class files within a zip file.
	 * 
	 * @param zipURI URI pointing to the zip file containing source and class files.
	 * @param isJDK true if the zip file contains the sources of the JDK. false otherwise.
	 */
	private void registerZip(URI zipURI, boolean isJDK) {
		try (ZipFile zipFile = new ZipFile(zipURI.toFileString())) {
			
			zipFile.stream().filter(entry -> entry.getName().endsWith(LogicalJavaURIGenerator.JAVA_FILE_EXTENSION)
					|| entry.getName().endsWith(LogicalJavaURIGenerator.JAVA_CLASS_FILE_EXTENSION))
				.forEach(entry -> {
					
					String entryName = entry.getName();
					String uri = "archive:" + zipURI.toString() + "!/" + entryName;
					URI physicalURI = URI.createURI(uri);
					// The entry name has the form "<module name>/<package>/<file name>.java"
					// if the file is within the JDK where module name contains only "." as separator,
					// package contains "/" as separator and file name
					// is a simple name.
					
					if (isJDK && entryName.endsWith(LogicalJavaURIGenerator.JAVA_MODULE_FILE_NAME)) {
						// Remove the file name.
						String modName = entryName.substring(0, entryName.indexOf("/"));
						registerModule(modName, physicalURI);
					} else if (entryName.endsWith(LogicalJavaURIGenerator.JAVA_PACKAGE_FILE_NAME)) {
						// Extract the package part.
						int firstIndex = isJDK ? entryName.indexOf("/") + 1 : 0;
						int lastIndex = entryName.lastIndexOf("/");
						String packName = entryName.substring(firstIndex, lastIndex)
								.replace("/", LogicalJavaURIGenerator.PACKAGE_SEPARATOR);
						registerPackage(packName, physicalURI);
					} else {
						// Remove the module name if the file is in the JDK.
						String fullName =
							(isJDK ? entryName.substring(entryName.indexOf("/") + 1) : entryName)
							.replace("/", LogicalJavaURIGenerator.PACKAGE_SEPARATOR);
						
						int lastDotIndex = fullName.lastIndexOf(
								LogicalJavaURIGenerator.PACKAGE_SEPARATOR);
						fullName = fullName.substring(0, lastDotIndex);
						int preLastDotIndex = fullName.lastIndexOf(
								LogicalJavaURIGenerator.PACKAGE_SEPARATOR);
						
						String packageName = "";
						String className = fullName;
						
						if (preLastDotIndex >= 0) {
							packageName = fullName.substring(0, preLastDotIndex);
							className = fullName.substring(preLastDotIndex + 1);
						}
						registerClassifier(packageName, className, physicalURI);
					}
				});
			
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Error in processing the zip file: " + zipURI.toFileString());
		}
	}
	
	private Set<String> registerPackage(String packageName) {
		packageName = checkPackageName(packageName);
		Set<String> classesInPackage = packageClassifierMap.get(packageName);
		if (classesInPackage == null) {
			classesInPackage = new HashSet<String>();
			packageClassifierMap.put(packageName, classesInPackage);
		}
		return classesInPackage;
	}
	
	private void registerPackage(String packageName, String className) {
		Set<String> classesInPackage = registerPackage(packageName);
	
		if (!classesInPackage.contains(className)) {
			classesInPackage.add(className);
		}
	}
	
	private void unRegisterPackage(String packageName, String className) {
		packageName = checkPackageName(packageName);
		if (packageClassifierMap.containsKey(packageName)) {
			packageClassifierMap.get(packageName).remove(className);
		}
	}
	
	private List<String> getPackageContents(String packageName) {
		packageName = checkPackageName(packageName);
		List<String> content = new UniqueEList<String>();
		if (packageClassifierMap.containsKey(packageName)) {
			content.addAll(packageClassifierMap.get(packageName));
		}
		return content;
	}
	
	public boolean existsPackage(String packageName) {
		packageName = checkPackageName(packageName);
		return packageClassifierMap.containsKey(packageName);
	}
	
	public Map<URI, URI> getURIMap() {
		return URIConverter.URI_MAP;
	}
	
	private void updateMapping(URI logicalURI, URI physicalURI) {
		getURIMap().put(logicalURI, physicalURI);
	}
	
	private void removeMapping(URI logicalURI) {
		getURIMap().remove(logicalURI);
	}
	
	/**
	 * Registers all classes defined in the given compilation unit.
	 *
	 * @param compilationUnit the given compilation unit.
	 * @param uri the physical URI of the compilation unit.
	 */
	public void registerClassifier(CompilationUnit compilationUnit, URI uri) {
		String packageName = LogicalJavaURIGenerator.packageName(compilationUnit);
		for (ConcreteClassifier classifier : compilationUnit.getClassifiers()) {
			this.classifiers.add(classifier);
			registerClassifier(packageName, classifier.getName(), uri);
			registerInnerClassifiers(classifier, packageName, classifier.getName(), uri);
		}
	}

	/**
	 * Registers the classifier with the given name and package that is physically located at the given URI. If there is
	 * already a classifier registered for the given class name, the old one is replaced with the new one.
	 * 
	 * @param packageName
	 *            the name of the package that contains the classifier.
	 * @param classifierName
	 *            the simple name of the classifier.
	 * @param physicalURI
	 *            the URI where the classifier can be found (class or source file).
	 */
	public void registerClassifier(String packageName, String classifierName, URI physicalURI) {
		if (classifierName == null || physicalURI == null) {
			return;
		}
		packageName = checkPackageName(packageName);

		String innerName = classifierName;
		String outerName = "";
		String qualifiedName = packageName;

		int idx = classifierName.lastIndexOf(LogicalJavaURIGenerator.CLASSIFIER_SEPARATOR);
		if (idx >= 0) {
			// The classifier name contains a "$"
			int indexPlusOne = idx + 1;
			innerName = classifierName.substring(indexPlusOne);
			outerName = classifierName.substring(0, indexPlusOne);
			if (LogicalJavaURIGenerator.PACKAGE_SEPARATOR.equals(packageName)) {
				qualifiedName = outerName;
			} else {
				qualifiedName = packageName + outerName;
			}
		}

		synchronized (this) {
			registerPackage(qualifiedName.replaceAll("\\" + LogicalJavaURIGenerator.CLASSIFIER_SEPARATOR,
					LogicalJavaURIGenerator.PACKAGE_SEPARATOR), innerName);

			final String qualifiedClassifierName;
			if (LogicalJavaURIGenerator.PACKAGE_SEPARATOR.equals(packageName)) {
				qualifiedClassifierName = classifierName;
			} else {
				qualifiedClassifierName = packageName + classifierName;
			}

			URI logicalURI = LogicalJavaURIGenerator.getJavaFileResourceURI(qualifiedClassifierName
					.replaceAll("\\" + LogicalJavaURIGenerator.CLASSIFIER_SEPARATOR,
							LogicalJavaURIGenerator.PACKAGE_SEPARATOR));

			URI existingMapping = getURIMap().get(logicalURI);

			if (existingMapping != null && !physicalURI.equals(existingMapping)) {
				// Do nothing: Silently replace old with new version.
			}

			updateMapping(logicalURI, physicalURI);

			String outerPackage = qualifiedName;
			while (outerPackage.endsWith("$")) {
				// Make sure outer classes are registered;
				// This is required when class names contain $ symbols.
				outerPackage = outerPackage.substring(0, outerPackage.length() - 1);
				idx = outerPackage.lastIndexOf("$");
				if (idx == -1) {
					idx = outerPackage.lastIndexOf(".");
				}

				int indexPlusOne = idx + 1;
				String outerClassifier = outerPackage.substring(indexPlusOne);
				outerPackage = outerPackage.substring(0, indexPlusOne);
				outerPackage = checkPackageName(outerPackage);

				registerPackage(outerPackage.replaceAll("\\" + LogicalJavaURIGenerator.CLASSIFIER_SEPARATOR,
						LogicalJavaURIGenerator.PACKAGE_SEPARATOR), outerClassifier);
			}
		}
	}

	private void registerInnerClassifiers(ConcreteClassifier classifier, String packageName, String className, URI uri) {
		for (Member innerCand : classifier.getMembers()) {
			if (innerCand instanceof ConcreteClassifier) {
				this.classifiers.add((ConcreteClassifier) innerCand);
				String newClassName = className + LogicalJavaURIGenerator.CLASSIFIER_SEPARATOR
						+ innerCand.getName();
				registerClassifier(packageName, newClassName, uri);
				registerInnerClassifiers((ConcreteClassifier) innerCand, packageName, newClassName, uri);
			}
		}
	}

	/**
	 * Removes the classifier identified by its package and name from the class path.
	 *
	 * @param packageName name of the package.
	 * @param classifierName name of the classifier.
	 */
	public void unRegisterClassifier(String packageName, String classifierName) {
		if (classifierName == null || classifierName.equals("")) {
			return;
		}

		packageName = checkPackageName(packageName);

		String innerName = classifierName;
		String outerName = "";
		String qualifiedName = packageName;

		int idx = classifierName.lastIndexOf(LogicalJavaURIGenerator.CLASSIFIER_SEPARATOR);
		if (idx >= 0) {
			innerName = classifierName.substring(idx + 1);
			outerName = classifierName.substring(0, idx + 1);
			if (LogicalJavaURIGenerator.PACKAGE_SEPARATOR.equals(packageName)) {
				qualifiedName = outerName;
			} else {
				qualifiedName = packageName + outerName;
			}
		}

		synchronized (this) {
			unRegisterPackage(qualifiedName, innerName);

			String fullName = null;
			if (LogicalJavaURIGenerator.PACKAGE_SEPARATOR.equals(packageName)) {
				fullName = classifierName;
			} else {
				fullName = packageName + classifierName;
			}

			URI logicalUri = LogicalJavaURIGenerator.getJavaFileResourceURI(fullName);

			removeMapping(logicalUri);
		}
	}
	
	public boolean isPackageRegistered(String packageName) {
		packageName = checkPackageName(packageName);
		return this.packageClassifierMap.containsKey(packageName);
	}

	public boolean isRegistered(String fullQualifiedName) {
		int idx = fullQualifiedName.lastIndexOf(LogicalJavaURIGenerator.CLASSIFIER_SEPARATOR);
		if (idx == -1) {
			idx = fullQualifiedName.lastIndexOf(LogicalJavaURIGenerator.PACKAGE_SEPARATOR);
		}
		String containerName = fullQualifiedName.substring(0, idx + 1);
		String classifierName = fullQualifiedName.substring(idx + 1);
		List<String> containerContent = getPackageContents(containerName);
		if (containerContent == null) {
			return false;
		}
		return containerContent.contains(classifierName);
	}
	
	private String checkPackageName(String packageName) {
		if (!packageName.endsWith(LogicalJavaURIGenerator.PACKAGE_SEPARATOR)
			&& !packageName.endsWith(LogicalJavaURIGenerator.CLASSIFIER_SEPARATOR)) {
			return packageName + ".";
		}
		return packageName;
	}
}
