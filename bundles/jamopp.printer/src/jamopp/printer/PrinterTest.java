package jamopp.printer;

import static org.junit.Assert.assertEquals;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.emftext.commons.layout.MinimalLayoutInformation;
import org.emftext.language.java.containers.JavaRoot;
import org.junit.Test;

import jamopp.parser.jdt.JDTTest;

public class PrinterTest {
	private static void print(JavaRoot root, Path file) {
		try (BufferedWriter writer = Files.newBufferedWriter(file)) {
			writer.append(convertToString(root));
		} catch (IOException e) {
		}
	}
	
	private static String convertToString(JavaRoot root) {
		StringBuilder builder = new StringBuilder();
		if (root.getLayoutInformations().size() == 1 && root.getLayoutInformations().get(0) instanceof MinimalLayoutInformation) {
			MinimalLayoutInformation layoutInfo = (MinimalLayoutInformation) root.getLayoutInformations().get(0);
			builder.append(layoutInfo.getSourceString());
		} else {
			// Iterate over model.
		}
		return builder.toString();
	}
	
	@Test
	public void testPrinter() {
		Path source = Paths.get("../../Tests/org.emftext.language.java.tests.sevenup/src/module-info.java");
		Path destination = Paths.get("target/module-info.java");
		try {
			Files.createDirectories(destination.getParent());
		} catch (IOException e) {
		}
		JavaRoot result = JDTTest.parseFile(source);
		print(result, destination);
		assertEquals(JDTTest.readFile(source), JDTTest.readFile(destination));
	}
}
