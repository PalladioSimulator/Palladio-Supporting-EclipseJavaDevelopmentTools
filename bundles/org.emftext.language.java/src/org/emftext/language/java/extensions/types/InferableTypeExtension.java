/*******************************************************************************
 * Copyright (c) 2019-2020, Martin Armbruster
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

package org.emftext.language.java.extensions.types;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.emftext.language.java.commons.Commentable;
import org.emftext.language.java.members.Member;
import org.emftext.language.java.types.InferableType;

public class InferableTypeExtension {

	public static EList<Member> getAllMembers(InferableType type, Commentable context) {
		return new BasicEList<>();
	}
}
