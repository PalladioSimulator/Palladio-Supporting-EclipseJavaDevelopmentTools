package jamopp.parser.jdt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.emftext.language.java.containers.JavaRoot;

import jamopp.parser.api.JaMoPPParserAPI;

public class JaMoPPJDTParser implements JaMoPPParserAPI {

	@Override
	public JavaRoot parse(String fileName, InputStream input) {
		StringBuilder builder = new StringBuilder();
		String lineSep = System.getProperty("line.separator");
		try(InputStreamReader inReader = new InputStreamReader(input); BufferedReader buffReader = new BufferedReader(inReader)) {
			buffReader.lines().forEach(line -> builder.append(line + lineSep));
		} catch (IOException e) {
		}
		String src = builder.toString();
		ASTNode ast = parseFileWithJDT(src, fileName);
		OrdinaryCompilationUnitJDTASTVisitorAndConverter converter = new OrdinaryCompilationUnitJDTASTVisitorAndConverter();
		converter.setSource(src);
		ast.accept(converter);
		return converter.getConvertedElement();
	}
	
	private ASTNode parseFileWithJDT(String fileContent, String fileName) {
		ASTParser parser = ASTParser.newParser(AST.JLS14);
		parser.setUnitName(fileName);
		parser.setEnvironment(new String[] {}, new String[] {}, new String[] {}, true);
		parser.setResolveBindings(true);
		parser.setBindingsRecovery(true);
		Map<String, String> options = new HashMap<>();
		options.put(JavaCore.COMPILER_SOURCE, JavaCore.VERSION_14);
		options.put(JavaCore.COMPILER_COMPLIANCE, JavaCore.VERSION_14);
		options.put(JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM, JavaCore.VERSION_14);
		parser.setCompilerOptions(options);
		parser.setSource(fileContent.toCharArray());
		return parser.createAST(null); // ast is instanceof org.eclipse.jdt.core.dom.CompilationUnit
	}
}
