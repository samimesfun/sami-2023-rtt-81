package collections;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number:");
		int num = scan.nextInt();
		int sum = 0;
		while (num != 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println("The Sum of Digits Is:");
		System.out.println(sum);
		scan.close();
	}
}
