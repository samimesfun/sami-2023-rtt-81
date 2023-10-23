package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stringList = new ArrayList<>();
		stringList.add("a");
		stringList.add("b");
		stringList.add("c");

		// get get by a position from a list.
		stringList.get(1);

		// set does not maintain position ... even if it looks like it does .. it doesnt
		Set<String> stringSet = new HashSet<>();
		stringSet.add("c");
		stringSet.add("b");
		stringSet.add("a");

		stringSet.add("a");

		// can not get by position from a set. The get function does not exist
		// stringSet.get

		for (String string : stringSet) {
			System.out.println(string);
		}

	}
}
