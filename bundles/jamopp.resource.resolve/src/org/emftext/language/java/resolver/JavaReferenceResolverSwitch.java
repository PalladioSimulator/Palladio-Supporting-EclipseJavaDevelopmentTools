/*******************************************************************************
 * Copyright (c) 2006-2014
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
 *   Martin Armbruster
 *      - Extension for Java 7-13
 ******************************************************************************/
package org.emftext.language.java.resolver;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.emftext.language.java.annotations.AnnotationAttributeSetting;
import org.emftext.language.java.annotations.AnnotationInstance;
import org.emftext.language.java.annotations.AnnotationsPackage;
import org.emftext.language.java.classifiers.Classifier;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.imports.ClassifierImport;
import org.emftext.language.java.imports.Import;
import org.emftext.language.java.imports.ImportsPackage;
import org.emftext.language.java.imports.StaticMemberImport;
import org.emftext.language.java.members.InterfaceMethod;
import org.emftext.language.java.references.ElementReference;
import org.emftext.language.java.references.ReferenceableElement;
import org.emftext.language.java.references.ReferencesPackage;
import org.emftext.language.java.resolver.result.IJavaReferenceResolveResult;
import org.emftext.language.java.resolver.result.JavaFuzzyResolveResult;
import org.emftext.language.java.types.ClassifierReference;
import org.emftext.language.java.types.TypesPackage;

public class JavaReferenceResolverSwitch implements IJavaReferenceResolverSwitch {
	private ClassifierImportClassifierReferenceResolver classifierImportClassifierReferenceResolver
		= new ClassifierImportClassifierReferenceResolver();
	private StaticMemberImportStaticMembersReferenceResolver staticMemberImportStaticMembersReferenceResolver
		= new StaticMemberImportStaticMembersReferenceResolver();
	private AnnotationInstanceAnnotationReferenceResolver annotationInstanceAnnotationReferenceResolver
		= new AnnotationInstanceAnnotationReferenceResolver();
	private AnnotationAttributeSettingAttributeReferenceResolver annotationAttributeSettingAttributeReferenceResolver
		= new AnnotationAttributeSettingAttributeReferenceResolver();
	private ClassifierReferenceTargetReferenceResolver classifierReferenceTargetReferenceResolver
		= new ClassifierReferenceTargetReferenceResolver();
	private ElementReferenceTargetReferenceResolver elementReferenceTargetReferenceResolver
		= new ElementReferenceTargetReferenceResolver();
	
	public IJavaReferenceResolver<Import, ConcreteClassifier> getClassifierImportClassifierReferenceResolver() {
		return this.classifierImportClassifierReferenceResolver;
	}
	
	public IJavaReferenceResolver<StaticMemberImport, ReferenceableElement>
		getStaticMemberImportStaticMembersReferenceResolver() {
		return this.staticMemberImportStaticMembersReferenceResolver;
	}
	
	public IJavaReferenceResolver<AnnotationInstance, Classifier> getAnnotationInstanceAnnotationReferenceResolver() {
		return this.annotationInstanceAnnotationReferenceResolver;
	}
	
	public IJavaReferenceResolver<AnnotationAttributeSetting, InterfaceMethod>
		getAnnotationAttributeSettingAttributeReferenceResolver() {
		return this.annotationAttributeSettingAttributeReferenceResolver;
	}
	
	public IJavaReferenceResolver<ClassifierReference, Classifier> getClassifierReferenceTargetReferenceResolver() {
		return this.classifierReferenceTargetReferenceResolver;
	}
	
	public IJavaReferenceResolver<ElementReference, ReferenceableElement> getElementReferenceTargetReferenceResolver() {
		return this.elementReferenceTargetReferenceResolver;
	}
	
