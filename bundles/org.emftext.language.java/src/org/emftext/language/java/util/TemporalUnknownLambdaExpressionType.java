package org.emftext.language.java.util;

import org.emftext.language.java.expressions.LambdaExpression;

/**
 * This class represents the actual type of a LambdaExpression which is temporarily unknown.
 */
public class TemporalUnknownLambdaExpressionType extends TemporalUnknownType {
	public TemporalUnknownLambdaExpressionType(LambdaExpression creator) {
		super(creator);
	}

	public LambdaExpression getLambdaExpression() {
		return (LambdaExpression) getCreator();
	}
}
