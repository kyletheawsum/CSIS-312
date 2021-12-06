package stevens.week.six;

import java.util.Random;

public class RecursiveAssignment {
	
	private Integer[] intArray;
	private Random r = new Random();
	
	private void setIntArray(Integer[] arr) {
		this.intArray = arr;
	}
	
	private Integer[] getIntArray() {
		return intArray;
	}
	
	private Integer[] createRandomArray(int n) {
		Integer[] intArray = new Integer[n];
		for(int i = 0; i < n; i++) {
			intArray[i] = r.nextInt(n);
		}
		
		return intArray;
	}
	
	private void printArray(int n) {
		if(n > 1) {
			printArray(n - 1);
		}
		System.out.print(intArray[n-1]+ " ");
	}
	
	public static void main(String[] args) {
		// call implicit constructor
		RecursiveAssignment ra = new RecursiveAssignment();
		
		// set Integer[] equal to random array created by separate method of size 100
		ra.setIntArray(ra.createRandomArray(100));
		
		ra.printArray(ra.getIntArray().length);
	}
}
