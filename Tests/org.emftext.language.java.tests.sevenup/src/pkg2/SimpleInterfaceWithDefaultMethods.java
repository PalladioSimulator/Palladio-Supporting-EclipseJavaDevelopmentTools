package pkg2;

import java.util.concurrent.Callable;

public interface SimpleInterfaceWithDefaultMethods<R> extends Runnable, Callable<R> {

	default boolean isActive() {
		return false;
	}
	
	public abstract String getName();
	
	@Override
	default void run() {
	}
	
	static void doMore(int i) {
		i++;
	}
	
	class Implementation implements SimpleInterfaceWithDefaultMethods<Integer> {
		@Override
		public String getName() {
			return "Test";
		}
		
		@Override
		public void run() {
		}
		
		@Override
		public Integer call() {
			return -1;
		}
	}
}
