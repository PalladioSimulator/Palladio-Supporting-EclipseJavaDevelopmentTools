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
import org.eclipse.jdt.core.dom.AssertStatement;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.BreakStatement;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ContinueStatement;
import org.eclipse.jdt.core.dom.DoStatement;
import org.eclipse.jdt.core.dom.EnhancedForStatement;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.ForStatement;
import org.eclipse.jdt.core.dom.IfStatement;
import org.eclipse.jdt.core.dom.LabeledStatement;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.SwitchCase;
import org.eclipse.jdt.core.dom.SwitchStatement;
import org.eclipse.jdt.core.dom.SynchronizedStatement;
import org.eclipse.jdt.core.dom.ThrowStatement;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclarationStatement;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.jdt.core.dom.WhileStatement;

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
			node.getPackage().annotations().forEach(obj -> finalRoot.getAnnotations().add(AnnotationInstanceOrModifierConverterUtility
				.convertToAnnotationInstance((Annotation) obj)));
			BaseConverterUtility.convertToNamespacesAndSet(node.getPackage().getName(), root);
		}
		super.visit(node);
		return false;
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
			result.setCondition(ExpressionConverterUtility.convertToExpression(assertSt.getExpression()));
			if (assertSt.getMessage() != null) {
				result.setErrorMessage(ExpressionConverterUtility.convertToExpression(assertSt.getMessage()));
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
				BaseConverterUtility.convertToSimpleNameOnlyAndSet(breakSt.getLabel(), proxyTarget);
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
				BaseConverterUtility.convertToSimpleNameOnlyAndSet(conSt.getLabel(), proxyTarget);
				result.setTarget(proxyTarget);
			}
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, conSt);
			return result;
		} else if (statement.getNodeType() == ASTNode.DO_STATEMENT) {
			DoStatement doSt = (DoStatement) statement;
			org.emftext.language.java.statements.DoWhileLoop result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createDoWhileLoop();
			result.setCondition(ExpressionConverterUtility.convertToExpression(doSt.getExpression()));
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
			result.setCollection(ExpressionConverterUtility.convertToExpression(forSt.getExpression()));
			result.setStatement(this.convertToStatement(forSt.getBody()));
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, forSt);
			return result;
		} else if (statement.getNodeType() == ASTNode.EXPRESSION_STATEMENT) {
			ExpressionStatement exprSt = (ExpressionStatement) statement;
			org.emftext.language.java.statements.ExpressionStatement result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createExpressionStatement();
			result.setExpression(ExpressionConverterUtility.convertToExpression(exprSt.getExpression()));
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, exprSt);
			return result;
		} else if (statement.getNodeType() == ASTNode.FOR_STATEMENT) {
			ForStatement forSt = (ForStatement) statement;
			org.emftext.language.java.statements.ForLoop result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createForLoop();
			forSt.initializers();
			result.setCondition(ExpressionConverterUtility.convertToExpression(forSt.getExpression()));
			forSt.updaters().forEach(obj -> result.getUpdates().add(ExpressionConverterUtility.convertToExpression((Expression) obj)));
			result.setStatement(this.convertToStatement(forSt.getBody()));
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, forSt);
			return result;
		} else if (statement.getNodeType() == ASTNode.IF_STATEMENT) {
			IfStatement ifSt = (IfStatement) statement;
			org.emftext.language.java.statements.Condition result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createCondition();
			result.setCondition(ExpressionConverterUtility.convertToExpression(ifSt.getExpression()));
			result.setStatement(this.convertToStatement(ifSt.getThenStatement()));
			if (ifSt.getElseStatement() != null) {
				result.setElseStatement(this.convertToStatement(ifSt.getElseStatement()));
			}
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, ifSt);
			return result;
		} else if (statement.getNodeType() == ASTNode.LABELED_STATEMENT) {
			LabeledStatement labelSt = (LabeledStatement) statement;
			org.emftext.language.java.statements.JumpLabel result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createJumpLabel();
			BaseConverterUtility.convertToSimpleNameOnlyAndSet(labelSt.getLabel(), result);
			result.setStatement(this.convertToStatement(labelSt.getBody()));
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, labelSt);
			return result;
		} else if (statement.getNodeType() == ASTNode.RETURN_STATEMENT) {
			ReturnStatement retSt = (ReturnStatement) statement;
			org.emftext.language.java.statements.Return result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createReturn();
			if (retSt.getExpression() != null) {
				result.setReturnValue(ExpressionConverterUtility.convertToExpression(retSt.getExpression()));
			}
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, retSt);
			return result;
		} else if (statement.getNodeType() == ASTNode.SWITCH_STATEMENT) {
			return this.convertToSwitch((SwitchStatement) statement);
		} else if (statement.getNodeType() == ASTNode.SYNCHRONIZED_STATEMENT) {
			SynchronizedStatement synSt = (SynchronizedStatement) statement;
			org.emftext.language.java.statements.SynchronizedBlock result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createSynchronizedBlock();
			result.setLockProvider(ExpressionConverterUtility.convertToExpression(synSt.getExpression()));
			result.setBlock(this.convertToBlock(synSt.getBody()));
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, synSt);
			return result;
		} else if (statement.getNodeType() == ASTNode.THROW_STATEMENT) {
			ThrowStatement throwSt = (ThrowStatement) statement;
			org.emftext.language.java.statements.Throw result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createThrow();
			result.setThrowable(ExpressionConverterUtility.convertToExpression(throwSt.getExpression()));
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
			varSt.modifiers().forEach(obj -> locVar.getAnnotationsAndModifiers().add(AnnotationInstanceOrModifierConverterUtility
				.convertToModifier((Modifier) obj)));
			locVar.setTypeReference(BaseConverterUtility.convertToTypeReference(varSt.getType()));
			varSt.fragments();
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, varSt);
			return result;
		} else if (statement.getNodeType() == ASTNode.WHILE_STATEMENT) {
			WhileStatement whileSt = (WhileStatement) statement;
			org.emftext.language.java.statements.WhileLoop result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createWhileLoop();
			result.setCondition(ExpressionConverterUtility.convertToExpression(whileSt.getExpression()));
			result.setStatement(this.convertToStatement(whileSt.getBody()));
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, whileSt);
			return result;
		}
		return null;
	}
	
	private org.emftext.language.java.statements.Switch convertToSwitch(SwitchStatement switchSt) {
		org.emftext.language.java.statements.Switch result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createSwitch();
		result.setVariable(ExpressionConverterUtility.convertToExpression(switchSt.getExpression()));
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
		if (switchCase.isSwitchLabeledRule() && switchCase.isDefault()) {
			result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createDefaultSwitchRule();
		} else if (switchCase.isSwitchLabeledRule() && !switchCase.isDefault()) {
			org.emftext.language.java.statements.NormalSwitchRule normalRule = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createNormalSwitchRule();
			normalRule.setCondition(ExpressionConverterUtility.convertToExpression((Expression) switchCase.expressions().get(0)));
			for (int index = 1; index < switchCase.expressions().size(); index++) {
				Expression expr = (Expression) switchCase.expressions().get(index);
				normalRule.getAdditionalConditions().add(ExpressionConverterUtility.convertToExpression(expr));
			}
			result = normalRule;
		} else if (!switchCase.isSwitchLabeledRule() && switchCase.isDefault()) {
			result = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createDefaultSwitchCase();
		} else { // !switchCase.isSwitchLabeledRule() && !switchCase.isDefault()
			org.emftext.language.java.statements.NormalSwitchCase normalCase = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createNormalSwitchCase();
			normalCase.setCondition(ExpressionConverterUtility.convertToExpression((Expression) switchCase.expressions().get(0)));
			for (int index = 1; index < switchCase.expressions().size(); index++) {
				Expression expr = (Expression) switchCase.expressions().get(index);
				normalCase.getAdditionalConditions().add(ExpressionConverterUtility.convertToExpression(expr));
			}
			result = normalCase;
		}
		LayoutInformationConverter.convertToMinimalLayoutInformation(result, switchCase);
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
