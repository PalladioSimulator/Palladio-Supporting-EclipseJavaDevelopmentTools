/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.emftext.language.java.resolver;

import java.util.List;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emftext.language.java.JavaClasspath;
import org.emftext.language.java.LogicalJavaURIGenerator;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.imports.Import;
import org.emftext.language.java.resolver.result.IJavaReferenceResolveResult;

public class ClassifierImportClassifierReferenceResolver implements
	IJavaReferenceResolver<Import, ConcreteClassifier> {
	@Override
	public void resolve(String identifier, Import theImport, EReference reference, int position,
			IJavaReferenceResolveResult<ConcreteClassifier> result) {
		ConcreteClassifier importedClassifier = theImport.getImportedClassifier(identifier);
		if (importedClassifier != null) {
			if (importedClassifier.eIsProxy()) {
				importedClassifier = (ConcreteClassifier) EcoreUtil.resolve(importedClassifier, theImport.eResource());
			}
			if (importedClassifier.eIsProxy()) {
				StringBuilder builder = new StringBuilder();
				List<String> namespaces = theImport.getNamespaces();
				for (int i = namespaces.size() - 1; i >= 0; i--) {
					builder.delete(0, builder.length());
					for (int j = 0; j < i; j++) {
						builder.append(namespaces.get(j));
						builder.append(LogicalJavaURIGenerator.PACKAGE_SEPARATOR);
					}
					for (int j = i; j < namespaces.size(); j++) {
						builder.append(namespaces.get(j));
						builder.append(LogicalJavaURIGenerator.CLASSIFIER_SEPARATOR);
					}
					builder.append(identifier);
					importedClassifier = (ConcreteClassifier) EcoreUtil.resolve(
						JavaClasspath.get().getConcreteClassifier(builder.toString()),
						theImport.eResource());
					if (!importedClassifier.eIsProxy()) {
						break;
					}
				}
			}
			if (!importedClassifier.eIsProxy()) {
				result.addMapping(identifier, importedClassifier);
			}
		}
	}
}
