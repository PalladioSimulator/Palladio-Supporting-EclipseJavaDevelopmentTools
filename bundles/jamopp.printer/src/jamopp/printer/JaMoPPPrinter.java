package jamopp.printer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;

import org.emftext.language.java.annotations.AnnotationAttributeSetting;
import org.emftext.language.java.annotations.AnnotationInstance;
import org.emftext.language.java.annotations.AnnotationParameterList;
import org.emftext.language.java.annotations.AnnotationValue;
import org.emftext.language.java.annotations.SingleAnnotationParameter;
import org.emftext.language.java.arrays.ArrayInitializer;
import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.containers.JavaRoot;
import org.emftext.language.java.imports.ClassifierImport;
import org.emftext.language.java.imports.Import;
import org.emftext.language.java.imports.ImportingElement;
import org.emftext.language.java.imports.PackageImport;
import org.emftext.language.java.imports.StaticClassifierImport;
import org.emftext.language.java.imports.StaticMemberImport;

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
		try (OutputStreamWriter outWriter = new OutputStreamWriter(output); BufferedWriter buffWriter = new BufferedWriter(outWriter)) {
			printJavaRoot(root, buffWriter);
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
			printJavaRoot(root, writer);
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
	private static void printJavaRoot(JavaRoot root, BufferedWriter writer) throws IOException {
		if (root instanceof org.emftext.language.java.containers.Module) {
			printImportingElement(root, writer);
		} else {
			if (root.getNamespaces().size() > 0) {
				for (AnnotationInstance inst : root.getAnnotations()) {
					printAnnotationInstance(inst, writer);
				}
				writer.append("package " + root.getNamespacesAsString() + ";\n\n");
			}
			printImportingElement(root, writer);
			if (root instanceof org.emftext.language.java.containers.Package) {
				
			} else if (root instanceof CompilationUnit) {
				
			} else {
				
			}
		}
	}
	
	private static void printImportingElement(ImportingElement element, BufferedWriter writer) throws IOException {
		for (Import ele : element.getImports()) {
			printImport(ele, writer);
		}
	}
	
	private static void printImport(Import element, BufferedWriter writer) throws IOException {
		writer.append("import ");
		if (element instanceof ClassifierImport) {
			printClassifierImport((ClassifierImport) element, writer);
		} else if (element instanceof PackageImport) {
			printPackageImport((PackageImport) element, writer);
		} else if (element instanceof StaticClassifierImport) {
			printStaticClassifierImport((StaticClassifierImport) element, writer);
		} else {
			printStaticMemberImport((StaticMemberImport) element, writer);
		}
		writer.append(";\n");
	}
	
	private static void printClassifierImport(ClassifierImport element, BufferedWriter writer) throws IOException {
		writer.append(element.getNamespacesAsString() + "." + element.getClassifier().getName());
	}
	
	private static void printPackageImport(PackageImport element, BufferedWriter writer) throws IOException {
		writer.append(element.getNamespacesAsString());
		if (element.getClassifier() != null) {
			writer.append("." + element.getClassifier().getName());
		}
		writer.append(".*");
	}
	
	private static void printStaticClassifierImport(StaticClassifierImport element, BufferedWriter writer) throws IOException {
		writer.append("static " + element.getNamespacesAsString() + "." + element.getClassifier().getName() + ".*");
	}
	
	private static void printStaticMemberImport(StaticMemberImport element, BufferedWriter writer) throws IOException {
		writer.append("static " + element.getNamespacesAsString() + "." + element.getClassifier().getName() + "."
			+ element.getStaticMembers().get(0).getName());
	}
	
	private static void printAnnotationInstance(AnnotationInstance element, BufferedWriter writer) throws IOException {
		writer.append("@" + element.getAnnotation().getName());
		if (element.getParameter() != null) {
			writer.append("(");
			if (element.getParameter() instanceof SingleAnnotationParameter) {
				printAnnotationValue(((SingleAnnotationParameter) element.getParameter()).getValue(), writer);
			} else {
				AnnotationParameterList list = (AnnotationParameterList) element.getParameter();
				for (AnnotationAttributeSetting setting : list.getSettings()) {
					writer.append(setting.getAttribute().getName() + " = ");
					printAnnotationValue(setting.getValue(), writer);
				}
			}
			writer.append(")");
		}
		writer.append("\n");
	}
	
	private static void printAnnotationValue(AnnotationValue element, BufferedWriter writer) throws IOException {
		if (element instanceof AnnotationInstance) {
			printAnnotationInstance((AnnotationInstance) element, writer);
		} else if (element instanceof ArrayInitializer) {
			
		} else {
			
		}
	}
}
