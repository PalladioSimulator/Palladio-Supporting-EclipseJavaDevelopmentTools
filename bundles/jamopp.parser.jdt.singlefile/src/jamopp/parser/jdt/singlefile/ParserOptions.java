package jamopp.parser.jdt.singlefile;

public enum ParserOptions {
	RESOLVE_ALL_BINDINGS(ParserOptions.TRUE_VALUE),
	RESOLVE_BINDINGS(ParserOptions.TRUE_VALUE),
	RESOLVE_BINDINGS_OF_INFERABLE_TYPES(ParserOptions.TRUE_VALUE);
	
	public static final String TRUE_VALUE = "true";
	
	private String value;
	
	ParserOptions(String initialValue) {
		value = initialValue;
	}
	
	public void setValue(String v) {
		value = v;
	}
	
	public String getValue() {
		return value;
	}
}
