package corejava;
import java.util.*;

public class MyHashSet {

	public static void main(String[] args) {
		Set<String> MySet=new HashSet<String>();	//Creating HashSet and adding elements  
		MySet.add("Ravi");
		MySet.add("Vijay");
		MySet.add("Ravi");
		MySet.add("Ajay");
		MySet.add(null);
		MySet.add(null);
		
		Iterator<String > itr= MySet.iterator();	//Traversing elements  
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
	}

}
