package stevens.week.seven;

public class Pair<F, S> {
	
	private F first;
	private S second;
	
	private void setFirst(F f) {
		this.first = f;
	}
	
	public F getFirst() {
		return this.first;
	}
	
	private void setSecond(S s) {
		this.second = s;
	}
	
	public S getSecond() {
		return this.second;
	}
	
	public Pair(F first, S second) {
		setFirst(first);
		setSecond(second);
	}

}
