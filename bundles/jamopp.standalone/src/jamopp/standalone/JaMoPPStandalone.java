package jamopp.standalone;


import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.EqualityHelper;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.containers.JavaRoot;
import org.emftext.language.java.containers.Package;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.EqualityHelper;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.emftext.language.java.containers.EmptyModel;
import org.emftext.language.java.containers.JavaRoot;
import org.emftext.language.java.containers.Package;
import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.containers.ContainersFactory;

import jamopp.parser.api.JaMoPPParserAPI;
import jamopp.parser.jdt.JaMoPPJDTParser;
import jamopp.resource.JavaResource2Factory;

//import de.fzi.gast.core.Root;
//import de.fzi.gast.core.coreFactory;	


/**
 * Class for stand alone usage of JaMoPP 
 * How to use:
 * - Input any URI (absolute or relative file path/ Directory/ Archive) via INPUT 
 * - Define a Location for an Output file. 
 */

public class JaMoPPStandalone {
	
	private static final String INPUT = "/Users/adrianschneider/Desktop/DemoApplication.java";
    
    public static void main(String[] agrs) throws Exception {
    	
    	 JavaRoot root = ContainersFactory.eINSTANCE.createEmptyModel();  
		 Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("java", new JavaResource2Factory());
		 Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		 JaMoPPParserAPI parser = new JaMoPPJDTParser();
		 ResourceSet rs = parser.parseFile(Path.of(INPUT)).getResourceSet();
		 
		
		EcoreUtil.resolveAll(rs);
		int emptyFileName = 0;
		String outputFileName = "";
		
		
		for (Resource javaResource : new ArrayList<Resource>(rs.getResources())) {
			
			
			if (javaResource.getContents().isEmpty()) {
				
				System.out.println("WARNING: Emtpy Resource: " + javaResource.getURI());
				continue;
			}
			
			if(javaResource.getURI().scheme().equals("file")) {
			
			root = (JavaRoot) javaResource.getContents().get(0);
			
			if (root instanceof CompilationUnit) {
				outputFileName = root.getNamespacesAsString().replace(".", File.separator) + File.separator;
				CompilationUnit cu = (CompilationUnit) root;
				if (cu.getClassifiers().size() > 0) {
					outputFileName += cu.getClassifiers().get(0).getName();
				} else {
					outputFileName += emptyFileName++;
				}

			} else if (root instanceof Package) {
				outputFileName = root.getNamespacesAsString().replace(".", File.separator) + File.separator + "package-info";
				if (outputFileName.startsWith(File.separator)) {
					outputFileName = outputFileName.substring(1);
				}
			} else if (root instanceof org.emftext.language.java.containers.Module) {
				outputFileName = root.getNamespacesAsString().replace(".", File.separator) + File.separator + "module-info";
			} 
			File outputFile = new File("." + File.separator + "./standalone_output" + File.separator + outputFileName);
			outputFile.getParentFile().mkdirs();
			
			URI xmiFileURI = URI.createFileURI(outputFile.getAbsolutePath()).appendFileExtension("xmi");	
			Resource xmiResource = rs.createResource(xmiFileURI);
			xmiResource.getContents().addAll(javaResource.getContents());
		}
		
		}
		
		
		for (Resource xmiResource : rs.getResources()) {
			if (xmiResource instanceof XMIResource) {
				try {
					xmiResource.save(rs.getLoadOptions());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
	}
    
    
	
    
    
  
	public static void oldmain(String[] args) {
		 JavaRoot root = ContainersFactory.eINSTANCE.createEmptyModel();  
		 Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("java", new JavaResource2Factory());
		 JaMoPPParserAPI parser = new JaMoPPJDTParser();
		 ResourceSet rs = parser.parseFile(Path.of(INPUT)).getResourceSet();
		 //rs.createResource(URI.createFileURI(Path.of(INPUT)));
	     Resource gastResource = createAndAddResource("C:/file.gast", new String[] {"xml","gast"}, rs); 
	     gastResource.getContents().add(root);
	     saveResource(gastResource);
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
	

	
	     
	        


