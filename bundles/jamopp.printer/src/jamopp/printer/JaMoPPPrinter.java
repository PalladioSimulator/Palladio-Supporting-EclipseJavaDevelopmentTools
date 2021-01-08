package jamopp.printer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import org.emftext.language.java.containers.ContainersPackage;
import org.emftext.language.java.containers.JavaRoot;

/**
 * This class provides methods to print JaMoPP model instances.
 */
public final class JaMoPPPrinter {
	/**
	 * Private constructor to avoid instantiation.
	 */
	private JaMoPPPrinter() {
	}
	
	/**
	 * Prints a model instance into an OutputStream.
	 * 
	 * @param root the model instance to print.
	 * @param output the output for printing.
	 */
	public static void print(JavaRoot root, OutputStream output) {
		try (OutputStreamWriter outWriter = new OutputStreamWriter(output, StandardCharsets.UTF_8); BufferedWriter buffWriter = new BufferedWriter(outWriter)) {
			internalPrint(root, buffWriter);
		} catch (IOException e) {
		}
	}
	
	/**
	 * Prints a model instance into a file.
	 * 
	 * @param root the model instance to print.
	 * @param file the file for printing.
	 */
	public static void print(JavaRoot root, Path file) {
		try (BufferedWriter writer = Files.newBufferedWriter(file)) {
			internalPrint(root, writer);
		} catch (IOException e) {
		}
	}
	
	private static void internalPrint(JavaRoot root, BufferedWriter writer) {
		new ComposedParentPrinterSwitch(writer).doSwitch(ContainersPackage.Literals.JAVA_ROOT, root);
	}
}
