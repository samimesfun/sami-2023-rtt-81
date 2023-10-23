package arrays;

import java.util.Arrays;

public class DeleteElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {0,1,2,3,4,5};

		System.out.println("original = " + Arrays.toString(numbers));

		int posToDelete = 2;
		for (int pos = posToDelete; pos < numbers.length - 1; pos++) {
			numbers[pos] = numbers[pos + 1];
		}

		System.out.println("After move = " + Arrays.toString(numbers));

		int[] minusOne = new int[numbers.length-1];
		for (int pos = 0; pos < minusOne.length; pos ++) {
			minusOne[pos] = numbers[pos];
		}

		System.out.println("After copy = " + Arrays.toString(minusOne));


	}

}
