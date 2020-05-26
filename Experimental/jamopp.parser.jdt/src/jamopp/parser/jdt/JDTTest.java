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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.junit.Test;

/**
 * A simple class to test the capabilities of the JDT parser.
 */
public class JDTTest {
	public static void main(String[] args) {
		parseDirectory(Paths.get("../../Tests/org.emftext.language.java.test/src-input"));
		parseDirectory(Paths.get("../../Tests/org.emftext.language.java.tests.sevenup/src"));
	}
	
	private static String readFile(Path file) {
		StringBuilder builder = new StringBuilder();
		try {
			Files.readAllLines(file).forEach(line -> builder.append(line + System.getProperty("line.separator")));
		} catch (IOException e) {
		}
		return builder.toString();
	}
	
	private static ASTNode parseFileWithJDT(Path file, String fileContent) {
		final String moduleInfoFileName = "module-info.java";
		ASTParser parser = ASTParser.newParser(AST.JLS13);
		if(file.endsWith(moduleInfoFileName)) {
			parser.setUnitName(moduleInfoFileName);
		}
		Map<String, String> options = new HashMap<>();
		options.put(JavaCore.COMPILER_SOURCE, JavaCore.VERSION_13);
		options.put(JavaCore.COMPILER_COMPLIANCE, JavaCore.VERSION_13);
		options.put(JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM, JavaCore.VERSION_13);
		parser.setCompilerOptions(options);
		parser.setSource(fileContent.toCharArray());
		return parser.createAST(null); // ast is instanceof org.eclipse.jdt.core.dom.CompilationUnit
	}
	
	public static List<org.emftext.language.java.containers.JavaRoot> parseDirectory(Path directory) {
		ArrayList<org.emftext.language.java.containers.JavaRoot> results = new ArrayList<>();
		try {
			Files.walk(directory).filter(path -> Files.isRegularFile(path)).forEach(path -> results.add(parseFile(path)));
		} catch (IOException e) {
		}
		return results;
	}
	
	public static org.emftext.language.java.containers.JavaRoot parseFile(Path file) {
		String src = readFile(file);
		ASTNode ast = parseFileWithJDT(file, src);
		JDTASTVisitorAndConverter converter = new JDTASTVisitorAndConverter();
		converter.setSource(src);
		ast.accept(converter);
		return converter.getConvertedElement();
	}
	
	@Test
	public void testModuleConversion() {
		Path moduleFile = Paths.get("../../Tests/org.emftext.language.java.tests.sevenup/src/module-info.java");
		org.emftext.language.java.containers.JavaRoot root = parseFile(moduleFile);
		assertTrue(root instanceof org.emftext.language.java.modules.NormalModule);
		assertEquals(1, root.getLayoutInformations().size());
		assertEquals(readFile(moduleFile), root.getLayoutInformations().get(0).getVisibleTokenText());
		org.emftext.language.java.modules.NormalModule module = (org.emftext.language.java.modules.NormalModule) root;
		assertEquals(0, module.getImports().size());
		assertEquals(6, module.getTarget().size());
		assertTrue(module.getTarget().get(0) instanceof org.emftext.language.java.modules.ExportsModuleDirective);
		assertEquals(1, module.getTarget().get(0).getLayoutInformations().size());
		assertTrue(module.getTarget().get(1) instanceof org.emftext.language.java.modules.UsesModuleDirective);
		assertEquals(1, module.getTarget().get(1).getLayoutInformations().size());
		assertTrue(module.getTarget().get(2) instanceof org.emftext.language.java.modules.ExportsModuleDirective);
		assertEquals(1, module.getTarget().get(2).getLayoutInformations().size());
		assertTrue(module.getTarget().get(3) instanceof org.emftext.language.java.modules.RequiresModuleDirective);
		org.emftext.language.java.modules.RequiresModuleDirective reqDirective = (org.emftext.language.java.modules.RequiresModuleDirective) module.getTarget().get(3);
		assertEquals(1, reqDirective.getLayoutInformations().size());
		assertEquals(1, reqDirective.getModifiers().size());
		assertTrue(reqDirective.getModifiers().get(0) instanceof org.emftext.language.java.modifiers.Transitive);
		assertTrue(reqDirective.getRequiredModule().getTarget().eIsProxy()); // Fails because proxy URI is set to null.
		assertTrue(module.getTarget().get(4) instanceof org.emftext.language.java.modules.ProvidesModuleDirective);
		assertEquals(1, module.getTarget().get(4).getLayoutInformations().size());
		assertTrue(module.getTarget().get(5) instanceof org.emftext.language.java.modules.OpensModuleDirective);
		assertEquals(1, module.getTarget().get(5).getLayoutInformations().size());
	}
}
