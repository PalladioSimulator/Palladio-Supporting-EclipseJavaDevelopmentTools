/*******************************************************************************
 * Copyright (c) 2020, Martin Armbruster
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Martin Armbruster
 *      - Initial implementation
 ******************************************************************************/

package jamopp.parser.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.emftext.language.java.containers.JavaRoot;

/**
 * This interface provides an API for parsers that read Java source files and convert them to Java model instances.
 */
public interface JaMoPPParserAPI {
	/**
	 * File name of a module declaration.
	 */
	static final String MODULE_DECLARATION_FILE_NAME = "module-info.java";
	
	/**
	 * Reads an InputStream and parses its content into a Java model instance.
	 * 
	 * @param input the InputStream to read.
	 * @param isModule true if the InputStream corresponds to a module declaration. false otherwise.
	 * @return the created Java model instance or null if the InputStream could not be read.
	 */
	JavaRoot parse(InputStream input, boolean isModule);
	
	/**
	 * Reads an InputStream and parses its content into a Java model instance. It is assumed that the InputStream does not
	 * correspond to a module declaration.
	 * 
	 * @param input the InputStream to read.
	 * @return the created Java model instance or null if the InputStream could not be read.
	 */
	default JavaRoot parse(InputStream input) {
		return parse(input, false);
	}
	
	/**
	 * Reads a file and parses its content into a Java model instance.
	 * 
	 * @param file the Java source file.
	 * @return the created Java model instance or null if the file could not be read.
	 */
	default JavaRoot parseFile(Path file) {
		JavaRoot result = null;
		try {
			InputStream input = Files.newInputStream(file);
			result = parse(input, file.endsWith(MODULE_DECLARATION_FILE_NAME));
			input.close();
		} catch (IOException e) {
		}
		return result;
	}
	
	/**
	 * Visits all files and directories in a directory and parses all found Java source files.
	 * 
	 * @param directory the directory to search for Java source files.
	 * @return a list of all created Java model instances.
	 */
	default List<JavaRoot> parseDirectory(Path directory) {
		ArrayList<JavaRoot> results = new ArrayList<>();
		try {
			Files.walk(directory).filter(path -> Files.isRegularFile(path) && path.endsWith("java"))
				.forEach(path -> results.add(parseFile(path)));
		} catch (IOException e) {
		}
		return results;
	}
}
