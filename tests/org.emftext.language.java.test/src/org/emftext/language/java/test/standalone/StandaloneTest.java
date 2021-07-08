/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.emftext.language.java.test.standalone;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.containers.impl.CompilationUnitImpl;
import org.emftext.language.java.test.bugs.AbstractBugTestCase;
import org.junit.jupiter.api.Test;

import jamopp.parser.api.JaMoPPParserAPI;
import jamopp.parser.jdt.JaMoPPJDTParser;
import jamopp.resource.JavaResource2Factory;

/**
 * {@code parser.parseDirectory(Paths.get(projectPath)} throws
 *
 * <ul>
 * <li>{@code NoSuchFileException} if openjdk-11-source (apt) is not installed
 * and else</li>
 * <li>{@code StackOverflowError}.</li>
 * </ul>
 *
 * @author Marvin Meller
 */
public class StandaloneTest extends AbstractBugTestCase {
    /**
     * This method was important for earlier versions of the JaMoPP model as some
     * model instances did not have a name for example
     */
    private static boolean isUnitRelevant(final CompilationUnit root) {
        return ((root.getClassifiers().size() > 0) && (root.getClassifiers().get(0).getName() != null)
                && !root.getNamespacesAsString().isEmpty());
    }

    private static void saveModelToDisk(final ResourceSet rs) {
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("java", new JavaResource2Factory());
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("containers", new XMIResourceFactoryImpl());

        EcoreUtil.resolveAll(rs);

        final File outputFile = new File("." + File.separator + "./standalone_output" + File.separator + "model");
        outputFile.getParentFile().mkdirs();
        final URI xmiFileURI = URI.createFileURI(outputFile.getAbsolutePath()).appendFileExtension("containers");
        final Resource xmiResource = rs.createResource(xmiFileURI);

        for (final Resource javaResource : new ArrayList<>(rs.getResources())) {
            if (javaResource.getContents().isEmpty()) {
                continue;
            }

            if (!javaResource.getURI().scheme().equals("file")) {
                continue;
            }

            if (javaResource instanceof CompilationUnit) {
                final CompilationUnit unit = (CompilationUnit) javaResource;

                if (!isUnitRelevant(unit)) {
                    continue;
                }
            }

            xmiResource.getContents().addAll(javaResource.getContents());
        }

        try {
            xmiResource.save(rs.getLoadOptions());
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test() {
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("java", new JavaResource2Factory());

        // create
        final List<CompilationUnitImpl> roots = new ArrayList<>();
        final ResourceSet rs = new ResourceSetImpl();
        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("containers", new XMIResourceFactoryImpl());

        final JaMoPPParserAPI parser = new JaMoPPJDTParser();
        final ResourceSet units = parser.parseDirectory(Paths.get("src-standalone"));

        // filter
        units.getAllContents().forEachRemaining(u -> {
            if (u instanceof CompilationUnitImpl) {
                final CompilationUnitImpl root = (CompilationUnitImpl) u;

                if (isUnitRelevant(root)) {
                    final String name = root.getClassifiers().get(0).getName();
                    root.setName(name);
                    roots.add(root);
                }
            }
        });

        saveModelToDisk(units);
    }
}
