package org.emftext.language.java.test;

import java.nio.file.Paths;
import java.nio.file.Path;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import jamopp.parser.jdt.JaMoPPJDTParser;

/**
 * Class for testing the Parser API
 */

public class JaMoPPParserAPITest extends AbstractJaMoPPTests {
	
	private JaMoPPJDTParser parser;
	private static final String JAVA_FILE_EXTENSION = ".java";
	protected static final String TEST_INPUT_FOLDER = "src-input";
	
	@Before
	public void setUp() {
		parser = new JaMoPPJDTParser();
	}
	
	// 
	//Bekomme ich aus dem resource set irgendwie wieder classifier raus? 
	// oder die Assert Parser nutzen aus dem old JamoPP project? 
	
	@Test
	public void testIsClass() throws Exception {
		//ResourceSet set = parser.parseDirectory(Paths.get("scr-input/ClassA"));
		//set.getResources().get(index)
		String typename = "ClassA";
		//String filename = typename + JAVA_FILE_EXTENSION;
		org.emftext.language.java.classifiers.Class clazz = assertParsesToClass(typename);
		
		this.assertIsClass(clazz);
		//this.assertParsesToType(typename, "Class")
	}
	@Test void testNameOfClass() {
		
		//this.assertClassifierName(declaration, expectedName);
	}
	
	@Test 
	public void testInheritanceOverwriting() {
	
	ResourceSet set = parser.parseDirectory(Paths.get("scr-input/ClassA","scr-input/ClassB"));
	
	
	
	}
	@Ignore
	public void testSrcSevenAndUp() {
		ResourceSet set = parser.parseDirectory(Paths.get("src-sevenandup"));
		this.assertModelValid(set);
	}

	@Override
	protected boolean isExcludedFromReprintTest(String filename) {
		return true;
	}

	@Override
	protected String getTestInputFolder() {
		return "";
	}

}


