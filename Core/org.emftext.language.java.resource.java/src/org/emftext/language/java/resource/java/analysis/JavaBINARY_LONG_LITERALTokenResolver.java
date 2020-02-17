/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.java.resource.java.analysis;

import static org.emftext.language.java.resource.java.analysis.helper.LiteralConstants.BIN_PREFIX;
import static org.emftext.language.java.resource.java.analysis.helper.LiteralConstants.LONG_SUFFIX;
import static org.emftext.language.java.resource.java.analysis.helper.LiteralConstants.UNDER_SCORE;

import java.math.BigInteger;

import org.emftext.language.java.literals.BinaryLongLiteral;
import org.emftext.language.java.literals.LiteralsPackage;

public class JavaBINARY_LONG_LITERALTokenResolver implements org.emftext.language.java.resource.java.IJavaTokenResolver {
	
	private org.emftext.language.java.resource.java.analysis.JavaDefaultTokenResolver defaultTokenResolver = new org.emftext.language.java.resource.java.analysis.JavaDefaultTokenResolver(true);
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		assert container == null || container instanceof BinaryLongLiteral;
		assert value instanceof BigInteger;
		
		return BIN_PREFIX + ((BigInteger) value).toString(2) + LONG_SUFFIX;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, org.emftext.language.java.resource.java.IJavaTokenResolveResult result) {
		assert feature == null || feature.getEContainingClass().equals(LiteralsPackage.eINSTANCE.getBinaryLongLiteral());
		assert lexem.startsWith(BIN_PREFIX) && lexem.endsWith(LONG_SUFFIX);
		
		lexem = lexem.substring(0, lexem.length() - 1);
		lexem = lexem.replaceAll(UNDER_SCORE, "");
		
		JavaDECIMAL_LONG_LITERALTokenResolver.parseToLong(lexem, 2, result);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
