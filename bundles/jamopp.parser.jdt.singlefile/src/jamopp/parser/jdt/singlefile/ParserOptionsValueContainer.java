package jamopp.parser.jdt.singlefile;

import java.util.EnumMap;

/**
 * A container for values of ParserOptions.
 * 
 * @author Martin Armbruster
 */
public final class ParserOptionsValueContainer {
	private static ParserOptionsValueContainer instance;
	private EnumMap<ParserOptions, String> values;
	
	private ParserOptionsValueContainer() {
		values = new EnumMap<>(ParserOptions.class);
	}
	
	public String getValue(ParserOptions option) {
		return values.get(option);
	}
	
	public void setValue(ParserOptions option, String value) {
		values.put(option, value);
	}
	
	public static ParserOptionsValueContainer getInstance() {
		if (instance == null) {
			instance = new ParserOptionsValueContainer();
			instance.setValue(ParserOptions.RESOLVE_ALL_BINDINGS, ParserOptions.TRUE_VALUE);
			instance.setValue(ParserOptions.RESOLVE_BINDINGS, ParserOptions.TRUE_VALUE);
			instance.setValue(ParserOptions.RESOLVE_BINDINGS_OF_INFERABLE_TYPES, ParserOptions.TRUE_VALUE);
		}
		return instance;
	}
}
