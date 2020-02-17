/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.java.resource.java.analysis;

public class JavaBINARY_INTEGER_LITERALTokenResolver implements org.emftext.language.java.resource.java.IJavaTokenResolver {
	
	private org.emftext.language.java.resource.java.analysis.JavaDefaultTokenResolver defaultTokenResolver = new org.emftext.language.java.resource.java.analysis.JavaDefaultTokenResolver(true);
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		// By default token de-resolving is delegated to the DefaultTokenResolver.
		String result = defaultTokenResolver.deResolve(value, feature, container, null, null, null);
		return result;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, org.emftext.language.java.resource.java.IJavaTokenResolveResult result) {
		// By default token resolving is delegated to the DefaultTokenResolver.
		defaultTokenResolver.resolve(lexem, feature, result, null, null, null);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
