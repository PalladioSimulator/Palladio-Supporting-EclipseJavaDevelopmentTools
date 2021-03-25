package org.emftext.language.java.test;

import java.io.File;
import java.nio.file.Paths;

import org.eclipse.emf.common.util.URI;
import org.emftext.language.java.JavaClasspath;
import org.emftext.language.java.containers.CompilationUnit;
import org.junit.jupiter.api.Test;

/**
 * A test class for the ClassFileParser.
 */
public class ClassFileParserTest extends AbstractJaMoPPTests {
	private static final String BIN_FOLDER = "bin";
	private static final String CLASS_FILE_EXTENSION = ".class";
	
	@Test
	public void testImport1() throws Exception {
		String filename = "Import1.java";

		JavaClasspath.get().registerClassifier("", "Import2",
				createURI(BIN_FOLDER, "Import2" + CLASS_FILE_EXTENSION));

		CompilationUnit model = (CompilationUnit) parseResource(filename);
		assertNumberOfClassifiers(model, 1);
		
		parseAndReprint(filename);
	}
	
	@Test
	public void testExplicitGenericConstructorCalls() throws Exception {
		String typename = "ExplicitGenericConstructorCalls";
		String filename = typename + ".java";
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);

		assertMemberCount(clazz, 4);

		String classFile = "ConstructorCalls";
		JavaClasspath.get().registerClassifier("", classFile,
				createURI(BIN_FOLDER, classFile + CLASS_FILE_EXTENSION));

		parseAndReprint(filename);
	}
	
	@Test
	public void testResolving() throws Exception {
		String folder = "resolving";

		String registeredTypeName = "MethodCallsWithoutInheritance";
		JavaClasspath.get().registerClassifier(folder, registeredTypeName,
				createURI(BIN_FOLDER, folder, registeredTypeName + CLASS_FILE_EXTENSION));

		parseAndReprint(folder + File.separator + "MethodCalls.java");
		parseAndReprint(folder + File.separator + "MethodCallsWithLocalTypeReferences.java");
		parseAndReprint(folder + File.separator + "MethodCallsWithoutInheritance.java");
		parseAndReprint(folder + File.separator + "ReferenceToInheritedMethod.java");
		parseAndReprint(folder + File.separator + "VariableReferencing.java");
	}
	
	@Test
	public void testStaticCalls() throws Exception {
		String registeredType = "AClass";
		JavaClasspath.get().registerClassifier("", registeredType,
				createURI(BIN_FOLDER, registeredType + CLASS_FILE_EXTENSION));
		JavaClasspath.get().registerClassifier(registeredType, "A",
				createURI(BIN_FOLDER, registeredType + "$A" + CLASS_FILE_EXTENSION));		
		parseAndReprint("StaticCalls.java");
	}
	
	private URI createURI(String... relPath) {
		return URI.createFileURI(Paths.get(".", relPath).toAbsolutePath().toString());
	}
	
	@Override
	protected boolean isExcludedFromReprintTest(String filename) {
		return false;
	}

	@Override
	protected String getTestInputFolder() {
		return "src-input";
	}
}
