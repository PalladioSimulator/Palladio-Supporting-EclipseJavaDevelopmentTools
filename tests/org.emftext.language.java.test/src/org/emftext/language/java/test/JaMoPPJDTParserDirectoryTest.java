package org.emftext.language.java.test;

import java.nio.file.Paths;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jamopp.parser.jdt.JaMoPPJDTParser;

/**
 * Class for testing the parseDirectory method of the JaMoPPJDTParser.
 */
public class JaMoPPJDTParserDirectoryTest extends AbstractJaMoPPTests {
	private JaMoPPJDTParser parser;
	
	@BeforeEach
	public void setUp() {
		super.initResourceFactory();
		parser = new JaMoPPJDTParser();
	}
	
	@Test
	public void testSrcInputDirectory() throws Exception {
		ResourceSet set = parser.parseDirectory(Paths.get("src-input"));
		this.assertModelValid(set);
		this.testReprint(set);
	}
	
	@Test
	public void testSrcSevenAndUp() throws Exception {
		ResourceSet set = parser.parseDirectory(Paths.get("src-sevenandup"));
		this.assertModelValid(set);
		this.testReprint(set);
	}

	@Override
	protected boolean isExcludedFromReprintTest(String filename) {
		return false;
	}

	@Override
	protected String getTestInputFolder() {
		return "";
	}
}
