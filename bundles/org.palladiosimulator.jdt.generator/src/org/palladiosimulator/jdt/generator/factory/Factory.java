package org.palladiosimulator.jdt.generator.factory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.PackageDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.palladiosimulator.jdt.core.parser.AstLevel;
import org.palladiosimulator.jdt.core.parser.AstParser;
import org.palladiosimulator.jdt.core.visitor.ClassDeclarationVisitor;
import org.palladiosimulator.jdt.core.visitor.PackageDeclarationVisitor;
import org.palladiosimulator.jdt.helper.FileHelper;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassImpl;
import org.palladiosimulator.jdt.metamodel.javamodel.containers.ContainersFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.containers.ProjectRoot;
import org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.CompilationUnitImpl;
import org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.PackageImpl;

public class Factory {

    private static final String IN = "./";
    private static final Logger LOG = Logger.getLogger(Factory.class);
    private static final String OUT = "./file.containers";

    public static Resource createAndAddResource(final String outputFile, final String[] fileextensions,
            final ResourceSet rs) {
        for (final String fileext : fileextensions) {
            rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(fileext, new XMLResourceFactoryImpl());
        }
        final URI uri = URI.createFileURI(outputFile);
        final Resource resource = rs.createResource(uri);
        ((ResourceImpl) resource).setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());
        return resource;
    }

    private static CompilationUnitImpl createCompilationUnit(final Object name) {
        final CompilationUnitImpl cu = (CompilationUnitImpl) ContainersFactory.eINSTANCE.createCompilationUnit();
        cu.setName(String.valueOf(name));
        return cu;
    }

    private static PackageImpl createPackage(final Object name) {
        final PackageImpl newPackage = (PackageImpl) ContainersFactory.eINSTANCE.createPackage();
        newPackage.setName(String.valueOf(name));
        return newPackage;
    }

    private static ClassImpl createClass(final Object name) {
        ClassImpl newClass = (ClassImpl) ClassifiersFactory.eINSTANCE.createClass();
        newClass.setName(String.valueOf(name));
        return newClass;
    }

    private static String getFileName(final Map<String, CompilationUnit> map, final CompilationUnit unit) {
        return map.entrySet().parallelStream().filter(entry -> Objects.equals(entry.getValue(), unit))
                .map(Map.Entry::getKey).map(FileHelper::getFileName).findFirst().get();
    }

    private static void getMethods() {
        // TODO
    }

    public static void main(final String[] args) {
        LOG.info("Start");

        // factories
        final ContainersFactory containersFactory = ContainersFactory.eINSTANCE;

        // create
        final ResourceSet rs = new ResourceSetImpl();
        final Resource javaResource = createAndAddResource(OUT, new String[] { "containers", "xml" }, rs);
        final ProjectRoot root = containersFactory.createProjectRoot();
        root.setPath(IN);
        javaResource.getContents().add(root);

        // parse
        final AstParser parser = new AstParser(AstLevel.JLS11);
        parser.createAsts(FileHelper.createUri(IN));
        final Map<String, CompilationUnit> asts = parser.getCompilationUnits();

        // package
        final PackageDeclarationVisitor packageVisitor = new PackageDeclarationVisitor();
        asts.values().stream().forEach(a -> a.accept(packageVisitor));
        final List<PackageImpl> packages = packageVisitor.getVisitedNodes().stream().map(PackageDeclaration::getName)
                .map(String::valueOf).distinct().sorted().map(Factory::createPackage).collect(Collectors.toList());

        // unit
        final Map<CompilationUnit, CompilationUnitImpl> units = asts.values().stream()
                .collect(Collectors.toMap(Function.identity(), u -> createCompilationUnit(getFileName(asts, u))));
        units.keySet().stream().forEach(u -> {
            packages.stream().filter(e -> e.getName().equals(u.getPackage().getName().toString())).findFirst().get()
            .getCompilationUnits().add(units.get(u));
        });

        // class
        units.entrySet().stream().forEach(e -> {
            final ClassDeclarationVisitor visitor = new ClassDeclarationVisitor();
            e.getKey().accept(visitor);
            visitor.getVisitedNodes().stream().map(TypeDeclaration::getName).forEach(n -> {
                units.get(e.getKey()).getClassifiers().add(createClass(n));
            });
        });

        // finish
        packages.forEach(root.getPackages()::add);
        saveResource(javaResource);
    }

    public static void saveResource(final Resource resource) {
        final Map<Object, Object> saveOptions = ((XMLResource) resource).getDefaultSaveOptions();
        saveOptions.put(XMLResource.OPTION_CONFIGURATION_CACHE, Boolean.TRUE);
        saveOptions.put(XMLResource.OPTION_USE_CACHED_LOOKUP_TABLE, new ArrayList<>());
        try {
            resource.save(saveOptions);
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
    }

}
