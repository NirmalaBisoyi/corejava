package corejava;

import java.util.*;

public class MyArrayList1 {
	public static void main(String args[]) {

		ArrayList<Integer> al = new ArrayList<Integer>(); // Declaring the ArrayList with
															// initial size n
		for (int i = 1; i < 5; i++) // Appending new elements at
									// the end of the list
			al.add(i);
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		for (int i = 0; i < al.size(); i++)
			System.out.print(al.get(i) + " ");
	}

}
