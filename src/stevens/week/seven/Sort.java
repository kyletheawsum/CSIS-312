package stevens.week.seven;

import java.util.Arrays;

public class Sort<T> {
	
	private T[] array;
	
	private void setArray(T[] array) {
		this.array = array;
	}
	
	public T[] getArray() {
		return this.array;
	}
	
	public void sortArray() {
		Arrays.sort(getArray());
	}
	
	public Sort(T[] array) {
		setArray(array);
	}

}
