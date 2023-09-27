package paassignmentsofarray;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = { 10, 20, 30, 40, 50 };

		// Loop through the array and print values, skipping the middle element
		for (int i = 0; i < myArray.length; i++) {
			if (i != 2) {
				System.out.println("Value at index " + i + ": " + myArray[i]);
			}

		}
	}
}
