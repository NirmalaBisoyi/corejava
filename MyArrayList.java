package corejava;

import java.util.*;

public class MyArrayList {

	public static void main(String[] args) {

		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Ravi");
		myList.add("Vijay");
		myList.add("Ravi");
		myList.add("Ajay");
		Iterator itr = myList.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

	}

}
