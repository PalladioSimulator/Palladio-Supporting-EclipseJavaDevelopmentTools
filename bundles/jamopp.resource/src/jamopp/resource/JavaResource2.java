package jamopp.resource;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.emftext.language.java.containers.JavaRoot;

import jamopp.parser.api.JaMoPPParserAPI;
import jamopp.parser.jdt.JaMoPPJDTParser;
import jamopp.printer.JaMoPPPrinter;

public class JavaResource2 extends ResourceImpl {
	public JavaResource2() {
		super();
	}
	
	public JavaResource2(URI uri) {
		super(uri);
	}
	
	@Override
	protected void doLoad(InputStream input, Map<?, ?> options) {
		JaMoPPParserAPI api = new JaMoPPJDTParser();
		api.setResourceSet(this.getResourceSet());
		this.getContents().add(api.parse(this.getURI().lastSegment(), input));
	}
	
	@Override
	protected void doSave(OutputStream output, Map<?, ?> options) {
		this.getContents().forEach(object -> {
			if (object instanceof JavaRoot) {
				JaMoPPPrinter.print((JavaRoot) object, output);
			}
		});
	}
}
