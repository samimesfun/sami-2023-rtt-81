package coffeshop;

import java.text.DecimalFormat;
import java.util.*;

public class CafeOrder {
	List<Product> products = new ArrayList<>();

	public void setupProducts() {

		// define product and product pricing
		Product coffee = new Product();
		coffee.setName("Coffee");
		coffee.setPrice(5.44);
		products.add(coffee);

		Product tea = new Product();
		tea.setName("Tea");
		tea.setPrice(3.44);
		products.add(tea);

		Product cookie = new Product();
		cookie.setName("Cookie");
		cookie.setPrice(5.44);
		products.add(cookie);

		printAllProducts();
	}

	public void printproduct(Product product) {
		System.out.println("Product name:\t" + product.getName() + "\t" + "Product Price\t $" + product.getPrice());
	}

	public void printAllProducts() {
		for (Product Product : products) {
			printproduct(Product);
		}
	}

	public static void main(String[] args) {
		// Define product names and their respective prices

		CafeOrder cf = new CafeOrder();
		cf.setupProducts();

		// product names and their respective prices
		String product1 = "Coffee";
		double price1 = 2.50;
		String product2 = "Cappuccino";
		double price2 = 3.00;
		String product3 = "Espresso";
		double price3 = 2.00;

		// Define quantities for each product in the order
		// quantities for each product in the order
		int quantityProduct1 = 3;
		int quantityProduct2 = 4;
		int quantityProduct3 = 2;

		// Calculate subtotal
		double subtotal = (price1 * quantityProduct1) + (price2 * quantityProduct2) + (price3 * quantityProduct3);

		// Define sales tax rate as a constant
		// sales tax rate as a constant
		final double SALES_TAX_RATE = 0.08; // 8% sales tax

		// Calculate total sale amount including sales tax
		// double salesTax = subtotal * SALES_TAX_RATE;
		double totalSale = subtotal + SALES_TAX_RATE;

		// Format results to two decimal places
		String formattedSubtotal = String.format("%.2f", subtotal);
		DecimalFormat df = new DecimalFormat("#,###.00");

		// String formattedSubtotal = String.format("%.2f", subtotal);
		// String formattedSalesTax = String.format("%.2f", salesTax);
		String formattedTotalSale = String.format("%.2f", totalSale);
		// String formattedTotalSale = String.format("%.2f", totalSale);

		// Display the order details
		System.out.println("Cafe Order Details:");
		System.out.println("1. " + product1 + " x " + quantityProduct1 + " @ $" + price1 + " each");
		System.out.println("2. " + product2 + " x " + quantityProduct2 + " @ $" + price2 + " each");
		System.out.println("3. " + product3 + " x " + quantityProduct3 + " @ $" + price3 + " each");
		System.out.println("Subtotal: $" + formattedSubtotal);
		// System.out.println("Subtotal: $" + formattedSubtotal);
		System.out.println("Subtotal: $" + df.format(subtotal));
		// System.out.println("Sales Tax (8%): $" + formattedSalesTax);
		System.out.println("Total Sale: $" + formattedTotalSale);
		// System.out.println("Total Sale: $" + formattedTotalSale);
		System.out.println("Total Sale: $" + df.format(totalSale));
	}

}
