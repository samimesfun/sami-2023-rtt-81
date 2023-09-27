package paassignmentsofarray;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a String array of 5 elements
		String[] myArray = { "A", "B", "C", "D", "E" };

		// Print the original array
		System.out.println("Original Array:");
		for (String element : myArray) {
			System.out.print(element + " ");
		}
		System.out.println();

		// Swap the first element with the middle element
		int middleIndex = myArray.length / 2;
		String temp = myArray[0];
		myArray[0] = myArray[middleIndex];
		myArray[middleIndex] = temp;

		// Print the modified array
		System.out.println("Modified Array:");
		for (String element : myArray) {
			System.out.print(element + " ");
		}
	}

}
