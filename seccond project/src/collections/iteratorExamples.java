package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> strings = new ArrayList<>();
		strings.add("one");
		strings.add("two");
		strings.add("three");
		for (String string : strings) {
			System.out.println(string);

		}
		System.out.println("=====================================");
		
		Iterator<String> itr = strings.iterator();
		while (itr.hasNext()) {
			String string = itr.next();
			System.out.println(string);
		}

	}

}
