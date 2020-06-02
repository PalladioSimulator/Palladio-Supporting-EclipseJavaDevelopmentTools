package org.palladiosimulator.jdt.generator.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.SingleMemberAnnotation;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.palladiosimulator.jdt.core.visitor.AnnotationVisitor;
import org.palladiosimulator.jdt.core.visitor.TypeDeclarationVisitor;
import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.annotations.impl.AnnotationInstanceImpl;
import org.palladiosimulator.jdt.metamodel.javamodel.annotations.impl.SingleAnnotationParameterImpl;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.AnnotationImpl;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassImpl;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.InterfaceImpl;
import org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.CompilationUnitImpl;
import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.references.impl.StringReferenceImpl;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypesFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.types.impl.ClassifierReferenceImpl;

public class ClassifierGenerator {
	
	ModelGenerator modelGenerator;
	MemberGenerator memberGenerator;
	Map<TypeDeclaration, ClassImpl> classes = new HashMap<TypeDeclaration, ClassImpl>();
	static Map<String, ClassImpl> internals = new HashMap<String, ClassImpl>();
	static Map<String, ClassImpl> externals = new HashMap<String, ClassImpl>();
	static Map<String, AnnotationImpl> resolvedAnnotations = new HashMap<String, AnnotationImpl>();
    static Map<String, InterfaceImpl> interfaces = new HashMap<String, InterfaceImpl>();
    
	
	public ClassifierGenerator(ModelGenerator modelGenerator) {
		this.modelGenerator = modelGenerator;
		memberGenerator = new MemberGenerator(this);
	}

	public void addClassifiersToCompUnit(Entry<CompilationUnit, CompilationUnitImpl> entry) {

		final TypeDeclarationVisitor visitor = new TypeDeclarationVisitor();
		entry.getKey().accept(visitor);
		
		// create class
		visitor.getClassDeclarations().forEach(c -> {
			ClassImpl newClass = createClass(c.getName());
            entry.getValue().getClassifiers().add(newClass);                
            classes.put(c, newClass);
            internals.put(newClass.getName(), newClass);
		});
		
		// create interface
		visitor.getInterfaceDeclarations().forEach(i -> {
			InterfaceImpl newInterface = createInterface(i.getName());
			entry.getValue().getClassifiers().add(newInterface);
		});		
		
		visitor.getEnumDeclarations().forEach(e -> {
			// TODO: create enums
		});
	}
	
	
	
	public void completeClassifiers() {
		for (Entry<TypeDeclaration, ClassImpl> entry : classes.entrySet()) {
			memberGenerator.addFields(entry);
        	memberGenerator.addMethods(entry);
        	addAnnotations(entry);
        }

	}
	
	private void addAnnotations(Entry<TypeDeclaration, ClassImpl> entry) {
		final AnnotationVisitor annoVisitor = new AnnotationVisitor();
    	entry.getKey().accept(annoVisitor);
    	annoVisitor.getVisitedNodes().stream().forEach(a -> {
    		AnnotationImpl anno = createAnnotation(a.getTypeName().toString(), false);
			AnnotationInstanceImpl annoinstance = createAnnotationInstance(anno);
			
			if(a.isSingleMemberAnnotation()) {
				SingleMemberAnnotation sma = (SingleMemberAnnotation) a;
				SingleAnnotationParameterImpl param = (SingleAnnotationParameterImpl) AnnotationsFactory.eINSTANCE.createSingleAnnotationParameter();
				
				StringReferenceImpl stringref = (StringReferenceImpl) ReferencesFactory.eINSTANCE.createStringReference();
				stringref.setValue(String.valueOf(sma.getValue()));
				
				param.setValue(stringref);    				
				annoinstance.setParameter(param);
				
			}
    		
    		// class annotation 
    		if(a.getParent().getClass().isInstance(entry.getKey())) {
    			     			
    			if(!resolvedAnnotations.containsKey(anno.getName())) {
    				modelGenerator.getCompilationUnits().get(a.getParent().getParent()).getClassifiers().add(anno);
    			}
    			// add annotation to compilation unit
    			//units.get(a.getParent().getParent()).getClassifiers().add(anno);
    			//annotations.put(anno.getName(), anno);
    			// add annotation instance to class
    			classes.get(a.getParent()).getAnnotationsAndModifiers().add(annoinstance);
    			
    			
    		}
    		//else if(a.getParent().getClass().isInstance(fields.keySet().stream().findFirst().get())) {		//ACHTUNG NULLPOINTEREXCEPTION WENN LEER -> TODO
    			// TODO field annotation
    		//}
    		// method annotation
    		else if(a.getParent().getClass().isInstance(memberGenerator.getMethods().keySet().stream().findFirst().get())) {		//ACHTUNG NULLPOINTEREXCEPTION WENN LEER -> TODO
    			   			
    			if(!resolvedAnnotations.containsKey(anno.getName())) {
    				modelGenerator.getCompilationUnits().get(a.getParent().getParent().getParent()).getClassifiers().add(anno);
    			}        			
    			// add annotation to compilation unit
    			//units.get(a.getParent().getParent().getParent()).getClassifiers().add(anno);
    			//annotations.put(anno.getName(), anno);
    			// add annotation instance to method
    			memberGenerator.getMethods().get(a.getParent()).getAnnotationsAndModifiers().add(annoinstance);
    		}
    	});
	}
	
