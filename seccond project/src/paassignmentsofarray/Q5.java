package paassignmentsofarray;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = new int[5];

		// Loop through the array and assign values
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = i;
		}

		// Print the array elements
		System.out.print("Array elements: ");
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");

		}

	}
}
