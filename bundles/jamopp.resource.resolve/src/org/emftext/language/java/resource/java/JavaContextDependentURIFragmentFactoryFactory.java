package org.emftext.language.java.resource.java;

import org.emftext.language.java.annotations.AnnotationAttributeSetting;
import org.emftext.language.java.annotations.AnnotationInstance;
import org.emftext.language.java.classifiers.Classifier;
import org.emftext.language.java.members.InterfaceMethod;
import org.emftext.language.java.resource.java.analysis.AnnotationAttributeSettingAttributeReferenceResolver;
import org.emftext.language.java.resource.java.analysis.AnnotationInstanceAnnotationReferenceResolver;
import org.emftext.language.java.resource.java.mopp.JavaContextDependentURIFragmentFactory;

public final class JavaContextDependentURIFragmentFactoryFactory {
	private JavaContextDependentURIFragmentFactoryFactory() {
	}
	
	public static final IJavaContextDependentURIFragmentFactory<AnnotationInstance, Classifier> ANNOTATION_INSTANCE_ANNOTATION_REFERENCE_FACTORY
		= new JavaContextDependentURIFragmentFactory<>(new AnnotationInstanceAnnotationReferenceResolver());
	
	public static final IJavaContextDependentURIFragmentFactory<AnnotationAttributeSetting, InterfaceMethod> ANNOTATION_ATTRIBUTE_SETTING_INTERFACE_METHOD_FACTORY
		= new JavaContextDependentURIFragmentFactory<>(new AnnotationAttributeSettingAttributeReferenceResolver());
}
