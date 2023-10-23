package collections;

import java.util.Scanner;

public class HackerRanks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number =");
		int n = scan.nextInt();
		if (n % 2 != 0) {
			System.out.println("Weird");
		} else if ((n >= 2 && n <= 5) && (n % 2 == 0)) {
			System.out.println("Not Weird");
		} else if ((n >= 6 && n <= 20) && (n % 2 == 0)) {
			System.out.println("Weird");

		} else if (n > 20 && n % 2 == 0) {
			System.out.println("Not Weird");
		}
		scan.close();
	}

}
