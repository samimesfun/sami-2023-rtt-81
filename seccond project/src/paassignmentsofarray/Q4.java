package paassignmentsofarray;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = { 10, 20, 30, 40, 50 };

		// Print the value at the first index (index 0)
		System.out.println("Value at the first index: " + myArray[0]);

		// Print the value at the last index (index length - 1)
		System.out.println("Value at the last index: " + myArray[myArray.length - 1]);

		// Attempt to access an out-of-bounds index (index = length)
		int indexToAccess = myArray.length;
		if (indexToAccess >= 0 && indexToAccess < myArray.length) {
			System.out.println("Value at index = length: " + myArray[indexToAccess]);
		} else {
			System.out.println("Index = length is out of bounds.");
		}

		// Attempt to assign a value to an out-of-bounds index (index 5)
		int indexToAssign = 5;
		if (indexToAssign >= 0 && indexToAssign < myArray.length) {
			myArray[indexToAssign] = 60;
			System.out.println("Value assigned at index 5: " + myArray[indexToAssign]);
		} else {
			System.out.println("Index 5 is out of bounds.");

		}

	}
}
