package collections;

import java.util.ArrayList;

public class ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> mylist = new ArrayList<String>();

		mylist.add("New Jersey");
		mylist.add("Dallas");
		mylist.add("New York");
		mylist.add("Chicago");
		mylist.add("LA");
		System.out.println("Return boolean :" + mylist.contains("Chicago"));
		System.out.println("Return index value of Element :" + mylist.indexOf("Chicago"));
		System.out.println("Returns the actual Element at the given index :" + mylist.get(2));
		System.out.println("Returns the length of the arraylist :" + mylist.size());
		// Remove the element at the given index. Returns the removed element.
		// remove element at index 3
		String removedElement = mylist.remove(3);
		System.out.println("Removed Element: " + removedElement);
		// remove all elements
		mylist.clear();
		System.out.println("ArrayList after clear(): " + mylist);

	}

}
