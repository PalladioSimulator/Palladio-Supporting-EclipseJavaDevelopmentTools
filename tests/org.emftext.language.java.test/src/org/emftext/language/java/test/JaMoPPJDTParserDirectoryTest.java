package org.emftext.language.java.test;

import java.nio.file.Paths;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Before;
import org.junit.Test;

import jamopp.parser.jdt.JaMoPPJDTParser;

/**
 * Class for testing the parseDirectory method of the JaMoPPJDTParser.
 */
public class JaMoPPJDTParserDirectoryTest extends AbstractJaMoPPTests {
	private JaMoPPJDTParser parser;
	
	@Before
	public void setUp() {
		parser = new JaMoPPJDTParser();
	}
	
	@Test
	public void testSrcInputDirectory() {
		ResourceSet set = parser.parseDirectory(Paths.get("src-input"));
		this.assertModelValid(set);
	}
	
	@Test
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
