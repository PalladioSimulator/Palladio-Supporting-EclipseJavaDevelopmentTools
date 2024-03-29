/*******************************************************************************
 * Copyright (c) 2006-2014
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.BadLocationException;
import org.emftext.language.java.classifiers.Annotation;
import org.emftext.language.java.classifiers.Classifier;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.classifiers.Enumeration;
import org.emftext.language.java.classifiers.Interface;
import org.emftext.language.java.commons.NamedElement;
import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.containers.JavaRoot;
import org.emftext.language.java.expressions.Expression;
import org.emftext.language.java.expressions.RelationExpression;
import org.emftext.language.java.expressions.ShiftExpression;
import org.emftext.language.java.imports.ClassifierImport;
import org.emftext.language.java.imports.Import;
import org.emftext.language.java.imports.StaticImport;
import org.emftext.language.java.literals.BooleanLiteral;
import org.emftext.language.java.literals.CharacterLiteral;
import org.emftext.language.java.literals.DecimalDoubleLiteral;
import org.emftext.language.java.literals.DecimalFloatLiteral;
import org.emftext.language.java.literals.DecimalIntegerLiteral;
import org.emftext.language.java.literals.DecimalLongLiteral;
import org.emftext.language.java.literals.HexDoubleLiteral;
import org.emftext.language.java.literals.HexFloatLiteral;
import org.emftext.language.java.literals.HexIntegerLiteral;
import org.emftext.language.java.literals.HexLongLiteral;
import org.emftext.language.java.literals.IntegerLiteral;
import org.emftext.language.java.literals.LongLiteral;
import org.emftext.language.java.literals.OctalIntegerLiteral;
import org.emftext.language.java.literals.OctalLongLiteral;
import org.emftext.language.java.members.ClassMethod;
import org.emftext.language.java.members.Constructor;
import org.emftext.language.java.members.Field;
import org.emftext.language.java.members.Member;
import org.emftext.language.java.members.Method;
import org.emftext.language.java.operators.LessThan;
import org.emftext.language.java.parameters.VariableLengthParameter;
import org.emftext.language.java.references.IdentifierReference;
import org.emftext.language.java.references.MethodCall;
import org.emftext.language.java.references.PackageReference;
import org.emftext.language.java.references.StringReference;
import org.emftext.language.java.statements.Block;
import org.emftext.language.java.statements.ExpressionStatement;
import org.emftext.language.java.statements.ForEachLoop;
import org.emftext.language.java.statements.Statement;
import org.emftext.language.java.types.TypeReference;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import jamopp.options.ParserOptions;
import pkg.NumberLiterals;

/**
 * JUnit test suite to test the JaMoPP parser. New tests should by added by:
 * <ul>
 * <li>putting a Java source file that contains valid Java classes to parse to
 * the <code>src-input</code> folder of this plug-in</li>
 * <li>declaring a test case in this path of Java source relative to the input
 * folder file to the method parseResource(String relativePath)</li>
 * <li>checking the returned CompilationUnit for correctness</li>
 * </ul>
 * 
 * @author Christian Wende
 */
public class OldJaMoPPParserTests extends AbstractJaMoPPTests {

	private static final String JAVA_FILE_EXTENSION = ".java";

	protected static final String TEST_INPUT_FOLDER = "src-input";

	@Override
	protected Map<Object, Object> getLoadOptions() {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		return map;
	}

	private void assertParsableAndReprintable(String filename) throws Exception, IOException, BadLocationException {

		JavaRoot root = parseResource(filename);
		assertType(root, CompilationUnit.class);
		CompilationUnit unit = (CompilationUnit) root;
		assertNotNull(unit);

		parseAndReprint(filename);
	}

	private void assertParsesToEnumAndReprints(final String typeName) throws Exception {
		String filename = typeName + JAVA_FILE_EXTENSION;
		CompilationUnit model = (CompilationUnit) parseResource(filename);
		assertNumberOfClassifiers(model, 1);
		Classifier declaration = model.getClassifiers().get(0);
		assertClassifierName(declaration, typeName);
		assertType(declaration, Enumeration.class);

		parseAndReprint(filename);
	}

	private void assertIsBooleanField(Member member, boolean expectedInitValue) {
		assertType(member, Field.class);
		Field booleanField = (Field) member;
		Expression initValueForBoolean = booleanField.getInitialValue();

		BooleanLiteral literal = (BooleanLiteral) initValueForBoolean;

		assertType(literal, BooleanLiteral.class);
		BooleanLiteral initLiteralForBoolean = (BooleanLiteral) literal;
		assertEquals(expectedInitValue, initLiteralForBoolean.isValue());
	}

	private void assertIsCharField(Member member, String expectedInitValue) {
		assertType(member, Field.class);
		Field charField = (Field) member;
		Expression initValue = charField.getInitialValue();

		CharacterLiteral literal = (CharacterLiteral) initValue;

		assertType(literal, CharacterLiteral.class);
		CharacterLiteral initLiteral = (CharacterLiteral) literal;
		assertEquals(expectedInitValue, initLiteral.getValue());
	}

	private void assertIsDoubleField(Member member, double expectedInitValue) {
		assertType(member, Field.class);
		Field charField = (Field) member;
		Expression initValue = charField.getInitialValue();

		DecimalDoubleLiteral literal = (DecimalDoubleLiteral) initValue;

		assertNotNull(literal, member.getName() + " is not a double field.");
		assertType(literal, DecimalDoubleLiteral.class);
		DecimalDoubleLiteral initLiteral = (DecimalDoubleLiteral) literal;
		assertEquals(expectedInitValue, initLiteral.getDecimalValue(), 0.0);
	}

	private void assertIsHexIntegerField(Member member, int expectedInitValue) {
		assertType(member, Field.class);
		Field longField = (Field) member;
		Expression initValue = longField.getInitialValue();

		IntegerLiteral literal = (IntegerLiteral) initValue;

		assertType(literal, HexIntegerLiteral.class);
		HexIntegerLiteral initLiteralForBoolean = (HexIntegerLiteral) literal;
		assertEquals(BigInteger.valueOf(expectedInitValue), initLiteralForBoolean.getHexValue());
	}

	private void assertIsDecimalIntegerField(Member member, int expectedInitValue) {
		assertType(member, Field.class);
		Field longField = (Field) member;
		Expression initValue = longField.getInitialValue();

		IntegerLiteral literal = (IntegerLiteral) initValue;

		assertType(literal, DecimalIntegerLiteral.class);
		DecimalIntegerLiteral initLiteralForBoolean = (DecimalIntegerLiteral) literal;
		assertEquals(BigInteger.valueOf(expectedInitValue), initLiteralForBoolean.getDecimalValue());
	}

