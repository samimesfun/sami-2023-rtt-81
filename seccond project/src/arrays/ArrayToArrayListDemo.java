package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = { "apple", "banana", "cherry", "date" };

		// Convert the array to an ArrayList
		List<String> arrayList = new ArrayList<>(Arrays.asList(array));
		arrayList.add("orange");
		arrayList.add("mango");
		// Now, you have an ArrayList
		System.out.println("ArrayList: " + arrayList);
		System.out.println("===========================");

		// second method using for loop
		String[] arrays = { "apple", "banana", "cherry", "date" };

		// Create a new ArrayList
		List<String> arrayLists = new ArrayList<>();
		arrayLists.add("pineapple");

		// Add array elements to the ArrayList
		for (String element : arrays) {
			arrayLists.add(element);//or in for loop arrayList.add(arry[i])
		}

		// Now, you have an ArrayList
		System.out.println("ArrayList: " + arrayLists);

	}

}
