package jamopp.printer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.emftext.language.java.annotations.Annotable;
import org.emftext.language.java.annotations.AnnotationAttributeSetting;
import org.emftext.language.java.annotations.AnnotationInstance;
import org.emftext.language.java.annotations.AnnotationParameterList;
import org.emftext.language.java.annotations.AnnotationValue;
import org.emftext.language.java.annotations.SingleAnnotationParameter;
import org.emftext.language.java.arrays.ArrayDimension;
import org.emftext.language.java.arrays.ArrayInitializer;
import org.emftext.language.java.classifiers.Annotation;
import org.emftext.language.java.classifiers.AnonymousClass;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.classifiers.Enumeration;
import org.emftext.language.java.classifiers.Implementor;
import org.emftext.language.java.classifiers.Interface;
import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.containers.JavaRoot;
import org.emftext.language.java.expressions.AssignmentExpression;
import org.emftext.language.java.expressions.AssignmentExpressionChild;
import org.emftext.language.java.expressions.Expression;
import org.emftext.language.java.expressions.ExpressionList;
import org.emftext.language.java.expressions.ImplicitlyTypedLambdaParameters;
import org.emftext.language.java.expressions.LambdaExpression;
import org.emftext.language.java.expressions.LambdaParameters;
import org.emftext.language.java.expressions.SingleImplicitLambdaParameter;
import org.emftext.language.java.generics.ExtendsTypeArgument;
import org.emftext.language.java.generics.QualifiedTypeArgument;
import org.emftext.language.java.generics.SuperTypeArgument;
import org.emftext.language.java.generics.TypeArgument;
import org.emftext.language.java.generics.TypeArgumentable;
import org.emftext.language.java.generics.TypeParameter;
import org.emftext.language.java.generics.TypeParametrizable;
import org.emftext.language.java.generics.UnknownTypeArgument;
import org.emftext.language.java.imports.ClassifierImport;
import org.emftext.language.java.imports.Import;
import org.emftext.language.java.imports.ImportingElement;
import org.emftext.language.java.imports.PackageImport;
import org.emftext.language.java.imports.StaticClassifierImport;
import org.emftext.language.java.imports.StaticMemberImport;
import org.emftext.language.java.members.AdditionalField;
import org.emftext.language.java.members.ClassMethod;
import org.emftext.language.java.members.Constructor;
import org.emftext.language.java.members.EmptyMember;
import org.emftext.language.java.members.EnumConstant;
import org.emftext.language.java.members.ExceptionThrower;
import org.emftext.language.java.members.Field;
import org.emftext.language.java.members.InterfaceMethod;
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
import org.emftext.language.java.parameters.CatchParameter;
import org.emftext.language.java.parameters.OrdinaryParameter;
import org.emftext.language.java.parameters.Parameter;
import org.emftext.language.java.parameters.Parametrizable;
import org.emftext.language.java.parameters.ReceiverParameter;
import org.emftext.language.java.parameters.VariableLengthParameter;
import org.emftext.language.java.references.Argumentable;
import org.emftext.language.java.references.ElementReference;
import org.emftext.language.java.statements.Assert;
import org.emftext.language.java.statements.Block;
import org.emftext.language.java.statements.Break;
import org.emftext.language.java.statements.CatchBlock;
import org.emftext.language.java.statements.Condition;
import org.emftext.language.java.statements.Continue;
import org.emftext.language.java.statements.DefaultSwitchCase;
import org.emftext.language.java.statements.DefaultSwitchRule;
import org.emftext.language.java.statements.DoWhileLoop;
import org.emftext.language.java.statements.EmptyStatement;
import org.emftext.language.java.statements.ExpressionStatement;
import org.emftext.language.java.statements.ForEachLoop;
import org.emftext.language.java.statements.ForLoop;
import org.emftext.language.java.statements.ForLoopInitializer;
import org.emftext.language.java.statements.JumpLabel;
import org.emftext.language.java.statements.LocalVariableStatement;
import org.emftext.language.java.statements.NormalSwitchCase;
import org.emftext.language.java.statements.NormalSwitchRule;
import org.emftext.language.java.statements.Return;
import org.emftext.language.java.statements.Statement;
import org.emftext.language.java.statements.Switch;
import org.emftext.language.java.statements.SwitchCase;
import org.emftext.language.java.statements.SynchronizedBlock;
import org.emftext.language.java.statements.Throw;
import org.emftext.language.java.statements.TryBlock;
import org.emftext.language.java.statements.WhileLoop;
import org.emftext.language.java.statements.YieldStatement;
import org.emftext.language.java.types.ClassifierReference;
import org.emftext.language.java.types.InferableType;
import org.emftext.language.java.types.NamespaceClassifierReference;
import org.emftext.language.java.types.PrimitiveType;
import org.emftext.language.java.types.TypeReference;
import org.emftext.language.java.variables.AdditionalLocalVariable;
import org.emftext.language.java.variables.LocalVariable;
import org.emftext.language.java.variables.Resource;

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
			printExpression((Expression) element, writer);
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
			printTypeArgument(element.getTypeArguments().get(0), writer);
			for (int index = 0; index < element.getTypeArguments().size(); index++) {
				writer.append(", ");
				printTypeArgument(element.getTypeArguments().get(index), writer);
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
			writer.append(element.getModules().get(0).getTarget().getNamespacesAsString());
			for (int index = 1; index < element.getModules().size(); index++) {
				writer.append(", ");
				writer.append(element.getModules().get(index).getTarget().getNamespacesAsString());
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
	
	private static void printAnonymousClass(AnonymousClass element, BufferedWriter writer) throws IOException {
		writer.append("{\n");
		printMemberContainer(element, writer);
		writer.append("}\n");
	}
	
	private static void printImplementor(Implementor element, BufferedWriter writer) throws IOException {
		if (element.getImplements().size() > 0) {
			writer.append("implements ");
			printTypeReference(element.getImplements().get(0), writer);
			for (int index = 1; index < element.getImplements().size(); index++) {
				writer.append(", ");
				printTypeReference(element.getImplements().get(index), writer);
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
		printAnnotable(element, writer);
		writer.append(element.getName() + " ");
		if (element.getArguments().size() > 0) {
			printArgumentable(element, writer);
		}
		if (element.getAnonymousClass() != null) {
			printAnonymousClass(element.getAnonymousClass(), writer);
		}
	}
	
	private static void printInterface(Interface element, BufferedWriter writer) throws IOException {
		printAnnotableAndModifiable(element, writer);
		writer.append("interface " + element.getName() + " ");
		if (element.getExtends().size() > 0) {
			writer.append("extends ");
			printTypeReference(element.getExtends().get(0), writer);
			for (int index = 1; index < element.getExtends().size(); index++) {
				writer.append(", ");
				printTypeReference(element.getExtends().get(index), writer);
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
		if (element instanceof Field) {
			printField((Field) element, writer);
		} else if (element instanceof Constructor) {
			printConstructor((Constructor) element, writer);
		} else if (element instanceof ClassMethod) {
			printClassMethod((ClassMethod) element, writer);
		} else if (element instanceof InterfaceMethod) {
			printInterfaceMethod((InterfaceMethod) element, writer);
		} else if (element instanceof ConcreteClassifier) {
			printConcreteClassifier((ConcreteClassifier) element, writer);
		} else if (element instanceof Block) {
			printBlock((Block) element, writer);
		} else {
			printEmptyMember((EmptyMember) element, writer);
		}
	}
	
	private static void printField(Field element, BufferedWriter writer) throws IOException {
		printAnnotableAndModifiable(element, writer);
		printTypeReference(element.getTypeReference(), writer);
		printArrayDimensions(element.getArrayDimensionsBefore(), writer);
		writer.append(element.getName());
		printArrayDimensions(element.getArrayDimensionsAfter(), writer);
		if (element.getInitialValue() != null) {
			writer.append(" = ");
			printExpression(element.getInitialValue(), writer);
		}
		for (AdditionalField f : element.getAdditionalFields()) {
			writer.append(", ");
			printAdditionalField(f, writer);
		}
		writer.append(";\n\n");
	}
	
	private static void printAdditionalField(AdditionalField element, BufferedWriter writer) throws IOException {
		writer.append(element.getName());
		printArrayDimensions(element.getArrayDimensionsBefore(), writer);
		printArrayDimensions(element.getArrayDimensionsAfter(), writer);
		if (element.getInitialValue() != null) {
			writer.append(" = ");
			printExpression(element.getInitialValue(), writer);
		}
	}
	
	private static void printArrayDimensions(List<ArrayDimension> element, BufferedWriter writer) throws IOException {
		for (ArrayDimension dim : element) {
			if (dim.getAnnotations().size() > 0) {
				writer.append(" ");
				printAnnotable(dim, writer);
			}
			writer.append("[] ");
		}
	}
	
	private static void printConstructor(Constructor element, BufferedWriter writer) throws IOException {
		printAnnotableAndModifiable(element, writer);
		printTypeParametrizable(element, writer);
		writer.append(" " + element.getName());
		printParametrizable(element, writer);
		printExceptionThrower(element, writer);
		printBlock(element.getBlock(), writer);
	}
	
	private static void printClassMethod(ClassMethod element, BufferedWriter writer) throws IOException {
		printAnnotableAndModifiable(element, writer);
		printTypeParametrizable(element, writer);
		writer.append(" ");
		printTypeReference(element.getTypeReference(), writer);
		printArrayDimensions(element.getArrayDimensionsBefore(), writer);
		writer.append(" " + element.getName());
		printParametrizable(element, writer);
		printArrayDimensions(element.getArrayDimensionsAfter(), writer);
		printExceptionThrower(element, writer);
		writer.append(" ");
		printStatement(element.getStatement(), writer);
		writer.append("\n");
	}
	
	private static void printInterfaceMethod(InterfaceMethod element, BufferedWriter writer) throws IOException {
		printAnnotableAndModifiable(element, writer);
		printTypeParametrizable(element, writer);
		writer.append(" ");
		printTypeReference(element.getTypeReference(), writer);
		printArrayDimensions(element.getArrayDimensionsBefore(), writer);
		writer.append(" " + element.getName());
		printParametrizable(element, writer);
		printArrayDimensions(element.getArrayDimensionsAfter(), writer);
		printExceptionThrower(element, writer);
		writer.append(" ");
		if (element.getDefaultValue() != null) {
			writer.append("default ");
			printAnnotationValue(element.getDefaultValue(), writer);
		}
		printStatement(element.getStatement(), writer);
		writer.append("\n");
	}
	
	private static void printExceptionThrower(ExceptionThrower element, BufferedWriter writer) throws IOException {
		if (element.getExceptions().size() > 0) {
			writer.append("throws ");
			printTypeReference(element.getExceptions().get(0), writer);
			for (int index = 1; index < element.getExceptions().size(); index++) {
				writer.append(", ");
				printTypeReference(element.getExceptions().get(index), writer);
			}
		}
	}
	
	private static void printParametrizable(Parametrizable element, BufferedWriter writer) throws IOException {
		writer.append("(");
		for (int index = 0; index < element.getParameters().size(); index++) {
			Parameter param = element.getParameters().get(index);
			if (param instanceof ReceiverParameter) {
				printReceiverParameter((ReceiverParameter) param, writer);
			} else if (param instanceof OrdinaryParameter) {
				printOrdinaryParameter((OrdinaryParameter) param, writer);
			} else {
				printVariableLengthParameter((VariableLengthParameter) element, writer);
			}
			if (index < element.getParameters().size() - 1) {
				writer.append(", ");
			}
		}
		writer.append(")");
	}
	
	private static void printReceiverParameter(ReceiverParameter element, BufferedWriter writer) throws IOException {
		printAnnotable(element, writer);
		printTypeReference(element.getTypeReference(), writer);
		writer.append(" ");
		if (element.getOuterTypeReference() != null) {
			printTypeReference(element.getOuterTypeReference(), writer);
			writer.append(".");
		}
		writer.append("this");
	}
	
	private static void printOrdinaryParameter(OrdinaryParameter element, BufferedWriter writer) throws IOException {
		printAnnotableAndModifiable(element, writer);
		printTypeReference(element.getTypeReference(), writer);
		printArrayDimensions(element.getArrayDimensionsBefore(), writer);
		writer.append(" " + element.getName());
		printArrayDimensions(element.getArrayDimensionsAfter(), writer);
	}
	
	private static void printVariableLengthParameter(VariableLengthParameter element, BufferedWriter writer) throws IOException {
		printAnnotableAndModifiable(element, writer);
		printTypeReference(element.getTypeReference(), writer);
		writer.append(" ");
		printAnnotable(element, writer);
		writer.append(" ..." + element.getName());
	}
	
	private static void printArgumentable(Argumentable element, BufferedWriter writer) throws IOException {
		writer.append("(");
		for (int index = 0; index < element.getArguments().size(); index++) {
			printExpression(element.getArguments().get(index), writer);
			if (index < element.getArguments().size() - 1) {
				writer.append(", ");
			}
		}
		writer.append(")");
	}
	
	private static void printExpression(Expression element, BufferedWriter writer) throws IOException {
		if (element instanceof LambdaExpression) {
			printLambdaExpression((LambdaExpression) element, writer);
		} else if (element instanceof AssignmentExpression) {
			printAssignmentExpression((AssignmentExpression) element, writer);
		} else {
			printAssignmentExpressionChild((AssignmentExpressionChild) element, writer);
		}
	}
	
	private static void printLambdaExpression(LambdaExpression element, BufferedWriter writer) throws IOException {
		printLambdaParameters(element.getParameters(), writer);
		writer.append(" -> ");
		if (element.getBody() instanceof Block) {
			printBlock((Block) element.getBody(), writer);
		} else {
			printExpression((Expression) element.getBody(), writer);
		}
	}
	
	private static void printLambdaParameters(LambdaParameters element, BufferedWriter writer) throws IOException {
		if (element instanceof SingleImplicitLambdaParameter) {
			writer.append(element.getParameters().get(0).getName());
		} else if (element instanceof ImplicitlyTypedLambdaParameters) {
			writer.append("(");
			for (int index = 0; index < element.getParameters().size(); index++) {
				writer.append(element.getParameters().get(index).getName());
				if (index < element.getParameters().size() - 1) {
					writer.append(", ");
				}
			}
			writer.append(")");
		} else {
			writer.append("(");
			for (int index = 0; index < element.getParameters().size(); index++) {
				Parameter param = element.getParameters().get(index);
				if (param instanceof OrdinaryParameter) {
					printOrdinaryParameter((OrdinaryParameter) element, writer);
				} else {
					printVariableLengthParameter((VariableLengthParameter) element, writer);
				}
				if (index < element.getParameters().size() - 1) {
					writer.append(", ");
				}
			}
			writer.append(")");
		}
	}
	
	private static void printAssignmentExpression(AssignmentExpression element, BufferedWriter writer) throws IOException {
		
	}
	
	private static void printAssignmentExpressionChild(AssignmentExpressionChild element, BufferedWriter writer) throws IOException {
		
	}
	
	private static void printElementReference(ElementReference element, BufferedWriter writer) throws IOException {
		
	}
	
	private static void printBlock(Block element, BufferedWriter writer) throws IOException {
		for (Modifier m : element.getModifiers()) {
			printModifier(m, writer);
		}
		writer.append("{\n");
		for (Statement s : element.getStatements()) {
			printStatement(s, writer);
		}
		writer.append("}\n");
	}
	
	private static void printEmptyMember(EmptyMember element, BufferedWriter writer) throws IOException {
		writer.append(";\n\n");
	}
	
	private static void printStatement(Statement element, BufferedWriter writer) throws IOException {
		if (element instanceof ConcreteClassifier) {
			printConcreteClassifier((ConcreteClassifier) element, writer);
		} else if (element instanceof Assert) {
			printAssert((Assert) element, writer);
		} else if (element instanceof Block) {
			printBlock((Block) element, writer);
		} else if (element instanceof Condition) {
			printCondition((Condition) element, writer);
		} else if (element instanceof EmptyStatement) {
			printEmptyStatement((EmptyStatement) element, writer);
		} else if (element instanceof ExpressionStatement) {
			printExpressionStatement((ExpressionStatement) element, writer);
		} else if (element instanceof ForLoop) {
			printForLoop((ForLoop) element, writer);
		} else if (element instanceof ForEachLoop) {
			printForEachLoop((ForEachLoop) element, writer);
		} else if (element instanceof Break) {
			printBreak((Break) element, writer);
		} else if (element instanceof Continue) {
			printContinue((Continue) element, writer);
		} else if (element instanceof JumpLabel) {
			printJumpLabel((JumpLabel) element, writer);
		} else if (element instanceof LocalVariableStatement) {
			printLocalVariableStatement((LocalVariableStatement) element, writer);
		} else if (element instanceof Return) {
			printReturn((Return) element, writer);
		} else if (element instanceof Switch) {
			printSwitch((Switch) element, writer);
		} else if (element instanceof SynchronizedBlock) {
			printSynchronizedBlock((SynchronizedBlock) element, writer);
		} else if (element instanceof Throw) {
			printThrow((Throw) element, writer);
		} else if (element instanceof TryBlock) {
			printTryBlock((TryBlock) element, writer);
		} else if (element instanceof DoWhileLoop) {
			printDoWhileLoop((DoWhileLoop) element, writer);
		} else if (element instanceof WhileLoop) {
			printWhileLoop((WhileLoop) element, writer);
		} else {
			printYieldStatement((YieldStatement) element, writer);
		}
	}
	
	private static void printAssert(Assert element, BufferedWriter writer) throws IOException {
		writer.append("assert ");
		printExpression(element.getCondition(), writer);
		if (element.getErrorMessage() != null) {
			writer.append(" : ");
			printExpression(element.getErrorMessage(), writer);
		}
		writer.append(";\n");
	}
	
	private static void printBreak(Break element, BufferedWriter writer) throws IOException {
		writer.append("break");
		if (element.getTarget() != null) {
			writer.append(" " + element.getTarget().getName());
		}
		writer.append(";\n");
	}
	
	private static void printCatchBlock(CatchBlock element, BufferedWriter writer) throws IOException {
		writer.append("catch(");
		printCatchParameter((CatchParameter) element.getParameter(), writer);
		writer.append(")");
		printBlock(element.getBlock(), writer);
	}
	
	private static void printCatchParameter(CatchParameter element, BufferedWriter writer) throws IOException {
		printAnnotableAndModifiable(element, writer);
		printTypeReference(element.getTypeReference(), writer);
		if (element.getTypeReferences().size() > 0) {
			for (TypeReference ref : element.getTypeReferences()) {
				writer.append(" | ");
				printTypeReference(ref, writer);
			}
		}
		writer.append(" " + element.getName());
	}
	
	private static void printContinue(Continue element, BufferedWriter writer) throws IOException {
		writer.append("continue");
		if (element.getTarget() != null) {
			writer.append(" " + element.getTarget().getName());	
		}
		writer.append(";\n");
	}
	
	private static void printDoWhileLoop(DoWhileLoop element, BufferedWriter writer) throws IOException {
		writer.append("do\n");
		printStatement(element.getStatement(), writer);
		writer.append("while (");
		printExpression(element.getCondition(), writer);
		writer.append(");\n");
	}
	
	private static void printEmptyStatement(EmptyStatement element, BufferedWriter writer) throws IOException {
		writer.append(";\n");
	}
	
	private static void printCondition(Condition element, BufferedWriter writer) throws IOException {
		writer.append("if (");
		printExpression(element.getCondition(), writer);
		writer.append(")\n");
		printStatement(element.getStatement(), writer);
		if (element.getElseStatement() != null) {
			writer.append("else\n");
			printStatement(element.getElseStatement(), writer);
		}
	}
	
	private static void printExpressionStatement(ExpressionStatement element, BufferedWriter writer) throws IOException {
		printExpression(element.getExpression(), writer);
		writer.append(";\n");
	}
	
	private static void printForLoop(ForLoop element, BufferedWriter writer) throws IOException {
		writer.append("for (");
		if (element.getInit() != null) {
			printForLoopInitializer(element.getInit(), writer);
		}
		writer.append(" ; ");
		if (element.getCondition() != null) {
			printExpression(element.getCondition(), writer);
		}
		writer.append(" ; ");
		for (int index = 0; index < element.getUpdates().size(); index++) {
			printExpression(element.getUpdates().get(index), writer);
			if (index < element.getUpdates().size() - 1) {
				writer.append(", ");
			}
		}
		writer.append(")\n");
		printStatement(element.getStatement(), writer);
	}
	
	private static void printForLoopInitializer(ForLoopInitializer element, BufferedWriter writer) throws IOException {
		if (element instanceof LocalVariable) {
			printLocalVariable((LocalVariable) element, writer);
		} else {
			ExpressionList list = (ExpressionList) element;
			for (int index = 0; index < list.getExpressions().size(); index++) {
				printExpression(list.getExpressions().get(index), writer);
				if (index < list.getExpressions().size() - 1) {
					writer.append(", ");
				}
			}
		}
	}
	
	private static void printForEachLoop(ForEachLoop element, BufferedWriter writer) throws IOException {
		writer.append("for (");
		printOrdinaryParameter(element.getNext(), writer);
		writer.append(" : ");
		printExpression(element.getCollection(), writer);
		writer.append(")\n");
		printStatement(element.getStatement(), writer);
	}
	
	private static void printJumpLabel(JumpLabel element, BufferedWriter writer) throws IOException {
		writer.append(element.getName() + ": ");
		printStatement(element.getStatement(), writer);
	}
	
	private static void printLocalVariableStatement(LocalVariableStatement element, BufferedWriter writer) throws IOException {
		printLocalVariable(element.getVariable(), writer);
		writer.append(";\n");
	}
	
	private static void printLocalVariable(LocalVariable element, BufferedWriter writer) throws IOException {
		printAnnotableAndModifiable(element, writer);
		printTypeReference(element.getTypeReference(), writer);
		printArrayDimensions(element.getArrayDimensionsBefore(), writer);
		writer.append(" " + element.getName());
		printArrayDimensions(element.getArrayDimensionsAfter(), writer);
		if (element.getInitialValue() != null) {
			writer.append(" = ");
			printExpression(element.getInitialValue(), writer);
		}
		for (AdditionalLocalVariable var : element.getAdditionalLocalVariables()) {
			writer.append(", ");
			printAdditionalLocalVariable(var, writer);
		}
	}
	
	private static void printAdditionalLocalVariable(AdditionalLocalVariable element, BufferedWriter writer) throws IOException {
		writer.append(element.getName());
		printArrayDimensions(element.getArrayDimensionsBefore(), writer);
		printArrayDimensions(element.getArrayDimensionsAfter(), writer);
		if (element.getInitialValue() != null) {
			writer.append(" = ");
			printExpression(element.getInitialValue(), writer);
		}
	}
	
	private static void printReturn(Return element, BufferedWriter writer) throws IOException {
		writer.append("return");
		if (element.getReturnValue() != null) {
			printExpression(element.getReturnValue(), writer);
		}
		writer.append(";\n");
	}
	
	private static void printSwitch(Switch element, BufferedWriter writer) throws IOException {
		writer.append("switch (");
		printExpression(element.getVariable(), writer);
		writer.append(") {\n");
		for (SwitchCase cas : element.getCases()) {
			printSwitchCase(cas, writer);
		}
		writer.append("}\n");
	}
	
	private static void printSwitchCase(SwitchCase element, BufferedWriter writer) throws IOException {
		if (element instanceof DefaultSwitchCase) {
			printDefaultSwitchCase((DefaultSwitchCase) element, writer);
		} else if (element instanceof NormalSwitchCase) {
			printNormalSwitchCase((NormalSwitchCase) element, writer);
		} else if (element instanceof DefaultSwitchRule) {
			printDefaultSwitchRule((DefaultSwitchRule) element, writer);
		} else {
			printNormalSwitchRule((NormalSwitchRule) element, writer);
		}
	}
	
	private static void printDefaultSwitchCase(DefaultSwitchCase element, BufferedWriter writer) throws IOException {
		writer.append("default: ");
		for (Statement s : element.getStatements()) {
			printStatement(s, writer);
		}
		writer.append("\n");
	}
	
	private static void printNormalSwitchCase(NormalSwitchCase element, BufferedWriter writer) throws IOException {
		writer.append("case ");
		printExpression(element.getCondition(), writer);
		for (Expression expr : element.getAdditionalConditions()) {
			writer.append(", ");
			printExpression(expr, writer);
		}
		writer.append(": ");
		for (Statement s : element.getStatements()) {
			printStatement(s, writer);
		}
	}
	
	private static void printDefaultSwitchRule(DefaultSwitchRule element, BufferedWriter writer) throws IOException {
		writer.append("default -> ");
		for (Statement s : element.getStatements()) {
			printStatement(s, writer);
		}
	}
	
	private static void printNormalSwitchRule(NormalSwitchRule element, BufferedWriter writer) throws IOException {
		writer.append("case ");
		printExpression(element.getCondition(), writer);
		for (Expression expr : element.getAdditionalConditions()) {
			writer.append(", ");
			printExpression(expr, writer);
		}
		writer.append(" -> ");
		for (Statement s : element.getStatements()) {
			printStatement(s, writer);
		}
	}
	
	private static void printSynchronizedBlock(SynchronizedBlock element, BufferedWriter writer) throws IOException {
		writer.append("synchronized (");
		printExpression(element.getLockProvider(), writer);
		writer.append(") ");
		printBlock(element.getBlock(), writer);
	}
	
	private static void printThrow(Throw element, BufferedWriter writer) throws IOException {
		writer.append("throw ");
		printExpression(element.getThrowable(), writer);
		writer.append(";\n");
	}
	
	private static void printTryBlock(TryBlock element, BufferedWriter writer) throws IOException {
		writer.append("try");
		if (element.getResources().size() > 0) {
			writer.append("(");
			printResource(element.getResources().get(0), writer);
			for (int index = 1; index < element.getResources().size(); index++) {
				writer.append("; ");
				printResource(element.getResources().get(index), writer);
			}
			writer.append(")");
		}
		writer.append(" ");
		printBlock(element.getBlock(), writer);
		for (CatchBlock cat : element.getCatchBlocks()) {
			printCatchBlock(cat, writer);
		}
		if (element.getFinallyBlock() != null) {
			writer.append("finally ");
			printBlock(element.getFinallyBlock(), writer);
		}
	}
	
	private static void printResource(Resource element, BufferedWriter writer) throws IOException {
		if (element instanceof LocalVariable) {
			printLocalVariable((LocalVariable) element, writer);
		} else {
			printElementReference((ElementReference) element, writer);
		}
	}
	
	private static void printYieldStatement(YieldStatement element, BufferedWriter writer) throws IOException {
		writer.append("yield ");
		printExpression(element.getYieldExpression(), writer);
		writer.append(";\n");
	}
	
	private static void printWhileLoop(WhileLoop element, BufferedWriter writer) throws IOException {
		writer.append("while (");
		printExpression(element.getCondition(), writer);
		writer.append(")\n");
		printStatement(element.getStatement(), writer);
	}
	
	private static void printTypeParametrizable(TypeParametrizable element, BufferedWriter writer) throws IOException {
		writer.append("<");
		for (int index = 0; index < element.getTypeParameters().size(); index++) {
			printTypeParameter(element.getTypeParameters().get(index), writer);
			if (index < element.getTypeParameters().size() - 1) {
				writer.append(", ");
			}
		}
		writer.append("> ");
	}
	
	private static void printTypeParameter(TypeParameter element, BufferedWriter writer) throws IOException {
		printAnnotable(element, writer);
		writer.append(element.getName());
		if (element.getExtendTypes().size() > 0) {
			writer.append(" extends ");
			printTypeReference(element.getExtendTypes().get(0), writer);
			for (int index = 1; index < element.getExtendTypes().size(); index++) {
				writer.append(" & ");
				printTypeReference(element.getExtendTypes().get(index), writer);
			}
		}
	}
}
