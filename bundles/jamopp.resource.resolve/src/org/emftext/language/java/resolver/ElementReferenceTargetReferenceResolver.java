/*******************************************************************************
 * Copyright (c) 2006-2013
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emftext.language.java.expressions.Expression;
import org.emftext.language.java.expressions.NestedExpression;
import org.emftext.language.java.instantiations.NewConstructorCall;
import org.emftext.language.java.references.ElementReference;
import org.emftext.language.java.references.IdentifierReference;
import org.emftext.language.java.references.PackageReference;
import org.emftext.language.java.references.Reference;
import org.emftext.language.java.references.ReferenceableElement;
import org.emftext.language.java.references.ReferencesPackage;
import org.emftext.language.java.resolver.decider.ConcreteClassifierDecider;
import org.emftext.language.java.resolver.decider.EnumConstantDecider;
import org.emftext.language.java.resolver.decider.FieldDecider;
import org.emftext.language.java.resolver.decider.LocalVariableDecider;
import org.emftext.language.java.resolver.decider.MethodDecider;
import org.emftext.language.java.resolver.decider.PackageDecider;
import org.emftext.language.java.resolver.decider.ParameterDecider;
import org.emftext.language.java.resolver.decider.ScopedTreeWalker;
import org.emftext.language.java.resolver.decider.TypeParameterDecider;
import org.emftext.language.java.resource.java.IJavaReferenceResolveResult;
import org.emftext.language.java.types.PrimitiveType;
import org.emftext.language.java.util.TemporalCompositeClassifier;

public class ElementReferenceTargetReferenceResolver implements
	IJavaReferenceResolver<ElementReference, ReferenceableElement> {
	@Override
	public void resolve(String identifier, ElementReference container, EReference reference,
			int position, boolean resolveFuzzy, IJavaReferenceResolveResult<ReferenceableElement> result) {
		EObject startingPoint = null;
		EObject alternativeStartingPoint = null;
		EObject target = null;
		Reference parentReference = null;

		if (container.eContainingFeature().equals(ReferencesPackage.Literals.REFERENCE__NEXT)) {
			//a follow up reference: different scope
			parentReference = (Reference) container.eContainer();
			if (parentReference instanceof IdentifierReference
					&& ((IdentifierReference) parentReference).getTarget()
						instanceof org.emftext.language.java.containers.Package) {
				startingPoint = container;
			} else {
				startingPoint = parentReference.getReferencedType();
				
				if (startingPoint == null) {
					startingPoint = container;
				}
				
				if (parentReference instanceof NestedExpression) {
					alternativeStartingPoint = ((NestedExpression) parentReference
							).getExpression().getAlternativeType();
				}

				//do not search on primitive types but their class representation
				if (startingPoint instanceof PrimitiveType) {
					startingPoint = ((PrimitiveType) startingPoint).wrapPrimitiveType();
				}

				if (parentReference instanceof NestedExpression) {
					startingPoint = (((NestedExpression) parentReference).getExpression()).getType();
				}

				//special case: anonymous class in constructor call
				while (parentReference instanceof NestedExpression) {
					Expression nestedExpression = ((NestedExpression) parentReference).getExpression();
					if (nestedExpression instanceof Reference) {
						parentReference = (Reference) nestedExpression;
					} else {
						parentReference = null;
					}
				}
				if (parentReference instanceof NewConstructorCall
						&& ((NewConstructorCall) parentReference).getAnonymousClass() != null) {
					startingPoint = ((NewConstructorCall) parentReference).getAnonymousClass();
				}

			}
		} else {
			startingPoint = container;
		}

		if (startingPoint instanceof TemporalCompositeClassifier) {
			for (EObject superType : ((TemporalCompositeClassifier) startingPoint).getSuperTypes()) {
				target = searchFromStartingPoint(identifier, container, reference,
						superType);
				if (target != null) {
					break;
				}
			}
		} else {
			target = searchFromStartingPoint(identifier, container, reference,
					startingPoint);
		}
		
		if (target == null && alternativeStartingPoint != null && !alternativeStartingPoint.equals(startingPoint)) {
			target = searchFromStartingPoint(identifier, container, reference,
					alternativeStartingPoint);
		}

		if (target != null) {
			if (target.eIsProxy()) {
				target = EcoreUtil.resolve(target, container);
			}
			if (!target.eIsProxy()) {
				if (target instanceof PackageReference) {
					container.setContainedTarget((ReferenceableElement) target);
				}
				result.addMapping(identifier, (ReferenceableElement) target);
			}
		}
	}

	private EObject searchFromStartingPoint(String identifier, ElementReference container,
			EReference reference, EObject startingPoint) {
		ScopedTreeWalker resolutionWalker = new ScopedTreeWalker(List.of(new EnumConstantDecider(),
				new FieldDecider(), new LocalVariableDecider(), new ParameterDecider(), new MethodDecider(),
				new ConcreteClassifierDecider(), new TypeParameterDecider(), new PackageDecider()));
		return resolutionWalker.walk(startingPoint, identifier, container, reference);
	}
}
