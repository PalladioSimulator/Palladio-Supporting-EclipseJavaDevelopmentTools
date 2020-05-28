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
import org.eclipse.jdt.core.dom.ArrayType;
import org.eclipse.jdt.core.dom.AssertStatement;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.BreakStatement;
import org.eclipse.jdt.core.dom.CastExpression;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ConditionalExpression;
import org.eclipse.jdt.core.dom.ContinueStatement;
import org.eclipse.jdt.core.dom.CreationReference;
import org.eclipse.jdt.core.dom.Dimension;
import org.eclipse.jdt.core.dom.DoStatement;
import org.eclipse.jdt.core.dom.EnhancedForStatement;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.ExpressionMethodReference;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.ForStatement;
import org.eclipse.jdt.core.dom.IExtendedModifier;
import org.eclipse.jdt.core.dom.IfStatement;
import org.eclipse.jdt.core.dom.InfixExpression;
import org.eclipse.jdt.core.dom.InstanceofExpression;
import org.eclipse.jdt.core.dom.IntersectionType;
import org.eclipse.jdt.core.dom.LabeledStatement;
import org.eclipse.jdt.core.dom.LambdaExpression;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.MethodReference;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.NameQualifiedType;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.PostfixExpression;
import org.eclipse.jdt.core.dom.PrefixExpression;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.QualifiedType;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.SingleMemberAnnotation;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.SuperMethodReference;
import org.eclipse.jdt.core.dom.SwitchCase;
import org.eclipse.jdt.core.dom.SwitchStatement;
import org.eclipse.jdt.core.dom.SynchronizedStatement;
import org.eclipse.jdt.core.dom.ThrowStatement;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclarationStatement;
import org.eclipse.jdt.core.dom.TypeMethodReference;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.jdt.core.dom.WhileStatement;
import org.eclipse.jdt.core.dom.WildcardType;

