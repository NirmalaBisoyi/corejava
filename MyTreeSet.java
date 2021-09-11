package corejava;
import java.util.*;

public class MyTreeSet {

	public static void main(String[] args) {
		TreeSet<String>	 set=new TreeSet<String>();
		set.add("Vijay");
		set.add("Ajay");
		set.add("Ravi");
		//set.add(null);
		//set.add(null);
		set.add("Ajay");
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	}

}
