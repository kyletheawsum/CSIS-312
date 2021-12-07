package stevens.week.seven;

public class Stack<T> {

	private T stack;
	
	private void setStack(T stack) {
		this.stack = stack;
	}
	
	public T getStack() {
		return this.stack;
	}
	
	public Stack(T stack) {
		setStack(stack);
	}
	
}