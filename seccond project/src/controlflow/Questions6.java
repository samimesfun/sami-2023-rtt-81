package controlflow;

import java.util.Scanner;

public class Questions6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Get the user's input as an integer
		System.out.print("Enter an integer between 1 and 7: ");
		int dayNumber = scanner.nextInt();

		// Use a switch statement to determine the weekday
		String weekday;
		switch (dayNumber) {
		case 1:
			weekday = "Sunday";
			break;
		case 2:
			weekday = "Monday";
			break;
		case 3:
			weekday = "Tuesday";
			break;
		case 4:
			weekday = "Wednesday";
			break;
		case 5:
			weekday = "Thursday";
			break;
		case 6:
			weekday = "Friday";
			break;
		case 7:
			weekday = "Saturday";
			break;
		default:
			weekday = "Out of range";
		}

		// Print the corresponding weekday or "Out of range"
		System.out.println("Day of the week: " + weekday);

		// Close the scanner
		scanner.close();
	}

}
