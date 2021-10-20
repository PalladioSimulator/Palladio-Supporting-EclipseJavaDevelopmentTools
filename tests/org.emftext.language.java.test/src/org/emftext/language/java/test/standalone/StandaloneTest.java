/*******************************************************************************
 * Copyright 2021 Marvin Meller
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Marvin Meller
 *      - initial implementation
 *  Yves Kirschner
 *      - parameterize implementation
 *  Manar Mazkatli
 *      - fix the test and let it runs as expected
 ******************************************************************************/
package org.emftext.language.java.test.standalone;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emftext.language.java.JavaClasspath;
import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.containers.ContainersFactory;
import org.emftext.language.java.containers.JavaRoot;
import org.emftext.language.java.containers.Package;
import org.emftext.language.java.test.bugs.AbstractBugTestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import jamopp.options.ParserOptions;
import jamopp.options.ParserOptionsValueContainer;
import jamopp.parser.api.JaMoPPParserAPI;
import jamopp.parser.jdt.singlefile.JaMoPPJDTSingleFileParser;
import jamopp.resource.JavaResource2Factory;

/**
 * Parameterized test for standalone use of JDT-based conversion of Java source
 * code to EMF-based models. Apart from JUint, no dependencies to other tools
 * were newly introduced. For this purpose, the existing code was taken almost
 * identically and copied into this test. This standalone implementation worked
 * as expected in the first version we developed together. A comparable
 * standalone call is also included in the original JaMoPP from DevBoost.
 *
 * @author Marvin Meller
 * @author Yves Kirschner
 * @author Manar Mazkatli
 *
 * @version 1.2
 */
public class StandaloneTest {

