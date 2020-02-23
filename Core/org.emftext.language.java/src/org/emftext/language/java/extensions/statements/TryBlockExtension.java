/*******************************************************************************
 * Copyright (c) 2006-2014
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
package org.emftext.language.java.extensions.statements;

import org.eclipse.emf.common.util.EList;
import org.emftext.language.java.statements.CatchBlock;
import org.emftext.language.java.statements.TryBlock;

public class TryBlockExtension {
	
	/**
	 * Returns all CatchBlocks.
	 * This is a legacy method to provide a stable and backwards-compatible API.
	 * 
	 * @param block the TryBlock for which the CatchBlocks are returned.
	 * @return the list of all CatchBlocks.
	 * @deprecated Use getCatchBlocks().
	 */
	@Deprecated
	public static EList<CatchBlock> getCatcheBlocks(TryBlock block) {
		return block.getCatchBlocks();
	}
}
