package paassignmentsofarray;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");
		// -- reading the number of elements from the that we want to enter
		n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			// -- reading array elements from the user
			array[i] = sc.nextInt();
		}
		System.out.println("Array elements are: ");
		// -- accessing array elements using the for loop
		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}

	}

}
