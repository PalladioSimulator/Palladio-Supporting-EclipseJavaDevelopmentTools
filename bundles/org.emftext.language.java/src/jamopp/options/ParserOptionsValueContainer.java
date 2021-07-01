package jamopp.options;

import java.util.EnumMap;

/**
 * A container for values of ParserOptions.
 * 
 * @author Martin Armbruster
 */
public final class ParserOptionsValueContainer {
	private static ParserOptionsValueContainer instance;
	private EnumMap<ParserOptions, Object> values;
	
	private ParserOptionsValueContainer() {
		values = new EnumMap<>(ParserOptions.class);
	}
	
	public Object getValue(ParserOptions option) {
		return values.get(option);
	}
	
	public void setValue(ParserOptions option, Object value) {
		values.put(option, value);
	}
	
	public static ParserOptionsValueContainer getInstance() {
		if (instance == null) {
			instance = new ParserOptionsValueContainer();
			instance.setValue(ParserOptions.RESOLVE_ALL_BINDINGS, Boolean.TRUE);
			instance.setValue(ParserOptions.RESOLVE_BINDINGS, Boolean.TRUE);
			instance.setValue(ParserOptions.RESOLVE_BINDINGS_OF_INFERABLE_TYPES, Boolean.TRUE);
			instance.setValue(ParserOptions.CREATE_LAYOUT_INFORMATION, Boolean.TRUE);
			instance.setValue(ParserOptions.PREFER_BINDING_CONVERSION, Boolean.TRUE);
		}
		return instance;
	}
}