	public boolean containsInternalClass(String name) {
		return internals.containsKey(name);
	}
	
	public ClassImpl getInternalClass(String name) {
		return internals.get(name);
	}
	
	public boolean containsExternalClass(String name) {
		return externals.containsKey(name);
	}
	
	public ClassImpl getExternalClass(String name) {
		return externals.get(name);
	}
	
	public boolean containsInterface(String name) {
		return interfaces.containsKey(name);
	}
	
	public InterfaceImpl getInterface(String name) {
		return interfaces.get(name);
	}
	
	public boolean containsAnnotation(String name) {
		return resolvedAnnotations.containsKey(name);
	}
	
	public AnnotationImpl getAnnotation(String name) {
		return resolvedAnnotations.get(name);
	}
	
	public ClassImpl createExternalClass(final Object name) {
		if(externals.containsKey(String.valueOf(name))) {
    		return externals.get(String.valueOf(name));
    	}
		ClassImpl newClass = (ClassImpl) ClassifiersFactory.eINSTANCE.createClass();
        newClass.setName(String.valueOf(name));
		externals.put(String.valueOf(name), newClass);
        return newClass;
	}
		
	private static ClassImpl createClass(final Object name) {
    	if(internals.containsKey(String.valueOf(name))) {
    		return internals.get(String.valueOf(name));
    	}
        ClassImpl newClass = (ClassImpl) ClassifiersFactory.eINSTANCE.createClass();
        newClass.setName(String.valueOf(name));
        internals.put(String.valueOf(name), newClass);
        return newClass;
    }
	
	public InterfaceImpl createInterface(final Object name) {
    	if(interfaces.containsKey(String.valueOf(name))) {
    		return interfaces.get(String.valueOf(name));
    	}
        InterfaceImpl newInterface = (InterfaceImpl) ClassifiersFactory.eINSTANCE.createInterface();
        newInterface.setName(String.valueOf(name));
        interfaces.put(String.valueOf(name), newInterface);
        return newInterface;
    }
	
	public AnnotationImpl createAnnotation(final Object name, boolean resolved) {
    	if(resolvedAnnotations.containsKey(String.valueOf(name))) {
    		return resolvedAnnotations.get(String.valueOf(name));
    	}
    	AnnotationImpl newAnno = (AnnotationImpl) ClassifiersFactory.eINSTANCE.createAnnotation();
		newAnno.setName(String.valueOf(name));
		if(resolved) {
			resolvedAnnotations.put(String.valueOf(name), newAnno);
		}
    	return newAnno;
    }
	
	
    private AnnotationInstanceImpl createAnnotationInstance(AnnotationImpl anno) {
    	AnnotationInstanceImpl newAnnoInstance = (AnnotationInstanceImpl) AnnotationsFactory.eINSTANCE.createAnnotationInstance();
    	newAnnoInstance.setAnnotation(anno);
    	return newAnnoInstance;
    }
	
