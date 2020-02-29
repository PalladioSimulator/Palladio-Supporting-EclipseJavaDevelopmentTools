package simplepackage;

import java.util.ArrayList;

public class SimpleClassWithDiamondTypeArguments {

	public void someMethod() {
		ArrayList<String> list = new ArrayList<>();
		new ArrayList<>();
		InnerClass<Integer, Byte, String> f1 = new InnerClass<>();
		InnerClass<Byte, String, Integer> f2 = new InnerClass<Byte, String, Integer>();
		InnerClass<String, Integer, Byte> f3 = new InnerClass<>();
		InnerClass<?, ?, ? extends Byte> f4 = new InnerClass<>();
	}
	
	class InnerClass<R, S, T> {
	}
}
