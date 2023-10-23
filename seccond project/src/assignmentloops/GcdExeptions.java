package assignmentloops;

import java.util.Scanner;

public class GcdExeptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		// Prompt the user to enter two positive integers
		System.out.print("Enter the first positive integer: ");
		int n1 = input.nextInt();

		// Validate that n1 is positive
		if (n1 <= 0) {
			System.out.println("Please enter a positive integer for the first number.");
			return;
		}

		System.out.print("Enter the second positive integer: ");
		int n2 = input.nextInt();

		// Validate that n2 is positive
		if (n2 <= 0) {
			System.out.println("Please enter a positive integer for the second number.");
			return;
		}

		// Calculate the GCD using the algorithm you described
		int gcd = 1;
		int k = 2;
		while (k <= n1 && k <= n2) {
			if (n1 % k == 0 && n2 % k == 0) {
				gcd = k;
			}
			k++;
		}
		/*
		 * can you also it recursively static int gcd(int a, int b) { if (b == 0) return
		 * a; else return gcd(b, a % b); }
		 */// short way
			// Print the result
		System.out.println("The GCD of " + n1 + " and " + n2 + " is " + gcd);

		// Close the scanner
		input.close();
	}

}
