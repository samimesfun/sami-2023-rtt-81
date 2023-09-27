package paassignmentsofarray;

import java.util.Arrays;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an array of String type and initialize it
		String[] originalArray = { "red", "green", "blue", "yellow" };

		// Print the original array length
		System.out.println("Original Array Length: " + originalArray.length);

		// Make a copy of the original array using the clone() method
		String[] copiedArray = originalArray.clone();

		// Verify that the original array was copied using Arrays.toString()
		System.out.println("Original Array: " + Arrays.toString(originalArray));
		System.out.println("Copied Array:   " + Arrays.toString(copiedArray));

	}

}
