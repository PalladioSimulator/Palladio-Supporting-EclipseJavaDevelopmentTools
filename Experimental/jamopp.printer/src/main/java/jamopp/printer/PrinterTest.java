package jamopp.printer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;

import org.emftext.language.java.containers.JavaRoot;

/**
 * This class provides methods to print JaMoPP model instances.
 */
public class PrinterTest {
	/**
	 * Prints a model instance into an OutputStream.
	 * 
	 * @param root the model instance to print.
	 * @param output the output for printing.
	 */
	public static void print(JavaRoot root, OutputStream output) {
		try (OutputStreamWriter outWriter = new OutputStreamWriter(output); BufferedWriter buffWriter = new BufferedWriter(outWriter)) {
			convertToTextAndWrite(root, buffWriter);
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
			convertToTextAndWrite(root, writer);
		} catch (IOException e) {
		}
	}
	
	/**
	 * Converts a model instance to text and writes it.
	 * 
	 * @param root the model instance to print.
	 * @param writer writer in which the text is written.
	 * @throws IOException if the text cannot be written.
	 */
	private static void convertToTextAndWrite(JavaRoot root, BufferedWriter writer) throws IOException {
		// Iterate over model.
	}
}
