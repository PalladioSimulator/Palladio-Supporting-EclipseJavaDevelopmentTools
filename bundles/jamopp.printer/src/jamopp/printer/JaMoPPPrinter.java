package jamopp.printer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;

import org.emftext.language.java.annotations.Annotable;
import org.emftext.language.java.annotations.AnnotationAttributeSetting;
import org.emftext.language.java.annotations.AnnotationInstance;
import org.emftext.language.java.annotations.AnnotationParameterList;
import org.emftext.language.java.annotations.AnnotationValue;
import org.emftext.language.java.annotations.SingleAnnotationParameter;
import org.emftext.language.java.arrays.ArrayInitializer;
import org.emftext.language.java.classifiers.Annotation;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.classifiers.Enumeration;
import org.emftext.language.java.classifiers.Implementor;
import org.emftext.language.java.classifiers.Interface;
import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.containers.JavaRoot;
import org.emftext.language.java.generics.ExtendsTypeArgument;
import org.emftext.language.java.generics.QualifiedTypeArgument;
import org.emftext.language.java.generics.SuperTypeArgument;
import org.emftext.language.java.generics.TypeArgument;
import org.emftext.language.java.generics.TypeArgumentable;
import org.emftext.language.java.generics.UnknownTypeArgument;
import org.emftext.language.java.imports.ClassifierImport;
import org.emftext.language.java.imports.Import;
import org.emftext.language.java.imports.ImportingElement;
import org.emftext.language.java.imports.PackageImport;
import org.emftext.language.java.imports.StaticClassifierImport;
import org.emftext.language.java.imports.StaticMemberImport;
import org.emftext.language.java.members.EnumConstant;
import org.emftext.language.java.members.Member;
import org.emftext.language.java.members.MemberContainer;
import org.emftext.language.java.modifiers.Abstract;
import org.emftext.language.java.modifiers.AnnotableAndModifiable;
import org.emftext.language.java.modifiers.AnnotationInstanceOrModifier;
import org.emftext.language.java.modifiers.Default;
import org.emftext.language.java.modifiers.Final;
import org.emftext.language.java.modifiers.Modifier;
import org.emftext.language.java.modifiers.Native;
import org.emftext.language.java.modifiers.Private;
import org.emftext.language.java.modifiers.Protected;
import org.emftext.language.java.modifiers.Public;
import org.emftext.language.java.modifiers.Static;
import org.emftext.language.java.modifiers.Strictfp;
import org.emftext.language.java.modifiers.Synchronized;
import org.emftext.language.java.modifiers.Transient;
import org.emftext.language.java.modifiers.Volatile;
import org.emftext.language.java.modules.AccessProvidingModuleDirective;
import org.emftext.language.java.modules.ExportsModuleDirective;
import org.emftext.language.java.modules.ModuleDirective;
import org.emftext.language.java.modules.OpensModuleDirective;
import org.emftext.language.java.modules.ProvidesModuleDirective;
import org.emftext.language.java.modules.RequiresModuleDirective;
import org.emftext.language.java.modules.UsesModuleDirective;
import org.emftext.language.java.types.ClassifierReference;
import org.emftext.language.java.types.InferableType;
import org.emftext.language.java.types.NamespaceClassifierReference;
import org.emftext.language.java.types.PrimitiveType;
import org.emftext.language.java.types.TypeReference;

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
			printModule((org.emftext.language.java.containers.Module) root, writer);
		} else {
			if (root.getNamespaces().size() > 0) {
				printAnnotable(root, writer);
				writer.append("package " + root.getNamespacesAsString() + ";\n\n");
			}
			printImportingElement(root, writer);
			if (root instanceof CompilationUnit) {
				printCompilationUnit((CompilationUnit) root, writer);
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
	
	private static void printAnnotable(Annotable element, BufferedWriter writer) throws IOException {
		for (AnnotationInstance inst : element.getAnnotations()) {
			printAnnotationInstance(inst, writer);
		}
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
	
	private static void printModule(org.emftext.language.java.containers.Module element, BufferedWriter writer) throws IOException {
		writer.append("module ");
		if (element.getOpen() != null) {
			writer.append("open ");
		}
		writer.append(element.getNamespacesAsString() + " {\n");
		for (ModuleDirective dir : element.getTarget()) {
			if (dir instanceof UsesModuleDirective) {
				printUsesModuleDirective((UsesModuleDirective) dir, writer);
			} else if (dir instanceof ProvidesModuleDirective) {
				printProvidesModuleDirective((ProvidesModuleDirective) dir, writer);
			} else if (dir instanceof RequiresModuleDirective) {
				printRequiresModuleDirective((RequiresModuleDirective) dir, writer);
			} else if (dir instanceof OpensModuleDirective) {
				printOpensModuleDirective((OpensModuleDirective) dir, writer);
			} else {
				printExportsModuleDirective((ExportsModuleDirective) dir, writer);
			}
		}
		writer.append("}\n");
	}
	
	private static void printTypeReference(TypeReference element, BufferedWriter writer) throws IOException {
		if (element instanceof NamespaceClassifierReference) {
			printNamespaceClassifierReference((NamespaceClassifierReference) element, writer);
		} else if (element instanceof ClassifierReference) {
			printClassifierReference((ClassifierReference) element, writer);
		} else if (element instanceof PrimitiveType) {
			printPrimitiveType((PrimitiveType) element, writer);
		} else if (element instanceof InferableType) {
			printInferableType((InferableType) element, writer);
		}
	}
	
	private static void printInferableType(InferableType element, BufferedWriter writer) throws IOException {
		writer.append("var");
	}
	
	private static void printPrimitiveType(PrimitiveType element, BufferedWriter writer) throws IOException {
		printAnnotable(element, writer);
		if (element instanceof org.emftext.language.java.types.Boolean) {
			writer.append("boolean");
		} else if (element instanceof org.emftext.language.java.types.Byte) {
			writer.append("byte");
		} else if (element instanceof org.emftext.language.java.types.Char) {
			writer.append("char");
		} else if (element instanceof org.emftext.language.java.types.Double) {
			writer.append("double");
		} else if (element instanceof org.emftext.language.java.types.Float) {
			writer.append("float");
		} else if (element instanceof org.emftext.language.java.types.Int) {
			writer.append("int");
		} else if (element instanceof org.emftext.language.java.types.Long) {
			writer.append("long");
		} else if (element instanceof org.emftext.language.java.types.Short) {
			writer.append("short");
		} else if (element instanceof org.emftext.language.java.types.Void) {
			writer.append("void");
		}
	}
	
	private static void printNamespaceClassifierReference(NamespaceClassifierReference element, BufferedWriter writer) throws IOException {
		writer.append(element.getNamespacesAsString());
		for (int index = 0; index < element.getClassifierReferences().size(); index++) {
			writer.append(".");
			printClassifierReference(element.getClassifierReferences().get(index), writer);
		}
	}
	
	private static void printClassifierReference(ClassifierReference element, BufferedWriter writer) throws IOException {
		printAnnotable(element, writer);
		writer.append(element.getTarget().getName());
		printTypeArgumentable(element, writer);
	}
	
	private static void printTypeArgumentable(TypeArgumentable element, BufferedWriter writer) throws IOException {
		if (element.getTypeArguments().size() > 0) {
			writer.append("<");
			for (int index = 0; index < element.getTypeArguments().size(); index++) {
				TypeArgument arg = element.getTypeArguments().get(0);
				printTypeArgument(arg, writer);
				if (index < element.getTypeArguments().size() - 1) {
					writer.append(", ");
				}
			}
			writer.append(">");
		}
	}
	
	private static void printTypeArgument(TypeArgument element, BufferedWriter writer) throws IOException {
		if (element instanceof QualifiedTypeArgument) {
			QualifiedTypeArgument arg = (QualifiedTypeArgument) element;
			printTypeReference(arg.getTypeReference(), writer);
		} else if (element instanceof UnknownTypeArgument) {
			UnknownTypeArgument arg = (UnknownTypeArgument) element;
			printAnnotable(arg, writer);
			writer.append("?");
		} else if (element instanceof SuperTypeArgument) {
			SuperTypeArgument arg = (SuperTypeArgument) element;
			printAnnotable(arg, writer);
			writer.append("? super ");
			printTypeReference(arg.getSuperType(), writer);
		} else {
			ExtendsTypeArgument arg = (ExtendsTypeArgument) element;
			printAnnotable(arg, writer);
			writer.append("? extends ");
			printTypeReference(arg.getExtendType(), writer);
		}
	}
	
	private static void printUsesModuleDirective(UsesModuleDirective element, BufferedWriter writer) throws IOException {
		writer.append("uses ");
		printTypeReference(element.getTypeReference(), writer);
		writer.append(";\n");
	}
	
	private static void printProvidesModuleDirective(ProvidesModuleDirective element, BufferedWriter writer) throws IOException {
		writer.append("provides ");
		printTypeReference(element.getTypeReference(), writer);
		writer.append(" with ");
		for (int index = 0; index < element.getServiceProviders().size(); index++) {
			TypeReference ref = element.getServiceProviders().get(index);
			printTypeReference(ref, writer);
			if (index < element.getServiceProviders().size() - 1) {
				writer.append(".");
			}
		}
		writer.append(";\n");
	}
	
	private static void printRequiresModuleDirective(RequiresModuleDirective element, BufferedWriter writer) throws IOException {
		writer.append("requires ");
		if (element.getModifier() != null) {
			if (element.getModifier() instanceof Static) {
				writer.append("static ");
			} else {
				writer.append("transitive ");
			}
		}
		writer.append(element.getRequiredModule().getTarget().getNamespacesAsString());
		writer.append(";\n");
	}
	
	private static void printOpensModuleDirective(OpensModuleDirective element, BufferedWriter writer) throws IOException {
		writer.append("opens ");
		printRemainingAccessProvidingModuleDirective(element, writer);
	}
	
	private static void printExportsModuleDirective(ExportsModuleDirective element, BufferedWriter writer) throws IOException {
		writer.append("exports ");
		printRemainingAccessProvidingModuleDirective(element, writer);
	}
	
	private static void printRemainingAccessProvidingModuleDirective(AccessProvidingModuleDirective element, BufferedWriter writer)
		throws IOException {
		writer.append(element.getAccessablePackage().getNamespacesAsString());
		if (element.getModules().size() > 0) {
			writer.append(" to ");
			for (int index = 0; index < element.getModules().size(); index++) {
				writer.append(element.getModules().get(index).getTarget().getNamespacesAsString());
				if (index < element.getModules().size() - 1) {
					writer.append(", ");
				}
			}
		}
		writer.append(";\n");
	}
	
	private static void printCompilationUnit(CompilationUnit element, BufferedWriter writer) throws IOException {
		for (ConcreteClassifier classifier : element.getClassifiers()) {
			printConcreteClassifier(classifier, writer);
		}
	}
	
	private static void printConcreteClassifier(ConcreteClassifier element, BufferedWriter writer) throws IOException {
		if (element instanceof org.emftext.language.java.classifiers.Class) {
			printClass((org.emftext.language.java.classifiers.Class) element, writer);
		} else if (element instanceof Interface) {
			printInterface((Interface) element, writer);
		} else if (element instanceof Enumeration) {
			printEnumeration((Enumeration) element, writer);
		} else {
			printAnnotation((Annotation) element, writer);
		}
	}
	
	private static void printAnnotableAndModifiable(AnnotableAndModifiable element, BufferedWriter writer) throws IOException {
		for (AnnotationInstanceOrModifier el : element.getAnnotationsAndModifiers()) {
			printAnnotationInstanceOrModifier(el, writer);
		}
	}
	
	private static void printAnnotationInstanceOrModifier(AnnotationInstanceOrModifier element, BufferedWriter writer)
		throws IOException {
		if (element instanceof AnnotationInstance) {
			printAnnotationInstance((AnnotationInstance) element, writer);
		} else {
			printModifier((Modifier) element, writer);
		}
	}
	
	private static void printModifier(Modifier element, BufferedWriter writer) throws IOException {
		if (element instanceof Abstract) {
			writer.append("abstract ");
		} else if (element instanceof Final) {
			writer.append("final ");
		} else if (element instanceof Native) {
			writer.append("native ");
		} else if (element instanceof Protected) {
			writer.append("protected ");
		} else if (element instanceof Private) {
			writer.append("private ");
		} else if (element instanceof Public) {
			writer.append("public ");
		} else if (element instanceof Static) {
			writer.append("static ");
		} else if (element instanceof Strictfp) {
			writer.append("strictfp ");
		} else if (element instanceof Synchronized) {
			writer.append("synchronized ");
		} else if (element instanceof Transient) {
			writer.append("transient ");
		} else if (element instanceof Volatile) {
			writer.append("volatile ");
		} else if (element instanceof Default) {
			writer.append("default ");
		}
	}
	
	private static void printClass(org.emftext.language.java.classifiers.Class element, BufferedWriter writer) throws IOException {
		printAnnotableAndModifiable(element, writer);
		writer.append("class " + element.getName() + " ");
		if (element.getExtends() != null) {
			writer.append("extends ");
			printTypeReference(element.getDefaultExtends(), writer);
			writer.append(" ");
		}
		printImplementor(element, writer);
		writer.append("{\n");
		printMemberContainer(element, writer);
		writer.append("}\n");
	}
	
	private static void printImplementor(Implementor element, BufferedWriter writer) throws IOException {
		if (element.getImplements().size() > 0) {
			writer.append("implements ");
			for (int index = 0; index < element.getImplements().size(); index++) {
				printTypeReference(element.getImplements().get(index), writer);
				if (index < element.getImplements().size() - 1) {
					writer.append(", ");
				}
			}
			writer.append(" ");
		}
	}
	
	private static void printEnumeration(Enumeration element, BufferedWriter writer) throws IOException {
		printAnnotableAndModifiable(element, writer);
		writer.append("enum " + element.getName() + " ");
		printImplementor(element, writer);
		writer.append("{\n");
		for (EnumConstant enc : element.getConstants()) {
			printEnumConstant(enc, writer);
			writer.append(",\n");
		}
		if (element.getMembers().size() > 0) {
			writer.append(";\n\n");
			printMemberContainer(element, writer);
		}
		writer.append("}\n");
	}
	
	private static void printEnumConstant(EnumConstant element, BufferedWriter writer) throws IOException {
		
	}
	
	private static void printInterface(Interface element, BufferedWriter writer) throws IOException {
		printAnnotableAndModifiable(element, writer);
		writer.append("interface " + element.getName() + " ");
		if (element.getExtends().size() > 0) {
			writer.append("extends ");
			for (int index = 0; index < element.getExtends().size(); index++) {
				printTypeReference(element.getExtends().get(index), writer);
				if (index < element.getExtends().size() - 1) {
					writer.append(", ");
				}
			}
			writer.append(" ");
		}
		writer.append("{\n");
		printMemberContainer(element, writer);
		writer.append("}\n");
	}
	
	private static void printAnnotation(Annotation element, BufferedWriter writer) throws IOException {
		printAnnotableAndModifiable(element, writer);
		writer.append("@interface " + element.getName() + " {\n");
		printMemberContainer(element, writer);
		writer.append("}\n");
	}
	
	private static void printMemberContainer(MemberContainer element, BufferedWriter writer) throws IOException {
		for (Member mem : element.getMembers()) {
			printMember(mem, writer);
		}
	}
	
	private static void printMember(Member element, BufferedWriter writer) throws IOException {
		
	}
}
