package variables;

public class NestedChain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 71;
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("b");
		} else if (score >= 70) {
			System.out.println("c");
		} else if (score >= 60) {
			System.out.println("d");
		} else
			System.out.println("f");

	}

}