public class PackageJDTASTVisitorAndConverter extends AbstractAndEmptyModelJDTASTVisitorAndConverter {
	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(CompilationUnit node) {
		org.emftext.language.java.containers.JavaRoot root = this.getConvertedElement();
		if (root == null && node.getPackage() != null) {
			root = org.emftext.language.java.containers.ContainersFactory.eINSTANCE.createPackage();
			LayoutInformationConverter.convertJavaRootLayoutInformation(root, node, this.getSource());
			this.setConvertedElement(root);
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
	
	@SuppressWarnings("unchecked")
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
	
	@SuppressWarnings("unchecked")
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
	
	@SuppressWarnings("unchecked")
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
			result.setTypeReference(this.convertToTypeReference(castedExpr.getRightOperand()));
			this.convertToArrayDimensionsAndSet(castedExpr.getRightOperand(), result);
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
			if (castExpr.getType().isIntersectionType()) {
				IntersectionType interType = (IntersectionType) castExpr.getType();
				result.setTypeReference(this.convertToTypeReference((Type) interType.types().get(0)));
				this.convertToArrayDimensionsAndSet((Type) interType.types().get(0), result);
				for (int index = 1; index < interType.types().size(); index++) {
					result.getAdditionalBounds().add(this.convertToTypeReference((Type) interType.types().get(index)));
				}
			} else {
				result.setTypeReference(this.convertToTypeReference(castExpr.getType()));
				this.convertToArrayDimensionsAndSet(castExpr.getType(), result);
			}
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
	
	@SuppressWarnings("unchecked")
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
	
	@SuppressWarnings("unchecked")
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
	
	@SuppressWarnings("unchecked")
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
	
	@SuppressWarnings("unchecked")
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
	
	@SuppressWarnings("unchecked")
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
	
	@SuppressWarnings("unchecked")
	private org.emftext.language.java.expressions.MethodReferenceExpression convertToMethodReferenceExpression(MethodReference ref) {
		if (ref.getNodeType() == ASTNode.CREATION_REFERENCE) {
			CreationReference crRef = (CreationReference) ref;
			if (crRef.getType().isArrayType()) {
				org.emftext.language.java.expressions.ArrayConstructorReferenceExpression result = org.emftext.language.java.expressions.ExpressionsFactory
					.eINSTANCE.createArrayConstructorReferenceExpression();
				result.setTypeReference(this.convertToTypeReference(crRef.getType()));
				this.convertToArrayDimensionsAndSet(crRef.getType(), result);
				LayoutInformationConverter.convertToMinimalLayoutInformation(result, crRef);
				return result;
			} else {
				org.emftext.language.java.expressions.ClassTypeConstructorReferenceExpression result = org.emftext.language.java.expressions.ExpressionsFactory
					.eINSTANCE.createClassTypeConstructorReferenceExpression();
				result.setTypeReference(this.convertToTypeReference(crRef.getType()));
				crRef.typeArguments().forEach(obj -> result.getCallTypeArguments().add(this.convertToTypeArgument((Type) obj)));
				LayoutInformationConverter.convertToMinimalLayoutInformation(result, crRef);
				return result;
			}
		} else {
			org.emftext.language.java.expressions.PrimaryExpressionReferenceExpression result = org.emftext.language.java.expressions.ExpressionsFactory
				.eINSTANCE.createPrimaryExpressionReferenceExpression();
			if (ref.getNodeType() == ASTNode.TYPE_METHOD_REFERENCE) {
				TypeMethodReference typeRef = (TypeMethodReference) ref;
				typeRef.getType();
				typeRef.typeArguments().forEach(obj -> result.getCallTypeArguments().add(this.convertToTypeArgument((Type) obj)));
				typeRef.getName();
			} else if (ref.getNodeType() == ASTNode.SUPER_METHOD_REFERENCE) {
				SuperMethodReference superRef = (SuperMethodReference) ref;
				superRef.getQualifier();
				superRef.typeArguments().forEach(obj -> result.getCallTypeArguments().add(this.convertToTypeArgument((Type) obj)));
				superRef.getName();
			} else if (ref.getNodeType() == ASTNode.EXPRESSION_METHOD_REFERENCE) {
				ExpressionMethodReference exprRef = (ExpressionMethodReference) ref;
				result.setChild((org.emftext.language.java.expressions.MethodReferenceExpressionChild) this.convertToExpression(exprRef.getExpression()));
				exprRef.typeArguments().forEach(obj -> result.getCallTypeArguments().add(this.convertToTypeArgument((Type) obj)));
				exprRef.getName();
			}
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, ref);
			return result;
		}
	}
	
	@SuppressWarnings("unchecked")
	org.emftext.language.java.types.TypeReference convertToTypeReference(Type t) {
		if (t.isPrimitiveType()) {
			PrimitiveType primType = (PrimitiveType) t;
			org.emftext.language.java.types.PrimitiveType convertedType;
			if (primType.getPrimitiveTypeCode() == PrimitiveType.BOOLEAN) {
				convertedType = org.emftext.language.java.types.TypesFactory.eINSTANCE.createBoolean();
			} else if (primType.getPrimitiveTypeCode() == PrimitiveType.BYTE) {
				convertedType = org.emftext.language.java.types.TypesFactory.eINSTANCE.createByte();
			} else if (primType.getPrimitiveTypeCode() == PrimitiveType.CHAR) {
				convertedType = org.emftext.language.java.types.TypesFactory.eINSTANCE.createChar();
			} else if (primType.getPrimitiveTypeCode() == PrimitiveType.DOUBLE) {
				convertedType = org.emftext.language.java.types.TypesFactory.eINSTANCE.createDouble();
			} else if (primType.getPrimitiveTypeCode() == PrimitiveType.FLOAT) {
				convertedType = org.emftext.language.java.types.TypesFactory.eINSTANCE.createFloat();
			} else if (primType.getPrimitiveTypeCode() == PrimitiveType.INT) {
				convertedType = org.emftext.language.java.types.TypesFactory.eINSTANCE.createInt();
			} else if (primType.getPrimitiveTypeCode() == PrimitiveType.LONG) {
				convertedType = org.emftext.language.java.types.TypesFactory.eINSTANCE.createLong();
			} else if (primType.getPrimitiveTypeCode() == PrimitiveType.SHORT) {
				convertedType = org.emftext.language.java.types.TypesFactory.eINSTANCE.createShort();
			} else { // primType.getPrimitiveTypeCode() == PrimitiveType.VOID
				convertedType = org.emftext.language.java.types.TypesFactory.eINSTANCE.createVoid();
			}
			primType.annotations().forEach(obj -> convertedType.getAnnotations().add(this.convertToAnnotationInstance((Annotation) obj)));
			LayoutInformationConverter.convertToMinimalLayoutInformation(convertedType, primType);
			return convertedType;
		} else if (t.isArrayType()) {
			ArrayType arrT = (ArrayType) t;
			return this.convertToTypeReference(arrT.getElementType());
		} else if (t.isSimpleType()) {
			SimpleType simT = (SimpleType) t;
			org.emftext.language.java.types.TypeReference ref;
			if (simT.annotations().size() > 0) {
				org.emftext.language.java.types.ClassifierReference tempRef = this.convertToClassifierReference((SimpleName) simT.getName());
				simT.annotations().forEach(obj -> tempRef.getAnnotations().add(this.convertToAnnotationInstance((Annotation) obj)));
				ref = tempRef;
			} else {
				ref = this.convertToClassifierOrNamespaceClassifierReference(simT.getName());
			}
			LayoutInformationConverter.convertToMinimalLayoutInformation(ref, simT);
			return ref;
		} else if (t.isQualifiedType()) {
			QualifiedType qualType = (QualifiedType) t;
			org.emftext.language.java.types.NamespaceClassifierReference result;
			org.emftext.language.java.types.TypeReference parentRef = this.convertToTypeReference(qualType.getQualifier());
			if (parentRef instanceof org.emftext.language.java.types.ClassifierReference) {
				result = org.emftext.language.java.types.TypesFactory.eINSTANCE.createNamespaceClassifierReference();
				result.getClassifierReferences().add((org.emftext.language.java.types.ClassifierReference) parentRef);
			} else { // parentRef instanceof org.emftext.language.java.types.NamespaceClassifierReference
				result = (org.emftext.language.java.types.NamespaceClassifierReference) parentRef;
			}
			org.emftext.language.java.types.ClassifierReference childRef = this.convertToClassifierReference(qualType.getName());
			qualType.annotations().forEach(obj -> childRef.getAnnotations().add(this.convertToAnnotationInstance((Annotation) obj)));
			result.getClassifierReferences().add(childRef);
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, qualType);
			return result;
		} else if (t.isNameQualifiedType()) {
			NameQualifiedType nqT = (NameQualifiedType) t;
			org.emftext.language.java.types.NamespaceClassifierReference result = org.emftext.language.java.types.TypesFactory.eINSTANCE.createNamespaceClassifierReference();
			this.convertToNamespacesAndSet(nqT.getQualifier(), result);
			org.emftext.language.java.types.ClassifierReference child = this.convertToClassifierReference(nqT.getName());
			nqT.annotations().forEach(obj -> child.getAnnotations().add(this.convertToAnnotationInstance((Annotation) obj)));
			result.getClassifierReferences().add(child);
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, nqT);
			return result;
		} else if (t.isParameterizedType()) {
			ParameterizedType paramT = (ParameterizedType) t;
			org.emftext.language.java.types.TypeReference ref = this.convertToTypeReference(paramT.getType());
			org.emftext.language.java.types.ClassifierReference container;
			if (ref instanceof org.emftext.language.java.types.ClassifierReference) {
				container = (org.emftext.language.java.types.ClassifierReference) ref;
			} else {
				org.emftext.language.java.types.NamespaceClassifierReference containerContainer = (org.emftext.language.java.types.NamespaceClassifierReference) ref;
				container = containerContainer.getClassifierReferences().get(containerContainer.getClassifierReferences().size() - 1);
			}
			paramT.typeArguments().forEach(obj -> container.getTypeArguments().add(this.convertToTypeArgument((Type) obj)));
			return ref;
		} else if (t.isVar()) {
			org.emftext.language.java.types.ClassifierReference ref = org.emftext.language.java.types.TypesFactory.eINSTANCE.createClassifierReference();
			ref.setTarget(org.emftext.language.java.types.TypesFactory.eINSTANCE.createInferableType());
			LayoutInformationConverter.convertToMinimalLayoutInformation(ref, t);
			return ref;
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	private org.emftext.language.java.generics.TypeArgument convertToTypeArgument(Type t) {
		if (t.isWildcardType()) {
			WildcardType wildType = (WildcardType) t;
			if (wildType.getBound() == null) {
				org.emftext.language.java.generics.UnknownTypeArgument result = org.emftext.language.java.generics.GenericsFactory.eINSTANCE.createUnknownTypeArgument();
				wildType.annotations().forEach(obj -> result.getAnnotations().add(this.convertToAnnotationInstance((Annotation) obj)));
				LayoutInformationConverter.convertToMinimalLayoutInformation(result, wildType);
				return result;
			} else if (wildType.isUpperBound()) {
				org.emftext.language.java.generics.ExtendsTypeArgument result = org.emftext.language.java.generics.GenericsFactory.eINSTANCE.createExtendsTypeArgument();
				wildType.annotations().forEach(obj -> result.getAnnotations().add(this.convertToAnnotationInstance((Annotation) obj)));
				result.setExtendType(this.convertToTypeReference(wildType.getBound()));
				this.convertToArrayDimensionsAndSet(wildType.getBound(), result);
				LayoutInformationConverter.convertToMinimalLayoutInformation(result, wildType);
				return result;
			} else {
				org.emftext.language.java.generics.SuperTypeArgument result = org.emftext.language.java.generics.GenericsFactory.eINSTANCE.createSuperTypeArgument();
				wildType.annotations().forEach(obj -> result.getAnnotations().add(this.convertToAnnotationInstance((Annotation) obj)));
				result.setSuperType(this.convertToTypeReference(wildType.getBound()));
				this.convertToArrayDimensionsAndSet(wildType.getBound(), result);
				LayoutInformationConverter.convertToMinimalLayoutInformation(result, wildType);
				return result;
			}
		} else {
			org.emftext.language.java.generics.QualifiedTypeArgument result = org.emftext.language.java.generics.GenericsFactory.eINSTANCE.createQualifiedTypeArgument();
			result.setTypeReference(this.convertToTypeReference(t));
			this.convertToArrayDimensionsAndSet(t, result);
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, t);
			return result;
		}
	}
	
