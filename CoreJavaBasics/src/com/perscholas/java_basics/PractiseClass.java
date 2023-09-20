package com.perscholas.java_basics;

public class PractiseClass {

	public static void main(String[] args) {
		// Declare and assign values to two integer variables and print it
		int m = 10;
		int n = 20;
		int z = m + n;

		System.out.println(z);

		// add double variables
		double a = 5.5;
		double b = 6.5;
		double c = a + b;
		System.out.println(c);

		// adding double and integer
		int num1 = 5;
		double num2 = 3.0;
		double sum = num1 + num2;
		System.out.println(sum);// The sum must be a double variable due to the decimal point.

		// divide large number by smaller
		int j = 10;
		int k = 5;
		int l = j / k;
		System.out.println(l);
		// Change large number to a decimal
		/*
		 * int j = 10.5;//this must be change to double int k = 5; int l = j/k;
		 */ // the result also must be double

		// division of double variable
		double d = 16.5;
		double e = 8.0;
		if (e != 0.0) {
			double result = d / e;
			System.out.println("The result of " + d + " divided by " + e + " is: " + result);
		} else {
			System.out.println("Division by zero is not allowed.");
		} 
		
		// division and cating
		int x = 5;
		int y = 6;

		double q = (double) y / x;
		System.out.println("q (as int division): " + q);

		q = (double) y;
		System.out.println("q (as double after casting): " + q);
		
		 // Declare a named constant
		
        final int MY_CONSTANT = 10;
        
        // Use the constant in a calculation
        int result = MY_CONSTANT * 5;
        
        // Print the result
        System.out.println("Result of MY_CONSTANT * 5 is: " + result);
        
        // Product prices
        double coffeePrice = 2.50;
        double cappuccinoPrice = 3.00;
        double greenTeaPrice = 2.25;

        // Order quantities
        int coffeeQuantity = 3;
        int cappuccinoQuantity = 4;
        int greenTeaQuantity = 2;

        // Calculate subtotal
        double subtotal = (coffeePrice * coffeeQuantity) + (cappuccinoPrice * cappuccinoQuantity) + (greenTeaPrice * greenTeaQuantity);

        // Sales tax rate (as a decimal)
        final double SALES_TAX_RATE = 0.08; // Assuming an 8% sales tax rate

        // Calculate total sale with sales tax
        double salesTax = subtotal * SALES_TAX_RATE;
        double totalSale = subtotal + salesTax;

        // Format results to two decimal places
        String formattedSubtotal = String.format("%.2f", subtotal);
        String formattedTotalSale = String.format("%.2f", totalSale);

        // Print the results
        System.out.println("Cafe Order Summary:");
        System.out.println("----------------------------");
        System.out.println("Coffee (Quantity: " + coffeeQuantity + ")   : $" + (coffeePrice * coffeeQuantity));
        System.out.println("Cappuccino (Quantity: " + cappuccinoQuantity + "): $" + (cappuccinoPrice * cappuccinoQuantity));
        System.out.println("Green Tea (Quantity: " + greenTeaQuantity + ") : $" + (greenTeaPrice * greenTeaQuantity));
        System.out.println("----------------------------");
        System.out.println("Subtotal            : $" + formattedSubtotal);
        System.out.println("Sales Tax (8%)      : $" + String.format("%.2f", salesTax));
        System.out.println("----------------------------");
        System.out.println("Total Sale          : $" + formattedTotalSale);

	}

}
