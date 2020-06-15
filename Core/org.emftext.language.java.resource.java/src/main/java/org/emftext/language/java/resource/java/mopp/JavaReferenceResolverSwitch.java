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
package org.emftext.language.java.resource.java.mopp;

public class JavaReferenceResolverSwitch implements org.emftext.language.java.resource.java.IJavaReferenceResolverSwitch {
	
	/**
	 * This map stores a copy of the options the were set for loading the resource.
	 */
	private java.util.Map<Object, Object> options;
	
	protected org.emftext.language.java.resource.java.analysis.ClassifierImportClassifierReferenceResolver classifierImportClassifierReferenceResolver = new org.emftext.language.java.resource.java.analysis.ClassifierImportClassifierReferenceResolver();
	protected org.emftext.language.java.resource.java.analysis.StaticMemberImportStaticMembersReferenceResolver staticMemberImportStaticMembersReferenceResolver = new org.emftext.language.java.resource.java.analysis.StaticMemberImportStaticMembersReferenceResolver();
	protected org.emftext.language.java.resource.java.analysis.AnnotationInstanceAnnotationReferenceResolver annotationInstanceAnnotationReferenceResolver = new org.emftext.language.java.resource.java.analysis.AnnotationInstanceAnnotationReferenceResolver();
	protected org.emftext.language.java.resource.java.analysis.AnnotationAttributeSettingAttributeReferenceResolver annotationAttributeSettingAttributeReferenceResolver = new org.emftext.language.java.resource.java.analysis.AnnotationAttributeSettingAttributeReferenceResolver();
	protected org.emftext.language.java.resource.java.analysis.ClassifierReferenceTargetReferenceResolver classifierReferenceTargetReferenceResolver = new org.emftext.language.java.resource.java.analysis.ClassifierReferenceTargetReferenceResolver();
	protected org.emftext.language.java.resource.java.analysis.ElementReferenceTargetReferenceResolver elementReferenceTargetReferenceResolver = new org.emftext.language.java.resource.java.analysis.ElementReferenceTargetReferenceResolver();
	protected org.emftext.language.java.resource.java.analysis.JumpTargetReferenceResolver jumpTargetReferenceResolver = new org.emftext.language.java.resource.java.analysis.JumpTargetReferenceResolver();
	
	public org.emftext.language.java.resource.java.IJavaReferenceResolver<org.emftext.language.java.imports.ClassifierImport, org.emftext.language.java.classifiers.ConcreteClassifier> getClassifierImportClassifierReferenceResolver() {
		return getResolverChain(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getClassifierImport_Classifier(), classifierImportClassifierReferenceResolver);
	}
	
	public org.emftext.language.java.resource.java.IJavaReferenceResolver<org.emftext.language.java.imports.StaticMemberImport, org.emftext.language.java.references.ReferenceableElement> getStaticMemberImportStaticMembersReferenceResolver() {
		return getResolverChain(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getStaticMemberImport_StaticMembers(), staticMemberImportStaticMembersReferenceResolver);
	}
	
	public org.emftext.language.java.resource.java.IJavaReferenceResolver<org.emftext.language.java.annotations.AnnotationInstance, org.emftext.language.java.classifiers.Classifier> getAnnotationInstanceAnnotationReferenceResolver() {
		return getResolverChain(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationInstance_Annotation(), annotationInstanceAnnotationReferenceResolver);
	}
	
	public org.emftext.language.java.resource.java.IJavaReferenceResolver<org.emftext.language.java.annotations.AnnotationAttributeSetting, org.emftext.language.java.members.InterfaceMethod> getAnnotationAttributeSettingAttributeReferenceResolver() {
		return getResolverChain(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttributeSetting_Attribute(), annotationAttributeSettingAttributeReferenceResolver);
	}
	
	public org.emftext.language.java.resource.java.IJavaReferenceResolver<org.emftext.language.java.types.ClassifierReference, org.emftext.language.java.classifiers.Classifier> getClassifierReferenceTargetReferenceResolver() {
		return getResolverChain(org.emftext.language.java.types.TypesPackage.eINSTANCE.getClassifierReference_Target(), classifierReferenceTargetReferenceResolver);
	}
	
	public org.emftext.language.java.resource.java.IJavaReferenceResolver<org.emftext.language.java.references.ElementReference, org.emftext.language.java.references.ReferenceableElement> getElementReferenceTargetReferenceResolver() {
		return getResolverChain(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getElementReference_Target(), elementReferenceTargetReferenceResolver);
	}
	
