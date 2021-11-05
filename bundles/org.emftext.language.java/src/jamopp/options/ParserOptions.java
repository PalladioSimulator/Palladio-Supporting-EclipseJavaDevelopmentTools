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
