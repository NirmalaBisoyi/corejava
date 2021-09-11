package corejava;
import java.util.*;

public class MyMap {

	public static void main(String[] args) {
		Map<Integer,String> myMap=new HashMap<Integer,String>();
		
		myMap.put(1, "Raaz1");
		myMap.put(2, "Raaz2");
		myMap.put(3, "Raaz3");
		myMap.put(4, "Raaz4");
	//	myMap.put(1, "anil");
		
		// using keySet() for iteration over keys
        for (Integer name : myMap.keySet())
            System.out.println("key: " + name);
         
        // using values() for iteration over values
        for (String url : myMap.values())
            System.out.println("value: " + url);
    }
		
	}


