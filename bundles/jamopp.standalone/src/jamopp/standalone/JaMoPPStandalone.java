package jamopp.standalone;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.emftext.language.java.containers.EmptyModel;

import jamopp.parser.api.JaMoPPParserAPI;
import jamopp.parser.jdt.JaMoPPJDTParser;

//import de.fzi.gast.core.Root;
//import de.fzi.gast.core.coreFactory;	


/**
 * Class for stand alone usage of JaMoPP 
 * How to use:
 * - Input any URI (absolute or relative file path/ Directory/ Archive) via INPUT 
 * - Define a Location for an Output file. 
 */

public class JaMoPPStandalone {
	
	private static final String INPUT = "";
    private static final String OUTPUT = "./file.containers";
	

	public static void main(String[] args) {
		
			JaMoPPParserAPI parser = new JaMoPPJDTParser();
			ResourceSet set = parser.parseUri(URI.createURI(INPUT));
			Resource resource = createAndAddResource(OUTPUT, new String[] {"xml","java" }, set);
			EmptyModel root = org.emftext.language.java.containers.ContainersFactory.eINSTANCE.createEmptyModel();	
			resource.getContents().add(root);
		    saveResource(resource);
		  }
		
	  public static Resource createAndAddResource(String outputFile, String[] fileextensions, ResourceSet rs) {
		     for (String fileext : fileextensions) {
		        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(fileext, new XMLResourceFactoryImpl());
		     }		
		     URI uri = URI.createFileURI(outputFile);
		     Resource resource = rs.createResource(uri);
		     ((ResourceImpl)resource).setIntrinsicIDToEObjectMap(new HashMap());
		     return resource;
		  }
	  
	  public static void saveResource(Resource resource) {
		     Map saveOptions = ((XMLResource)resource).getDefaultSaveOptions();
		     saveOptions.put(XMLResource.OPTION_CONFIGURATION_CACHE, Boolean.TRUE);
		     saveOptions.put(XMLResource.OPTION_USE_CACHED_LOOKUP_TABLE, new ArrayList());
		     try {
		        resource.save(saveOptions);
		     } catch (IOException e) {
		        throw new RuntimeException(e);
		     }
		  }
}
	
	
	
	     
	        


