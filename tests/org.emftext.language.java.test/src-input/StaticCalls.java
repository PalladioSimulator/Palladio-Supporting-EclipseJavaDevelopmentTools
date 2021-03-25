public class StaticCalls {
	public void m() {
		String s = AClass.createA("empty").getName();
		System.out.println(s);
	}
}