	public ClassifierReferenceImpl createClassifierReference(ITypeBinding binding) {
    	ClassifierReferenceImpl ref = (ClassifierReferenceImpl) TypesFactory.eINSTANCE.createClassifierReference();
    	
		if(internals.containsKey(binding.getName())) {
			ref.setTarget(internals.get(binding.getName()));
		}
		else if(externals.containsKey(binding.getName())) {
			ref.setTarget(externals.get(binding.getName()));
		}
		else if(interfaces.containsKey(binding.getName())) {
			ref.setTarget(interfaces.get(binding.getName()));
		}
		else if(resolvedAnnotations.containsKey(binding.getName())) {
			ref.setTarget(resolvedAnnotations.get(binding.getName()));
		}
		else {
			CompilationUnitImpl newCompUnit = modelGenerator.createCompilationUnit(binding.getQualifiedName()+".java");
			modelGenerator.addNamespaces(newCompUnit, binding.getPackage().getNameComponents());
			
			if(binding.isClass()) {
				ClassImpl newClass = createExternalClass(binding.getName());
				newCompUnit.getClassifiers().add(newClass);
    			ref.setTarget(newClass);
    			externals.put(binding.getName(), newClass);
			}
			else if(binding.isInterface() && !(binding.isAnnotation())) {
				InterfaceImpl newInterface = createInterface(binding.getName());
				newCompUnit.getClassifiers().add(newInterface);
				ref.setTarget(newInterface);
			}
			else if(binding.isAnnotation()) {
				AnnotationImpl newAnno = createAnnotation(binding.getName(), true);
				newCompUnit.getClassifiers().add(newAnno);
				ref.setTarget(newAnno);
			}    	
		}
		
		/*else {
			ref = createExternalClassifierReference(binding);
		}*/
		
		
    	return ref;
    }
    
    /*private ClassifierReferenceImpl createExternalClassifierReference(ITypeBinding binding) {
    	
    	ClassifierReferenceImpl ref = (ClassifierReferenceImpl) TypesFactory.eINSTANCE.createClassifierReference();
		PackageImpl newPackage;
		if(externals.containsKey(binding.getName())) {
			ref.setTarget(externals.get(binding.getName()));
			if(externals.containsKey(binding.getName())) {        				
	    		ref.setTarget(externals.get(binding.getName()));
	    	}
			else {				
				newPackage = modelGenerator.getExternalPackage(binding.getQualifiedName());
				CompilationUnitImpl newCompUnit = modelGenerator.createCompilationUnit(binding.getQualifiedName()+".java");
				modelGenerator.addNamespaces(newCompUnit, binding.getPackage().getNameComponents());
				newPackage.getCompilationUnits().add(newCompUnit);
				if(binding.isClass()) {
					System.out.println("interface: "+binding.getPackage());
					ClassImpl newClass = createExternalClass(binding.getName());
					newCompUnit.getClassifiers().add(newClass);
	    			ref.setTarget(newClass);
	    			externals.put(binding.getName(), newClass);
				}
				else if(binding.isInterface() && !(binding.isAnnotation())) {
					System.out.println("interface: "+binding.getPackage());
					InterfaceImpl newInterface = createInterface(binding.getName());
					newCompUnit.getClassifiers().add(newInterface);
					ref.setTarget(newInterface);
				}
				else if(binding.isAnnotation()) {
					System.out.println("anno: "+binding.getPackage());
					AnnotationImpl newAnno = createAnnotation(binding.getName(), true);
					newCompUnit.getClassifiers().add(newAnno);
					ref.setTarget(newAnno);
				}    			
			}
		}
		else {
			newPackage = modelGenerator.createPackage(binding.getQualifiedName());
			CompilationUnitImpl newCompUnit = modelGenerator.createCompilationUnit(binding.getQualifiedName()+".java");
			modelGenerator.addNamespaces(newCompUnit, binding.getPackage().getNameComponents());
			newPackage.getCompilationUnits().add(newCompUnit);
			
			if(binding.isClass()) {
				ClassImpl newClass = createExternalClass(binding.getName());
				newCompUnit.getClassifiers().add(newClass);
    			ref.setTarget(newClass);
    			externals.put(binding.getName(), newClass);
			}
			else if(binding.isInterface() && !(binding.isAnnotation())) {
				InterfaceImpl newInterface = createInterface(binding.getName());
				newCompUnit.getClassifiers().add(newInterface);
				ref.setTarget(newInterface);
			}
			else if(binding.isAnnotation()) {
				AnnotationImpl newAnno = createAnnotation(binding.getName(), true);
				newCompUnit.getClassifiers().add(newAnno);
				ref.setTarget(newAnno);
			}    	
			
			modelGenerator.addPackage(newPackage);			
		}
		// TODO resolve classes further
		return ref;
    	
    }*/

}