	private void assertIsOctalLongField(Member member, String expectedInitValue) {
		assertType(member, Field.class);
		Field longField = (Field) member;
		Expression initValue = longField.getInitialValue();

		LongLiteral literal = (LongLiteral) initValue;

		assertType(literal, OctalLongLiteral.class);
		OctalLongLiteral initLiteralForBoolean = (OctalLongLiteral) literal;
		BigInteger expected;
		if (expectedInitValue.toLowerCase().startsWith("0x")) {
			expected = new BigInteger(expectedInitValue.substring(2), 16);
		} else {
			expected = new BigInteger(expectedInitValue);
		}
		assertEquals(expected, initLiteralForBoolean.getOctalValue());
	}

	private void assertIsHexLongField(Member member, String expectedInitValue) {
		assertType(member, Field.class);
		Field longField = (Field) member;
		Expression initValue = longField.getInitialValue();

		LongLiteral literal = (LongLiteral) initValue;

		assertType(literal, HexLongLiteral.class);
		HexLongLiteral initLiteralForBoolean = (HexLongLiteral) literal;
		BigInteger expected;
		if (expectedInitValue.toLowerCase().startsWith("0x")) {
			expected = new BigInteger(expectedInitValue.substring(2), 16);
		} else {
			expected = new BigInteger(expectedInitValue);
		}
		assertEquals(expected, initLiteralForBoolean.getHexValue());
	}

	private void assertIsDecimalLongField(Member member, String expectedInitValue) {
		assertType(member, Field.class);
		Field longField = (Field) member;
		Expression initValue = longField.getInitialValue();

		LongLiteral literal = (LongLiteral) initValue;

		assertType(literal, DecimalLongLiteral.class);
		DecimalLongLiteral initLiteralForBoolean = (DecimalLongLiteral) literal;
		BigInteger expected;
		if (expectedInitValue.toLowerCase().startsWith("0x")) {
			expected = new BigInteger(expectedInitValue.substring(2), 16);
		} else {
			expected = new BigInteger(expectedInitValue);
		}
		assertEquals(expected, initLiteralForBoolean.getDecimalValue());
	}

	private void assertIsNumericField(List<Member> members, String name, Object expectedValue) {

		NamedElement field = findElementByName(members, name);
		assertNotNull(field);
		assertType(field, Field.class);
		Field unicode = (Field) field;
		Expression value = unicode.getInitialValue();

		Object initValue = null;
		if (value instanceof DecimalIntegerLiteral) {
			initValue = ((DecimalIntegerLiteral) value).getDecimalValue();
		}
		if (value instanceof DecimalLongLiteral) {
			initValue = ((DecimalLongLiteral) value).getDecimalValue();
		}
		if (value instanceof DecimalFloatLiteral) {
			initValue = ((DecimalFloatLiteral) value).getDecimalValue();
		}
		if (value instanceof DecimalDoubleLiteral) {
			initValue = ((DecimalDoubleLiteral) value).getDecimalValue();
		}
		if (value instanceof HexIntegerLiteral) {
			initValue = ((HexIntegerLiteral) value).getHexValue();
		}
		if (value instanceof HexLongLiteral) {
			initValue = ((HexLongLiteral) value).getHexValue();
		}
		if (value instanceof HexFloatLiteral) {
			initValue = ((HexFloatLiteral) value).getHexValue();
		}
		if (value instanceof HexDoubleLiteral) {
			initValue = ((HexDoubleLiteral) value).getHexValue();
		}
		if (value instanceof OctalIntegerLiteral) {
			initValue = ((OctalIntegerLiteral) value).getOctalValue();
		}
		if (value instanceof OctalLongLiteral) {
			initValue = ((OctalLongLiteral) value).getOctalValue();
		}
		assertNotNull(initValue, "Init value for field " + name + " is null.");
		assertEquals(expectedValue, initValue, "Field " + name);
	}

	private void assertIsStringField(List<Member> members, String name, String expectedValue) {

		NamedElement field = findElementByName(members, name);
		assertNotNull(field);
		assertType(field, Field.class);
		Field unicode = (Field) field;
		Expression value = unicode.getInitialValue();

		StringReference literal = (StringReference) value;

		assertType(literal, StringReference.class);
		StringReference stringValue = (StringReference) literal;
		assertEquals("Unescaped value expected for field \"" + name + "\".", expectedValue, stringValue.getValue());
	}

	private void assertIsStringField(Member member, String expectedInitValue) {
		assertType(member, Field.class);
		Field charField = (Field) member;
		Expression initValue = charField.getInitialValue();

		StringReference literal = (StringReference) initValue;

		assertType(literal, StringReference.class);
		StringReference initLiteral = (StringReference) literal;
		assertEquals(expectedInitValue, initLiteral.getValue());
	}

	private <T extends NamedElement> T findElementByName(List<T> elements, String name) {
		for (T next : elements) {
			if (name.equals(next.getName())) {
				return next;
			}
		}
		return null;
	}

	@Override
	protected boolean isExcludedFromReprintTest(String filename) {
		return false;
	}

	@Override
	protected String getTestInputFolder() {
		return TEST_INPUT_FOLDER;
	}

	@Test
	public void testAnnotations() throws Exception {
		String typename = "Annotations";
		String filename = typename + JAVA_FILE_EXTENSION;
		Annotation annotation = assertParsesToAnnotation(typename);
		assertMemberCount(annotation, 11);

		parseAndReprint(filename);
	}

	@Test
	public void testAnnotationInstances() throws Exception {
		String typename = "AnnotationInstances";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 3);