	public org.emftext.language.java.resource.java.IJavaReferenceResolver<org.emftext.language.java.statements.Jump, org.emftext.language.java.statements.JumpLabel> getJumpTargetReferenceResolver() {
		return getResolverChain(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getJump_Target(), jumpTargetReferenceResolver);
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		if (options != null) {
			this.options = new java.util.LinkedHashMap<Object, Object>();
			this.options.putAll(options);
		}
		classifierImportClassifierReferenceResolver.setOptions(options);
		staticMemberImportStaticMembersReferenceResolver.setOptions(options);
		annotationInstanceAnnotationReferenceResolver.setOptions(options);
		annotationAttributeSettingAttributeReferenceResolver.setOptions(options);
		classifierReferenceTargetReferenceResolver.setOptions(options);
		elementReferenceTargetReferenceResolver.setOptions(options);
		jumpTargetReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, org.emftext.language.java.resource.java.IJavaReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getClassifierImport().isInstance(container)) {
			JavaFuzzyResolveResult<org.emftext.language.java.classifiers.ConcreteClassifier> frr = new JavaFuzzyResolveResult<org.emftext.language.java.classifiers.ConcreteClassifier>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("classifier")) {
				classifierImportClassifierReferenceResolver.resolve(identifier, (org.emftext.language.java.imports.ClassifierImport) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getStaticMemberImport().isInstance(container)) {
			JavaFuzzyResolveResult<org.emftext.language.java.references.ReferenceableElement> frr = new JavaFuzzyResolveResult<org.emftext.language.java.references.ReferenceableElement>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("staticMembers")) {
				staticMemberImportStaticMembersReferenceResolver.resolve(identifier, (org.emftext.language.java.imports.StaticMemberImport) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationInstance().isInstance(container)) {
			JavaFuzzyResolveResult<org.emftext.language.java.classifiers.Classifier> frr = new JavaFuzzyResolveResult<org.emftext.language.java.classifiers.Classifier>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("annotation")) {
				annotationInstanceAnnotationReferenceResolver.resolve(identifier, (org.emftext.language.java.annotations.AnnotationInstance) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttributeSetting().isInstance(container)) {
			JavaFuzzyResolveResult<org.emftext.language.java.members.InterfaceMethod> frr = new JavaFuzzyResolveResult<org.emftext.language.java.members.InterfaceMethod>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("attribute")) {
				annotationAttributeSettingAttributeReferenceResolver.resolve(identifier, (org.emftext.language.java.annotations.AnnotationAttributeSetting) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.java.types.TypesPackage.eINSTANCE.getClassifierReference().isInstance(container)) {
			JavaFuzzyResolveResult<org.emftext.language.java.classifiers.Classifier> frr = new JavaFuzzyResolveResult<org.emftext.language.java.classifiers.Classifier>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("target")) {
				classifierReferenceTargetReferenceResolver.resolve(identifier, (org.emftext.language.java.types.ClassifierReference) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getElementReference().isInstance(container)) {
			JavaFuzzyResolveResult<org.emftext.language.java.references.ReferenceableElement> frr = new JavaFuzzyResolveResult<org.emftext.language.java.references.ReferenceableElement>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("target")) {
				elementReferenceTargetReferenceResolver.resolve(identifier, (org.emftext.language.java.references.ElementReference) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getJump().isInstance(container)) {
			JavaFuzzyResolveResult<org.emftext.language.java.statements.JumpLabel> frr = new JavaFuzzyResolveResult<org.emftext.language.java.statements.JumpLabel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("target")) {
				jumpTargetReferenceResolver.resolve(identifier, (org.emftext.language.java.statements.Jump) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public org.emftext.language.java.resource.java.IJavaReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getClassifierImport_Classifier()) {
			return getResolverChain(reference, classifierImportClassifierReferenceResolver);
		}
		if (reference == org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getStaticMemberImport_StaticMembers()) {
			return getResolverChain(reference, staticMemberImportStaticMembersReferenceResolver);
		}
		if (reference == org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationInstance_Annotation()) {
			return getResolverChain(reference, annotationInstanceAnnotationReferenceResolver);
		}
		if (reference == org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttributeSetting_Attribute()) {
			return getResolverChain(reference, annotationAttributeSettingAttributeReferenceResolver);
		}
		if (reference == org.emftext.language.java.types.TypesPackage.eINSTANCE.getClassifierReference_Target()) {
			return getResolverChain(reference, classifierReferenceTargetReferenceResolver);
		}
		if (reference == org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getElementReference_Target()) {
			return getResolverChain(reference, elementReferenceTargetReferenceResolver);
		}
		if (reference == org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getJump_Target()) {
			return getResolverChain(reference, jumpTargetReferenceResolver);
		}
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> org.emftext.language.java.resource.java.IJavaReferenceResolver<ContainerType, ReferenceType> getResolverChain(org.eclipse.emf.ecore.EStructuralFeature reference, org.emftext.language.java.resource.java.IJavaReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(org.emftext.language.java.resource.java.IJavaOptions.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof java.util.Map)) {
			// send this to the error log
			new org.emftext.language.java.resource.java.util.JavaRuntimeUtil().logWarning("Found value with invalid type for option " + org.emftext.language.java.resource.java.IJavaOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + java.util.Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		java.util.Map<?,?> resolverMap = (java.util.Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof org.emftext.language.java.resource.java.IJavaReferenceResolver) {
			org.emftext.language.java.resource.java.IJavaReferenceResolver replacingResolver = (org.emftext.language.java.resource.java.IJavaReferenceResolver) resolverValue;
			if (replacingResolver instanceof org.emftext.language.java.resource.java.IJavaDelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((org.emftext.language.java.resource.java.IJavaDelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof java.util.Collection) {
			java.util.Collection replacingResolvers = (java.util.Collection) resolverValue;
			org.emftext.language.java.resource.java.IJavaReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof org.emftext.language.java.resource.java.IJavaReferenceCache) {
					org.emftext.language.java.resource.java.IJavaReferenceResolver nextResolver = (org.emftext.language.java.resource.java.IJavaReferenceResolver) next;
					if (nextResolver instanceof org.emftext.language.java.resource.java.IJavaDelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((org.emftext.language.java.resource.java.IJavaDelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new org.emftext.language.java.resource.java.util.JavaRuntimeUtil().logWarning("Found value with invalid type in value map for option " + org.emftext.language.java.resource.java.IJavaOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + org.emftext.language.java.resource.java.IJavaDelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new org.emftext.language.java.resource.java.util.JavaRuntimeUtil().logWarning("Found value with invalid type in value map for option " + org.emftext.language.java.resource.java.IJavaOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + org.emftext.language.java.resource.java.IJavaDelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}
