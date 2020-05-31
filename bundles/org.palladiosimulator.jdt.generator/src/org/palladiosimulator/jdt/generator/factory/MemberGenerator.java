package org.palladiosimulator.jdt.generator.factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.palladiosimulator.jdt.core.visitor.FieldDeclarationVisitor;
import org.palladiosimulator.jdt.core.visitor.MethodDeclarationVisitor;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayDimensionImpl;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassImpl;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.QualifiedTypeArgumentImpl;
import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.InstantiationsFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.NewConstructorCallImpl;
import org.palladiosimulator.jdt.metamodel.javamodel.members.MembersFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.members.impl.ClassMethodImpl;
import org.palladiosimulator.jdt.metamodel.javamodel.members.impl.FieldImpl;
import org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MethodImpl;
import org.palladiosimulator.jdt.metamodel.javamodel.parameters.ParametersFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.parameters.impl.OrdinaryParameterImpl;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypesFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.types.impl.BooleanImpl;
import org.palladiosimulator.jdt.metamodel.javamodel.types.impl.ByteImpl;
import org.palladiosimulator.jdt.metamodel.javamodel.types.impl.CharImpl;
import org.palladiosimulator.jdt.metamodel.javamodel.types.impl.ClassifierReferenceImpl;
import org.palladiosimulator.jdt.metamodel.javamodel.types.impl.DoubleImpl;
import org.palladiosimulator.jdt.metamodel.javamodel.types.impl.FloatImpl;
import org.palladiosimulator.jdt.metamodel.javamodel.types.impl.IntImpl;
import org.palladiosimulator.jdt.metamodel.javamodel.types.impl.LongImpl;
import org.palladiosimulator.jdt.metamodel.javamodel.types.impl.PrimitiveTypeImpl;
import org.palladiosimulator.jdt.metamodel.javamodel.types.impl.ShortImpl;
import org.palladiosimulator.jdt.metamodel.javamodel.types.impl.VoidImpl;

public class MemberGenerator {
	
	ClassifierGenerator classGenerator;
	Map<FieldDeclaration, FieldImpl> fields = new HashMap<FieldDeclaration, FieldImpl>();
    Map<MethodDeclaration, MethodImpl> methods = new HashMap<MethodDeclaration, MethodImpl>();
    
    public MemberGenerator(ClassifierGenerator classGenerator) {
    	this.classGenerator = classGenerator;
    }
    
    public void addFields(Entry<TypeDeclaration, ClassImpl> entry) {
    	final FieldDeclarationVisitor fieldVisitor = new FieldDeclarationVisitor();
    	entry.getKey().accept(fieldVisitor);
    	
    	fieldVisitor.getVisitedNodes().stream().forEach(f -> {
    		VariableDeclarationFragment fragment = (VariableDeclarationFragment) f.fragments().get(0);
    		FieldImpl newField = createField(fragment.getName());
    		ClassifierReferenceImpl ref;
    		
    		if(f.getType().isPrimitiveType()) {
    			newField.setTypeReference(createPrimitiveType(f.getType()));
    		}
    		else if(f.getType().isSimpleType()) {        			       			
    			ref = classGenerator.createClassifierReference(f.getType().resolveBinding());        			        	    	
    			newField.setTypeReference(ref);
    		}
    		else if(f.getType().isArrayType()) {
    			ref = classGenerator.createClassifierReference(f.getType().resolveBinding().getElementType());
    			newField.setTypeReference(ref);
    			
    			ArrayDimensionImpl dim = (ArrayDimensionImpl) ArraysFactory.eINSTANCE.createArrayDimension();
    			newField.getArrayDimensionsBefore().add(dim);
    		}
    		else if(f.getType().isParameterizedType()) {
    			ref = classGenerator.createClassifierReference(f.getType().resolveBinding().getTypeDeclaration());
    			
    			/*ITypeBinding[] bindings = f.getType().resolveBinding().getTypeArguments();
    			for(int i = 0; i < bindings.length; i++) {
    				ClassifierReferenceImpl argref = (ClassifierReferenceImpl) TypesFactory.eINSTANCE.createClassifierReference();
        			argref = createClassifierReference(bindings[i]);
        			
        			QualifiedTypeArgumentImpl arg = (QualifiedTypeArgumentImpl) GenericsFactory.eINSTANCE.createQualifiedTypeArgument();
        			arg.setTypeReference(argref);
        			ref.getTypeArguments().add(arg);
    			}*/
    			resolveTypeArguments(f.getType().resolveBinding().getTypeArguments()).forEach(arg -> ref.getTypeArguments().add(arg));
    			newField.setTypeReference(ref);
    			
    			if(fragment.getInitializer() != null) {
    				ClassifierReferenceImpl inst_ref = classGenerator.createClassifierReference(fragment.getInitializer().resolveTypeBinding().getTypeDeclaration());
        			            			
        			resolveTypeArguments(fragment.getInitializer().resolveTypeBinding().getTypeArguments()).forEach(arg -> inst_ref.getTypeArguments().add(arg));            			

        			NewConstructorCallImpl newInstantiation = (NewConstructorCallImpl) InstantiationsFactory.eINSTANCE.createNewConstructorCall();
        			newInstantiation.setTypeReference(inst_ref);
        			
        			newField.setInitialValue(newInstantiation);            			
    			}
    			
    			
    		}
    		
    		entry.getValue().getMembers().add(newField);
    		fields.put(f, newField);
    	});
    }
	
