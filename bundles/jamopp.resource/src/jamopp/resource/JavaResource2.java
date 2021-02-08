package jamopp.resource;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.emftext.language.java.JavaClasspath;
import org.emftext.language.java.LogicalJavaURIGenerator;
import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.containers.JavaRoot;
import org.emftext.language.java.members.MemberContainer;
import org.emftext.language.java.resource.java.IJavaContextDependentURIFragment;
import org.emftext.language.java.resource.java.IJavaContextDependentURIFragmentWrapper;
import org.emftext.language.java.resource.java.IJavaElementMapping;
import org.emftext.language.java.resource.java.IJavaReferenceMapping;
import org.emftext.language.java.resource.java.IJavaReferenceResolveResult;
import org.emftext.language.java.resource.java.IJavaURIMapping;
import org.emftext.language.java.resource.java.util.JavaCastUtil;

import jamopp.parser.api.JaMoPPParserAPI;
import jamopp.parser.jdt.singlefile.JaMoPPJDTSingleFileParser;
import jamopp.printer.JaMoPPPrinter;

public class JavaResource2 extends ResourceImpl {
	private Map<String, IJavaContextDependentURIFragment<? extends EObject>> internalURIFragmentMap = IJavaContextDependentURIFragmentWrapper.GLOBAL_INSTANCE.getInternalURIFragmentMap();
	
	public JavaResource2() {
		super();
	}
	
	public JavaResource2(URI uri) {
		super(uri);
	}
	
	@Override
	protected void doLoad(InputStream input, Map<?, ?> options) {
		IJavaContextDependentURIFragmentWrapper.GLOBAL_INSTANCE.setBaseURI(getURI());
		JaMoPPParserAPI api = new JaMoPPJDTSingleFileParser();
		api.setResourceSet(this.getResourceSet());
		EObject result = api.parse(this.getURI().toString(), input);
		JavaClasspath.get().registerJavaRoot((JavaRoot) result, getURI());
		this.getContents().add(result);
	}
	
	@Override
	protected void doSave(OutputStream output, Map<?, ?> options) {
		this.getContents().forEach(object -> {
			if (object instanceof JavaRoot) {
				JaMoPPPrinter.print((JavaRoot) object, output);
			}
		});
	}
	
	@Override
	public org.eclipse.emf.ecore.EObject getEObject(String id) {
		if (internalURIFragmentMap.containsKey(id)) {
			IJavaContextDependentURIFragment<? extends EObject> uriFragment = internalURIFragmentMap.get(id);
			boolean wasResolvedBefore = uriFragment.isResolved();
			IJavaReferenceResolveResult<? extends EObject> result = null;
			// catch and report all Exceptions that occur during proxy resolving
			try {
				result = uriFragment.resolve();
			} catch (Exception e) {
				String message = "An expection occured while resolving the proxy for: "+ id + ". (" + e.toString() + ")";
				new org.emftext.language.java.resource.java.util.JavaRuntimeUtil().logError(message, e);
			}
			if (result == null) {
				// the resolving did call itself
				return null;
			}
			if (!wasResolvedBefore && !result.wasResolved()) {
				attachResolveError(result, uriFragment.getProxy());
				return null;
			} else if (!result.wasResolved()) {
				return null;
			} else {
				org.eclipse.emf.ecore.EObject proxy = uriFragment.getProxy();
				// remove an error that might have been added by an earlier attempt
				// remove old warnings and attach new
				attachResolveWarnings(result, proxy);
				IJavaReferenceMapping<? extends EObject> mapping = result.getMappings().iterator().next();
				EObject resultElement = getResultElement(uriFragment, mapping, proxy, result.getErrorMessage());
				return resultElement;
			}
		} else {
			return super.getEObject(id);
		}
	}
	
