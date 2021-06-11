package jamopp.parser.jdt.singlefile;

/**
 * Options for the single file parser.
 * 
 * @author Martin Armbruster
 */
public enum ParserOptions {
	RESOLVE_ALL_BINDINGS,
	RESOLVE_BINDINGS,
	RESOLVE_BINDINGS_OF_INFERABLE_TYPES,
	CREATE_LAYOUT_INFORMATION;
	
	public static final String TRUE_VALUE = "true";
	
	public void setValue(String v) {
		ParserOptionsValueContainer.getInstance().setValue(this, v);
	}
	
	public String getValue() {
		return ParserOptionsValueContainer.getInstance().getValue(this);
	}
}
