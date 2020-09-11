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
import org.emftext.language.java.arrays.ArrayInitializationValue;
import org.emftext.language.java.arrays.ArrayInitializer;
import org.emftext.language.java.arrays.ArrayInstantiation;
import org.emftext.language.java.arrays.ArrayInstantiationBySize;
import org.emftext.language.java.arrays.ArrayInstantiationByValuesTyped;
import org.emftext.language.java.arrays.ArrayInstantiationByValuesUntyped;
import org.emftext.language.java.arrays.ArraySelector;
import org.emftext.language.java.classifiers.Annotation;
import org.emftext.language.java.classifiers.AnonymousClass;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.classifiers.Enumeration;
import org.emftext.language.java.classifiers.Implementor;
import org.emftext.language.java.classifiers.Interface;
import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.containers.JavaRoot;
import org.emftext.language.java.expressions.AdditiveExpression;
import org.emftext.language.java.expressions.AdditiveExpressionChild;
import org.emftext.language.java.expressions.AndExpression;
import org.emftext.language.java.expressions.AndExpressionChild;
import org.emftext.language.java.expressions.ArrayConstructorReferenceExpression;
import org.emftext.language.java.expressions.AssignmentExpression;
import org.emftext.language.java.expressions.AssignmentExpressionChild;
import org.emftext.language.java.expressions.CastExpression;
import org.emftext.language.java.expressions.ClassTypeConstructorReferenceExpression;
import org.emftext.language.java.expressions.ConditionalAndExpression;
import org.emftext.language.java.expressions.ConditionalAndExpressionChild;
import org.emftext.language.java.expressions.ConditionalExpression;
import org.emftext.language.java.expressions.ConditionalExpressionChild;
import org.emftext.language.java.expressions.ConditionalOrExpression;
import org.emftext.language.java.expressions.ConditionalOrExpressionChild;
import org.emftext.language.java.expressions.EqualityExpression;
import org.emftext.language.java.expressions.EqualityExpressionChild;
import org.emftext.language.java.expressions.ExclusiveOrExpression;
import org.emftext.language.java.expressions.ExclusiveOrExpressionChild;
import org.emftext.language.java.expressions.Expression;
import org.emftext.language.java.expressions.ExpressionList;
import org.emftext.language.java.expressions.ImplicitlyTypedLambdaParameters;
import org.emftext.language.java.expressions.InclusiveOrExpression;
import org.emftext.language.java.expressions.InclusiveOrExpressionChild;
import org.emftext.language.java.expressions.InstanceOfExpression;
import org.emftext.language.java.expressions.InstanceOfExpressionChild;
import org.emftext.language.java.expressions.LambdaExpression;
import org.emftext.language.java.expressions.LambdaParameters;
import org.emftext.language.java.expressions.MethodReferenceExpression;
import org.emftext.language.java.expressions.MethodReferenceExpressionChild;
import org.emftext.language.java.expressions.MultiplicativeExpression;
import org.emftext.language.java.expressions.MultiplicativeExpressionChild;
import org.emftext.language.java.expressions.NestedExpression;
import org.emftext.language.java.expressions.PrefixUnaryModificationExpression;
import org.emftext.language.java.expressions.PrimaryExpressionReferenceExpression;
import org.emftext.language.java.expressions.RelationExpression;
import org.emftext.language.java.expressions.RelationExpressionChild;
import org.emftext.language.java.expressions.ShiftExpression;
import org.emftext.language.java.expressions.ShiftExpressionChild;
import org.emftext.language.java.expressions.SingleImplicitLambdaParameter;
import org.emftext.language.java.expressions.SuffixUnaryModificationExpression;
import org.emftext.language.java.expressions.UnaryExpression;
import org.emftext.language.java.expressions.UnaryExpressionChild;
import org.emftext.language.java.expressions.UnaryModificationExpressionChild;
import org.emftext.language.java.generics.CallTypeArgumentable;
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
import org.emftext.language.java.instantiations.ExplicitConstructorCall;
import org.emftext.language.java.instantiations.Instantiation;
import org.emftext.language.java.instantiations.NewConstructorCall;
import org.emftext.language.java.instantiations.NewConstructorCallWithInferredTypeArguments;
import org.emftext.language.java.literals.BinaryIntegerLiteral;
import org.emftext.language.java.literals.BinaryLongLiteral;
import org.emftext.language.java.literals.BooleanLiteral;
import org.emftext.language.java.literals.CharacterLiteral;
import org.emftext.language.java.literals.DecimalDoubleLiteral;
import org.emftext.language.java.literals.DecimalFloatLiteral;
import org.emftext.language.java.literals.DecimalIntegerLiteral;
import org.emftext.language.java.literals.DecimalLongLiteral;
import org.emftext.language.java.literals.HexDoubleLiteral;
import org.emftext.language.java.literals.HexFloatLiteral;
import org.emftext.language.java.literals.HexIntegerLiteral;
import org.emftext.language.java.literals.HexLongLiteral;
import org.emftext.language.java.literals.Literal;
import org.emftext.language.java.literals.NullLiteral;
import org.emftext.language.java.literals.OctalIntegerLiteral;
import org.emftext.language.java.literals.OctalLongLiteral;
import org.emftext.language.java.literals.Self;
import org.emftext.language.java.literals.Super;
import org.emftext.language.java.literals.This;
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
import org.emftext.language.java.operators.Addition;
import org.emftext.language.java.operators.AdditiveOperator;
import org.emftext.language.java.operators.Assignment;
import org.emftext.language.java.operators.AssignmentAnd;
import org.emftext.language.java.operators.AssignmentDivision;
import org.emftext.language.java.operators.AssignmentExclusiveOr;
import org.emftext.language.java.operators.AssignmentLeftShift;
import org.emftext.language.java.operators.AssignmentMinus;
import org.emftext.language.java.operators.AssignmentModulo;
import org.emftext.language.java.operators.AssignmentMultiplication;
import org.emftext.language.java.operators.AssignmentOperator;
import org.emftext.language.java.operators.AssignmentOr;
import org.emftext.language.java.operators.AssignmentPlus;
import org.emftext.language.java.operators.AssignmentRightShift;
import org.emftext.language.java.operators.Division;
import org.emftext.language.java.operators.Equal;
import org.emftext.language.java.operators.EqualityOperator;
import org.emftext.language.java.operators.GreaterThan;
import org.emftext.language.java.operators.GreaterThanOrEqual;
import org.emftext.language.java.operators.LeftShift;
import org.emftext.language.java.operators.LessThan;
import org.emftext.language.java.operators.LessThanOrEqual;
import org.emftext.language.java.operators.Multiplication;
import org.emftext.language.java.operators.MultiplicativeOperator;
import org.emftext.language.java.operators.Negate;
import org.emftext.language.java.operators.NotEqual;
import org.emftext.language.java.operators.PlusPlus;
import org.emftext.language.java.operators.RelationOperator;
import org.emftext.language.java.operators.RightShift;
import org.emftext.language.java.operators.ShiftOperator;
import org.emftext.language.java.operators.Subtraction;
import org.emftext.language.java.operators.UnaryModificationOperator;
import org.emftext.language.java.operators.UnaryOperator;
import org.emftext.language.java.parameters.CatchParameter;
import org.emftext.language.java.parameters.OrdinaryParameter;
import org.emftext.language.java.parameters.Parameter;
import org.emftext.language.java.parameters.Parametrizable;
import org.emftext.language.java.parameters.ReceiverParameter;
import org.emftext.language.java.parameters.VariableLengthParameter;
import org.emftext.language.java.references.Argumentable;
import org.emftext.language.java.references.ElementReference;
import org.emftext.language.java.references.IdentifierReference;
import org.emftext.language.java.references.MethodCall;
import org.emftext.language.java.references.PrimitiveTypeReference;
import org.emftext.language.java.references.Reference;
import org.emftext.language.java.references.ReflectiveClassReference;
import org.emftext.language.java.references.SelfReference;
import org.emftext.language.java.references.StringReference;
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
			printArrayInitializer((ArrayInitializer) element, writer);
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
		if (element.getNamespaces().size() > 0) {
			writer.append(".");
		}
		for (int index = 0; index < element.getClassifierReferences().size() - 1; index++) {
			printClassifierReference(element.getClassifierReferences().get(index), writer);
			writer.append(".");
		}
		printClassifierReference(element.getClassifierReferences().get(element.getClassifierReferences().size() - 1), writer);
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
			for (int index = 1; index < element.getTypeArguments().size(); index++) {
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
		writer.append("class " + element.getName());
		printTypeParametrizable(element, writer);
		writer.append(" ");
		if (element.getExtends() != null) {
			writer.append("extends ");
			printTypeReference(element.getExtends(), writer);
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
		writer.append("interface " + element.getName());
		printTypeParametrizable(element, writer);
		writer.append(" ");
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
		writer.append(" " + element.getName());
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
				printVariableLengthParameter((VariableLengthParameter) param, writer);
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
					printOrdinaryParameter((OrdinaryParameter) param, writer);
				} else {
					printVariableLengthParameter((VariableLengthParameter) param, writer);
				}
				if (index < element.getParameters().size() - 1) {
					writer.append(", ");
				}
			}
			writer.append(")");
		}
	}
	
	private static void printAssignmentExpression(AssignmentExpression element, BufferedWriter writer) throws IOException {
		printAssignmentExpressionChild(element.getChild(), writer);
		if (element.getAssignmentOperator() != null) {
			printAssignmentOperator(element.getAssignmentOperator(), writer);
			printExpression(element.getValue(), writer);
		}
	}
	
	private static void printAssignmentOperator(AssignmentOperator element, BufferedWriter writer) throws IOException {
		if (element instanceof Assignment) {
			writer.append(" = ");
		} else if (element instanceof AssignmentAnd) {
			writer.append(" &= ");
		} else if (element instanceof AssignmentDivision) {
			writer.append(" /= ");
		} else if (element instanceof AssignmentExclusiveOr) {
			writer.append(" ^= ");
		} else if (element instanceof AssignmentMinus) {
			writer.append(" -= ");
		} else if (element instanceof AssignmentModulo) {
			writer.append(" %= ");
		} else if (element instanceof AssignmentMultiplication) {
			writer.append(" *= ");
		} else if (element instanceof AssignmentLeftShift) {
			writer.append(" <<= ");
		} else if (element instanceof AssignmentOr) {
			writer.append(" |= ");
		} else if (element instanceof AssignmentPlus) {
			writer.append(" += ");
		} else if (element instanceof AssignmentRightShift) {
			writer.append(" >>= ");
		} else {
			writer.append(" >>>= ");
		}
	}
	
	private static void printAssignmentExpressionChild(AssignmentExpressionChild element, BufferedWriter writer) throws IOException {
		if (element instanceof ConditionalExpression) {
			printConditionalExpression((ConditionalExpression) element, writer);
		} else {
			printConditionalExpressionChild((ConditionalExpressionChild) element, writer);
		}
	}
	
	private static void printConditionalExpression(ConditionalExpression element, BufferedWriter writer) throws IOException {
		printConditionalExpressionChild(element.getChild(), writer);
		if (element.getExpressionIf() != null) {
			writer.append(" ? ");
			printExpression(element.getExpressionIf(), writer);
			writer.append(" : ");
			printExpression(element.getGeneralExpressionElse(), writer);
		}
	}
	
	private static void printConditionalExpressionChild(ConditionalExpressionChild element, BufferedWriter writer)
		throws IOException {
		if (element instanceof ConditionalOrExpression) {
			printConditionalOrExpression((ConditionalOrExpression) element, writer);
		} else {
			printConditionalOrExpressionChild((ConditionalOrExpressionChild) element, writer);
		}
	}
	
	private static void printConditionalOrExpression(ConditionalOrExpression element, BufferedWriter writer) throws IOException {
		printConditionalOrExpressionChild(element.getChildren().get(0), writer);
		for (int index = 1; index < element.getChildren().size(); index++) {
			writer.append(" || ");
			printConditionalOrExpressionChild(element.getChildren().get(index), writer);
		}
	}
	
	private static void printConditionalOrExpressionChild(ConditionalOrExpressionChild element, BufferedWriter writer)
		throws IOException {
		if (element instanceof ConditionalAndExpression) {
			printConditionalAndExpression((ConditionalAndExpression) element, writer);
		} else {
			printConditionalAndExpressionChild((ConditionalAndExpressionChild) element, writer);
		}
	}
	
	private static void printConditionalAndExpression(ConditionalAndExpression element, BufferedWriter writer) throws IOException {
		printConditionalAndExpressionChild(element.getChildren().get(0), writer);
		for (int index = 1; index < element.getChildren().size(); index++) {
			writer.append(" && ");
			printConditionalAndExpressionChild(element.getChildren().get(index), writer);
		}
	}
	
	private static void printConditionalAndExpressionChild(ConditionalAndExpressionChild element, BufferedWriter writer)
		throws IOException {
		if (element instanceof InclusiveOrExpression) {
			printInclusiveOrExpression((InclusiveOrExpression) element, writer);
		} else {
			printInclusiveOrExpressionChild((InclusiveOrExpressionChild) element, writer);
		}
	}
	
	private static void printInclusiveOrExpression(InclusiveOrExpression element, BufferedWriter writer) throws IOException {
		printInclusiveOrExpressionChild(element.getChildren().get(0), writer);
		for (int index = 0; index < element.getChildren().size(); index++) {
			writer.append(" | ");
			printInclusiveOrExpressionChild(element.getChildren().get(index), writer);
		}
	}
	
	private static void printInclusiveOrExpressionChild(InclusiveOrExpressionChild element, BufferedWriter writer) throws IOException {
		if (element instanceof ExclusiveOrExpression) {
			printExclusiveOrExpression((ExclusiveOrExpression) element, writer);
		} else {
			printExclusiveOrExpressionChild((ExclusiveOrExpressionChild) element, writer);
		}
	}
	
	private static void printExclusiveOrExpression(ExclusiveOrExpression element, BufferedWriter writer) throws IOException {
		printExclusiveOrExpressionChild(element.getChildren().get(0), writer);
		for (int index = 1; index < element.getChildren().size(); index++) {
			writer.append(" ^ ");
			printExclusiveOrExpressionChild(element.getChildren().get(index), writer);
		}
	}
	
	private static void printExclusiveOrExpressionChild(ExclusiveOrExpressionChild element, BufferedWriter writer) throws IOException {
		if (element instanceof AndExpression) {
			printAndExpression((AndExpression) element, writer);
		} else {
			printAndExpressionChild((AndExpressionChild) element, writer);
		}
	}
	
	private static void printAndExpression(AndExpression element, BufferedWriter writer) throws IOException {
		printAndExpressionChild(element.getChildren().get(0), writer);
		for (int index = 0; index < element.getChildren().size(); index++) {
			writer.append(" & ");
			printAndExpressionChild(element.getChildren().get(index), writer);
		}
	}
	
	private static void printAndExpressionChild(AndExpressionChild element, BufferedWriter writer) throws IOException {
		if (element instanceof EqualityExpression) {
			printEqualityExpression((EqualityExpression) element, writer);
		} else {
			printEqualityExpressionChild((EqualityExpressionChild) element, writer);
		}
	}
	
	private static void printEqualityExpression(EqualityExpression element, BufferedWriter writer) throws IOException {
		printEqualityExpressionChild(element.getChildren().get(0), writer);
		for (int index = 1; index < element.getChildren().size(); index++) {
			printEqualityOperator(element.getEqualityOperators().get(index - 1), writer);
			printEqualityExpressionChild(element.getChildren().get(index), writer);
		}
	}
	
	private static void printEqualityOperator(EqualityOperator element, BufferedWriter writer) throws IOException {
		if (element instanceof Equal) {
			writer.append(" == ");
		} else if (element instanceof NotEqual) {
			writer.append(" != ");
		}
	}
	
	private static void printEqualityExpressionChild(EqualityExpressionChild element, BufferedWriter writer) throws IOException {
		if (element instanceof InstanceOfExpression) {
			printInstanceOfExpression((InstanceOfExpression) element, writer);
		} else {
			printInstanceOfExpressionChild((InstanceOfExpressionChild) element, writer);
		}
	}
	
	private static void printInstanceOfExpression(InstanceOfExpression element, BufferedWriter writer) throws IOException {
		printInstanceOfExpressionChild(element.getChild(), writer);
		writer.append(" instanceof ");
		printTypeReference(element.getTypeReference(), writer);
		printArrayDimensions(element.getArrayDimensionsBefore(), writer);
		printArrayDimensions(element.getArrayDimensionsAfter(), writer);
	}
	
	private static void printInstanceOfExpressionChild(InstanceOfExpressionChild element, BufferedWriter writer) throws IOException {
		if (element instanceof RelationExpression) {
			printRelationExpression((RelationExpression) element, writer);
		} else {
			printRelationExpressionChild((RelationExpressionChild) element, writer);
		}
	}
	
	private static void printRelationExpression(RelationExpression element, BufferedWriter writer) throws IOException {
		printRelationExpressionChild(element.getChildren().get(0), writer);
		for (int index = 1; index < element.getChildren().size(); index++) {
			printRelationOperator(element.getRelationOperators().get(index - 1), writer);
			printRelationExpressionChild(element.getChildren().get(index), writer);
		}
	}
	
	private static void printRelationOperator(RelationOperator element, BufferedWriter writer) throws IOException {
		if (element instanceof GreaterThan) {
			writer.append(" > ");
		} else if (element instanceof GreaterThanOrEqual) {
			writer.append(" >= ");
		} else if (element instanceof LessThan) {
			writer.append(" < ");
		} else if (element instanceof LessThanOrEqual) {
			writer.append(" <= ");
		}
	}
	
	private static void printRelationExpressionChild(RelationExpressionChild element, BufferedWriter writer) throws IOException {
		if (element instanceof ShiftExpression) {
			printShiftExpression((ShiftExpression) element, writer);
		} else {
			printShiftExpressionChild((ShiftExpressionChild) element, writer);
		}
	}
	
	private static void printShiftExpression(ShiftExpression element, BufferedWriter writer) throws IOException {
		printShiftExpressionChild(element.getChildren().get(0), writer);
		for (int index = 1; index < element.getChildren().size(); index++) {
			printShiftOperator(element.getShiftOperators().get(index - 1), writer);
			printShiftExpressionChild(element.getChildren().get(index), writer);
		}
	}
	
	private static void printShiftOperator(ShiftOperator element, BufferedWriter writer) throws IOException {
		if (element instanceof LeftShift) {
			writer.append(" << ");
		} else if (element instanceof RightShift) {
			writer.append(" >> ");
		} else {
			writer.append(" >>> ");
		}
	}
	
	private static void printShiftExpressionChild(ShiftExpressionChild element, BufferedWriter writer) throws IOException {
		if (element instanceof AdditiveExpression) {
			printAdditiveExpression((AdditiveExpression) element, writer);
		} else {
			printAdditiveExpressionChild((AdditiveExpressionChild) element, writer);
		}
	}
	
	private static void printAdditiveExpression(AdditiveExpression element, BufferedWriter writer) throws IOException {
		printAdditiveExpressionChild(element.getChildren().get(0), writer);
		for (int index = 1; index < element.getChildren().size(); index++) {
			printAdditiveOperator(element.getAdditiveOperators().get(index - 1), writer);
			printAdditiveExpressionChild(element.getChildren().get(index), writer);
		}
	}
	
	private static void printAdditiveOperator(AdditiveOperator element, BufferedWriter writer) throws IOException {
		if (element instanceof Addition) {
			writer.append(" + ");
		} else {
			writer.append(" - ");
		}
	}
	
	private static void printAdditiveExpressionChild(AdditiveExpressionChild element, BufferedWriter writer) throws IOException {
		if (element instanceof MultiplicativeExpression) {
			printMultiplicativeExpression((MultiplicativeExpression) element, writer);
		} else {
			printMultiplicativeExpressionChild((MultiplicativeExpressionChild) element, writer);
		}
	}
	
	private static void printMultiplicativeExpression(MultiplicativeExpression element, BufferedWriter writer) throws IOException {
		printMultiplicativeExpressionChild(element.getChildren().get(0), writer);
		for (int index = 1; index < element.getChildren().size(); index++) {
			printMultiplicativeOperator(element.getMultiplicativeOperators().get(index - 1), writer);
			printMultiplicativeExpressionChild(element.getChildren().get(index), writer);
		}
	}
	
	private static void printMultiplicativeOperator(MultiplicativeOperator element, BufferedWriter writer) throws IOException {
		if (element instanceof Multiplication) {
			writer.append(" * ");
		} else if (element instanceof Division) {
			writer.append(" / ");
		} else {
			writer.append(" % ");
		}
	}
	
	private static void printMultiplicativeExpressionChild(MultiplicativeExpressionChild element, BufferedWriter writer)
		throws IOException {
		if (element instanceof UnaryExpression) {
			printUnaryExpression((UnaryExpression) element, writer);
		} else {
			printUnaryExpressionChild((UnaryExpressionChild) element, writer);
		}
	}
	
	private static void printUnaryExpression(UnaryExpression element, BufferedWriter writer) throws IOException {
		for (UnaryOperator op : element.getOperators()) {
			printUnaryOperator(op, writer);
		}
		printUnaryExpressionChild(element.getChild(), writer);
	}
	
	private static void printUnaryOperator(UnaryOperator element, BufferedWriter writer) throws IOException {
		if (element instanceof Addition) {
			writer.append("+");
		} else if (element instanceof Subtraction) {
			writer.append("-");
		} else if (element instanceof Negate) {
			writer.append("~");
		} else {
			writer.append("!");
		}
	}
	
	private static void printUnaryExpressionChild(UnaryExpressionChild element, BufferedWriter writer) throws IOException {
		if (element instanceof PrefixUnaryModificationExpression) {
			printPrefixUnaryModificationExpression((PrefixUnaryModificationExpression) element, writer);
		} else if (element instanceof SuffixUnaryModificationExpression) {
			printSuffixUnaryModificationExpression((SuffixUnaryModificationExpression) element, writer);
		} else {
			printUnaryModificationExpressionChild((UnaryModificationExpressionChild) element, writer);
		}
	}
	
	private static void printPrefixUnaryModificationExpression(PrefixUnaryModificationExpression element, BufferedWriter writer)
		throws IOException {
		if (element.getOperator() != null) {
			printUnaryModificationOperator(element.getOperator(), writer);
		}
		printUnaryModificationExpressionChild(element.getChild(), writer);
	}
	
	private static void printSuffixUnaryModificationExpression(SuffixUnaryModificationExpression element, BufferedWriter writer)
		throws IOException {
		printUnaryModificationExpressionChild(element.getChild(), writer);
		if (element.getOperator() != null) {
			printUnaryModificationOperator(element.getOperator(), writer);
		}
	}
	
	private static void printUnaryModificationOperator(UnaryModificationOperator element, BufferedWriter writer) throws IOException {
		if (element instanceof PlusPlus) {
			writer.append("++");
		} else {
			writer.append("--");
		}
	}
	
	private static void printUnaryModificationExpressionChild(UnaryModificationExpressionChild element, BufferedWriter writer)
		throws IOException {
		if (element instanceof Switch) {
			printSwitch((Switch) element, writer);
		} else if (element instanceof CastExpression) {
			printCastExpression((CastExpression) element, writer);
		} else if (element instanceof MethodReferenceExpression) {
			printMethodReferenceExpression((MethodReferenceExpression) element, writer);
		} else {
			printMethodReferenceExpressionChild((MethodReferenceExpressionChild) element, writer);
		}
	}
	
	private static void printCastExpression(CastExpression element, BufferedWriter writer) throws IOException {
		writer.append("(");
		printTypeReference(element.getTypeReference(), writer);
		printArrayDimensions(element.getArrayDimensionsBefore(), writer);
		printArrayDimensions(element.getArrayDimensionsAfter(), writer);
		for (TypeReference ref : element.getAdditionalBounds()) {
			writer.append(" & ");
			printTypeReference(ref, writer);
		}
		writer.append(") ");
		printExpression(element.getGeneralChild(), writer);
	}
	
	private static void printMethodReferenceExpression(MethodReferenceExpression element, BufferedWriter writer) throws IOException {
		if (element instanceof PrimaryExpressionReferenceExpression) {
			PrimaryExpressionReferenceExpression ref = (PrimaryExpressionReferenceExpression) element;
			printMethodReferenceExpressionChild(ref.getChild(), writer);
			if (ref.getMethodReference() != null) {
				writer.append("::");
				printCallTypeArgumentable(ref, writer);
				printReference(ref.getMethodReference(), writer);
			}
		} else if (element instanceof ClassTypeConstructorReferenceExpression) {
			ClassTypeConstructorReferenceExpression ref = (ClassTypeConstructorReferenceExpression) element;
			printTypeReference(ref.getTypeReference(), writer);
			writer.append("::");
			printCallTypeArgumentable(ref, writer);
			writer.append("new");
		} else {
			ArrayConstructorReferenceExpression ref = (ArrayConstructorReferenceExpression) element;
			printTypeReference(ref.getTypeReference(), writer);
			printArrayDimensions(ref.getArrayDimensionsBefore(), writer);
			printArrayDimensions(ref.getArrayDimensionsAfter(), writer);
			writer.append("::new");
		}
	}
	
	private static void printCallTypeArgumentable(CallTypeArgumentable element, BufferedWriter writer) throws IOException {
		if (element.getCallTypeArguments().size() > 0) {
			writer.append("<");
			printTypeArgument(element.getCallTypeArguments().get(0), writer);
			for (int index = 1; index < element.getCallTypeArguments().size(); index++) {
				writer.append(", ");
				printTypeArgument(element.getCallTypeArguments().get(index), writer);
			}
			writer.append(">");
		}
	}
	
	private static void printMethodReferenceExpressionChild(MethodReferenceExpressionChild element, BufferedWriter writer)
		throws IOException {
		if (element instanceof Literal) {
			printLiteral((Literal) element, writer);
		} else {
			printReference((Reference) element, writer);
		}
	}
	
	private static void printLiteral(Literal element, BufferedWriter writer) throws IOException {
		if (element instanceof BooleanLiteral) {
			BooleanLiteral lit = (BooleanLiteral) element;
			writer.append(Boolean.toString(lit.isValue()));
		} else if (element instanceof CharacterLiteral) {
			CharacterLiteral lit = (CharacterLiteral) element;
			writer.append(lit.getValue());
		} else if (element instanceof NullLiteral) {
			writer.append("null");
		} else if (element instanceof DecimalFloatLiteral) {
			DecimalFloatLiteral lit = (DecimalFloatLiteral) element;
			writer.append(Float.toString(lit.getDecimalValue()) + "F");
		} else if (element instanceof HexFloatLiteral) {
			HexFloatLiteral lit = (HexFloatLiteral) element;
			writer.append("0x" + Float.toHexString(lit.getHexValue()) + "F");
		} else if (element instanceof DecimalDoubleLiteral) {
			DecimalDoubleLiteral lit = (DecimalDoubleLiteral) element;
			writer.append(Double.toString(lit.getDecimalValue()) + "D");
		} else if (element instanceof HexDoubleLiteral) {
			HexDoubleLiteral lit = (HexDoubleLiteral) element;
			writer.append("0x" + Double.toHexString(lit.getHexValue()) + "D");
		} else if (element instanceof DecimalIntegerLiteral) {
			DecimalIntegerLiteral lit = (DecimalIntegerLiteral) element;
			writer.append(lit.getDecimalValue().toString());
		} else if (element instanceof HexIntegerLiteral) {
			HexIntegerLiteral lit = (HexIntegerLiteral) element;
			writer.append("0x" + lit.getHexValue().toString(16));
		} else if (element instanceof OctalIntegerLiteral) {
			OctalIntegerLiteral lit = (OctalIntegerLiteral) element;
			writer.append("0" + lit.getOctalValue().toString(8));
		} else if (element instanceof BinaryIntegerLiteral) {
			BinaryIntegerLiteral lit = (BinaryIntegerLiteral) element;
			writer.append("0b" + lit.getBinaryValue().toString(2));
		} else if (element instanceof DecimalLongLiteral) {
			DecimalLongLiteral lit = (DecimalLongLiteral) element;
			writer.append(lit.getDecimalValue().toString() + "L");
		} else if (element instanceof HexLongLiteral) {
			HexLongLiteral lit = (HexLongLiteral) element;
			writer.append("0x" + lit.getHexValue().toString(16) + "L");
		} else if (element instanceof OctalLongLiteral) {
			OctalLongLiteral lit = (OctalLongLiteral) element;
			writer.append("0" + lit.getOctalValue().toString(8) + "L");
		} else if (element instanceof BinaryLongLiteral) {
			BinaryLongLiteral lit = (BinaryLongLiteral) element;
			writer.append("0b" + lit.getBinaryValue().toString(2) + "L");
		}
	}
	
	private static void printReference(Reference element, BufferedWriter writer) throws IOException {
		if (element instanceof AnnotationInstance) {
			printAnnotationInstance((AnnotationInstance) element, writer);
		} else if (element instanceof NestedExpression) {
			printNestedExpression((NestedExpression) element, writer);
		} else if (element instanceof ReflectiveClassReference) {
			printReflectiveClassReference((ReflectiveClassReference) element, writer);
		} else if (element instanceof PrimitiveTypeReference) {
			printPrimitiveTypeReference((PrimitiveTypeReference) element, writer);
		} else if (element instanceof StringReference) {
			printStringReference((StringReference) element, writer);
		} else if (element instanceof SelfReference) {
			printSelfReference((SelfReference) element, writer);
		} else if (element instanceof ArrayInstantiation) {
			printArrayInstantiation((ArrayInstantiation) element, writer);
		} else if (element instanceof Instantiation) {
			printInstantiation((Instantiation) element, writer);
		} else {
			printElementReference((ElementReference) element, writer);
		}
		for (ArraySelector sel : element.getArraySelectors()) {
			printArraySelector(sel, writer);
		}
		if (element.getNext() != null) {
			writer.append(".");
			printReference(element.getNext(), writer);
		}
	}
	
	private static void printArraySelector(ArraySelector element, BufferedWriter writer) throws IOException {
		printAnnotable(element, writer);
		writer.append("[");
		printExpression(element.getPosition(), writer);
		writer.append("]");
	}
	
	private static void printNestedExpression(NestedExpression element, BufferedWriter writer) throws IOException {
		writer.append("(");
		printExpression(element.getExpression(), writer);
		writer.append(")");
	}
	
	private static void printReflectiveClassReference(ReflectiveClassReference element, BufferedWriter writer) throws IOException {
		writer.append("class");
	}
	
	private static void printPrimitiveTypeReference(PrimitiveTypeReference element, BufferedWriter writer) throws IOException {
		printPrimitiveType(element.getPrimitiveType(), writer);
		printArrayDimensions(element.getArrayDimensionsBefore(), writer);
		printArrayDimensions(element.getArrayDimensionsAfter(), writer);
	}
	
	private static void printStringReference(StringReference element, BufferedWriter writer) throws IOException {
		writer.append("\"" + element.getValue() + "\"");
	}
	
	private static void printSelfReference(SelfReference element, BufferedWriter writer) throws IOException {
		printSelf(element.getSelf(), writer);
	}
	
	private static void printSelf(Self element, BufferedWriter writer) throws IOException {
		if (element instanceof This) {
			writer.append("this");
		} else if (element instanceof Super) {
			writer.append("super");
		}
	}
	
	private static void printInstantiation(Instantiation element, BufferedWriter writer) throws IOException {
		if (element instanceof NewConstructorCall) {
			NewConstructorCall call = (NewConstructorCall) element;
			writer.append("new ");
			printCallTypeArgumentable(call, writer);
			writer.append(" ");
			printTypeReference(call.getTypeReference(), writer);
			if (call instanceof NewConstructorCallWithInferredTypeArguments) {
				writer.append("<>");
			} else {
				printTypeArgumentable(call, writer);
			}
			printArgumentable(call, writer);
			if (call.getAnonymousClass() != null) {
				printAnonymousClass(call.getAnonymousClass(), writer);
			}
		} else {
			ExplicitConstructorCall call = (ExplicitConstructorCall) element;
			printCallTypeArgumentable(call, writer);
			printSelf(call.getCallTarget(), writer);
			printArgumentable(call, writer);
		}
	}
	
	private static void printArrayInstantiation(ArrayInstantiation element, BufferedWriter writer) throws IOException {
		if (element instanceof ArrayInstantiationBySize) {
			ArrayInstantiationBySize inst = (ArrayInstantiationBySize) element;
			writer.append("new ");
			printTypeReference(inst.getTypeReference(), writer);
			printTypeArgumentable(inst, writer);
			writer.append(" ");
			for (Expression expr : inst.getSizes()) {
				writer.append("[");
				printExpression(expr, writer);
				writer.append("] ");
			}
			printArrayDimensions(inst.getArrayDimensionsBefore(), writer);
			printArrayDimensions(inst.getArrayDimensionsAfter(), writer);
		} else if (element instanceof ArrayInstantiationByValuesUntyped) {
			ArrayInstantiationByValuesUntyped inst = (ArrayInstantiationByValuesUntyped) element;
			printArrayInitializer(inst.getArrayInitializer(), writer);
		} else {
			ArrayInstantiationByValuesTyped inst = (ArrayInstantiationByValuesTyped) element;
			writer.append("new ");
			printTypeReference(inst.getTypeReference(), writer);
			printTypeArgumentable(inst, writer);
			printArrayDimensions(inst.getArrayDimensionsBefore(), writer);
			printArrayDimensions(inst.getArrayDimensionsAfter(), writer);
			writer.append(" ");
			printArrayInitializer(inst.getArrayInitializer(), writer);
		}
	}
	
	private static void printArrayInitializer(ArrayInitializer element, BufferedWriter writer) throws IOException {
		writer.append("{");
		for (ArrayInitializationValue val : element.getInitialValues()) {
			if (val instanceof AnnotationInstance) {
				printAnnotationInstance((AnnotationInstance) val, writer);
			} else if (val instanceof ArrayInitializer) {
				printArrayInitializer((ArrayInitializer) val, writer);
			} else {
				printExpression((Expression) val, writer);
			}
		}
		writer.append("}");
	}
	
	private static void printElementReference(ElementReference element, BufferedWriter writer) throws IOException {
		if (element instanceof IdentifierReference) {
			printIdentifierReference((IdentifierReference) element, writer);
		} else {
			printMethodCall((MethodCall) element, writer);
		}
	}
	
	private static void printIdentifierReference(IdentifierReference element, BufferedWriter writer) throws IOException {
		printAnnotable(element, writer);
		if (element.getTarget() instanceof org.emftext.language.java.containers.Package) {
			writer.append(((org.emftext.language.java.containers.Package) element).getNamespacesAsString());
		} else {
			writer.append(element.getTarget().getName());
		}
		printTypeArgumentable(element, writer);
		printArrayDimensions(element.getArrayDimensionsBefore(), writer);
		printArrayDimensions(element.getArrayDimensionsAfter(), writer);
	}
	
	private static void printMethodCall(MethodCall element, BufferedWriter writer) throws IOException {
		printCallTypeArgumentable(element, writer);
		writer.append(" " + element.getTarget().getName());
		printArgumentable(element, writer);
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
			writer.append(" ");
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
		if (element.getTypeParameters().size() > 0) {
			writer.append("<");
			printTypeParameter(element.getTypeParameters().get(0), writer);
			for (int index = 1; index < element.getTypeParameters().size(); index++) {
				writer.append(", ");
				printTypeParameter(element.getTypeParameters().get(index), writer);
			}
			writer.append("> ");
		}
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
