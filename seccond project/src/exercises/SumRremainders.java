package exercises;

public class SumRremainders {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			int remainder = i % 2;
			sum += remainder;
		}
System.out.println("sum of remainder is " +sum);		
	}
}
