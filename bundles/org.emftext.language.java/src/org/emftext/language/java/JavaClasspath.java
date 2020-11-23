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

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.containers.CompilationUnit;

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
		}
		return globalClasspath;
	}
	
	private HashSet<org.emftext.language.java.containers.Module> modules = new HashSet<>();
	private HashSet<org.emftext.language.java.containers.Package> packages = new HashSet<>();
	private HashSet<ConcreteClassifier> classifiers = new HashSet<>();

	public void clear() {
		modules.clear();
		packages.clear();
		classifiers.clear();
	}

	public void registerPackage(org.emftext.language.java.containers.Package pack) {
		packages.add(pack);
	}

	public void registerModule(org.emftext.language.java.containers.Module module) {
		modules.add(module);
	}
	
	public void registerConcreteClassifier(org.emftext.language.java.classifiers.ConcreteClassifier classifier) {
		classifiers.add(classifier);
	}
	
	public org.emftext.language.java.containers.Package getPackage(String packageName) {
		return packages.stream().filter(p -> p.getNamespacesAsString().equals(packageName)).findFirst().orElse(null);
	}
	
	public org.emftext.language.java.containers.Module getModule(String moduleName) {
		return modules.stream().filter(m -> m.getNamespacesAsString().equals(moduleName)).findFirst().orElse(null);
	}
	
	public ConcreteClassifier getConcreteClassifier(URI uri) {
		return classifiers.stream().filter(c -> {
			if (c.eResource() != null) {
				if (c.eResource().getURI().toString().equals(uri.toString())) {
					return true;
				}
			}
			return false;
		}).findFirst().orElse(null);
	}
	
	public ConcreteClassifier getConcreteClassifier(String fullQualifiedClassifierName) {
		return classifiers.stream().filter(c -> c.getQualifiedName().equals(fullQualifiedClassifierName)).findFirst().orElse(null);
	}
	
	public Collection<ConcreteClassifier> getConcreteClassifiers(String packageName) {
		return classifiers.stream().filter(c -> c.getQualifiedName().startsWith(packageName)).collect(Collectors.toList());
	}
	
	public ConcreteClassifier getFirstConcreteClassifier(String simpleClassifierName) {
		return classifiers.stream().filter(c -> c.getName().equals(simpleClassifierName)).findFirst().orElse(null);
	}
	
	public CompilationUnit getCompilationUnit(String fullQualifiedClassifierName) {
		ConcreteClassifier classifier = getConcreteClassifier(fullQualifiedClassifierName);
		if (classifier != null) {
			while (classifier.eContainer() != null && !(classifier.eContainer() instanceof CompilationUnit)) {
				classifier = (ConcreteClassifier) classifier.eContainer();
			}
			if (classifier.eContainer() != null) {
				return (CompilationUnit) classifier.eContainer();
			}
		}
		return null;
	}
	
	public Resource getResource(URI resourceURI) {
		ConcreteClassifier classifier = getConcreteClassifier(resourceURI);
		if (classifier != null) {
			return classifier.eResource();
		}
		org.emftext.language.java.containers.Package pack = packages.stream().filter(p -> p.eResource() != null)
			.filter(p -> p.eResource().getURI().toString().equals(resourceURI.toString()))
			.findFirst().orElse(null);
		if (pack != null) {
			return pack.eResource();
		}
		org.emftext.language.java.containers.Module mod = modules.stream().filter(m -> m.eResource() != null)
			.filter(m -> m.eResource().getURI().toString().equals(resourceURI.toString()))
			.findFirst().orElse(null);
		if (mod != null) {
			return mod.eResource();
		}
		return null;
	}
}
