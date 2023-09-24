package controlflow;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub // Create a Scanner object to accept user
		// input
		Scanner scanner = new Scanner(System.in);

		// Prompt the user for a number score
		System.out.print("Enter the score: ");
		int score = scanner.nextInt();

		// Close the scanner since we no longer need it
		scanner.close();

		// Check if the score is out of range
		if (score < 0 || score > 100) {
			System.out.println("Score out of range");
		} else {
			// Determine the letter grade based on the score
			if (score >= 90 && score <= 100) {
				System.out.println("Grade: A");
			} else if (score >= 80 && score < 90) {
				System.out.println("Grade: B");
			} else if (score >= 70 && score < 80) {
				System.out.println("Grade: C");
			} else if (score >= 60 && score < 70) {
				System.out.println("Grade: D");
			} else {
				System.out.println("Grade: F");
			}
		}

	}

}
