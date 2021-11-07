/*******************************************************************************
 * Copyright (c) 2021, Martin Armbruster
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

package jamopp.options;

/**
 * Options for the single file parser.
 * 
 * @author Martin Armbruster
 */
public enum ParserOptions {
	RESOLVE_ALL_BINDINGS,
	RESOLVE_BINDINGS,
	RESOLVE_BINDINGS_OF_INFERABLE_TYPES,
	CREATE_LAYOUT_INFORMATION,
	PREFER_BINDING_CONVERSION,
	RESOLVE_EVERYTHING,
	REGISTER_LOCAL;
	
	public void setValue(Object v) {
		ParserOptionsValueContainer.getInstance().setValue(this, v);
	}
	
	public Object getValue() {
		return ParserOptionsValueContainer.getInstance().getValue(this);
	}
	
	public boolean isTrue() {
		return getValue() == Boolean.TRUE;
	}
}