		parseAndReprint(filename);
	}

	@Test
	public void testAnnotationsForInnerTypes() throws Exception {
		String typename = "AnnotationsForInnerTypes";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 4);

		parseAndReprint(filename);
	}

	@Test
	public void testAnnotationsForMethods() throws Exception {
		String typename = "AnnotationsForMethods";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 6);

		parseAndReprint(filename);
	}

	@Test
	@Disabled("Contains empty members that are not parsed by JDT.")
	public void testAnnotationsForParameters() throws Exception {
		String typename = "AnnotationsForParameters";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 15);

		parseAndReprint(filename);
	}

	@Test
	public void testAnnotationsForStatements() throws Exception {
		String typename = "AnnotationsForStatements";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 1);

		parseAndReprint(filename);
	}

	@Test
	public void testAnnotationsForAnnotations() throws Exception {
		String typename = "AnnotationsForAnnotations";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 2);

		parseAndReprint(filename);
	}

	@Test
	public void testAnnotationsAsAnnotationArguments() throws Exception {
		String typename = "AnnotationsAsAnnotationArguments";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 8);

		parseAndReprint(filename);
	}

	@Test
	public void testAnnotationsBetweenKeywords() throws Exception {
		String typename = "AnnotationsBetweenKeywords";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 7);

		parseAndReprint(filename);
	}

	@Test
	public void testAnnotationsForEnums() throws Exception {
		String typename = "AnnotationsForEnums";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Enumeration eenum = assertParsesToEnumeration(typename);
		assertMemberCount(eenum, 0);

		parseAndReprint(filename);
	}

	@Test
	public void testAnonymousEnum() throws Exception {
		String typename = "AnonymousEnum";
		String filename = typename + JAVA_FILE_EXTENSION;
		Enumeration enumeration = assertParsesToEnumeration(typename);
		// assert no members because enumeration constants are not members
		assertMemberCount(enumeration, 0);

		parseAndReprint(filename);
	}

	@Test
	public void testAnonymousEnumWithArguments() throws Exception {
		String typename = "AnonymousEnumWithArguments";
		String filename = typename + JAVA_FILE_EXTENSION;
		Enumeration enumeration = assertParsesToEnumeration(typename);
		// assert one member (the constructor) because enumeration constants are not
		// members
		assertMemberCount(enumeration, 1);

		parseAndReprint(filename);
	}

	@Test
	public void testAnonymousInner() throws Exception {
		String typename = "AnonymousInner";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 3);

		parseAndReprint(filename);
	}

	@Test
	public void testArguments() throws Exception {
		String typename = "Arguments";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 5);

		parseAndReprint(filename);
	}

	@Test
	public void testArrayInitializers() throws Exception {
		String typename = "ArrayInitializers";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 10);

		parseAndReprint(filename);
	}

	@Test
	public void testArraysInDeclarationsComplex() throws Exception {
		String typename = "ArraysInDeclarationsComplex";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 6);
		List<Member> members = clazz.getMembers();
		assertType(members.get(0), Field.class);
		assertType(members.get(1), Field.class);
		assertType(members.get(2), Field.class);
		assertType(members.get(3), Method.class);
		assertType(members.get(4), Method.class);

		parseAndReprint(filename);
	}

	@Test
	public void testArraysInDeclarationsSimple() throws Exception {
		String typename = "ArraysInDeclarationsSimple";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 5);
		List<Member> members = clazz.getMembers();

		assertType(members.get(0), Field.class);
		assertType(members.get(1), Field.class);
		assertType(members.get(2), Field.class);
		assertType(members.get(3), Method.class);
		assertType(members.get(4), Method.class);

		parseAndReprint(filename);
	}

	@Test
	public void testAssignments() throws Exception {
		String typename = "Assignments";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 2);
		List<Member> members = clazz.getMembers();

		assertType(members.get(0), Field.class);
		assertType(members.get(1), Block.class);

		parseAndReprint(filename);
	}

	@Test
	public void testBasicEnums() throws Exception {
		assertParsesToEnumAndReprints("BasicEnum");
		assertParsesToEnumAndReprints("BasicEnumWithCommaAndSemicolonAtTheEnd");
		assertParsesToEnumAndReprints("BasicEnumWithCommaAtTheEnd");
		assertParsesToEnumAndReprints("BasicEnumWithSemicolonAtTheEnd");
	}

	@Test
	public void testBooleanAssignments() throws Exception {
		String typename = "BooleanAssignments";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 1);

		parseAndReprint(filename);
	}

	@Test
	public void testBooleanExpressions() throws Exception {
		String typename = "BooleanExpressions";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 4);

		parseAndReprint(filename);
	}

	@Test
	public void testBlocks() throws Exception {
		String typename = "Blocks";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 3);

		parseAndReprint(filename);
	}

	@Test
	public void testCasting() throws Exception {
		String typename = "Casting";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 2);

		parseAndReprint(filename);
	}

	@Test
	public void testChainedCalls() throws Exception {
		String typename = "ChainedCalls";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 27);

		parseAndReprint(filename);
	}

	@Test
	@Disabled("Contains empty members that are not parsed by JDT.")
	public void testClassSemicolonOnly() throws Exception {
		String typename = "ClassSemicolonOnly";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 1);

		parseAndReprint(filename);
	}

	@Test
	public void testControlZ() throws Exception {
		String folder = "unicode/";
		assertParsableAndReprintable(folder + "ControlZ.java");
	}

	@Test
	public void testCrazyUnicode() throws Exception {
		String typename = "CrazyUnicode";
		String file = "pkg" + File.separator + typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass("pkg", typename);
		assertMemberCount(clazz, 2);

		parseAndReprint(file);
	}

	@Test
	public void testComments() throws Exception {
		String typename = "Comments";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 3);

		parseAndReprint(filename);
	}

	@Test
	public void testCommentsAtEOF() throws Exception {
		String typename = "CommentsAtEOF";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 0);

		parseAndReprint(filename);
	}

	@Test
	public void testCommentsInArrayInitializers() throws Exception {
		String typename = "CommentsInArrayInitializers";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 4);

		parseAndReprint(filename);
	}

	@Test
	public void testCommentsInFieldDeclaration() throws Exception {
		String typename = "CommentsInFieldDeclaration";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 1);

		parseAndReprint(filename);
	}

	@Test
	public void testCommentsBetweenCaseStatements() throws Exception {
		String typename = "CommentsBetweenCaseStatements";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 3);

		parseAndReprint(filename);
	}

	@Test
	public void testCommentsBetweenCatchClauses() throws Exception {
		String typename = "CommentsBetweenCatchClauses";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 1);

		parseAndReprint(filename);
	}

	@Test
	public void testCommentsBetweenConstructorArguments() throws Exception {
		String typename = "CommentsBetweenConstructorArguments";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 2);

		parseAndReprint(filename);
	}

	@Test
	public void testCommentsBetweenMethodArguments() throws Exception {
		String typename = "CommentsBetweenMethodArguments";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 1);

		parseAndReprint(filename);
	}

	@Test
	public void testCommentsBetweenReferenceSequenceParts() throws Exception {
		String typename = "CommentsBetweenReferenceSequenceParts";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 2);

		parseAndReprint(filename);
	}

	@Test
	public void testCommentsInParExpression() throws Exception {
		String typename = "CommentsInParExpression";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 1);

		parseAndReprint(filename);
	}

	@Test
	public void testClassWithEnumeratingFieldDeclaration() throws Exception {
		String typename = "ClassWithEnumeratingFieldDeclaration";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 1);

		List<Member> members = clazz.getMembers();
		assertType(members.get(0), Field.class);

		parseAndReprint(filename);
	}

	@Test
	public void testConditionalExpressions() throws Exception {
		String typename = "ConditionalExpressions";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 1);

		parseAndReprint(filename);
	}

	@Test
	public void testConstructorCalls() throws Exception {
		String typename = "ConstructorCalls";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 4);

		parseAndReprint(filename);
	}

	@Test
	public void testEmptyClass() throws Exception {
		String typename = "EmptyClass";
		String filename = typename + JAVA_FILE_EXTENSION;
		assertParsesToClass(typename);

		parseAndReprint(filename);
	}

	@Test
	public void testEmptyEnum() throws Exception {
		String typename = "EmptyEnum";
		String filename = typename + JAVA_FILE_EXTENSION;
		Enumeration enumeration = assertParsesToEnumeration(typename);
		assertEquals(0, enumeration.getMembers().size(), typename + " should have no members.");

		parseAndReprint(filename);
	}

	@Test
	public void testEmptyEnumWithSemicolon() throws Exception {
		assertParsesToEnumAndReprints("EmptyEnumWithSemicolon");
	}

	@Test
	public void testEmptyInterface() throws Exception {
		String typename = "EmptyInterface";
		String filename = typename + JAVA_FILE_EXTENSION;
		Interface interfaze = assertParsesToInterface(typename);
		assertEquals(0, interfaze.getMembers().size(), typename + " should have no members.");

		parseAndReprint(filename);
	}

	@Test
	public void testEnumImplementingTwoInterfaces() throws Exception {
		String typename = "EnumImplementingTwoInterfaces";
		String filename = typename + JAVA_FILE_EXTENSION;

		registerInClassPath("EmptyInterface" + JAVA_FILE_EXTENSION);
		registerInClassPath("IOneMethod" + JAVA_FILE_EXTENSION);

		Enumeration enumeration = assertParsesToEnumeration(typename);
		assertEquals(2, enumeration.getImplements().size(), typename + " implements two interfaces.");

		parseAndReprint(filename);
	}

	@Test
	public void testEnumValueMethodsUse() throws Exception {
		String typename = "EnumValueMethodsUse";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		Enumeration enumeration = (Enumeration) clazz.getMembers().get(0);
		assertMemberCount(enumeration, 0);
		parseAndReprint(filename);
	}

	@Test
	public void testEnumWithMember() throws Exception {
		String typename = "EnumWithMember";
		String filename = typename + JAVA_FILE_EXTENSION;
		Enumeration enumeration = assertParsesToEnumeration(typename);
		assertMemberCount(enumeration, 2);

		parseAndReprint(filename);
	}

	@Test
	public void testEnumWithConstructor() throws Exception {
		String typename = "EnumWithConstructor";
		String filename = typename + JAVA_FILE_EXTENSION;
		Enumeration enumeration = assertParsesToEnumeration(typename);
		assertMemberCount(enumeration, 1);

		parseAndReprint(filename);
	}

	@Test
	public void testEqualityExpression() throws Exception {
		String typename = "EqualityExpression";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 1);

		parseAndReprint(filename);
	}

	@Test
	public void testEscapedStrings() throws Exception {
		String typename = "EscapedStrings";
		String file = "pkg" + File.separator + typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass("pkg", typename);
		assertMemberCount(clazz, 9);

		parseAndReprint(file);
	}

	@Test
	public void testExceptionThrowing() throws Exception {
		String typename = "ExceptionThrowing";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);

		assertMemberCount(clazz, 7);

		List<Member> members = clazz.getMembers();
		assertConstructorThrowsCount(members.get(1), 1);
		assertConstructorThrowsCount(members.get(2), 2);
		assertMethodThrowsCount(members.get(3), 1);
		assertMethodThrowsCount(members.get(4), 3);
		assertMethodThrowsCount(members.get(5), 1);

		parseAndReprint(filename);
	}

	@Test
	public void testExplicitConstructorCalls() throws Exception {
		String typename = "ExplicitConstructorCalls";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);

		assertMemberCount(clazz, 3);

		parseAndReprint(filename);
	}

	@Test
	public void testExplicitGenericConstructorCalls() throws Exception {
		String typename = "ExplicitGenericConstructorCalls";
		String filename = typename + JAVA_FILE_EXTENSION;

		registerInClassPath("ConstructorCalls" + JAVA_FILE_EXTENSION);

		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);

		assertMemberCount(clazz, 4);

		parseAndReprint(filename);
	}

	@Test
	public void testExplicitGenericInvocation() throws Exception {
		String typename = "ExplicitGenericInvocation";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);

		assertMemberCount(clazz, 2);

		parseAndReprint(filename);
	}

	@Test
	public void testExpressions() throws Exception {
		String typename = "Expressions";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);

		assertMemberCount(clazz, 2);

		parseAndReprint(filename);
	}

	@Test
	public void testExpressionsAsMethodArguments() throws Exception {
		String typename = "ExpressionsAsMethodArguments";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);

		assertMemberCount(clazz, 3);

		parseAndReprint(filename);
	}

	@Disabled("Fails Maven build because of unknown reason.")
	@Test
	public void testLegalIdentifiers() throws Exception {
		String typename = "LegalIdentifiers";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);

		assertMemberCount(clazz, 1);

		parseAndReprint(filename);
	}

	@Test
	public void testForEachLoop() throws Exception {
		String typename = "ForEachLoop";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 3);

		Member simpleForEach = clazz.getMembers().get(1);
		assertType(simpleForEach, ClassMethod.class);
		ClassMethod simpleForEachMethod = (ClassMethod) simpleForEach;
		Statement forEach = simpleForEachMethod.getStatements().get(0);
		assertType(forEach, ForEachLoop.class);
		parseAndReprint(filename);
	}

	@Test
	public void testFullQualifiedNameReferences() throws Exception {
		boolean usesBindingsForResolution = ParserOptions.RESOLVE_BINDINGS.isTrue();

		String typename = "FullQualifiedNameReferences";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertResolveAllProxies(clazz);

		assertEquals(1, clazz.getMembers().size());
		Member firstMember = clazz.getMembers().get(0);
		assertType(firstMember, Method.class);
		Method method = (Method) firstMember;

		ExpressionStatement statement = (ExpressionStatement) method.getStatements().get(0);
		IdentifierReference ref = (IdentifierReference) statement.getExpression();
		if (usesBindingsForResolution) {
			assertType(ref.getTarget(), org.emftext.language.java.containers.Package.class);
			org.emftext.language.java.containers.Package p1 = (org.emftext.language.java.containers.Package) ref
					.getTarget();
			assertEquals(1, p1.getNamespaces().size());
			assertEquals("java", p1.getNamespaces().get(0));
		} else {
			assertType(ref.getTarget(), PackageReference.class);
			PackageReference p1 = (PackageReference) ref.getTarget();
			assertEquals(0, p1.getNamespaces().size());
			assertEquals("java", p1.getName());
		}

		ref = (IdentifierReference) ref.getNext();
		if (usesBindingsForResolution) {
			assertType(ref.getTarget(), org.emftext.language.java.containers.Package.class);
			org.emftext.language.java.containers.Package p1 = (org.emftext.language.java.containers.Package) ref
					.getTarget();
			assertEquals(2, p1.getNamespaces().size());
			assertEquals("java", p1.getNamespaces().get(0));
			assertEquals("lang", p1.getNamespaces().get(1));
		} else {
			assertType(ref.getTarget(), PackageReference.class);
			PackageReference p1 = (PackageReference) ref.getTarget();
			assertEquals(1, p1.getNamespaces().size());
			assertEquals("java", p1.getNamespaces().get(0));
			assertEquals("lang", p1.getName());
		}

		ref = (IdentifierReference) ref.getNext();
		if (usesBindingsForResolution) {
			assertType(ref.getTarget(), org.emftext.language.java.containers.Package.class);
			org.emftext.language.java.containers.Package p1 = (org.emftext.language.java.containers.Package) ref
					.getTarget();
			assertEquals(3, p1.getNamespaces().size());
			assertEquals("annotation", p1.getNamespaces().get(2));
		} else {
			assertType(ref.getTarget(), PackageReference.class);
			PackageReference p1 = (PackageReference) ref.getTarget();
			assertEquals(2, p1.getNamespaces().size());
			assertEquals("annotation", p1.getName());
		}

		parseAndReprint(filename);
	}

	@Test
	public void testGenericConstructorCalls() throws Exception {
		String typename = "GenericConstructorCalls";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 5);

		parseAndReprint(filename);
	}

	@Test
	public void testGenericConstructors() throws Exception {
		String typename = "GenericConstructors";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 4);

		List<Member> members = clazz.getMembers();
		assertConstructorTypeParameterCount(members.get(0), 1);
		assertConstructorTypeParameterCount(members.get(1), 2);
		assertConstructorTypeParameterCount(members.get(2), 1);
		assertConstructorTypeParameterCount(members.get(3), 2);

		parseAndReprint(filename);
	}

	@Test
	public void testGenericMethods() throws Exception {
		String typename = "GenericMethods";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 5);

		List<Member> members = clazz.getMembers();
		assertMethodTypeParameterCount(members.get(0), 1);
		assertMethodTypeParameterCount(members.get(1), 1);
		assertMethodTypeParameterCount(members.get(2), 2);
		assertMethodTypeParameterCount(members.get(3), 2);
		assertMethodTypeParameterCount(members.get(4), 3);

		parseAndReprint(filename);
	}

	@Test
	public void testGenericSuperConstructors() throws Exception {
		String typename = "GenericSuperConstructors";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 1);

		registerInClassPath("GenericConstructors" + JAVA_FILE_EXTENSION);

		parseAndReprint(filename);
	}

	@Test
	public void testIExtendsMultiple() throws Exception {
		testEmptyInterface();
		testIOneMethod();

		String typename = "IExtendsMultiple";
		String filename = typename + JAVA_FILE_EXTENSION;
		Interface interfaze = assertParsesToInterface(typename);

		assertEquals(2, interfaze.getExtends().size(), "IExtendsMultiple extends two interfaces.");

		parseAndReprint(filename);
	}

	@Test
	public void testIGenericMembers() throws Exception {
		String typename = "IGenericMembers";
		String filename = typename + JAVA_FILE_EXTENSION;
		Interface interfaze = assertParsesToInterface(typename);
		assertMemberCount(interfaze, 3);
		List<Member> members = interfaze.getMembers();
		assertType(members.get(0), Method.class);
		assertType(members.get(1), Interface.class);
		assertType(members.get(2), org.emftext.language.java.classifiers.Class.class);

		assertMethodTypeParameterCount(members.get(0), 1);
		assertInterfaceTypeParameterCount(members.get(1), 1);
		assertClassTypeParameterCount(members.get(2), 1);

		parseAndReprint(filename);
	}

	@Test
	public void testIMembers() throws Exception {
		String typename = "IMembers";
		String filename = typename + JAVA_FILE_EXTENSION;
		Interface interfaze = assertParsesToInterface(typename);

		assertMemberCount(interfaze, 5);

		List<Member> members = interfaze.getMembers();
		assertType(members.get(0), Field.class);
		assertType(members.get(1), Method.class);
		assertType(members.get(2), Interface.class);
		assertType(members.get(3), org.emftext.language.java.classifiers.Class.class);
		assertType(members.get(4), Enumeration.class);

		parseAndReprint(filename);
	}

	@Test
	public void testImport1() throws Exception {
		String typename = "Import1";
		String filename = typename + JAVA_FILE_EXTENSION;

		registerInClassPath("Import2" + JAVA_FILE_EXTENSION);

		CompilationUnit model = (CompilationUnit) parseResource(filename);
		assertNumberOfClassifiers(model, 1);

		parseAndReprint(filename);
	}

	@Test
	public void testImport2() throws Exception {
		String typename = "Import2";
		String filename = typename + JAVA_FILE_EXTENSION;

		CompilationUnit model = (CompilationUnit) parseResource(filename);
		assertNumberOfClassifiers(model, 1);

		registerInClassPath("Import1" + JAVA_FILE_EXTENSION);

		parseAndReprint(filename);
	}

	@Test
	public void testSpecialHierarchy() {
		try {
			CompilationUnit model = (CompilationUnit) parseResource("spechier" + File.separator + "SubClass.java");
			assertNumberOfClassifiers(model, 1);
			registerInClassPath("spechier" + File.separator + "ClassC.java");
			registerInClassPath("spechier" + File.separator + "SuperClass.java");
			parseAndReprint("spechier" + File.separator + "SubClass.java");
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testInstanceOfArrayType() throws Exception {
		String typename = "InstanceOfArrayType";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 3);

		parseAndReprint(filename);
	}

	@Test
	public void testInterfaces() throws Exception {
		String filename1 = "Interface1" + JAVA_FILE_EXTENSION;
		String filename2 = "Interface2" + JAVA_FILE_EXTENSION;
		String filename3 = "Interface3" + JAVA_FILE_EXTENSION;

		parseAndReprint(filename1);
		parseAndReprint(filename2);
		parseAndReprint(filename3);

		String typename = "InterfaceUse";
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 1);
		Statement s = ((Block) clazz.getMembers().get(0)).getStatements().get(1);
		ConcreteClassifier target = ((MethodCall) ((IdentifierReference) ((ExpressionStatement) s).getExpression())
				.getNext()).getTarget().getContainingConcreteClassifier();
		// should point at interface2 with the most concrete type as return type of
		// getX()
		assertEquals("Interface2", target.getName());
		parseAndReprint(typename + JAVA_FILE_EXTENSION);
	}

	@Test
	public void testJavadoc1() throws Exception {
		String filename1 = "JavaDocCommentBlock" + JAVA_FILE_EXTENSION;
		parseAndReprint(filename1);
	}

	@Test
	public void testJavadoc2() throws Exception {
		String filename2 = "JavaDocCommentInClass" + JAVA_FILE_EXTENSION;
		parseAndReprint(filename2);
	}

	@Test
	public void testJavadoc3() throws Exception {
		String filename3 = "JavaDocCommentInField" + JAVA_FILE_EXTENSION;
		parseAndReprint(filename3);
	}

	@Test
	public void testIOneMethod() throws Exception {
		String typename = "IOneMethod";
		String filename = typename + JAVA_FILE_EXTENSION;
		Interface interfaze = assertParsesToInterface(typename);
		assertMemberCount(interfaze, 1);

		parseAndReprint(filename);
	}

	@Test
	@Disabled("Contains empty members that are not parsed by JDT.")
	public void testISemicolonOnly() throws Exception {
		String typename = "ISemicolonOnly";
		String filename = typename + JAVA_FILE_EXTENSION;
		Interface interfaze = assertParsesToInterface(typename);
		assertMemberCount(interfaze, 1);

		parseAndReprint(filename);
	}

	@Test
	public void testITwoPublicVoidMethods() throws Exception {
		String typename = "ITwoPublicVoidMethods";
		String filename = typename + JAVA_FILE_EXTENSION;
		Interface interfaze = assertParsesToInterface(typename);
		assertMemberCount(interfaze, 2);

		List<Member> members = interfaze.getMembers();
		Member member1 = members.get(0);
		Member member2 = members.get(1);
		Method method1 = (Method) member1;
		Method method2 = (Method) member2;
		assertModifierCount(method1, 1);
		assertModifierCount(method2, 1);
		assertIsPublic(method1);
		assertIsPublic(method2);

		parseAndReprint(filename);
	}

	@Test
	public void testIWithComments() throws Exception {
		String typename = "IWithComments";
		String filename = typename + JAVA_FILE_EXTENSION;
		Interface interfaze = assertParsesToInterface(typename);
		assertMemberCount(interfaze, 2);

		parseAndReprint(filename);
	}

	@Test
	public void testLiterals() throws Exception {
		String typename = "Literals";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 27);

		List<Member> members = clazz.getMembers();
		// check the fields and their initialization values
		assertIsDecimalIntegerField(findElementByName(members, "i1"), 3);
		assertIsHexIntegerField(members.get(2), 1);
		assertIsOctalLongField(members.get(3), "8");
		assertIsOctalLongField(members.get(4), "0");
		assertIsDoubleField(members.get(9), 1.5);
		assertIsCharField(members.get(10), "a");
		assertIsStringField(members.get(11), "abc");
		assertIsBooleanField(members.get(12), false);
		assertIsBooleanField(members.get(13), true);

		Member maxLongField = findElementByName(members, "maxLong");
		assertNotNull(maxLongField);
		assertIsHexLongField(maxLongField, "0xffffffffffffffff");

		Member i7Field = findElementByName(members, "i7");
		assertNotNull(i7Field);
		assertIsHexIntegerField(i7Field, 0xff);

		Member i8Field = findElementByName(members, "i8");
		assertNotNull(i8Field);
		assertIsDecimalLongField(i8Field, "10");

		parseAndReprint(filename);
	}

	@Test
	public void testLocalVariableDeclarations() throws Exception {
		String typename = "LocalVariableDeclarations";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 2);

		parseAndReprint(filename);
	}

	@Test
	public void testLocation() throws Exception {
		String filename = "locations/Location.java";
		assertParsableAndReprintable(filename);
	}

	@Test
	public void testMembers() throws Exception {
		String typename = "Members";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 6);

		List<Member> members = clazz.getMembers();
		assertType(members.get(0), Field.class);
		assertType(members.get(1), Constructor.class);
		assertType(members.get(2), Method.class);
		assertType(members.get(3), Interface.class);
		assertType(members.get(4), org.emftext.language.java.classifiers.Class.class);
		assertType(members.get(5), Enumeration.class);

		parseAndReprint(filename);
	}

	@Test
	public void testResolving() throws Exception {
		String folder = "resolving/";

		registerInClassPath(folder + "MethodCallsWithoutInheritance.java");

		assertParsableAndReprintable(folder + "MethodCalls.java");
		assertParsableAndReprintable(folder + "MethodCallsWithLocalTypeReferences.java");
		assertParsableAndReprintable(folder + "MethodCallsWithoutInheritance.java");
		assertParsableAndReprintable(folder + "ReferenceToInheritedMethod.java");
		assertParsableAndReprintable(folder + "VariableReferencing.java");
	}

	@Test
	public void testMethodOverride() throws Exception {
		String typename = "MethodOverride";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 1);

		Statement s = ((Block) clazz.getMembers().get(0)).getStatements().get(1);
		ConcreteClassifier target = ((MethodCall) ((IdentifierReference) ((ExpressionStatement) s).getExpression())
				.getNext()).getTarget().getContainingConcreteClassifier();
		assertEquals("StringBuffer", target.getName());
		parseAndReprint(filename, getTestInputFolder(), TEST_OUTPUT_FOLDER);
	}

	@Test
	public void testMethodOverloading() throws Exception {
		String filename = "resolving_new/methodOverloading_2/MethodOverloading" + JAVA_FILE_EXTENSION;
		CompilationUnit cu = (CompilationUnit) parseResource(filename);
		ConcreteClassifier clazz = cu.getClassifiers().get(0);

		Statement s = ((ClassMethod) clazz.getMembers().get(2)).getStatements().get(2);
		ClassMethod target = (ClassMethod) ((MethodCall) ((ExpressionStatement) s).getExpression()).getTarget();
		assertEquals(clazz.getMembers().get(1), target);
		parseAndReprint(filename, getTestInputFolder(), TEST_OUTPUT_FOLDER);
	}

	@Test
	public void testMethodCallsWithLocalTypeReferences() throws Exception {
		String typename = "MethodCallsWithLocalTypeReferences";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 4);

		parseAndReprint(filename, getTestInputFolder(), TEST_OUTPUT_FOLDER);
	}

	@Test
	public void testModifiers() throws Exception {
		String typename = "Modifiers";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 29);

		parseAndReprint(filename);
	}

	@Test
	public void testMultipleImplements() throws Exception {
		testEmptyInterface();
		testIOneMethod();

		String typename = "MultipleImplements";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 0);
		List<TypeReference> implementedInterfaces = clazz.getImplements();
		assertEquals(2, implementedInterfaces.size());

		registerInClassPath("ISemicolonOnly" + JAVA_FILE_EXTENSION);

		parseAndReprint(filename);
	}

	@Test
	public void testMultiplications() throws Exception {
		String typename = "Multiplications";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 2);

		List<Member> members = clazz.getMembers();

		Field longField = (Field) members.get(1);
		Expression initValue = longField.getInitialValue();

		TreeIterator<EObject> iter = initValue.eAllContents();
		DecimalIntegerLiteral literal1 = null;
		DecimalIntegerLiteral literal2 = null;
		while (iter.hasNext()) {
			Object obj = iter.next();
			if (obj instanceof DecimalIntegerLiteral) {
				if (literal1 == null) {
					literal1 = (DecimalIntegerLiteral) obj;
				} else {
					literal2 = (DecimalIntegerLiteral) obj;
				}
			}
		}
		assertNotNull(literal1, "no IntegerLiteral found");
		assertNotNull(literal2, "no second IntegerLiteral found");
		assertEquals(BigInteger.valueOf(3), literal1.getDecimalValue());
		assertEquals(BigInteger.valueOf(4), literal2.getDecimalValue());

		parseAndReprint(filename);
	}

	@Test
	public void testNoTypeArgument() throws Exception {
		String typename = "NoTypeArgument";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 3);
		Field b = (Field) clazz.getMembers().get(2);
		RelationExpression exp = (RelationExpression) b.getInitialValue();
		assertTrue(exp.getRelationOperators().size() == 1);
		assertTrue(exp.getRelationOperators().get(0) instanceof LessThan,
				exp.getRelationOperators().get(0).eClass().getName());
		assertTrue(exp.getChildren().get(1) instanceof ShiftExpression);

		parseAndReprint(filename);
	}

	@Test
	public void testNumberLiterals() throws Exception {
		String typename = "NumberLiterals";
		String file = "pkg" + File.separator + typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass("pkg", typename);
		assertMemberCount(clazz, 46);

		// iterate over all fields, get their value using reflection and
		// compare this value with the one from the Java parser
		java.lang.reflect.Field[] fields = NumberLiterals.class.getDeclaredFields();
		for (java.lang.reflect.Field field : fields) {
			Object value = field.get(null);
			Object bigValue = value;
			if (value instanceof Integer) {
				bigValue = BigInteger.valueOf(((Integer) value).longValue());
			}
			if (value instanceof Long) {
				bigValue = BigInteger.valueOf(((Long) value).longValue());
			}
			assertIsNumericField(clazz.getMembers(), field.getName(), bigValue);
		}

		parseAndReprint(file);
	}

	@Test
	public void testTempLiterals() throws Exception {
		String typename = "TempLiterals";
		String file = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 9);
		parseAndReprint(file);
	}

	@Test
	public void testRoundedLiterals() throws Exception {
		String typename = "RoundedLiterals";
		String file = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 26);
		parseAndReprint(file);
	}

	@Test
	public void testParametersWithModifiers() throws Exception {
		String typename = "ParametersWithModifiers";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 2);

		parseAndReprint(filename);
	}

	@Test
	public void testPrimitiveTypeArrays() throws Exception {
		String typename = "PrimitiveTypeArrays";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 4);

		parseAndReprint(filename);
	}

	@Test
	public void testPkg_EmptyClass() throws Exception {
		CompilationUnit model = (CompilationUnit) parseResource("pkg/EmptyClass.java");
		assertNumberOfClassifiers(model, 1);
		Classifier declaration = model.getClassifiers().get(0);
		assertEquals("EmptyClass", declaration.getName(), "The name of the declared class equals 'EmptyClass'");
		assertEquals("pkg", model.getNamespaces().get(0), "pkg.Empty is located in a package 'pkg'");
		parseAndReprint("pkg/EmptyClass.java");
	}

	@Test
	public void testPkg_inner_EmptyClass() throws Exception {
		CompilationUnit model = (CompilationUnit) parseResource("pkg/inner/Inner.java");
		assertNumberOfClassifiers(model, 1);
		Classifier declaraction = model.getClassifiers().get(0);
		assertEquals("Inner", declaraction.getName(), "The name of the declared class equals 'Inner'");
		assertEquals("inner", model.getNamespaces().get(1), "pkg.inner.Inner is located in a package 'inner'");
		assertEquals("pkg", model.getNamespaces().get(0), "Package 'Inner' is located in a package 'pkg'");
		parseAndReprint("pkg/inner/Inner.java");
	}

	@Test
	public void testPkg_PackageAnnotation() throws Exception {
		CompilationUnit model = (CompilationUnit) parseResource("pkg/PackageAnnotation.java");
		assertNumberOfClassifiers(model, 1);
		parseAndReprint("pkg/PackageAnnotation.java");
	}

	@Test
	public void testPkg_package_info() throws Exception {
		registerInClassPath("pkg/PackageAnnotation.java");

		parseAndReprint("pkg/package-info.java");
	}

	@Test
	public void testPkg_package_info2() throws Exception {
		parseAndReprint("pkg2/pkg3/Pkg2Enum.java");
		parseAndReprint("pkg2/pkg3/PackageAnnotation.java");

		parseAndReprint("pkg2/package-info.java");
	}

	@Test
	public void testPkg_package_info3() throws Exception {
		// deep nested package with annotation in SAME package
		parseAndReprint("pkg2/pkg3/pkg4/PackageAnnotation.java");

		parseAndReprint("pkg2/pkg3/pkg4/package-info.java");
	}

	@Test
	@Disabled("Contains empty members that are not parsed by JDT.")
	public void testSemicolonAfterMembers() throws Exception {
		String typename = "SemicolonAfterMembers";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 2 + 4);

		parseAndReprint(filename, getTestInputFolder(), TEST_OUTPUT_FOLDER);
	}

	@Test
	public void testSemicolonAfterExpressions() throws Exception {
		String typename = "SemicolonAfterExpressions";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 1);

		parseAndReprint(filename, getTestInputFolder(), TEST_OUTPUT_FOLDER);
	}

	@Test
	public void testSimpleAnnotations() throws Exception {
		String typename = "SimpleAnnotations";
		String filename = typename + JAVA_FILE_EXTENSION;
		Annotation annotation = assertParsesToAnnotation(typename);
		assertEquals(2, annotation.getMembers().size(), typename + " should have 2 members.");

		parseAndReprint(filename);
	}

	@Test
	public void testSimpleMethodCalls() throws Exception {
		String typename = "SimpleMethodCalls";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 4);

		parseAndReprint(filename, getTestInputFolder(), TEST_OUTPUT_FOLDER);
	}

	@Test
	public void testSpecialCharacters() throws Exception {
		String typename = "SpecialCharacters";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 3);

		parseAndReprint(filename, getTestInputFolder(), TEST_OUTPUT_FOLDER);
	}

	@Test
	public void testStatements() throws Exception {
		registerInClassPath("ConditionalStatements" + JAVA_FILE_EXTENSION);

		assertParsesToClass("ConditionalStatements", 4);
		assertParsesToClass("TryCatchStatements", 4);
		assertParsesToClass("AssertStatements", 1);
		assertParsesToClass("ThrowStatements", 1);
		assertParsesToClass("SynchronizedStatements", 3);
		assertParsesToClass("SwitchStatements", 12);
		assertParsesToClass("DeclarationStatements", 1);
		assertParsesToClass("JumpLabelStatements", 4);
		assertParsesToClass("LoopStatements", 11);
	}

	@Test
	public void testStaticImports() throws Exception {
		String typename = "StaticImports";
		String filename = typename + JAVA_FILE_EXTENSION;
		CompilationUnit unit = (CompilationUnit) parseResource(filename, getTestInputFolder());
		List<Import> imports = unit.getImports();
		assertEquals(2, imports.size());
		assertTrue(imports.get(0) instanceof StaticImport, "first import is not static");
		assertTrue(imports.get(1) instanceof ClassifierImport, "second import is static");

		registerInClassPath("pkg/EmptyClass" + JAVA_FILE_EXTENSION);
		registerInClassPath("pkg/EscapedStrings" + JAVA_FILE_EXTENSION);

		parseAndReprint(filename);
	}

	@Test
	public void testStringLiteralReferencing() throws Exception {
		String typename = "StringLiteralReferencing";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 1);

		parseAndReprint(filename);
	}

	@Test
	public void testSuperKeyword() throws Exception {
		String typename = "SuperKeyword";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 1);

		Member method = clazz.getMembers().get(0);
		assertType(method, Constructor.class);

		parseAndReprint(filename);
	}

	@Test
	public void testSynchronized() throws Exception {
		String typename = "Synchronized";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 2);

		parseAndReprint(filename);
	}

	@Test
	public void testTypeParameters() throws Exception {
		testIOneMethod();

		String typename = "TypeParameters";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 14);

		parseAndReprint(filename);
	}

	@Test
	public void testTypeReferencing() throws Exception {
		String typename = "TypeReferencing";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 3);

		registerInClassPath("pkg/EmptyClass" + JAVA_FILE_EXTENSION);
		registerInClassPath("pkg/inner/Inner" + JAVA_FILE_EXTENSION);

		parseAndReprint(filename);
	}

	@Test
	public void testTypeReferencingExternal() throws Exception {
		String typename = "TypeReferencingExternal";
		String filename = typename + JAVA_FILE_EXTENSION;
		assertParsesToClass(typename);

		registerInClassPath("TypeReferencing" + JAVA_FILE_EXTENSION);
		registerInClassPath("pkg/EmptyClass" + JAVA_FILE_EXTENSION);
		registerInClassPath("pkg/inner/Inner" + JAVA_FILE_EXTENSION);

		parseAndReprint(filename);
	}

	@Test
	public void testUnaryExpressions() throws Exception {
		String typename = "UnaryExpressions";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 1);

		parseAndReprint(filename);
	}

	@Test
	public void testUsingAnnotations() throws Exception {
		String typename = "UsingAnnotations";
		String filename = "pkg" + File.separator + typename + JAVA_FILE_EXTENSION;
		assertParsesToClass("pkg", typename);

		parseAndReprint(filename);
	}

	@Test
	public void testUnicode() throws Exception {
		String folder = "unicode/";
		assertParsableAndReprintable(folder + "Unicode.java");
	}

	@Test
	public void testUnicodeIdentifiers() throws Exception {
		String folder = "unicode/";
		assertParsableAndReprintable(folder + "UnicodeIdentifiers.java");
	}

	@Test
	public void testMoreUnicodeCharacters() throws Exception {
		String folder = "unicode/";
		assertParsableAndReprintable(folder + "MoreUnicodeCharacters.java");
	}

	@Test
	public void testVariableLengthArgumentList() throws Exception {
		String typename = "VariableLengthArgumentList";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);

		assertMemberCount(clazz, 4);
		Member firstMember = clazz.getMembers().get(0);
		Constructor constructor = assertIsConstructor(firstMember);
		assertEquals(1, constructor.getParameters().size(), "Constructor of " + typename + " should habe 1 parameter.");
		assertType(constructor.getParameters().get(0), VariableLengthParameter.class);

		parseAndReprint(filename);
	}

	@Test
	public void testVariableReferencing() throws Exception {
		String typename = "VariableReferencing";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		assertMemberCount(clazz, 2);

		parseAndReprint(filename, getTestInputFolder(), TEST_OUTPUT_FOLDER);
	}

	@Test
	public void testUnicodeSurrogateCharacter() throws Exception {
		String typename = "UnicodeSurrogateCharacters";
		String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		Member m1 = clazz.getMembers().get(0);
		assertTrue(m1 instanceof Field);
		Expression value = ((Field) m1).getInitialValue();
		assertTrue(value instanceof CharacterLiteral);
		String c = ((CharacterLiteral) value).getValue();
		assertEquals("\\uD800", c);
		parseAndReprint(filename);
	}

	@Test
	public void test$InClassName() throws Exception {
		parseAndReprint("ClassWith$InName" + JAVA_FILE_EXTENSION);
		parseAndReprint("ClassWith$$InName" + JAVA_FILE_EXTENSION);
		parseAndReprint("Class$$$$With$$$$In$$$$Name$$$$$" + JAVA_FILE_EXTENSION);
		parseAndReprint("pkg/ClassWith$In$$Pkg" + JAVA_FILE_EXTENSION);
		parseAndReprint("pkg/inner/ClassWith$In$$Inner$Pkg" + JAVA_FILE_EXTENSION);

		String typename = "ClassWithDollarReferenced";
		String filename = typename + JAVA_FILE_EXTENSION;

		parseAndReprint(filename);
	}

	@Test
	public void testBug1695() throws Exception {
		String typename = "Bug1695";
		String filename = "bugs" + File.separator + typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass("bugs", typename);

		assertEquals("Bug1695", clazz.getName());
		assertEquals("InnerClass", clazz.getMembers().get(0).getName());

		parseAndReprint(filename);
	}

	@Test
	public void testMultipleBoundTypeParameters() throws Exception {
		this.registerInClassPath("mbtp" + File.separator + "C1.java");
		this.registerInClassPath("mbtp" + File.separator + "C3.java");
		parseAndReprint("mbtp" + File.separator + "C2.java");
	}

	@Test
	public void testLambdaExpressionRefs() throws Exception {
		parseAndReprint("refs" + File.separator + "LambdaExpressionRefs.java");
	}

	@Test
	public void testLambdaExpressionRefs2() throws Exception {
		parseAndReprint("refs" + File.separator + "LambdaExpressionRefs2.java");
	}

	@Test
	public void testLocalClass() throws Exception {
		parseAndReprint("refs" + File.separator + "LocalClasses.java");
	}

	@Test
	public void testAnonymousClasses() throws Exception {
		parseAndReprint("refs" + File.separator + "AnonymousClasses.java");
	}

	@Test
	public void testVarLengthRef() throws Exception {
		parseAndReprint("refs" + File.separator + "VarLengthRef.java");
	}

	@Test
	public void testToArray() throws Exception {
		parseAndReprint("refs" + File.separator + "ToArray.java");
	}

	@Test
	public void testFieldLambdaExpressions() throws Exception {
		parseAndReprint("refs" + File.separator + "FieldLambdaExpressions.java");
	}

	@Test
	public void testNestedLambdaExpressions() throws Exception {
		parseAndReprint("refs" + File.separator + "NestedLambdaExpressions.java");
	}

	@Test
	public void testLambdaExpressionRefs3() throws Exception {
		parseAndReprint("refs" + File.separator + "LambdaExpressionRefs3.java");
	}

	@Test
	public void testLambdaExpressionRefs4() throws Exception {
		parseAndReprint("refs" + File.separator + "LambdaExpressionRefs4.java");
	}
}
