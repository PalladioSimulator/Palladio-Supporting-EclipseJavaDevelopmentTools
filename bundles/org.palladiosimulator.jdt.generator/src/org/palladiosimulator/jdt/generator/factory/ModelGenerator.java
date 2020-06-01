package org.palladiosimulator.jdt.generator.factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.IBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.palladiosimulator.jdt.core.visitor.ImportDeclarationVisitor;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.AnnotationImpl;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassImpl;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.InterfaceImpl;
import org.palladiosimulator.jdt.metamodel.javamodel.containers.ContainersFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.CompilationUnitImpl;
import org.palladiosimulator.jdt.metamodel.javamodel.imports.ImportsFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ClassifierImportImpl;

public class ModelGenerator {
	
	//private List<PackageImpl> packages;
	private Map<CompilationUnit, CompilationUnitImpl> units;
	private ClassifierGenerator classGenerator;
	//static Map<String, PackageImpl> extPackage = new HashMap<String, PackageImpl>();
	static List<CompilationUnitImpl> allunits = new ArrayList<CompilationUnitImpl>();
	
	public ModelGenerator(Map<CompilationUnit, CompilationUnitImpl> units) {
		//this.packages = packages;
		this.units = units;
		classGenerator = new ClassifierGenerator(this);
	}

	/*public List<PackageImpl> generatePackages() {
        
        addCompilationUnits();
        createClassifiers();
        addImports();
        classGenerator.completeClassifiers();
        
        return packages;
	}*/
	
	public List<CompilationUnitImpl> generateCompilationUnits() {
		// add namespaces to the initial (parsed) units and add them to the final list
		addCompilationUnits();
		
		// create classifiers (classes, interfaces, annotations) and add them to the units with help of ClassGenerator
        createClassifiers();
        
        // create imports (units and classifiers) and add them
        addImports();
        
        // add fields, methods and annotation instances
        classGenerator.completeClassifiers();
        
		return allunits;
	}
	
	private void addCompilationUnits() {
		units.entrySet().stream().forEach(u -> {
				addNamespaces(u.getValue(), u.getKey().getPackage().resolveBinding().getNameComponents());
				allunits.add(u.getValue());
        });
	}
	
	private void createClassifiers() {
		        
        for (Entry<CompilationUnit, CompilationUnitImpl> entry : units.entrySet()) {
        	classGenerator.addClassifiersToCompUnit(entry);
        }
                
	}
	
	public void addNamespaces(CompilationUnitImpl unit, String[] namespaces) {
				
		for(String component : namespaces) {
					unit.getNamespaces().add(component);
		}
	}
	
