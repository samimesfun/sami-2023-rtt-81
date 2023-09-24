package glab303;

import java.util.Scanner;

public class ReadingStringFromConsole2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character: ");
		String s = input.nextLine();
		char ch = s.charAt(0);
		System.out.println("The character entered is " + ch);

	}

}
