package org.emftext.language.java.util;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.emftext.language.java.types.TypeReference;
import org.emftext.language.java.types.impl.TypeReferenceImpl;

/**
 * A temporal create classifier that combines all type restrictions
 * of one type parameter.
 */
public class TemporalCompositeTypeReference extends TypeReferenceImpl {
	
	private EList<TypeReference> references = new UniqueEList<>();

	public EList<TypeReference> getTypeReferences() {
		return references;
	}
}
