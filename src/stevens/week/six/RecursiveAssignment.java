package stevens.week.six;

/**
 * Program to create random array of 100 integers and recursively print them out
 * @author Kyle Stevens
 */
import java.util.Random;

public class RecursiveAssignment {
	
	private Integer[] intArray;
	private Random r = new Random();
	
	/**
	 * set the integer array
	 * @param arr
	 */
	private void setIntArray(Integer[] arr) {
		this.intArray = arr;
	}
	
	/**
	 * get the integer array
	 * @return
	 */
	private Integer[] getIntArray() {
		return intArray;
	}
	
	/**
	 * create an array, length n, of random integers
	 * @param n
	 * @return
	 */
	private Integer[] createRandomArray(int n) {
		Integer[] intArray = new Integer[n];
		for(int i = 0; i < n; i++) {
			intArray[i] = r.nextInt(n);
		}
		
		return intArray;
	}
	
	/**
	 * print the array of length n out
	 * @param n
	 */
	private void printArray(int n) {
		if(n > 1) {
			printArray(n - 1);
		}
		System.out.print(intArray[n-1]+ " ");
	}
	
	public static void main(String[] args) {
		System.out.println("Kyle Stevens - Assignment 6: Program 1\n");

		// call implicit constructor
		RecursiveAssignment ra = new RecursiveAssignment();
		
		// set Integer[] equal to random array created by separate method of size 100
		ra.setIntArray(ra.createRandomArray(100));
				
		System.out.println("Random Array: ");
		ra.printArray(ra.getIntArray().length);
	}
}
