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
	public JavaRoot parse(InputStream input, boolean isModule) {
		StringBuilder builder = new StringBuilder();
		String lineSep = System.getProperty("line.separator");
		try(InputStreamReader inReader = new InputStreamReader(input); BufferedReader buffReader = new BufferedReader(inReader)) {
			buffReader.lines().forEach(line -> builder.append(line + lineSep));
		} catch (IOException e) {
		}
		String src = builder.toString();
		ASTNode ast = parseFileWithJDT(src, isModule);
		OrdinaryCompilationUnitJDTASTVisitorAndConverter converter = new OrdinaryCompilationUnitJDTASTVisitorAndConverter();
		converter.setSource(src);
		ast.accept(converter);
		return converter.getConvertedElement();
	}
	
	private ASTNode parseFileWithJDT(String fileContent, boolean isModule) {
		ASTParser parser = ASTParser.newParser(AST.JLS14);
		if (isModule) {
			parser.setUnitName(JaMoPPParserAPI.MODULE_DECLARATION_FILE_NAME);
		}
		Map<String, String> options = new HashMap<>();
		options.put(JavaCore.COMPILER_SOURCE, JavaCore.VERSION_14);
		options.put(JavaCore.COMPILER_COMPLIANCE, JavaCore.VERSION_14);
		options.put(JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM, JavaCore.VERSION_14);
		parser.setCompilerOptions(options);
		parser.setSource(fileContent.toCharArray());
		return parser.createAST(null); // ast is instanceof org.eclipse.jdt.core.dom.CompilationUnit
	}
}