	@Override
	public void resolveFuzzy(String identifier, EObject container, EReference reference, int position,
			IJavaReferenceResolveResult<EObject> result) {
		if (container == null) {
			return;
		}
		if (ImportsPackage.eINSTANCE.getClassifierImport().isInstance(container)) {
			JavaFuzzyResolveResult<ConcreteClassifier> frr = new JavaFuzzyResolveResult<ConcreteClassifier>(result);
			String referenceName = reference.getName();
			EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof EReference
					&& referenceName != null && referenceName.equals("classifier")) {
				classifierImportClassifierReferenceResolver.resolve(identifier, (ClassifierImport) container,
						(EReference) feature, position, true, frr);
			}
		}
		if (ImportsPackage.eINSTANCE.getStaticMemberImport().isInstance(container)) {
			JavaFuzzyResolveResult<ReferenceableElement> frr
				= new JavaFuzzyResolveResult<ReferenceableElement>(result);
			String referenceName = reference.getName();
			EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof EReference
					&& referenceName != null && referenceName.equals("staticMembers")) {
				staticMemberImportStaticMembersReferenceResolver.resolve(identifier,
						(StaticMemberImport) container, (EReference) feature, position, true, frr);
			}
		}
		if (AnnotationsPackage.eINSTANCE.getAnnotationInstance().isInstance(container)) {
			JavaFuzzyResolveResult<Classifier> frr = new JavaFuzzyResolveResult<Classifier>(result);
			String referenceName = reference.getName();
			EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof EReference
					&& referenceName != null && referenceName.equals("annotation")) {
				annotationInstanceAnnotationReferenceResolver.resolve(identifier, (AnnotationInstance) container,
						(EReference) feature, position, true, frr);
			}
		}
		if (AnnotationsPackage.eINSTANCE.getAnnotationAttributeSetting().isInstance(container)) {
			JavaFuzzyResolveResult<InterfaceMethod> frr = new JavaFuzzyResolveResult<InterfaceMethod>(result);
			String referenceName = reference.getName();
			EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof EReference
					&& referenceName != null && referenceName.equals("attribute")) {
				annotationAttributeSettingAttributeReferenceResolver.resolve(identifier,
						(AnnotationAttributeSetting) container, (EReference) feature,
						position, true, frr);
			}
		}
		if (TypesPackage.eINSTANCE.getClassifierReference().isInstance(container)) {
			JavaFuzzyResolveResult<Classifier> frr = new JavaFuzzyResolveResult<Classifier>(result);
			String referenceName = reference.getName();
			EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof EReference
					&& referenceName != null && referenceName.equals("target")) {
				classifierReferenceTargetReferenceResolver.resolve(identifier, (ClassifierReference) container,
						(EReference) feature, position, true, frr);
			}
		}
		if (ReferencesPackage.eINSTANCE.getElementReference().isInstance(container)) {
			JavaFuzzyResolveResult<ReferenceableElement> frr
				= new JavaFuzzyResolveResult<ReferenceableElement>(result);
			String referenceName = reference.getName();
			EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof EReference
					&& referenceName != null && referenceName.equals("target")) {
				elementReferenceTargetReferenceResolver.resolve(identifier, (ElementReference) container,
						(EReference) feature, position, true, frr);
			}
		}
	}
	
	public IJavaReferenceResolver<? extends EObject, ? extends EObject> getResolver(EStructuralFeature reference) {
		if (reference == ImportsPackage.eINSTANCE.getImport_Classifier()) {
			return this.getClassifierImportClassifierReferenceResolver();
		}
		if (reference == ImportsPackage.eINSTANCE.getStaticMemberImport_StaticMembers()) {
			return this.getStaticMemberImportStaticMembersReferenceResolver();
		}
		if (reference == AnnotationsPackage.eINSTANCE.getAnnotationInstance_Annotation()) {
			return this.getAnnotationInstanceAnnotationReferenceResolver();
		}
		if (reference == AnnotationsPackage.eINSTANCE.getAnnotationAttributeSetting_Attribute()) {
			return this.getAnnotationAttributeSettingAttributeReferenceResolver();
		}
		if (reference == TypesPackage.eINSTANCE.getClassifierReference_Target()) {
			return this.getAnnotationAttributeSettingAttributeReferenceResolver();
		}
		if (reference == ReferencesPackage.eINSTANCE.getElementReference_Target()) {
			return this.getElementReferenceTargetReferenceResolver();
		}
		return null;
	}
}
