package paassignmentsofarray;

import java.util.Arrays;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = { 4, 2, 9, 13, 1, 0 };

		// Sort the array in ascending order
		Arrays.sort(intArray);

		// Print the sorted array
		System.out.print("Array in ascending order: ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]);
			if (i < intArray.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();

		// Find and print the smallest and largest numbers
		int smallest = intArray[0];
		int largest = intArray[intArray.length - 1];

		System.out.println("The smallest number is " + smallest);
		System.out.println("The biggest number is " + largest);
	}

}
