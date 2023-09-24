package controlflow;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// Define tax rates and income brackets for each filing status
		double[] brackets = { 0, 9525, 38700, 82500, 157500, 200000, 500000 }; // Tax brackets for Single filers
		double[] rates = { 0.10, 0.12, 0.22, 0.24, 0.32, 0.35, 0.37 }; // Tax rates for Single filers

		// Get user input for filing status and income
		System.out.print("Enter your filing status (Single, MFJ, MFS, HOH): ");
		String filingStatus = scanner.nextLine();

		System.out.print("Enter your taxable income: ");
		double income = scanner.nextDouble();

		// Calculate the tax amount based on filing status and income
		double taxAmount = calculateTax(filingStatus, income, brackets, rates);

		// Display the calculated tax amount
		System.out.println("Tax amount: $" + taxAmount);

		// Close the scanner
		scanner.close();
	}

	// Function to calculate tax based on filing status and income
	public static double calculateTax(String filingStatus, double income, double[] brackets, double[] rates) {
		double tax = 0;
		int i = 0;

		// Determine the tax bracket based on income
		while (income > brackets[i]) {
			if (i == brackets.length - 1) {
				tax += (income - brackets[i]) * rates[i];
				break;
			}
			tax += (brackets[i + 1] - brackets[i]) * rates[i];
			i++;
		}

		return tax;

	}

}
