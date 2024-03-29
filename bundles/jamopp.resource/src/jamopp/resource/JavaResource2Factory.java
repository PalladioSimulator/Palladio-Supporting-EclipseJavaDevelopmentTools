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

package jamopp.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class JavaResource2Factory implements Resource.Factory {
	@Override
	public Resource createResource(URI uri) {
		return new JavaResource2(uri);
	}
}
