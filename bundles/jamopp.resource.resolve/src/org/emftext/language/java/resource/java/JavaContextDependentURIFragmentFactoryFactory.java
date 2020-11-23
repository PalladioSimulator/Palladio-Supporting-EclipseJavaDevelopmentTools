package org.emftext.language.java.resource.java;

import org.emftext.language.java.annotations.AnnotationAttributeSetting;
import org.emftext.language.java.annotations.AnnotationInstance;
import org.emftext.language.java.classifiers.Classifier;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.imports.ClassifierImport;
import org.emftext.language.java.imports.StaticMemberImport;
import org.emftext.language.java.members.InterfaceMethod;
import org.emftext.language.java.references.ElementReference;
import org.emftext.language.java.references.ReferenceableElement;
import org.emftext.language.java.resource.java.analysis.AnnotationAttributeSettingAttributeReferenceResolver;
import org.emftext.language.java.resource.java.analysis.AnnotationInstanceAnnotationReferenceResolver;
import org.emftext.language.java.resource.java.analysis.ClassifierImportClassifierReferenceResolver;
import org.emftext.language.java.resource.java.analysis.ClassifierReferenceTargetReferenceResolver;
import org.emftext.language.java.resource.java.analysis.ElementReferenceTargetReferenceResolver;
import org.emftext.language.java.resource.java.analysis.StaticMemberImportStaticMembersReferenceResolver;
import org.emftext.language.java.resource.java.mopp.JavaContextDependentURIFragmentFactory;
import org.emftext.language.java.types.ClassifierReference;

public final class JavaContextDependentURIFragmentFactoryFactory {
	private JavaContextDependentURIFragmentFactoryFactory() {
	}
	
	public static final IJavaContextDependentURIFragmentFactory<AnnotationInstance, Classifier> ANNOTATION_INSTANCE_ANNOTATION_REFERENCE_FACTORY
		= new JavaContextDependentURIFragmentFactory<>(new AnnotationInstanceAnnotationReferenceResolver());
	
	public static final IJavaContextDependentURIFragmentFactory<AnnotationAttributeSetting, InterfaceMethod> ANNOTATION_ATTRIBUTE_SETTING_INTERFACE_METHOD_FACTORY
		= new JavaContextDependentURIFragmentFactory<>(new AnnotationAttributeSettingAttributeReferenceResolver());
	
	public static final IJavaContextDependentURIFragmentFactory<ClassifierImport, ConcreteClassifier> CLASSIFIER_IMPORT_CLASSIFIER_REFERENCE_FACTORY
		= new JavaContextDependentURIFragmentFactory<>(new ClassifierImportClassifierReferenceResolver());
	
	public static final IJavaContextDependentURIFragmentFactory<ClassifierReference, Classifier> CLASSIFIER_REFERENCE_TARGET_REFERENCE_FACTORY
		= new JavaContextDependentURIFragmentFactory<>(new ClassifierReferenceTargetReferenceResolver());
	
	public static final IJavaContextDependentURIFragmentFactory<ElementReference, ReferenceableElement> ELEMENT_REFERENCE_TARGET_REFERENCE_FACTORY
		= new JavaContextDependentURIFragmentFactory<>(new ElementReferenceTargetReferenceResolver());
	
	public static final IJavaContextDependentURIFragmentFactory<StaticMemberImport, ReferenceableElement> STATIC_MEMER_IMPORT_STATIC_MEMBERS_REFERENCE_FACTORY
		= new JavaContextDependentURIFragmentFactory<>(new StaticMemberImportStaticMembersReferenceResolver());
}
