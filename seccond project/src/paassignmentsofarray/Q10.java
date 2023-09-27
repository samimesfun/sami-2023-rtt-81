package paassignmentsofarray;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an array with mixed data types
		Object[] mixedArray = { 42, "Hello", "World", "Java", 3.14 };

		// Print the contents of the array
		System.out.print("Array contents: ");
		for (int i = 0; i < mixedArray.length; i++) {
			System.out.print(mixedArray[i]);
			if (i < mixedArray.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}

}
