/*******************************************************************************
 * Copyright (c) 2019-2020, Martin Armbruster
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Martin Armbruster
 *      - Initial implementation
 ******************************************************************************/

package org.emftext.language.java.resource.java.analysis;

import static org.emftext.language.java.resource.java.analysis.helper.LiteralConstants.BIN_PREFIX;
import static org.emftext.language.java.resource.java.analysis.helper.LiteralConstants.UNDER_SCORE;

import java.math.BigInteger;

import org.emftext.language.java.literals.BinaryIntegerLiteral;
import org.emftext.language.java.literals.LiteralsPackage;

public class JavaBINARY_INTEGER_LITERALTokenResolver implements org.emftext.language.java.resource.java.IJavaTokenResolver {
	
	private org.emftext.language.java.resource.java.analysis.JavaDefaultTokenResolver defaultTokenResolver = new org.emftext.language.java.resource.java.analysis.JavaDefaultTokenResolver(true);
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		assert container == null || container instanceof BinaryIntegerLiteral;
		assert value instanceof BigInteger;

		return BIN_PREFIX + ((BigInteger) value).toString(2);
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, org.emftext.language.java.resource.java.IJavaTokenResolveResult result) {
		assert feature == null || feature.getEContainingClass().equals(LiteralsPackage.eINSTANCE.getBinaryIntegerLiteral());
		assert lexem.toLowerCase().startsWith(BIN_PREFIX);
		
		lexem = lexem.substring(BIN_PREFIX.length());
		lexem = lexem.replaceAll(UNDER_SCORE, "");
		
		JavaDECIMAL_LONG_LITERALTokenResolver.parseToLong(lexem, 2, result);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
