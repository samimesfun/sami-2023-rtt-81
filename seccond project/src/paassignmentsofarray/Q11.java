package paassignmentsofarray;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Ask the user how many favorite things they have
		System.out.print("How many favorite things do you have? ");
		int numFavorites = scanner.nextInt();

		// Create a String array of the correct size
		String[] favoriteThings = new String[numFavorites];

		// Ask the user to enter their favorite things
		for (int i = 0; i < numFavorites; i++) {
			System.out.print("Enter your thing: ");
			favoriteThings[i] = scanner.next();
		}

		// Print out the contents of the array
		System.out.println("Your favorite things are:");
		for (String thing : favoriteThings) {
			System.out.println(thing);

		}

	}
}
