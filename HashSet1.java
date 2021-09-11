package corejava;
import java.util.*;

public class HashSet1 {

	public static void main(String[] args) {
		HashMap<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(1,null);
		map1.put(4,"Pineapple");
		map1.put(4,"Guava");
		map1.put(6,null);
		map1.put(5,"Grapes");
		map1.put(3,"Apple");
		
		System.out.println("Iterating HashMap");
		for(Map.Entry m:map1.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
	
			}

}
