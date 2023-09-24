package controlflow;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 15;
		if (x < 10 || x > 20) {
			System.out.println("out of range");
		} else if(x>10&&x<20){
			System.out.println("in range");
		}
		// Change x to 5
		x = 5;
		// Check if x is in the specified range again
		if (x >= 10 && x <= 20) {
			System.out.println("In range");
		} else {
			System.out.println("Out of range");

		}

	}
}
