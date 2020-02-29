package simplepackage;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;

public class SimpleClassWithMethodReferenceExpressions {

	public static void someMethod() {
		Function<String, String> concat = "s"::concat;
		Supplier s = SimpleClassWithMethodReferenceExpressions::new;
		s = Inner<String, Integer>::new;
		s = Inner<SimpleClassWithMethodReferenceExpressions, String>::<Integer, Long>new;
		s = ((SimpleClassWithMethodReferenceExpressions.Inner) s.get()).r()::getClass;
		Function<String, Long> decode = Long::decode;
		IntFunction f = Long[]::new;
		f = IntFunction[]::new;
	}
	
	static class Inner<R, T> {
		
		public <U, V> Inner() {
		}
		
		Object r() {
			return this;
		}
	}
}