	@SuppressWarnings("unchecked")
	private void convertToArrayDimensionsAndSet(Type t, org.emftext.language.java.arrays.ArrayTypeable arrDimContainer) {
		if (t.isArrayType()) {
			ArrayType arrT = (ArrayType) t;
			arrT.dimensions().forEach(obj -> {
				Dimension dim = (Dimension) obj;
				org.emftext.language.java.arrays.ArrayDimension convertedDim = org.emftext.language.java.arrays.ArraysFactory.eINSTANCE.createArrayDimension();
				dim.annotations().forEach(annot -> convertedDim.getAnnotations().add(this.convertToAnnotationInstance((Annotation) annot)));
				LayoutInformationConverter.convertToMinimalLayoutInformation(convertedDim, dim);
				arrDimContainer.getArrayDimensionsBefore().add(convertedDim);
			});
		}
	}
	
	@SuppressWarnings("unchecked")
	org.emftext.language.java.statements.Block convertToBlock(Block block) {
		org.emftext.language.java.statements.Block result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createBlock();
		block.statements().forEach(obj -> result.getStatements().add(null));
		LayoutInformationConverter.convertToMinimalLayoutInformation(result, block);
		return result;
	}
	
	@SuppressWarnings("unchecked")
	org.emftext.language.java.statements.Statement convertToStatement(Statement statement) {
		if (statement.getNodeType() == ASTNode.ASSERT_STATEMENT) {
			AssertStatement assertSt = (AssertStatement) statement;
			org.emftext.language.java.statements.Assert result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createAssert();
			result.setCondition(this.convertToExpression(assertSt.getExpression()));
			if (assertSt.getMessage() != null) {
				result.setErrorMessage(this.convertToExpression(assertSt.getMessage()));
			}
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, assertSt);
			return result;
		} else if (statement.getNodeType() == ASTNode.BLOCK) {
			return this.convertToBlock((Block) statement);
		} else if (statement.getNodeType() == ASTNode.BREAK_STATEMENT) {
			BreakStatement breakSt = (BreakStatement) statement;
			org.emftext.language.java.statements.Break result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createBreak();
			if (breakSt.getLabel() != null) {
				org.emftext.language.java.statements.JumpLabel proxyTarget = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createJumpLabel();
				((InternalEObject) proxyTarget).eSetProxyURI(null);
				this.convertToSimpleNameOnlyAndSet(breakSt.getLabel(), proxyTarget);
				result.setTarget(proxyTarget);
			}
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, breakSt);
			return result;
		} else if (statement.getNodeType() == ASTNode.CONTINUE_STATEMENT) {
			ContinueStatement conSt = (ContinueStatement) statement;
			org.emftext.language.java.statements.Continue result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createContinue();
			if (conSt.getLabel() != null) {
				org.emftext.language.java.statements.JumpLabel proxyTarget = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createJumpLabel();
				((InternalEObject) proxyTarget).eSetProxyURI(null);
				this.convertToSimpleNameOnlyAndSet(conSt.getLabel(), proxyTarget);
				result.setTarget(proxyTarget);
			}
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, conSt);
			return result;
		} else if (statement.getNodeType() == ASTNode.DO_STATEMENT) {
			DoStatement doSt = (DoStatement) statement;
			org.emftext.language.java.statements.DoWhileLoop result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createDoWhileLoop();
			result.setCondition(this.convertToExpression(doSt.getExpression()));
			result.setStatement(this.convertToStatement(doSt.getBody()));
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, doSt);
			return result;
		} else if (statement.getNodeType() == ASTNode.EMPTY_STATEMENT) {
			org.emftext.language.java.statements.EmptyStatement result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createEmptyStatement();
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, statement);
			return result;
		} else if (statement.getNodeType() == ASTNode.ENHANCED_FOR_STATEMENT) {
			EnhancedForStatement forSt = (EnhancedForStatement) statement;
			org.emftext.language.java.statements.ForEachLoop result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createForEachLoop();
			result.setNext(null);
			forSt.getParameter();
			result.setCollection(this.convertToExpression(forSt.getExpression()));
			result.setStatement(this.convertToStatement(forSt.getBody()));
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, forSt);
			return result;
		} else if (statement.getNodeType() == ASTNode.EXPRESSION_STATEMENT) {
			ExpressionStatement exprSt = (ExpressionStatement) statement;
			org.emftext.language.java.statements.ExpressionStatement result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createExpressionStatement();
			result.setExpression(this.convertToExpression(exprSt.getExpression()));
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, exprSt);
			return result;
		} else if (statement.getNodeType() == ASTNode.FOR_STATEMENT) {
			ForStatement forSt = (ForStatement) statement;
			org.emftext.language.java.statements.ForLoop result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createForLoop();
			forSt.initializers();
			result.setCondition(this.convertToExpression(forSt.getExpression()));
			forSt.updaters().forEach(obj -> result.getUpdates().add(this.convertToExpression((Expression) obj)));
			result.setStatement(this.convertToStatement(forSt.getBody()));
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, forSt);
			return result;
		} else if (statement.getNodeType() == ASTNode.IF_STATEMENT) {
			IfStatement ifSt = (IfStatement) statement;
			org.emftext.language.java.statements.Condition result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createCondition();
			result.setCondition(this.convertToExpression(ifSt.getExpression()));
			result.setStatement(this.convertToStatement(ifSt.getThenStatement()));
			if (ifSt.getElseStatement() != null) {
				result.setElseStatement(this.convertToStatement(ifSt.getElseStatement()));
			}
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, ifSt);
			return result;
		} else if (statement.getNodeType() == ASTNode.LABELED_STATEMENT) {
			LabeledStatement labelSt = (LabeledStatement) statement;
			org.emftext.language.java.statements.JumpLabel result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createJumpLabel();
			this.convertToSimpleNameOnlyAndSet(labelSt.getLabel(), result);
			result.setStatement(this.convertToStatement(labelSt.getBody()));
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, labelSt);
			return result;
		} else if (statement.getNodeType() == ASTNode.RETURN_STATEMENT) {
			ReturnStatement retSt = (ReturnStatement) statement;
			org.emftext.language.java.statements.Return result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createReturn();
			if (retSt.getExpression() != null) {
				result.setReturnValue(this.convertToExpression(retSt.getExpression()));
			}
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, retSt);
			return result;
		} else if (statement.getNodeType() == ASTNode.SWITCH_STATEMENT) {
			return this.convertToSwitch((SwitchStatement) statement);
		} else if (statement.getNodeType() == ASTNode.SYNCHRONIZED_STATEMENT) {
			SynchronizedStatement synSt = (SynchronizedStatement) statement;
			org.emftext.language.java.statements.SynchronizedBlock result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createSynchronizedBlock();
			result.setLockProvider(this.convertToExpression(synSt.getExpression()));
			result.setBlock(this.convertToBlock(synSt.getBody()));
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, synSt);
			return result;
		} else if (statement.getNodeType() == ASTNode.THROW_STATEMENT) {
			ThrowStatement throwSt = (ThrowStatement) statement;
			org.emftext.language.java.statements.Throw result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createThrow();
			result.setThrowable(this.convertToExpression(throwSt.getExpression()));
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, throwSt);
			return result;
		} else if (statement.getNodeType() == ASTNode.TRY_STATEMENT) {
			TryStatement trySt = (TryStatement) statement;
			org.emftext.language.java.statements.TryBlock result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createTryBlock();
			trySt.resources();
			result.setBlock(this.convertToBlock(trySt.getBody()));
			trySt.catchClauses().forEach(obj -> result.getCatchBlocks().add(this.convertToCatchBlock((CatchClause) obj)));
			if (trySt.getFinally() != null) {
				result.setFinallyBlock(this.convertToBlock(trySt.getFinally()));
			}
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, trySt);
			return result;
		} else if (statement.getNodeType() == ASTNode.TYPE_DECLARATION_STATEMENT) {
			TypeDeclarationStatement declSt = (TypeDeclarationStatement) statement;
			declSt.getDeclaration();
		} else if (statement.getNodeType() == ASTNode.VARIABLE_DECLARATION_STATEMENT) {
			VariableDeclarationStatement varSt = (VariableDeclarationStatement) statement;
			org.emftext.language.java.statements.LocalVariableStatement result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createLocalVariableStatement();
			org.emftext.language.java.variables.LocalVariable locVar = org.emftext.language.java.variables.VariablesFactory.eINSTANCE.createLocalVariable();
			varSt.modifiers().forEach(obj -> locVar.getAnnotationsAndModifiers().add(this.convertToModifier((Modifier) obj)));
			locVar.setTypeReference(this.convertToTypeReference(varSt.getType()));
			varSt.fragments();
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, varSt);
			return result;
		} else if (statement.getNodeType() == ASTNode.WHILE_STATEMENT) {
			WhileStatement whileSt = (WhileStatement) statement;
			org.emftext.language.java.statements.WhileLoop result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createWhileLoop();
			result.setCondition(this.convertToExpression(whileSt.getExpression()));
			result.setStatement(this.convertToStatement(whileSt.getBody()));
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, whileSt);
			return result;
		}
		return null;
	}
	
	private org.emftext.language.java.statements.Switch convertToSwitch(SwitchStatement switchSt) {
		org.emftext.language.java.statements.Switch result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createSwitch();
		result.setVariable(this.convertToExpression(switchSt.getExpression()));
		org.emftext.language.java.statements.SwitchCase currentCase = null;
		for (int index = 0; index < switchSt.statements().size(); index++) {
			Statement st = (Statement) switchSt.statements().get(index);
			if (st.getNodeType() == ASTNode.SWITCH_CASE) {
				currentCase = this.convertToSwitchCase((SwitchCase) st);
				result.getCases().add(currentCase);
			} else {
				currentCase.getStatements().add(this.convertToStatement(st));
			}
		}
		LayoutInformationConverter.convertToMinimalLayoutInformation(result, switchSt);
		return result;
	}
	
	private org.emftext.language.java.statements.SwitchCase convertToSwitchCase(SwitchCase switchCase) {
		org.emftext.language.java.statements.SwitchCase result = null;
//		if (switchCase.isSwitchLabeledRule() && switchCase.isDefault()) {
//			result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createDefaultSwitchRule();
//		} else if (switchCase.isSwitchLabeledRule() && !switchCase.isDefault()) {
//			org.emftext.language.java.statements.NormalSwitchRule normalRule = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createNormalSwitchRule();
//			normalRule.setCondition(this.convertToExpression((Expression) switchCase.expressions().get(0)));
//			for (int index = 1; index < switchCase.expressions().size(); index++) {
//				Expression expr = (Expression) switchCase.expressions().get(index);
//				normalRule.getAdditionalConditions().add(this.convertToExpression(expr));
//			}
//			result = normalRule;
//		} else if (!switchCase.isSwitchLabeledRule() && switchCase.isDefault()) {
//			result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createDefaultSwitchCase();
//		} else { // !switchCase.isSwitchLabeledRule() && !switchCase.isDefault()
//			org.emftext.language.java.statements.NormalSwitchCase normalCase = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createNormalSwitchCase();
//			normalCase.setCondition(this.convertToExpression((Expression) switchCase.expressions().get(0)));
//			for (int index = 1; index < switchCase.expressions().size(); index++) {
//				Expression expr = (Expression) switchCase.expressions().get(index);
//				normalCase.getAdditionalConditions().add(this.convertToExpression(expr));
//			}
//			result = normalCase;
//		}
//		LayoutInformationConverter.convertToMinimalLayoutInformation(result, switchCase);
		return result;
	}
	
	private org.emftext.language.java.statements.CatchBlock convertToCatchBlock(CatchClause block) {
		org.emftext.language.java.statements.CatchBlock result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createCatchBlock();
		block.getException();
		result.setBlock(this.convertToBlock(block.getBody()));
		LayoutInformationConverter.convertToMinimalLayoutInformation(result, block);
		return result;
	}
}
