package arrays;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int intArr[] = {10, 20, 15, 22, 35};
	      
	       // sorting the array
	       Arrays.sort(intArr);
	      
	       // declare element for searching
	       int element = 22;
	        System.out.println(element + " found at index = " + Arrays.binarySearch(intArr, element));


	}

}
