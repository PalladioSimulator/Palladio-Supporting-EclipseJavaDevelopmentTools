/*******************************************************************************
 * Copyright (c) 2006-2012
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

package org.emftext.language.java.test;

import java.math.BigInteger;

import org.eclipse.jdt.core.dom.*;

/**
 * An extension of the JDT ASTMatcher that prints information
 * whenever the matching of two ASTs fails. In addition some
 * normalizations are applied to number literals to removed
 * redundant characters that can cause comparison failures
 * even though the numbers are the same.
 */
public class TalkativeASTMatcher extends ASTMatcher {

	public TalkativeASTMatcher(boolean b) {
		super(b);
	}

	@Override
	public boolean match(AnnotationTypeDeclaration node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(AnnotationTypeMemberDeclaration node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(AnonymousClassDeclaration node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(ArrayAccess node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(ArrayCreation node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(ArrayInitializer node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(ArrayType node, Object other) {
		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(AssertStatement node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(Assignment node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(Block node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(BlockComment node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(BooleanLiteral node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(BreakStatement node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(CastExpression node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(CatchClause node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(CharacterLiteral node, Object other) {
		if (!(other instanceof CharacterLiteral)) {
			return false;
		}
		CharacterLiteral o = (CharacterLiteral) other;
		String oToken = o.getEscapedValue();
		String nToken = node.getEscapedValue();

		//octal notation and escaped characters
		if (oToken.matches("\\'\\\\.+\\'")) {
			oToken = oToken.substring(1, oToken.length() - 1);
			oToken = "'" + CharacterEscaper.unescapeEscapedCharacters(oToken) + "'";
		}
		if (nToken.matches("\\'\\\\.+\\'")) {
			nToken = nToken.substring(1, nToken.length() - 1);
			nToken = "'" + CharacterEscaper.unescapeEscapedCharacters(nToken) + "'";
		}
		return setDiff(node, other, safeEquals(nToken, oToken));
	}

	@Override
	public boolean match(ClassInstanceCreation node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(CompilationUnit node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(ConditionalExpression node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(ConstructorInvocation node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(ContinueStatement node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}
	
	@Override
	public boolean match(CreationReference node, Object other) {
		return setDiff(node, other, super.match(node, other));
	}
	
	@Override
	public boolean match(Dimension node, Object other) {
		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(DoStatement node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(EmptyStatement node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(EnhancedForStatement node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(EnumConstantDeclaration node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(EnumDeclaration node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}
	
	@Override
	public boolean match(ExportsDirective node, Object other) {
		return setDiff(node, other, super.match(node, other));
	}
	
	@Override
	public boolean match(ExpressionMethodReference node, Object other) {
		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(ExpressionStatement node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(FieldAccess node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(FieldDeclaration node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(ForStatement node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(IfStatement node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(ImportDeclaration node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(InfixExpression node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(Initializer node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(InstanceofExpression node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}
	
	@Override
	public boolean match(IntersectionType node, Object other) {
		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(Javadoc node, Object other) {
		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(LabeledStatement node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}
	
	@Override
	public boolean match(LambdaExpression node, Object other) {
		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(LineComment node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(MarkerAnnotation node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(MemberRef node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(MemberValuePair node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(MethodDeclaration node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(MethodInvocation node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(MethodRef node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(MethodRefParameter node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(Modifier node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}
	
	@Override
	public boolean match(ModuleDeclaration node, Object other) {
		return setDiff(node, other, super.match(node, other));
	}
	
	@Override
	public boolean match(ModuleModifier node, Object other) {
		return setDiff(node, other, super.match(node, other));
	}
	
	@Override
	public boolean match(NameQualifiedType node, Object other) {
		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(NormalAnnotation node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(NullLiteral node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(NumberLiteral node, Object other) {
		String oToken = null;

		if (other instanceof PrefixExpression) {
			oToken = ((PrefixExpression)other).toString();
		}
		else if (other instanceof NumberLiteral) {
			oToken = ((NumberLiteral)other).getToken();
		}
		else {
			return setDiff(node, other, false);
		}
		String nToken = node.getToken();

		return setDiff(node, other, numberMatch(nToken, oToken));
	}

	private boolean numberMatch(String nToken, String oToken) {
		nToken = normalizeNumberToken(nToken);
		oToken = normalizeNumberToken(oToken);
		boolean equals = safeEquals(nToken, oToken);
		return equals;
	}

	private String normalizeNumberToken(String token) {
		token = token.toLowerCase();
		token = token.replaceAll("_", "");

		if (token.endsWith("f")) {
			token = token.substring(0, token.length() - 1);
		}
		if (token.endsWith("d")) {
			token = token.substring(0, token.length() - 1);
		}
		if (token.endsWith("l")) {
			token = token.substring(0, token.length() - 1);
		}
		
		if (token.startsWith("-0x")) {
			token = token.substring(1);
			token = "-" + normalizeNumberToken(token);
		}
		if (token.contains(".") || token.contains("p") || token.contains("e")) {
			token = "" + Double.parseDouble(token);
		}
		
		if (token.matches("0x[0-9,a-f]+")) {
			token = new BigInteger(token.substring(2), 16).toString();
		}
		if (token.matches("0[0-9]+")) {
			token = new BigInteger(token.substring(0), 8).toString();
		}
		if (token.matches("0b[0-1]+")) {
			token = new BigInteger(token.substring(2), 2).toString();
		}
		
		if (token.startsWith("- ")) {
			token = "-" + token.substring(2);
		}
		
		return token;
	}

	@Override
	public boolean match(OpensDirective node, Object other) {
		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(PackageDeclaration node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(ParameterizedType node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(ParenthesizedExpression node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(PostfixExpression node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(PrefixExpression node, Object other) {

		if (other instanceof NumberLiteral) {
			String nToken = node.toString();
			String oToken = ((NumberLiteral)other).getToken();
			return setDiff(node, other, numberMatch(nToken, oToken));
		}
		else {
			return setDiff(node, other, super.match(node, other));
		}

	}

	@Override
	public boolean match(PrimitiveType node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}
	
	@Override
	public boolean match(ProvidesDirective node, Object other) {
		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(QualifiedName node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(QualifiedType node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}
	
	@Override
	public boolean match(RequiresDirective node, Object other) {
		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(ReturnStatement node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(SimpleName node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(SimpleType node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(SingleMemberAnnotation node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(SingleVariableDeclaration node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(StringLiteral node, Object other) {
		if (!(other instanceof StringLiteral)) {
			return setDiff(node, other, false);
		}
		StringLiteral o = (StringLiteral) other;

		String nString = node.getEscapedValue();
		String oString = o.getEscapedValue();

		//normalize escaped strings
		nString = CharacterEscaper.unescapeEscapedCharacters(nString);
		oString = CharacterEscaper.unescapeEscapedCharacters(oString);

		return setDiff(node, other, safeEquals(nString, oString));
	}

	@Override
	public boolean match(SuperConstructorInvocation node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(SuperFieldAccess node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(SuperMethodInvocation node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}
	
	@Override
	public boolean match(SuperMethodReference node, Object other) {
		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(SwitchCase node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}
	
	@Override
	public boolean match(SwitchExpression node, Object other) {
		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(SwitchStatement node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(SynchronizedStatement node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(TagElement node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(TextElement node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(ThisExpression node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(ThrowStatement node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(TryStatement node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}


	@Override
	public boolean match(TypeDeclaration node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(TypeDeclarationStatement node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(TypeLiteral node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}
	
	@Override
	public boolean match(TypeMethodReference node, Object other) {
		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(TypeParameter node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}
	
	@Override
	public boolean match(UnionType node, Object other) {
		return setDiff(node, other, super.match(node, other));
	}
	
	@Override
	public boolean match(UsesDirective node, Object other) {
		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(VariableDeclarationExpression node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(VariableDeclarationFragment node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(VariableDeclarationStatement node, Object other) {
		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(WhileStatement node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}

	@Override
	public boolean match(WildcardType node, Object other) {

		return setDiff(node, other, super.match(node, other));
	}
	
	@Override
	public boolean match(YieldStatement node, Object other) {
		return setDiff(node, other, super.match(node, other));
	}


	private String diff = "";

	private boolean setDiff(Object o1, Object o2, boolean result) {
		if (!result) {
			diff += ("\nORIGINAL: \n");
			if (o1 instanceof ASTNode) {
				diff += "(POSITION: " + ((ASTNode) o1).getStartPosition() + ")\n";
			}	
			diff += (o1.toString());
			diff += ("\nREPRINT:\n");
			if (o2 instanceof ASTNode) {
				diff += "(POSITION: " + ((ASTNode) o2).getStartPosition() + ")\n";
			}
			diff += (o2.toString());
			diff += ("\n--------\n");
		}
		return result;
	}

	public String getDiff() {
		return diff;
	}

}
