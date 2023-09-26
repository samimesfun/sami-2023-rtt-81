package assignmentloops;

public class MultiplicationTable {

	public static void main(String[] args) {
		int start = 1;
		int end = 12;

		// Print the header row
		System.out.println("Multiplication Table");
		System.out.println("--------------------");

		// Print column headers
		System.out.print("  |");
		for (int i = start; i <= end; i++) {
			System.out.printf("%4d", i); // Adjust the width for alignment
		}
		System.out.println("\n___________________________________________________");

		// Outer loop for the rows
		for (int i = start; i <= end; i++) {
			System.out.printf("%2d|", i); // Print row header
			// Inner loop for the columns
			for (int j = start; j <= end; j++) {
				// Calculate the product and print it with proper formatting
				int product = i * j;
				System.out.printf("%4d", product); // Adjust the width for alignment
			}
			// Move to the next row after finishing a row
			System.out.println();
		}
	}
}
