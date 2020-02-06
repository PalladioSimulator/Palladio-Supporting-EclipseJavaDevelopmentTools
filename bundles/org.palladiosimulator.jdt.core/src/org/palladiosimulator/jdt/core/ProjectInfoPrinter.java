package org.palladiosimulator.jdt.core;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.text.Document;

/**
 * The Class ProjectInfoPrinter.
 */
public class ProjectInfoPrinter {

	/**
	 * Prints the compilation unit details.
	 *
	 * @param unit the unit
	 * @throws JavaModelException the java model exception
	 */
	private static void printCompilationUnitDetails(ICompilationUnit unit) throws JavaModelException {
		System.out.println("Source file " + unit.getElementName());
		System.out.println("Has number of lines: " + new Document(unit.getSource()).getNumberOfLines());
		printIMethods(unit);
	}

	/**
	 * Prints the I compilation unit info.
	 *
	 * @param mypackage the mypackage
	 * @throws JavaModelException the java model exception
	 */
	private static void printICompilationUnitInfo(IPackageFragment mypackage) throws JavaModelException {
		for (final ICompilationUnit unit : mypackage.getCompilationUnits()) {
			printCompilationUnitDetails(unit);
		}
	}

	/**
	 * Prints the I method details.
	 *
	 * @param type the type
	 * @throws JavaModelException the java model exception
	 */
	private static void printIMethodDetails(IType type) throws JavaModelException {
		for (final IMethod method : type.getMethods()) {
			System.out.println("Method name " + method.getElementName());
			System.out.println("Signature " + method.getSignature());
			System.out.println("Return Type " + method.getReturnType());

		}
	}

	/**
	 * Prints the I methods.
	 *
	 * @param unit the unit
	 * @throws JavaModelException the java model exception
	 */
	private static void printIMethods(ICompilationUnit unit) throws JavaModelException {
		for (final IType type : unit.getAllTypes()) {
			printIMethodDetails(type);
		}
	}

	/**
	 * Prints the package infos.
	 *
	 * @param javaProject the java project
	 * @throws JavaModelException the java model exception
	 */
	private static void printPackageInfos(IJavaProject javaProject) throws JavaModelException {
		for (final IPackageFragment javaPackage : javaProject.getPackageFragments()) {
			if (javaPackage.getKind() == IPackageFragmentRoot.K_SOURCE) {
				System.out.println("Package " + javaPackage.getElementName());
				printICompilationUnitInfo(javaPackage);
			}

		}
	}

	/**
	 * Prints the project info.
	 *
	 * @param project the project
	 * @throws CoreException      the core exception
	 * @throws JavaModelException the java model exception
	 */
	private static void printProjectInfo(IProject project) throws CoreException, JavaModelException {
		System.out.println("Working in project " + project.getName());
		if (project.isNatureEnabled("org.eclipse.jdt.core.javanature")) {
			printPackageInfos(JavaCore.create(project));
		}
	}

	/**
	 * Run.
	 */
	public static void run() {
		for (final IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
			try {
				printProjectInfo(project);
			} catch (final Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Instantiates a new project info printer.
	 */
	private ProjectInfoPrinter() {

	}
}