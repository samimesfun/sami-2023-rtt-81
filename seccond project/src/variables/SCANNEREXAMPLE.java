package variables;

import java.util.Scanner;

public class SCANNEREXAMPLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // create an Object of Scanner class
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter your name: ");
	    // read input(line of text) from the keyboard
	    String name = input.nextLine();
	    // prints the name
	    System.out.println("My name is " + name);
	    // closes the scanner
	    input.close();


	}

}