	@SuppressWarnings("unchecked")
	public void addMethods(Entry<TypeDeclaration, ClassImpl> entry) {
		final MethodDeclarationVisitor methodVisitor = new MethodDeclarationVisitor();
    	entry.getKey().accept(methodVisitor);
    	methodVisitor.getVisitedNodes().stream().forEach(m -> {
    		if(!m.isConstructor()) {
    			MethodImpl newMethod = createClassMethod(m.getName());
    			
    			// return type
    			if(m.getReturnType2().isPrimitiveType()) {
    				newMethod.setTypeReference(createPrimitiveType(m.getReturnType2()));
    			}
    			else if(m.getReturnType2().isSimpleType()) {
    				newMethod.setTypeReference(classGenerator.createClassifierReference(m.getReturnType2().resolveBinding()));
    			}
    			
    			
    			// parameters
    			m.parameters().forEach(p -> {
    				OrdinaryParameterImpl param = (OrdinaryParameterImpl) ParametersFactory.eINSTANCE.createOrdinaryParameter();
    				SingleVariableDeclaration dec = (SingleVariableDeclaration) p; 
    				
    				param.setName(String.valueOf(dec.getName()));
    				if(dec.getType().isPrimitiveType()) {
    					param.setTypeReference(createPrimitiveType(dec.getType()));
    				}
    				else if(dec.getType().isSimpleType()){
    					param.setTypeReference(classGenerator.createClassifierReference(dec.getType().resolveBinding()));
    				}
    				newMethod.getParameters().add(param);
    			});
    			
    			entry.getValue().getMembers().add(newMethod);
    			methods.put(m, newMethod);
    		}
    	});
	}
	
	private List<QualifiedTypeArgumentImpl> resolveTypeArguments(ITypeBinding[] bindings) {
    	List<QualifiedTypeArgumentImpl> arguments = new ArrayList<QualifiedTypeArgumentImpl>();
    	for(int i = 0; i < bindings.length; i++) {
			ClassifierReferenceImpl argref = (ClassifierReferenceImpl) TypesFactory.eINSTANCE.createClassifierReference();
			argref = classGenerator.createClassifierReference(bindings[i]);
			
			QualifiedTypeArgumentImpl arg = (QualifiedTypeArgumentImpl) GenericsFactory.eINSTANCE.createQualifiedTypeArgument();
			arg.setTypeReference(argref);
			arguments.add(arg);
		}
    	return arguments;
    }
	
	public Map<MethodDeclaration, MethodImpl> getMethods() {
		return methods;
	}
	
	private MethodImpl createClassMethod(final Object name) {
    	ClassMethodImpl newMethod = (ClassMethodImpl) MembersFactory.eINSTANCE.createClassMethod();
    	newMethod.setName(String.valueOf(name));
    	return newMethod;
    }
	
	private FieldImpl createField(final Object name) {
    	FieldImpl newField = (FieldImpl) MembersFactory.eINSTANCE.createField();
    	newField.setName(String.valueOf(name));
    	return newField;
    }
	
	private PrimitiveTypeImpl createPrimitiveType(Type type) {
    	PrimitiveTypeImpl newType;
    	String typeString = type.toString();
    	
    	switch(typeString)
    	{
    		case "int":
    			newType = (IntImpl) TypesFactory.eINSTANCE.createInt();
        		return newType;
    		case "boolean":
    			newType = (BooleanImpl) TypesFactory.eINSTANCE.createBoolean();
        		return newType;
    		case "byte":
    			newType = (ByteImpl) TypesFactory.eINSTANCE.createByte();
        		return newType;
    		case "char":
    			newType = (CharImpl) TypesFactory.eINSTANCE.createChar();
        		return newType;
    		case "double":
    			newType = (DoubleImpl) TypesFactory.eINSTANCE.createDouble();
        		return newType;
    		case "float":
    			newType = (FloatImpl) TypesFactory.eINSTANCE.createFloat();
        		return newType;
    		case "long":
    			newType = (LongImpl) TypesFactory.eINSTANCE.createLong();
        		return newType;
    		case "short":
    			newType = (ShortImpl) TypesFactory.eINSTANCE.createShort();
        		return newType;
    		case "void":
    			newType = (VoidImpl) TypesFactory.eINSTANCE.createVoid();
        		return newType;
    		default:
    			System.out.println("Not a primitive type!");
    	}
    	return null;
    }
}
