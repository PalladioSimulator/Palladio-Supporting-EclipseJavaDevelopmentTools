package jamopp.parser.jdt.singlefile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.FileASTRequestor;
import org.emftext.language.java.JavaClasspath;
import org.emftext.language.java.containers.JavaRoot;
import org.emftext.language.java.resolver.CentralReferenceResolver;

import jamopp.parser.api.JaMoPPParserAPI;
import jamopp.proxy.IJavaContextDependentURIFragment;
import jamopp.proxy.IJavaContextDependentURIFragmentCollector;
import jamopp.resolution.bindings.CentralBindingBasedResolver;

public class JaMoPPJDTSingleFileParser implements JaMoPPParserAPI {
	private final String DEFAULT_ENCODING = StandardCharsets.UTF_8.toString();
	private ResourceSet resourceSet;
	private HashMap<String, String> options;
	private final String trueString = "true";
	
	public JaMoPPJDTSingleFileParser() {
		options = new HashMap<>();
		setOption(ParserOptions.RESOLVE_BINDINGS, trueString);
		setOption(ParserOptions.RESOLVE_ALL_BINDINGS, trueString);
	}

	public void setOption(ParserOptions option, String value) {
		options.put(option.name(), value);
	}
	
	@Override
	public JavaRoot parse(String fileName, InputStream input) {
		this.setUpResourceSet();
		StringBuilder builder = new StringBuilder();
		String lineSep = System.getProperty("line.separator");
		try (InputStreamReader inReader = new InputStreamReader(input);
				BufferedReader buffReader = new BufferedReader(inReader)) {
			buffReader.lines().forEach(line -> builder.append(line + lineSep));
		} catch (IOException e) {
		}
		String src = builder.toString();
		ASTNode ast = parseFileWithJDT(src, fileName);
		OrdinaryCompilationUnitJDTASTVisitorAndConverter converter =
				new OrdinaryCompilationUnitJDTASTVisitorAndConverter();
		converter.setSource(src);
		ast.accept(converter);
		this.resourceSet = null;
		return converter.getConvertedElement();
	}
	
	private ASTNode parseFileWithJDT(String fileContent, String fileName) {
		ASTParser parser = setUpParser();
		parser.setUnitName(fileName);
		parser.setEnvironment(new String[] {}, new String[] {}, new String[] {}, true);
		parser.setSource(fileContent.toCharArray());
		return parser.createAST(null);
	}
	
	@Override
	public Resource parseFile(Path file) {
		this.setUpResourceSet();
		Resource result = this.parseFilesWithJDT(new String[] {}, new String[] { file.toAbsolutePath().toString() },
			new String[] { DEFAULT_ENCODING }).get(0).eResource();
		this.resourceSet = null;
		return result;
	}
	
	@Override
	public ResourceSet parseDirectory(Path dir) {
		this.setUpResourceSet();
		try {
			String[] sources = Files.walk(dir).filter(path ->
				Files.isRegularFile(path) && path.getFileName().toString().endsWith("java"))
				.map(Path::toAbsolutePath).map(Path::toString).toArray(i -> new String[i]);
			String[] encodings = new String[sources.length];
			for (int index = 0; index < encodings.length; index++) {
				encodings[index] = DEFAULT_ENCODING;
			}
			String[] classpathEntries = Files.walk(dir).filter(path -> Files.isRegularFile(path)
				&& (path.getFileName().toString().endsWith(".jar")
				|| path.getFileName().toString().endsWith(".zip")))
				.map(Path::toAbsolutePath).map(Path::toString).toArray(i -> new String[i]);
			this.parseFilesWithJDT(classpathEntries, sources, encodings);
			resolveBindings();
		} catch (IOException e) {
		}
		ResourceSet result = this.resourceSet;
		this.resourceSet = null;
		return result;
	}
	
	private List<JavaRoot> parseFilesWithJDT(String[] classpathEntries, String[] sources, String[] encodings) {
		ArrayList<JavaRoot> result = new ArrayList<>();
		ASTParser parser = setUpParser();
		for (String entry : classpathEntries) {
			JavaClasspath.get().registerZip(URI.createFileURI(entry));
		}
		parser.setEnvironment(classpathEntries, new String[] {}, new String[] {}, true);
		OrdinaryCompilationUnitJDTASTVisitorAndConverter converter =
				new OrdinaryCompilationUnitJDTASTVisitorAndConverter();
		parser.createASTs(sources, encodings, new String[] {}, new FileASTRequestor() {
			@Override
			public void acceptAST(String sourceFilePath, CompilationUnit node) {
				URI fileURI = URI.createFileURI(sourceFilePath);
				IJavaContextDependentURIFragmentCollector.GLOBAL_INSTANCE.setBaseURI(fileURI);
				node.accept(converter);
				JavaRoot root = converter.getConvertedElement();
				Resource newResource;
				if (root.eResource() == null) {
					newResource = JaMoPPJDTSingleFileParser.this.resourceSet.createResource(fileURI);
					newResource.getContents().add(root);
					JavaClasspath.get().registerJavaRoot(root, fileURI);
				} else {
					newResource = root.eResource();
					if (!newResource.getURI().toFileString().equals(sourceFilePath)) {
						newResource.setURI(fileURI);
						JavaClasspath.get().registerJavaRoot(root, fileURI);
					}
				}
				result.add(root);
			}
		}, null);
		return result;
	}
	
	private void setUpResourceSet() {
		if (this.resourceSet == null) {
			this.resourceSet = new ResourceSetImpl();
		}
	}
	
	private ASTParser setUpParser() {
		ASTParser parser = ASTParser.newParser(AST.JLS15);
		parser.setResolveBindings(true);
		parser.setBindingsRecovery(true);
		parser.setStatementsRecovery(true);
		Map<String, String> compilerOptions = new HashMap<>();
		compilerOptions.put(JavaCore.COMPILER_SOURCE, JavaCore.VERSION_15);
		compilerOptions.put(JavaCore.COMPILER_COMPLIANCE, JavaCore.VERSION_15);
		compilerOptions.put(JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM, JavaCore.VERSION_15);
		parser.setCompilerOptions(compilerOptions);
		return parser;
	}
	
	public void resolveBindings() {
		if (trueString.equals(options.get(ParserOptions.RESOLVE_BINDINGS.name()))) {
			CentralReferenceResolver.GLOBAL_INSTANCE.setBindingBasedResolver(
					new CentralBindingBasedResolver(this.resourceSet));
			int oldSize;
			int newSize = this.resourceSet.getResources().size();
			do {
				oldSize = newSize;
				List<Resource> resources = new ArrayList<>(this.resourceSet.getResources());
				resources.forEach(r -> EcoreUtil.resolveAll(r));
				newSize = this.resourceSet.getResources().size();
			} while (oldSize != newSize
					&& trueString.equals(options.get(ParserOptions.RESOLVE_ALL_BINDINGS.name())));
			CentralReferenceResolver.GLOBAL_INSTANCE.setBindingBasedResolver(null);
			Map<String, IJavaContextDependentURIFragment> fragments =
					IJavaContextDependentURIFragmentCollector.GLOBAL_INSTANCE
					.getContextDependentURIFragmentMap();
			fragments.values().forEach(v -> v.setBinding(null));
		}
	}

	@Override
	public void setResourceSet(ResourceSet set) {
		this.resourceSet = set;
	}
}
