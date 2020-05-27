/*******************************************************************************
 * Copyright (c) 2020, Martin Armbruster
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

package jamopp.parser.jdt;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Annotation;
import org.eclipse.jdt.core.dom.ArrayInitializer;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.CastExpression;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ConditionalExpression;
import org.eclipse.jdt.core.dom.CreationReference;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.ExpressionMethodReference;
import org.eclipse.jdt.core.dom.IExtendedModifier;
import org.eclipse.jdt.core.dom.InfixExpression;
import org.eclipse.jdt.core.dom.InstanceofExpression;
import org.eclipse.jdt.core.dom.LambdaExpression;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.MethodReference;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.PostfixExpression;
import org.eclipse.jdt.core.dom.PrefixExpression;
import org.eclipse.jdt.core.dom.SingleMemberAnnotation;
import org.eclipse.jdt.core.dom.SuperMethodReference;
import org.eclipse.jdt.core.dom.TypeMethodReference;

public class PackageJDTASTVisitorAndConverter extends AbstractAndEmptyModelJDTASTVisitorAndConverter {
	@Override
	public boolean visit(CompilationUnit node) {
		org.emftext.language.java.containers.JavaRoot root = this.getConvertedElement();
		if (root == null && node.getPackage() != null) {
			root = org.emftext.language.java.containers.ContainersFactory.eINSTANCE.createPackage();
		}
		org.emftext.language.java.containers.JavaRoot finalRoot = root;
		if (node.getPackage() != null) {
			node.getPackage().annotations().forEach(obj -> finalRoot.getAnnotations().add(this.convertToAnnotationInstance((Annotation) obj)));
			this.convertToNamespacesAndSet(node.getPackage().getName(), root);
		}
		super.visit(node);
		return false;
	}
	
	org.emftext.language.java.modifiers.AnnotationInstanceOrModifier converToModifierOrAnnotationInstance(IExtendedModifier mod) {
		if (mod.isModifier()) {
			return this.convertToModifier((Modifier) mod);
		} else { // mod.isAnnotation()
			return this.convertToAnnotationInstance((Annotation) mod);
		}
	}
	
	org.emftext.language.java.modifiers.Modifier convertToModifier(Modifier mod) {
		org.emftext.language.java.modifiers.Modifier result = null;
		if (mod.isAbstract()) {
			result = org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createAbstract();
		} else if (mod.isDefault()) {
			result = org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createDefault();
		} else if (mod.isFinal()) {
			result = org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createFinal();
		} else if (mod.isNative()) {
			result = org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createNative();
		} else if (mod.isPrivate()) {
			result = org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createPrivate();
		} else if (mod.isProtected()) {
			result = org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createProtected();
		} else if (mod.isPublic()) {
			result = org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createPublic();
		} else if (mod.isStatic()) {
			result = org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createStatic();
		} else if (mod.isStrictfp()) {
			result = org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createStrictfp();
		} else if (mod.isSynchronized()) {
			result = org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createSynchronized();
		} else if (mod.isTransient()) {
			result = org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createTransient();
		} else { // mod.isVolatile()
			result = org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createVolatile();
		}
		LayoutInformationConverter.convertToMinimalLayoutInformation(result, mod);
		return result;
	}
	
	org.emftext.language.java.annotations.AnnotationInstance convertToAnnotationInstance(Annotation annot) {
		org.emftext.language.java.annotations.AnnotationInstance result = org.emftext.language.java.annotations.AnnotationsFactory.eINSTANCE.createAnnotationInstance();
		org.emftext.language.java.classifiers.Class proxyClass = org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createClass();
		((InternalEObject) proxyClass).eSetProxyURI(null);
		this.convertToSimpleNameOnlyAndSet(annot.getTypeName(), proxyClass);
		if (annot.isSingleMemberAnnotation()) {
			org.emftext.language.java.annotations.SingleAnnotationParameter param = org.emftext.language.java.annotations.AnnotationsFactory.eINSTANCE
				.createSingleAnnotationParameter();
			result.setParameter(param);
			SingleMemberAnnotation singleAnnot = (SingleMemberAnnotation) annot;
			param.setValue(this.convertToAnnotationValue(singleAnnot.getValue()));
		} else if (annot.isNormalAnnotation()) {
			org.emftext.language.java.annotations.AnnotationParameterList param = org.emftext.language.java.annotations.AnnotationsFactory.eINSTANCE
				.createAnnotationParameterList();
			result.setParameter(param);
			NormalAnnotation normalAnnot = (NormalAnnotation) annot;
			normalAnnot.values().forEach(obj -> {
				MemberValuePair memVal = (MemberValuePair) obj;
				org.emftext.language.java.annotations.AnnotationAttributeSetting attrSet = org.emftext.language.java.annotations.AnnotationsFactory.eINSTANCE
					.createAnnotationAttributeSetting();
				org.emftext.language.java.members.InterfaceMethod methodProxy = org.emftext.language.java.members.MembersFactory.eINSTANCE.createInterfaceMethod();
				((InternalEObject) methodProxy).eSetProxyURI(null);
				this.convertToSimpleNameOnlyAndSet(memVal.getName(), methodProxy);
				attrSet.setAttribute(methodProxy);
				attrSet.setValue(this.convertToAnnotationValue(memVal.getValue()));
				LayoutInformationConverter.convertToMinimalLayoutInformation(attrSet, memVal);
				param.getSettings().add(attrSet);
			});
		}
		LayoutInformationConverter.convertToMinimalLayoutInformation(result, annot);
		return result;
	}
	
	org.emftext.language.java.annotations.AnnotationValue convertToAnnotationValue(Expression expr) {
		if (expr instanceof Annotation) {
			return this.convertToAnnotationInstance((Annotation) expr);
		} else if (expr.getNodeType() == ASTNode.ARRAY_INITIALIZER) {
			return this.convertToArrayInitializer((ArrayInitializer) expr);
		} else if (expr.getNodeType() == ASTNode.CONDITIONAL_EXPRESSION) {
			return this.convertToConditionalExpression((ConditionalExpression) expr);
		}
		return null;
	}
	
	org.emftext.language.java.arrays.ArrayInitializer convertToArrayInitializer(ArrayInitializer arr) {
		org.emftext.language.java.arrays.ArrayInitializer result = org.emftext.language.java.arrays.ArraysFactory.eINSTANCE.createArrayInitializer();
		arr.expressions().forEach(obj -> {
			org.emftext.language.java.arrays.ArrayInitializationValue value = null;
			Expression expr = (Expression) obj;
			if (expr instanceof ArrayInitializer) {
				value = this.convertToArrayInitializer((ArrayInitializer) expr);
			} else if (expr instanceof Annotation) {
				value = this.convertToAnnotationInstance((Annotation) expr);
			} else {
				value = this.convertToExpression(expr);
			}
			result.getInitialValues().add(value);
		});
		LayoutInformationConverter.convertToMinimalLayoutInformation(result, arr);
		return result;
	}
	
	org.emftext.language.java.expressions.Expression convertToExpression(Expression expr) {
		if (expr.getNodeType() == ASTNode.ASSIGNMENT) {
			Assignment assign = (Assignment) expr;
			org.emftext.language.java.expressions.AssignmentExpression result = org.emftext.language.java.expressions.ExpressionsFactory
				.eINSTANCE.createAssignmentExpression();
			result.setChild((org.emftext.language.java.expressions.AssignmentExpressionChild) this.convertToExpression(assign.getLeftHandSide()));
			result.setAssignmentOperator(this.convertToAssignmentOperator(assign.getOperator()));
			result.setValue(this.convertToExpression(assign.getRightHandSide()));
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, expr);
			return result;
		} else if (expr.getNodeType() == ASTNode.CONDITIONAL_EXPRESSION) {
			return this.convertToConditionalExpression((ConditionalExpression) expr);
		} else if (expr.getNodeType() == ASTNode.INFIX_EXPRESSION) {
			InfixExpression infix = (InfixExpression) expr;
			if (infix.getOperator() == InfixExpression.Operator.CONDITIONAL_OR) {
				org.emftext.language.java.expressions.ConditionalOrExpression result = org.emftext.language.java.expressions.ExpressionsFactory
					.eINSTANCE.createConditionalOrExpression();
				result.getChildren().add((org.emftext.language.java.expressions.ConditionalOrExpressionChild) this.convertToExpression(infix.getLeftOperand()));
				result.getChildren().add((org.emftext.language.java.expressions.ConditionalOrExpressionChild) this.convertToExpression(infix.getRightOperand()));
				infix.extendedOperands().forEach(obj -> result.getChildren().add((org.emftext.language.java.expressions.ConditionalOrExpressionChild)
					this.convertToExpression((Expression) obj)));
				LayoutInformationConverter.convertToMinimalLayoutInformation(result, infix);
				return result;
			} else if (infix.getOperator() == InfixExpression.Operator.CONDITIONAL_AND) {
				org.emftext.language.java.expressions.ConditionalAndExpression result = org.emftext.language.java.expressions.ExpressionsFactory
					.eINSTANCE.createConditionalAndExpression();
				result.getChildren().add((org.emftext.language.java.expressions.ConditionalAndExpressionChild) this.convertToExpression(infix.getLeftOperand()));
				result.getChildren().add((org.emftext.language.java.expressions.ConditionalAndExpressionChild) this.convertToExpression(infix.getRightOperand()));
				infix.extendedOperands().forEach(obj -> result.getChildren().add((org.emftext.language.java.expressions.ConditionalAndExpressionChild)
					this.convertToExpression((Expression) obj)));
				LayoutInformationConverter.convertToMinimalLayoutInformation(result, infix);
				return result;
			} else if (infix.getOperator() == InfixExpression.Operator.OR) {
				org.emftext.language.java.expressions.InclusiveOrExpression result = org.emftext.language.java.expressions.ExpressionsFactory
					.eINSTANCE.createInclusiveOrExpression();
				result.getChildren().add((org.emftext.language.java.expressions.InclusiveOrExpressionChild) this.convertToExpression(infix.getLeftOperand()));
				result.getChildren().add((org.emftext.language.java.expressions.InclusiveOrExpressionChild) this.convertToExpression(infix.getRightOperand()));
				infix.extendedOperands().forEach(obj -> result.getChildren().add((org.emftext.language.java.expressions.InclusiveOrExpressionChild)
					this.convertToExpression((Expression) obj)));
				LayoutInformationConverter.convertToMinimalLayoutInformation(result, infix);
				return result;
			} else if (infix.getOperator() == InfixExpression.Operator.XOR) {
				org.emftext.language.java.expressions.ExclusiveOrExpression result = org.emftext.language.java.expressions.ExpressionsFactory
					.eINSTANCE.createExclusiveOrExpression();
				result.getChildren().add((org.emftext.language.java.expressions.ExclusiveOrExpressionChild) this.convertToExpression(infix.getLeftOperand()));
				result.getChildren().add((org.emftext.language.java.expressions.ExclusiveOrExpressionChild) this.convertToExpression(infix.getRightOperand()));
				infix.extendedOperands().forEach(obj -> result.getChildren().add((org.emftext.language.java.expressions.ExclusiveOrExpressionChild)
					this.convertToExpression((Expression) obj)));
				LayoutInformationConverter.convertToMinimalLayoutInformation(result, infix);
				return result;
			} else if (infix.getOperator() == InfixExpression.Operator.AND) {
				org.emftext.language.java.expressions.AndExpression result = org.emftext.language.java.expressions.ExpressionsFactory
					.eINSTANCE.createAndExpression();
				result.getChildren().add((org.emftext.language.java.expressions.AndExpressionChild) this.convertToExpression(infix.getLeftOperand()));
				result.getChildren().add((org.emftext.language.java.expressions.AndExpressionChild) this.convertToExpression(infix.getRightOperand()));
				infix.extendedOperands().forEach(obj -> result.getChildren().add((org.emftext.language.java.expressions.AndExpressionChild)
					this.convertToExpression((Expression) obj)));
				LayoutInformationConverter.convertToMinimalLayoutInformation(result, infix);
				return result;
			} else if (infix.getOperator() == InfixExpression.Operator.EQUALS || infix.getOperator() == InfixExpression.Operator.NOT_EQUALS) {
				return this.convertToEqualityExpression(infix);
			} else if (infix.getOperator() == InfixExpression.Operator.GREATER || infix.getOperator() == InfixExpression.Operator.GREATER_EQUALS
				|| infix.getOperator() == InfixExpression.Operator.LESS || infix.getOperator() == InfixExpression.Operator.LESS_EQUALS) {
				return this.convertToRelationExpression(infix);
			} else if (infix.getOperator() == InfixExpression.Operator.LEFT_SHIFT || infix.getOperator() == InfixExpression.Operator.RIGHT_SHIFT_SIGNED
				|| infix.getOperator() == InfixExpression.Operator.RIGHT_SHIFT_UNSIGNED) {
				return this.convertToShiftExpression(infix);
			} else if (infix.getOperator() == InfixExpression.Operator.PLUS || infix.getOperator() == InfixExpression.Operator.MINUS) {
				return this.convertToAdditiveExpression(infix);
			} else if (infix.getOperator() == InfixExpression.Operator.TIMES || infix.getOperator() == InfixExpression.Operator.DIVIDE
				|| infix.getOperator() == InfixExpression.Operator.REMAINDER) {
				return this.convertToMultiplicativeExpression(infix);
			}
		} else if (expr.getNodeType() == ASTNode.INSTANCEOF_EXPRESSION) {
			InstanceofExpression castedExpr = (InstanceofExpression) expr;
			org.emftext.language.java.expressions.InstanceOfExpression result = org.emftext.language.java.expressions.ExpressionsFactory.eINSTANCE.createInstanceOfExpression();
			result.setChild((org.emftext.language.java.expressions.InstanceOfExpressionChild) this.convertToExpression(castedExpr.getLeftOperand()));
			castedExpr.getRightOperand();
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, castedExpr);
			return result;
		} else if (expr.getNodeType() == ASTNode.PREFIX_EXPRESSION) {
			PrefixExpression prefixExpr = (PrefixExpression) expr;
			if (prefixExpr.getOperator() == PrefixExpression.Operator.COMPLEMENT || prefixExpr.getOperator() == PrefixExpression.Operator.NOT
				|| prefixExpr.getOperator() == PrefixExpression.Operator.PLUS || prefixExpr.getOperator() == PrefixExpression.Operator.MINUS) {
				return this.convertToUnaryExpression(prefixExpr);
			} else if (prefixExpr.getOperator() == PrefixExpression.Operator.DECREMENT || prefixExpr.getOperator() == PrefixExpression.Operator.INCREMENT) {
				org.emftext.language.java.expressions.PrefixUnaryModificationExpression result = org.emftext.language.java.expressions.ExpressionsFactory
					.eINSTANCE.createPrefixUnaryModificationExpression();
				if (prefixExpr.getOperator() == PrefixExpression.Operator.DECREMENT) {
					result.setOperator(org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createMinusMinus());
				} else {
					result.setOperator(org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createPlusPlus());
				}
				result.setChild((org.emftext.language.java.expressions.UnaryModificationExpressionChild) this.convertToExpression(prefixExpr.getOperand()));
				LayoutInformationConverter.convertToMinimalLayoutInformation(result, prefixExpr);
				return result;
			}
		} else if (expr.getNodeType() == ASTNode.POSTFIX_EXPRESSION) {
			PostfixExpression postfixExpr = (PostfixExpression) expr;
			org.emftext.language.java.expressions.SuffixUnaryModificationExpression result = org.emftext.language.java.expressions.ExpressionsFactory
				.eINSTANCE.createSuffixUnaryModificationExpression();
			if (postfixExpr.getOperator() == PostfixExpression.Operator.DECREMENT) {
				result.setOperator(org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createMinusMinus());
			} else {
				result.setOperator(org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createPlusPlus());
			}
			result.setChild((org.emftext.language.java.expressions.UnaryModificationExpressionChild) this.convertToExpression(postfixExpr.getOperand()));
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, postfixExpr);
			return result;
		} else if (expr.getNodeType() == ASTNode.CAST_EXPRESSION) {
			CastExpression castExpr = (CastExpression) expr;
			org.emftext.language.java.expressions.CastExpression result = org.emftext.language.java.expressions.ExpressionsFactory
				.eINSTANCE.createCastExpression();
			castExpr.getType();
			result.setGeneralChild(this.convertToExpression(castExpr.getExpression()));
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, castExpr);
			return result;
		} else if (expr instanceof MethodReference) {
			return this.convertToMethodReferenceExpression((MethodReference) expr);
		} else if (expr.getNodeType() == ASTNode.LAMBDA_EXPRESSION) {
			LambdaExpression lambda = (LambdaExpression) expr;
			org.emftext.language.java.expressions.LambdaExpression result = org.emftext.language.java.expressions.ExpressionsFactory
				.eINSTANCE.createLambdaExpression();
			lambda.parameters();
			if (lambda.getBody() instanceof Expression) {
				result.setBody(this.convertToExpression((Expression) lambda.getBody()));
			} else {
				
			}
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, lambda);
			return result;
		}
		return null;
	}
	
	private org.emftext.language.java.operators.AssignmentOperator convertToAssignmentOperator(Assignment.Operator op) {
		if (op == Assignment.Operator.ASSIGN) {
			return org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createAssignment();
		} else if (op == Assignment.Operator.BIT_AND_ASSIGN) {
			return org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createAssignmentAnd();
		} else if (op == Assignment.Operator.BIT_OR_ASSIGN) {
			return org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createAssignmentOr();
		} else if (op == Assignment.Operator.BIT_XOR_ASSIGN) {
			return org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createAssignmentExclusiveOr();
		} else if (op == Assignment.Operator.DIVIDE_ASSIGN) {
			return org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createAssignmentDivision();
		} else if (op == Assignment.Operator.LEFT_SHIFT_ASSIGN) {
			return org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createAssignmentLeftShift();
		} else if (op == Assignment.Operator.MINUS_ASSIGN) {
			return org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createAssignmentMinus();
		} else if (op == Assignment.Operator.PLUS_ASSIGN) {
			return org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createAssignmentPlus();
		} else if (op == Assignment.Operator.REMAINDER_ASSIGN) {
			return org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createAssignmentModulo();
		} else if (op == Assignment.Operator.RIGHT_SHIFT_SIGNED_ASSIGN) {
			return org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createAssignmentRightShift();
		} else if (op == Assignment.Operator.RIGHT_SHIFT_UNSIGNED_ASSIGN) {
			return org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createAssignmentUnsignedRightShift();
		} else { // op == Assignment.Operator.TIMES_ASSIGN
			return org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createAssignmentMultiplication();
		}
	}
	
	private org.emftext.language.java.expressions.ConditionalExpression convertToConditionalExpression(ConditionalExpression expr) {
		org.emftext.language.java.expressions.ConditionalExpression result = org.emftext.language.java.expressions.ExpressionsFactory.eINSTANCE.createConditionalExpression();
		result.setChild((org.emftext.language.java.expressions.ConditionalExpressionChild) this.convertToExpression(expr.getExpression()));
		result.setExpressionIf(this.convertToExpression(expr.getThenExpression()));
		result.setGeneralExpressionElse(this.convertToExpression(expr.getElseExpression()));
		LayoutInformationConverter.convertToMinimalLayoutInformation(result, expr);
		return result;
	}
	
	private org.emftext.language.java.expressions.EqualityExpression convertToEqualityExpression(InfixExpression expr) {
		org.emftext.language.java.expressions.EqualityExpression result = org.emftext.language.java.expressions.ExpressionsFactory.eINSTANCE.createEqualityExpression();
		this.mergeEqualityExpressionAndExpression(result, this.convertToExpression(expr.getLeftOperand()));
		result.getEqualityOperators().add(this.convertToEqualityOperator(expr.getOperator()));
		this.mergeEqualityExpressionAndExpression(result, this.convertToExpression(expr.getLeftOperand()));
		expr.extendedOperands().forEach(obj -> {
			result.getEqualityOperators().add(this.convertToEqualityOperator(expr.getOperator()));
			this.mergeEqualityExpressionAndExpression(result, this.convertToExpression((Expression) obj));
		});
		LayoutInformationConverter.convertToMinimalLayoutInformation(result, expr);
		return result;
	}
	
	private org.emftext.language.java.operators.EqualityOperator convertToEqualityOperator(InfixExpression.Operator op) {
		if (op == InfixExpression.Operator.EQUALS) {
			return org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createEqual();
		} else if (op == InfixExpression.Operator.NOT_EQUALS) {
			return org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createNotEqual();
		}
		return null;
	}
	
	private void mergeEqualityExpressionAndExpression(org.emftext.language.java.expressions.EqualityExpression eqExpr, org.emftext.language.java.expressions.Expression potChild) {
		if (potChild instanceof org.emftext.language.java.expressions.EqualityExpressionChild) {
			eqExpr.getChildren().add((org.emftext.language.java.expressions.EqualityExpressionChild) potChild);
		} else {
			org.emftext.language.java.expressions.EqualityExpression expr = (org.emftext.language.java.expressions.EqualityExpression) potChild;
			eqExpr.getChildren().addAll(expr.getChildren());
			eqExpr.getEqualityOperators().addAll(expr.getEqualityOperators());
		}
	}
	
	private org.emftext.language.java.expressions.RelationExpression convertToRelationExpression(InfixExpression expr) {
		org.emftext.language.java.expressions.RelationExpression result = org.emftext.language.java.expressions.ExpressionsFactory.eINSTANCE.createRelationExpression();
		this.mergeRelationExpressionAndExpression(result, this.convertToExpression(expr.getLeftOperand()));
		result.getRelationOperators().add(this.convertToRelationOperator(expr.getOperator()));
		this.mergeRelationExpressionAndExpression(result, this.convertToExpression(expr.getRightOperand()));
		expr.extendedOperands().forEach(obj -> {
			result.getRelationOperators().add(this.convertToRelationOperator(expr.getOperator()));
			this.mergeRelationExpressionAndExpression(result, this.convertToExpression((Expression) obj));
		});
		LayoutInformationConverter.convertToMinimalLayoutInformation(result, expr);
		return result;
	}
	
	private org.emftext.language.java.operators.RelationOperator convertToRelationOperator(InfixExpression.Operator op) {
		if (op == InfixExpression.Operator.GREATER) {
			return org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createGreaterThan();
		} else if (op == InfixExpression.Operator.GREATER_EQUALS) {
			return org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createGreaterThanOrEqual();
		} else if (op == InfixExpression.Operator.LESS) {
			return org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createLessThan();
		} else if (op == InfixExpression.Operator.LESS_EQUALS) {
			return org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createLessThanOrEqual();
		}
		return null;
	}
	
	private void mergeRelationExpressionAndExpression(org.emftext.language.java.expressions.RelationExpression relExpr, org.emftext.language.java.expressions.Expression potChild) {
		if (potChild instanceof org.emftext.language.java.expressions.RelationExpressionChild) {
			relExpr.getChildren().add((org.emftext.language.java.expressions.RelationExpressionChild) potChild);
		} else {
			org.emftext.language.java.expressions.RelationExpression expr = (org.emftext.language.java.expressions.RelationExpression) potChild;
			relExpr.getChildren().addAll(expr.getChildren());
			relExpr.getRelationOperators().addAll(expr.getRelationOperators());
		}
	}
	
	private org.emftext.language.java.expressions.ShiftExpression convertToShiftExpression(InfixExpression expr) {
		org.emftext.language.java.expressions.ShiftExpression result = org.emftext.language.java.expressions.ExpressionsFactory.eINSTANCE.createShiftExpression();
		this.mergeShiftExpressionAndExpression(result, this.convertToExpression(expr.getLeftOperand()));
		result.getShiftOperators().add(this.convertToShiftOperator(expr.getOperator()));
		this.mergeShiftExpressionAndExpression(result, this.convertToExpression(expr.getRightOperand()));
		expr.extendedOperands().forEach(obj -> {
			result.getShiftOperators().add(this.convertToShiftOperator(expr.getOperator()));
			this.mergeShiftExpressionAndExpression(result, this.convertToExpression((Expression) obj));
		});
		LayoutInformationConverter.convertToMinimalLayoutInformation(result, expr);
		return result;
	}
	
	private org.emftext.language.java.operators.ShiftOperator convertToShiftOperator(InfixExpression.Operator op) {
		if (op == InfixExpression.Operator.LEFT_SHIFT) {
			return org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createLeftShift();
		} else if (op == InfixExpression.Operator.RIGHT_SHIFT_SIGNED) {
			return org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createRightShift();
		} else if (op == InfixExpression.Operator.RIGHT_SHIFT_UNSIGNED) {
			return org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createUnsignedRightShift();
		}
		return null;
	}
	
	private void mergeShiftExpressionAndExpression(org.emftext.language.java.expressions.ShiftExpression shiftExpr, org.emftext.language.java.expressions.Expression potChild) {
		if (potChild instanceof org.emftext.language.java.expressions.ShiftExpressionChild) {
			shiftExpr.getChildren().add((org.emftext.language.java.expressions.ShiftExpressionChild) potChild);
		} else {
			org.emftext.language.java.expressions.ShiftExpression expr = (org.emftext.language.java.expressions.ShiftExpression) potChild;
			shiftExpr.getChildren().addAll(expr.getChildren());
			shiftExpr.getShiftOperators().addAll(expr.getShiftOperators());
		}
	}
	
	private org.emftext.language.java.expressions.AdditiveExpression convertToAdditiveExpression(InfixExpression expr) {
		org.emftext.language.java.expressions.AdditiveExpression result = org.emftext.language.java.expressions.ExpressionsFactory.eINSTANCE.createAdditiveExpression();
		this.mergeAdditiveExpressionAndExpression(result, this.convertToExpression(expr.getLeftOperand()));
		result.getAdditiveOperators().add(this.convertToAdditiveOperator(expr.getOperator()));
		this.mergeAdditiveExpressionAndExpression(result, this.convertToExpression(expr.getRightOperand()));
		expr.extendedOperands().forEach(obj -> {
			result.getAdditiveOperators().add(this.convertToAdditiveOperator(expr.getOperator()));
			this.mergeAdditiveExpressionAndExpression(result, this.convertToExpression((Expression) obj));
		});
		LayoutInformationConverter.convertToMinimalLayoutInformation(result, expr);
		return result;
	}
	
	private org.emftext.language.java.operators.AdditiveOperator convertToAdditiveOperator(InfixExpression.Operator op) {
		if (op == InfixExpression.Operator.PLUS) {
			return org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createAddition();
		} else if (op == InfixExpression.Operator.MINUS) {
			return org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createSubtraction();
		}
		return null;
	}
	
	private void mergeAdditiveExpressionAndExpression(org.emftext.language.java.expressions.AdditiveExpression addExpr, org.emftext.language.java.expressions.Expression potChild) {
		if (potChild instanceof org.emftext.language.java.expressions.AdditiveExpressionChild) {
			addExpr.getChildren().add((org.emftext.language.java.expressions.AdditiveExpressionChild) potChild);
		} else {
			org.emftext.language.java.expressions.AdditiveExpression expr = (org.emftext.language.java.expressions.AdditiveExpression) potChild;
			addExpr.getChildren().addAll(expr.getChildren());
			addExpr.getAdditiveOperators().addAll(expr.getAdditiveOperators());
		}
	}
	
	private org.emftext.language.java.expressions.MultiplicativeExpression convertToMultiplicativeExpression(InfixExpression expr) {
		org.emftext.language.java.expressions.MultiplicativeExpression result = org.emftext.language.java.expressions.ExpressionsFactory.eINSTANCE.createMultiplicativeExpression();
		this.mergeMultiplicativeExpressionAndExpression(result, this.convertToExpression(expr.getLeftOperand()));
		result.getMultiplicativeOperators().add(this.convertToMultiplicativeOperator(expr.getOperator()));
		this.mergeMultiplicativeExpressionAndExpression(result, this.convertToExpression(expr.getRightOperand()));
		expr.extendedOperands().forEach(obj -> {
			result.getMultiplicativeOperators().add(this.convertToMultiplicativeOperator(expr.getOperator()));
			this.mergeMultiplicativeExpressionAndExpression(result, this.convertToExpression((Expression) obj));
		});
		LayoutInformationConverter.convertToMinimalLayoutInformation(result, expr);
		return result;
	}
	
	private org.emftext.language.java.operators.MultiplicativeOperator convertToMultiplicativeOperator(InfixExpression.Operator op) {
		if (op == InfixExpression.Operator.TIMES) {
			return org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createMultiplication();
		} else if (op == InfixExpression.Operator.DIVIDE) {
			return org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createDivision();
		} else if (op == InfixExpression.Operator.REMAINDER) {
			return org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createRemainder();
		}
		return null;
	}
	
	private void mergeMultiplicativeExpressionAndExpression(org.emftext.language.java.expressions.MultiplicativeExpression mulExpr, org.emftext.language.java.expressions.Expression potChild) {
		if (potChild instanceof org.emftext.language.java.expressions.MultiplicativeExpression) {
			mulExpr.getChildren().add((org.emftext.language.java.expressions.MultiplicativeExpressionChild) potChild);
		} else {
			org.emftext.language.java.expressions.MultiplicativeExpression expr = (org.emftext.language.java.expressions.MultiplicativeExpression) potChild;
			mulExpr.getChildren().addAll(expr.getChildren());
			mulExpr.getMultiplicativeOperators().addAll(expr.getMultiplicativeOperators());
		}
	}
	
	private org.emftext.language.java.expressions.UnaryExpression convertToUnaryExpression(PrefixExpression expr) {
		org.emftext.language.java.expressions.UnaryExpression result = org.emftext.language.java.expressions.ExpressionsFactory.eINSTANCE.createUnaryExpression();
		result.getOperators().add(this.convertToUnaryOperator(expr.getOperator()));
		org.emftext.language.java.expressions.Expression potChild = this.convertToExpression(expr.getOperand());
		if (potChild instanceof org.emftext.language.java.expressions.UnaryExpressionChild) {
			result.setChild((org.emftext.language.java.expressions.UnaryExpressionChild) potChild);
		} else {
			org.emftext.language.java.expressions.UnaryExpression secRes = (org.emftext.language.java.expressions.UnaryExpression) potChild;
			result.getOperators().addAll(secRes.getOperators());
			result.setChild(secRes.getChild());
		}
		LayoutInformationConverter.convertToMinimalLayoutInformation(result, expr);
		return result;
	}
	
	private org.emftext.language.java.operators.UnaryOperator convertToUnaryOperator(PrefixExpression.Operator op) {
		if (op == PrefixExpression.Operator.COMPLEMENT) {
			return org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createComplement();
		} else if (op == PrefixExpression.Operator.NOT) {
			return org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createNegate();
		} else if (op == PrefixExpression.Operator.PLUS) {
			return org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createAddition();
		} else if (op == PrefixExpression.Operator.MINUS) {
			return org.emftext.language.java.operators.OperatorsFactory.eINSTANCE.createSubtraction();
		}
		return null;
	}
	
	private org.emftext.language.java.expressions.MethodReferenceExpression convertToMethodReferenceExpression(MethodReference ref) {
		if (ref.getNodeType() == ASTNode.CREATION_REFERENCE) {
			CreationReference crRef = (CreationReference) ref;
			if (crRef.getType().isArrayType()) {
				org.emftext.language.java.expressions.ArrayConstructorReferenceExpression result = org.emftext.language.java.expressions.ExpressionsFactory
					.eINSTANCE.createArrayConstructorReferenceExpression();
				crRef.getType();
				LayoutInformationConverter.convertToMinimalLayoutInformation(result, crRef);
				return result;
			} else {
				org.emftext.language.java.expressions.ClassTypeConstructorReferenceExpression result = org.emftext.language.java.expressions.ExpressionsFactory
					.eINSTANCE.createClassTypeConstructorReferenceExpression();
				crRef.getType();
				crRef.typeArguments();
				LayoutInformationConverter.convertToMinimalLayoutInformation(result, crRef);
				return result;
			}
		} else {
			org.emftext.language.java.expressions.PrimaryExpressionReferenceExpression result = org.emftext.language.java.expressions.ExpressionsFactory
				.eINSTANCE.createPrimaryExpressionReferenceExpression();
			if (ref.getNodeType() == ASTNode.TYPE_METHOD_REFERENCE) {
				TypeMethodReference typeRef = (TypeMethodReference) ref;
				typeRef.getType();
				typeRef.typeArguments();
				typeRef.getName();
			} else if (ref.getNodeType() == ASTNode.SUPER_METHOD_REFERENCE) {
				SuperMethodReference superRef = (SuperMethodReference) ref;
				superRef.getQualifier();
				superRef.typeArguments();
				superRef.getName();
			} else if (ref.getNodeType() == ASTNode.EXPRESSION_METHOD_REFERENCE) {
				ExpressionMethodReference exprRef = (ExpressionMethodReference) ref;
				result.setChild((org.emftext.language.java.expressions.MethodReferenceExpressionChild) this.convertToExpression(exprRef.getExpression()));
				exprRef.typeArguments();
				exprRef.getName();
			}
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, ref);
			return result;
		}
	}
}
