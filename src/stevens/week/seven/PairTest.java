package stevens.week.seven;

import java.util.ArrayList;

public class PairTest {

	public static void main(String[] args) {
		
		System.out.println("Kyle Stevens - Assignment 7: Program 1\n");

		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "second");
		Pair<String, Integer> p2 = new Pair<String, Integer>("first", 2);
		
		System.out.println(String.format("p1 First (%s): %s", p1.getFirst().getClass().getTypeName(), p1.getFirst()));
		System.out.println(String.format("p1 Second (%s): %s", p1.getSecond().getClass().getTypeName(), p1.getSecond()));

		System.out.println(String.format("p2 First (%s): %s", p2.getFirst().getClass().getTypeName(), p2.getFirst()));
		System.out.println(String.format("p2 Second (%s): %s", p2.getSecond().getClass().getTypeName(), p2.getSecond()));
				
		// Stack class to show use generic class with a List<Integer>
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);intList.add(2);intList.add(3);
		Stack<ArrayList<Integer>> p3 = new Stack<ArrayList<Integer>>(intList);
		
		System.out.println(String.format("Stack (%s): %s", p3.getStack().getClass().getTypeName(), p3.getStack()));
		
		// Stack class to show use generic class with a List<String>
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("one");stringList.add("two");stringList.add("three");
		Stack<ArrayList<String>> p4 = new Stack<ArrayList<String>>(stringList);
		
		System.out.println(String.format("Stack (%s): %s", p4.getStack().getClass().getTypeName(), p4.getStack()));
		
		// Sort class to show use of generic class with Integer[]
		Integer[] intArr = {5,6,91,78,100,2,4,8,3};
		Sort<Integer> sortedArr = new Sort<Integer>(intArr);
		sortedArr.sortArray();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < sortedArr.getArray().length; i++) {
			sb.append(sortedArr.getArray()[i]);
			sb.append(" ");
		}
		System.out.println(String.format("Sorted Array (%s): %s", sortedArr.getArray().getClass().getTypeName(), sb));

	}

}
