package org.emftext.language.java.util;

import org.eclipse.emf.ecore.resource.Resource;
import org.emftext.language.java.classifiers.impl.ClassifierImpl;
import org.emftext.language.java.expressions.LambdaExpression;

/**
 * This class represents the actual type of a LambdaExpression which is temporarily unknown.
 */
public class TemporalUnknownLambdaExpressionType extends ClassifierImpl {

	private LambdaExpression creator;

	public TemporalUnknownLambdaExpressionType(LambdaExpression creator) {
		this.creator = creator;
	}

	@Override
	public Resource eResource() {
		return creator.eResource();
	}

	public LambdaExpression getLambdaExpression() {
		return creator;
	}
}