    /**
     * This test generates corresponding EMF resources for the Java files in a
     * project. JUinit passes the folder name of the projects {@code <project>} to
     * be tested as a parameter. The EMF sources are then stored as XMI files in the
     * folder {@code ./standalone_output/<project>/}.
     *
     * This {@code ./standalone_output/} folder is not yet automatically deleted
     * after test execution. Likewise, these saved EMF resources would have to be
     * reloaded and then tested even further.
     *
     * As before, the projects do not need to be built. The projects are integrated
     * with Git submodules, so with {@code git submodule update --init} all projects
     * must be updated before test execution.
     *
     *
     * @param input Name of the project folder to test.
     *
     * @see jamopp.standalone.JaMoPPStandalone
     * @see org.emftext.language.java.test.AbstractJaMoPPTests
     */
    @ParameterizedTest
    @ValueSource(strings = { "src-standalone", "acmeair", "piggymetrics", "petclinic", "TeaStore","src-sevenandup", "teammates", "esda", "microservice", "src-input"})
    //src-input will be further examined, because it includes special symbols. One of them is allowed in java but not allowed in xml.
    public void testProject(String input) {
        
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("java", new JavaResource2Factory());
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
        final Path directory = Path.of(input).toAbsolutePath();
        assertTrue(Files.exists(directory), "Path " + directory + " must exist.");
        // The two lines have been replaced by equivalent calls to simplify
        // parameterization.
        // JaMoPPParserAPI parser = new JaMoPPJDTParser();
        // ResourceSet rs = parser.parseUri(URI.createURI(INPUT));
        final JaMoPPJDTSingleFileParser parser = new JaMoPPJDTSingleFileParser();     
        final ResourceSet rs = parser.parseDirectory(directory);
        EcoreUtil.resolveAll(rs);
        for (final Resource javaResource : new ArrayList<>(rs.getResources())) {
            if (javaResource.getContents().isEmpty()) {
                // The output is not interesting for the tests for the moment.
                // System.out.println("WARNING: Emtpy Resource: " + javaResource.getURI());
                continue;
            }

            // ENABLE_OUTPUT_OF_LIBRARY_FILES has been removed because no library files are
            // to be output for the the moment.
            //To avoid problems by opening the xmi files, you have to comment the following three lines and to install jamopp in your eclipse (or to open a new eclipse instance)
            //Additionally, the mappath protocol has to be registered, which I have not done yet. 
           if (!javaResource.getURI().scheme().equals("file")) {
                continue;
            }

            // For the parameterized test, the input parameter was also included in the path
            // for the output.
           final File outputFile = new File(
                    "standalone_output_ResolveAll_Active" + File.separator + input + File.separator + checkScheme(javaResource));
            outputFile.getParentFile().mkdirs();
            final URI xmiFileURI = URI.createFileURI(outputFile.getAbsolutePath()).appendFileExtension("xmi");
            final Resource xmiResource =  rs.createResource(xmiFileURI);
            xmiResource.getContents().addAll(javaResource.getContents());
            //The next lines are to avoid deleting the content of java files.
            
           try { 	
				xmiResource.save(rs.getLoadOptions());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
        }      
        }

        /*
         * TODO For further testing, the saved EMF resources must be reloaded. These
         * loaded resources must then be tested further. Here, existing EMF
         * functionality is called, comparable to the AbstractJaMoPPTests.
         */

    /**
     * Creates the path including the package hierarchy for the xmi output. Taken
     * directly from the last version.
     *
     * @param javaResource Resource for which the path is to be created.
     * @return path including the package hierarchy
     *
     * @see jamopp.standalone.JaMoPPStandalone#checkScheme()
     */
    private static String checkScheme(Resource javaResource) {
        int emptyFileName = 0;
        String outputFileName = "";
        JavaRoot root = ContainersFactory.eINSTANCE.createEmptyModel();

        root = (JavaRoot) javaResource.getContents().get(0);

        if (root instanceof CompilationUnit) {
            outputFileName = root.getNamespacesAsString().replace(".", File.separator) + File.separator;
            final CompilationUnit cu = (CompilationUnit) root;
            if (cu.getClassifiers().size() > 0) {
                outputFileName += cu.getClassifiers().get(0).getName();
            } else {
                outputFileName += emptyFileName++;
            }

        } else if (root instanceof Package) {
            outputFileName = root.getNamespacesAsString().replace(".", File.separator) + File.separator
                    + "package-info";
            if (outputFileName.startsWith(File.separator)) {
                outputFileName = outputFileName.substring(1);
            }
        } else if (root instanceof org.emftext.language.java.containers.Module) {
            outputFileName = root.getNamespacesAsString().replace(".", File.separator) + File.separator + "module-info";
        }
        return outputFileName;
    }

    /**
     * Set the parser options explicitly. The default setting of the parser options
     * should be fine for parsing non-compilable code; i.e. theoretically, nothing
     * would need to be adjusted. However, this has been added explicitly to allow
     * easy option changes for testing, among other things.
     *
     * @see jamopp.options.ParserOptionsValueContainer
     * @see jamopp.options.ParserOptions
     */
    @BeforeEach
    public void setUpParserOptions() {
    	JavaClasspath.get().clear();
		JavaClasspath.get().registerStdLib();
        final ParserOptionsValueContainer instance = ParserOptionsValueContainer.getInstance();
        instance.setValue(ParserOptions.RESOLVE_ALL_BINDINGS, Boolean.TRUE);
        instance.setValue(ParserOptions.RESOLVE_BINDINGS, Boolean.TRUE);
        instance.setValue(ParserOptions.RESOLVE_BINDINGS_OF_INFERABLE_TYPES, Boolean.TRUE);
        instance.setValue(ParserOptions.CREATE_LAYOUT_INFORMATION, Boolean.TRUE);
        instance.setValue(ParserOptions.PREFER_BINDING_CONVERSION, Boolean.TRUE);
        // instance.setValue(ParserOptions.RESOLVE_EVERYTHING, Boolean.FALSE);
        // instance.setValue(ParserOptions.REGISTER_LOCAL, Boolean.FALSE);
    }

}
