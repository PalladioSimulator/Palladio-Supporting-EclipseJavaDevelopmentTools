package jamopp.standalone;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import jamopp.parser.api.JaMoPPParserAPI;
import jamopp.parser.jdt.JaMoPPJDTParser;


/**
 * Class for stand alone usage of JaMoPP 
 * How to use:
 * - Input any URI (absolute or relative file path/ Directory/ Archive) via the command line argument  
 * - 
 */

public class JaMoPPStandalone {
	

	public static void main(String[] args) {
		
		if(args[0] != null) {
			JaMoPPParserAPI parser = new JaMoPPJDTParser();
			ResourceSet set = parser.parseUri(URI.createURI(args[0]));
			
			//Do Something with it
		}
	}
}

