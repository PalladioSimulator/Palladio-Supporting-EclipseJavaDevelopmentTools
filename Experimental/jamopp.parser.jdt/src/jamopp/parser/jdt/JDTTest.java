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

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;

/**
 * A simple class to test the capabilities of the JDT parser.
 */
public class JDTTest {
	public static void main(String[] args) {
		parseDirectory(Paths.get("../../Tests/org.emftext.language.java.test/src-input"));
		parseDirectory(Paths.get("../../Tests/org.emftext.language.java.tests.sevenup/src"));
	}
	
	private static void parseDirectory(Path directory) {
		final String moduleInfoFileName = "module-info.java";
		ASTParser parser = ASTParser.newParser(AST.JLS13);
		try {
			Files.walk(directory).filter(path -> Files.isRegularFile(path)).forEach(path -> {
				if(path.endsWith(moduleInfoFileName)) {
					parser.setUnitName(moduleInfoFileName);
				}
				Map<String, String> options = new HashMap<>();
				options.put(JavaCore.COMPILER_SOURCE, JavaCore.VERSION_13);
				options.put(JavaCore.COMPILER_COMPLIANCE, JavaCore.VERSION_13);
				options.put(JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM, JavaCore.VERSION_13);
				parser.setCompilerOptions(options);
				StringBuilder builder = new StringBuilder();
				try {
					Files.readAllLines(path).forEach(line -> builder.append(line + System.getProperty("line.separator")));
				} catch (IOException e) {
					e.printStackTrace();
				}
				parser.setSource(builder.toString().toCharArray());
				ASTNode ast = parser.createAST(null); // ast is instanceof org.eclipse.jdt.core.dom.CompilationUnit
				ASTVisitor visitor = new ASTVisitor() {};
				ast.accept(visitor);
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