	@Override
	protected EObject getEObject(List<String> uriFragmentPath) {
		int size = uriFragmentPath.size();
		EObject eObject = getEObjectForURIFragmentRootSegment(size == 0 ? ""
				: uriFragmentPath.get(0));
		for (int i = 1; i < size && eObject != null; ++i) {
			String uriFragment = uriFragmentPath.get(i);
			if (eObject instanceof MemberContainer && uriFragment.startsWith(
				LogicalJavaURIGenerator.CLASSIFIERS_SUB_PATH_PREFIX)) {

				MemberContainer memberContainer = (MemberContainer) eObject;
				String name = uriFragment.substring(
						LogicalJavaURIGenerator.CLASSIFIERS_SUB_PATH_PREFIX.length(),
						uriFragment.length() - 2);
				eObject = memberContainer.getContainedClassifier(name);
			}
			else if (eObject instanceof CompilationUnit && uriFragment.startsWith(
					LogicalJavaURIGenerator.CLASSIFIERS_ROOT_PATH_PREFIX)){

				CompilationUnit compilationUnit = (CompilationUnit)eObject;
				String name = uriFragment.substring(
						LogicalJavaURIGenerator.CLASSIFIERS_ROOT_PATH_PREFIX.length(),
						uriFragment.length() - 2);
				eObject = compilationUnit.getContainedClassifier(name);
				int j = i + 1;
				while (j < size && eObject == null) {
					// this is required for classifiers with '$' in their names
					String subUriFragment = uriFragmentPath.get(j);
					name = name + "$" + subUriFragment.substring(
							LogicalJavaURIGenerator.CLASSIFIERS_SUB_PATH_PREFIX.length(),
							subUriFragment.length() - 2);
					eObject = compilationUnit.getContainedClassifier(name);
					if (eObject != null) {
						i = j;
					} else {
						j++;
					}
				}

			} else {
				 eObject = ((InternalEObject)eObject).eObjectForURIFragmentSegment(uriFragmentPath.get(i));
			}
		}

		return eObject;
	}
	
	private EObject getResultElement(IJavaContextDependentURIFragment<? extends EObject> uriFragment, IJavaReferenceMapping<? extends EObject> mapping, EObject proxy, final String errorMessage) {
		if (mapping instanceof IJavaURIMapping<?>) {
			URI uri = ((IJavaURIMapping<? extends EObject>)mapping).getTargetIdentifier();
			if (uri != null) {
				org.eclipse.emf.ecore.EObject result = null;
				try {
					result = this.getResourceSet().getEObject(uri, true);
				} catch (Exception e) {
					// we can catch exceptions here, because EMF will try to resolve again and handle
					// the exception
				}
				if (result == null || result.eIsProxy()) {
					// unable to resolve: attach error
					if (errorMessage == null) {
						assert false;
					} else {
						errors.add(new SimpleDiagnostic(errorMessage));
					}
				}
				return result;
			}
			return null;
		} else if (mapping instanceof IJavaElementMapping<?>) {
			EObject element = ((IJavaElementMapping<? extends EObject>)mapping).getTargetElement();
			org.eclipse.emf.ecore.EReference reference = uriFragment.getReference();
			org.eclipse.emf.ecore.EReference oppositeReference = uriFragment.getReference().getEOpposite();
			if (!uriFragment.getReference().isContainment() && oppositeReference != null) {
				if (reference.isMany()) {
					org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList.ManyInverse<EObject> list = JavaCastUtil.cast(element.eGet(oppositeReference, false));										// avoids duplicate entries in the reference caused by adding to the
					// oppositeReference
					list.basicAdd(uriFragment.getContainer(),null);
				} else {
					uriFragment.getContainer().eSet(uriFragment.getReference(), element);
				}
			}
			return element;
		} else {
			assert false;
			return null;
		}
	}
	
	private void attachResolveError(IJavaReferenceResolveResult<?> result, EObject proxy) {
		assert result != null;
		final String errorMessage = result.getErrorMessage();
		if (errorMessage == null) {
			assert false;
		} else {
			errors.add(new SimpleDiagnostic(errorMessage));
		}
	}
	
	private void attachResolveWarnings(IJavaReferenceResolveResult<? extends EObject> result, EObject proxy) {
		assert result != null;
		assert result.wasResolved();
		if (result.wasResolved()) {
			for (IJavaReferenceMapping<? extends EObject> mapping : result.getMappings()) {
				final String warningMessage = mapping.getWarning();
				if (warningMessage == null) {
					continue;
				}
				warnings.add(new SimpleDiagnostic(warningMessage));
			}
		}
	}
	
	public class SimpleDiagnostic implements Resource.Diagnostic {
		private String message;
		
		SimpleDiagnostic(String message) {
			this.message = message;
		}
		
		@Override
		public String getMessage() {
			return message;
		}

		@Override
		public String getLocation() {
			return JavaResource2.this.getURI().toString();
		}

		@Override
		public int getLine() {
			return 0;
		}

		@Override
		public int getColumn() {
			return 0;
		}
	}
}
