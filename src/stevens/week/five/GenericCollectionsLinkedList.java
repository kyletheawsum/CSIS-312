package stevens.week.five;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

/**
 * GenericCollectionsLinkedList
 * @author Kyle Stevens
 *
 */
public class GenericCollectionsLinkedList {
	
	// private variables
	private Random r = new Random();
	private LinkedList<Integer> linkedList = new LinkedList<Integer>();
	private double average = 0;
	
	/**
	 * set the linked list
	 * @return void
	 */
	private void setLinkedList() {
		for(int i = 0; i < 25; i++) {
			linkedList.add(r.nextInt(100));
		}
	}
	
	/**
	 * sort the linked list using Collections.sort()
	 * @param linkedList
	 */
	private void sortList(LinkedList<Integer> linkedList) {
		Collections.sort(linkedList);
	}
	
	/**
	 * sum the elements within the linked list
	 * also call averageOfList(int, LinkedList<Integer>)
	 * 		this way we can make int sum an instance variable within the method 
	 * 		and avoid another instance class variable
	 * we only have to calculate the sum once this way
	 * @param linkedList
	 * @return int
	 */
	private int sumList(LinkedList<Integer> linkedList) {
		int sum = 0;
		
		// loop through elements in list and add to the sum
		for(Integer i : linkedList) {
			sum += i;
		}
		
		// find the average of the list
		averageOfList(sum, linkedList);
		
		return sum;
	}
	
	/**
	 * calculate the average of the linked list
	 * cast the result to a double so that we can maintain decimal precision 
	 * @param sum
	 * @param linkedList
	 * @return double
	 */
	private double averageOfList(int sum, LinkedList<Integer> linkedList) {
		
		average = (double) sum / linkedList.size();
		
		return average;
	}
	
	public static void main(String[] args) {
		System.out.println("Kyle Stevens - Assignment 5: Program 1\n");
		
		GenericCollectionsLinkedList gc = new GenericCollectionsLinkedList();
		
		gc.setLinkedList();		
		System.out.println(String.format("Unsorted List: %s", gc.linkedList));
		
		gc.sortList(gc.linkedList);
		System.out.println(String.format("Sorted List: %s", gc.linkedList));
		
		System.out.println(String.format("The sum of the list is: %d", gc.sumList(gc.linkedList)));
		
		System.out.println(String.format("The average of the list is: %.2f", gc.average));
		
	}
}
