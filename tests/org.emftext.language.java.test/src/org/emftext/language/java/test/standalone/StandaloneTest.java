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
 ******************************************************************************/
package org.emftext.language.java.test.standalone;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emftext.language.java.containers.impl.CompilationUnitImpl;
import org.emftext.language.java.test.bugs.AbstractBugTestCase;
import org.junit.jupiter.api.Disabled;
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
@Disabled
public class StandaloneTest extends AbstractBugTestCase {

    @Test
    @SuppressWarnings("unused")
    public void test() {
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("java", new JavaResource2Factory());

        // create
        final List<CompilationUnitImpl> roots = new ArrayList<>();
        final ResourceSet rs = new ResourceSetImpl();
        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("containers", new XMIResourceFactoryImpl());

        final JaMoPPParserAPI parser = new JaMoPPJDTParser();
        final ResourceSet units = parser.parseDirectory(Paths.get("src-standalone"));
    }
}
