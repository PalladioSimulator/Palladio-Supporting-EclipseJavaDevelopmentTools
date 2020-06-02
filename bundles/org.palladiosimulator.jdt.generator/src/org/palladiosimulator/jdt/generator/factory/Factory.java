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
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.palladiosimulator.jdt.core.parser.AstLevel;
import org.palladiosimulator.jdt.core.parser.AstParser;
import org.palladiosimulator.jdt.helper.FileHelper;
import org.palladiosimulator.jdt.metamodel.javamodel.containers.ContainersFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.CompilationUnitImpl;

public class Factory {

    private static final String IN = "C:\\Users\\Fabian\\git\\masterarbeit\\Workspace\\innereclipse\\demo\\src";
    private static final Logger LOG = Logger.getLogger(TestFactory.class);
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


    private static String getFileName(final Map<String, CompilationUnit> map, final CompilationUnit unit) {
        return map.entrySet().parallelStream().filter(entry -> Objects.equals(entry.getValue(), unit))
                .map(Map.Entry::getKey).map(FileHelper::getFileName).findFirst().get();
    }
    
    
	public static void main(final String[] args) {
        LOG.info("Start");


        // create
        final ResourceSet rs = new ResourceSetImpl();
        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("containers", new XMIResourceFactoryImpl());
        
        final URI uri = URI.createFileURI(OUT);
        final Resource javaResource = rs.createResource(uri);
        
        //TODO
        // parse
        final AstParser parser = new AstParser(AstLevel.JLS11);
        parser.createAsts(FileHelper.createUri(IN), args);
        final Map<String, CompilationUnit> asts = parser.getCompilationUnits();

        // unit
        final Map<CompilationUnit, CompilationUnitImpl> units = asts.values().stream()
                .collect(Collectors.toMap(Function.identity(), u -> createCompilationUnit(getFileName(asts, u))));
        
        // complete compilation units
        ModelGenerator modelGenerator = new ModelGenerator(units);        
        List<CompilationUnitImpl> cunits = modelGenerator.generateCompilationUnits();
      
        
        // add containers to resource and save
        for (CompilationUnitImpl cunit : cunits) {        	
        	javaResource.getContents().add(cunit);
        }        
        try {
			saveXmiResource(javaResource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	
	private static void saveXmiResource(Resource xmiResource)
			throws IOException {
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
		xmiResource.save(options);
	}

}