	/*private String[] getNamespacesFromQualifiedName(String qualifiedname) {
		String[] namespaces = qualifiedname.split("\\.");
		namespaces = Arrays.copyOf(namespaces, namespaces.length-1);
		return namespaces;
	}
	
	private String getClassnameFromQualifiedName(String qualifiedname) {
		String[] namespaces = qualifiedname.split("\\.");
		return namespaces[namespaces.length-1];
	}*/
	
	
	private void addImports() {
		units.entrySet().stream().forEach(entry -> {
			final ImportDeclarationVisitor importVisitor = new ImportDeclarationVisitor();
			entry.getKey().accept(importVisitor);
			importVisitor.getVisitedNodes().stream().forEach(v -> {
				
				ClassifierImportImpl newImport = createImport();
				
				String[] namespaces = v.getName().toString().split("\\.");
				for(int i = 0; i<namespaces.length-1; i++) {
					newImport.getNamespaces().add(namespaces[i]);
				}
				String className = namespaces[namespaces.length-1];
				//String[] namespaces = getNamespacesFromQualifiedName(v.getName().toString());
				//String className = getClassnameFromQualifiedName(v.getName().toString());
				IBinding binding = v.resolveBinding();
				if(binding!=null) {
					if(binding.getKind() == IBinding.TYPE) {
							
						if(((ITypeBinding) binding).isClass()) {
								if(classGenerator.containsInternalClass(className)) {
									newImport.setClassifier(classGenerator.getInternalClass(className));
									entry.getValue().getImports().add(newImport);				
									}
								else if(classGenerator.containsExternalClass(v.getName().toString())) {
									newImport.setClassifier(classGenerator.getExternalClass(v.getName().toString()));
									entry.getValue().getImports().add(newImport);
								}
								else {
									// 	create class
									
									//	PackageImpl newPackage = createPackage(v.getName().toString());
									CompilationUnitImpl newCompUnit = createCompilationUnit(v.getName().toString()+".java");
									//	newPackage.getCompilationUnits().add(newCompUnit);
									ClassImpl newClass = classGenerator.createExternalClass(binding.getName());
									newCompUnit.getClassifiers().add(newClass);
									//	addPackage(newPackage);
									addNamespaces(newCompUnit, Arrays.copyOf(namespaces, namespaces.length-1));
									newImport.setClassifier(newClass);
									entry.getValue().getImports().add(newImport);
								}
						}
						else if(((ITypeBinding) binding).isInterface() && !(((ITypeBinding) binding).isAnnotation())) {
							//TODO: Check for duplicates
							// 	create interface
							//PackageImpl newPackage = createPackage(v.getName().toString());
							CompilationUnitImpl newCompUnit = createCompilationUnit(v.getName().toString()+".java");
							//newPackage.getCompilationUnits().add(newCompUnit);
							InterfaceImpl newInterface = classGenerator.createInterface(binding.getName());
							newCompUnit.getClassifiers().add(newInterface);
							//addPackage(newPackage);
							addNamespaces(newCompUnit, Arrays.copyOf(namespaces, namespaces.length-1));
							newImport.setClassifier(newInterface);
							entry.getValue().getImports().add(newImport);
						}
						else if((((ITypeBinding) binding).isAnnotation())) {
							//TODO: Check for duplicates
							// 	create Annotation
							//PackageImpl newPackage = createPackage(v.getName().toString());
							CompilationUnitImpl newCompUnit = createCompilationUnit(v.getName().toString()+".java");
							//newPackage.getCompilationUnits().add(newCompUnit);
							AnnotationImpl newAnno = classGenerator.createAnnotation(binding.getName(), true);
							newCompUnit.getClassifiers().add(newAnno);
							//addPackage(newPackage);
							addNamespaces(newCompUnit, Arrays.copyOf(namespaces, namespaces.length-1));
							newImport.setClassifier(newAnno);
							entry.getValue().getImports().add(newImport);
						}
					}
				}
				else {
					System.out.println("Binding ("+className+") could not be resolved! Missing .jar file...");
				}        
				
			});
    	});
	}
	
	public Map<CompilationUnit, CompilationUnitImpl> getCompilationUnits() {
		return units;
	}
	
	public CompilationUnitImpl createCompilationUnit(final Object name) {
        final CompilationUnitImpl cu = (CompilationUnitImpl) ContainersFactory.eINSTANCE.createCompilationUnit();
        cu.setName(String.valueOf(name));
        allunits.add(cu);
        return cu;
    }
	
	/*public PackageImpl createPackage(final Object name) {
		if (extPackage.containsKey(String.valueOf(name))) {
			return extPackage.get(String.valueOf(name));
		}
        final PackageImpl newPackage = (PackageImpl) ContainersFactory.eINSTANCE.createPackage();
        newPackage.setName(String.valueOf(name));
        extPackage.put(String.valueOf(name), newPackage);
        return newPackage;
    }
	
	public PackageImpl getExternalPackage(String name) {
		return extPackage.get(name);
	}
	
	public boolean containsExternalPackage(String name) {
		return extPackage.containsKey(name);
	}*/
	

    private static ClassifierImportImpl createImport() {
    	ClassifierImportImpl newImport = (ClassifierImportImpl) ImportsFactory.eINSTANCE.createClassifierImport();
    	return newImport;
    }

}
