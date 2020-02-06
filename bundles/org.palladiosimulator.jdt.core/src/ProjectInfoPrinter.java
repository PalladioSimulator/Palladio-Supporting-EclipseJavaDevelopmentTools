import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
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

public class ProjectInfoPrinter {

	private static void printCompilationUnitDetails(ICompilationUnit unit) throws JavaModelException {
		System.out.println("Source file " + unit.getElementName());
		System.out.println("Has number of lines: " + new Document(unit.getSource()).getNumberOfLines());
		printIMethods(unit);
	}

	private static void printICompilationUnitInfo(IPackageFragment mypackage) throws JavaModelException {
		for (final ICompilationUnit unit : mypackage.getCompilationUnits()) {
			printCompilationUnitDetails(unit);
		}
	}

	private static void printIMethodDetails(IType type) throws JavaModelException {
		for (final IMethod method : type.getMethods()) {
			System.out.println("Method name " + method.getElementName());
			System.out.println("Signature " + method.getSignature());
			System.out.println("Return Type " + method.getReturnType());

		}
	}

	private static void printIMethods(ICompilationUnit unit) throws JavaModelException {
		for (final IType type : unit.getAllTypes()) {
			printIMethodDetails(type);
		}
	}

	private static void printPackageInfos(IJavaProject javaProject) throws JavaModelException {
		for (final IPackageFragment javaPackage : javaProject.getPackageFragments()) {
			if (javaPackage.getKind() == IPackageFragmentRoot.K_SOURCE) {
				System.out.println("Package " + javaPackage.getElementName());
				printICompilationUnitInfo(javaPackage);
			}

		}
	}

	private static void printProjectInfo(IProject project) throws CoreException, JavaModelException {
		System.out.println("Working in project " + project.getName());
		if (project.isNatureEnabled("org.eclipse.jdt.core.javanature")) {
			printPackageInfos(JavaCore.create(project));
		}
	}

	public static void run() {
		final IWorkspace workspace = ResourcesPlugin.getWorkspace();
		final IWorkspaceRoot root = workspace.getRoot();
		final IProject[] projects = root.getProjects();
		for (final IProject project : projects) {
			try {
				printProjectInfo(project);
			} catch (final Exception e) {
				e.printStackTrace();
			}
		}
	}

	private ProjectInfoPrinter() {

	}
}