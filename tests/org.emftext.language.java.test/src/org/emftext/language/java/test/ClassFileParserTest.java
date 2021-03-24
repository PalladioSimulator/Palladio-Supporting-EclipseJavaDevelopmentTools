package org.emftext.language.java.test;

import java.nio.file.Paths;

import org.eclipse.emf.common.util.URI;
import org.emftext.language.java.JavaClasspath;
import org.emftext.language.java.containers.CompilationUnit;
import org.junit.jupiter.api.Test;

/**
 * A test class for the ClassFileParser.
 */
public class ClassFileParserTest extends AbstractJaMoPPTests {
	/**
	 * Uses the Import1 class with Import2 loaded by the ClassFileParser.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testImport1() throws Exception {
		String filename = "Import1.java";

		JavaClasspath.get().registerClassifier("", "Import2",
			URI.createFileURI(Paths.get("bin", "Import2.class").toAbsolutePath().toString()));

		CompilationUnit model = (CompilationUnit) parseResource(filename);
		assertNumberOfClassifiers(model, 1);
		
		assertResolveAllProxies(model);
		parseAndReprint(filename);
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
