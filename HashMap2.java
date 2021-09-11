package corejava;
import java.util.*;

public class HashMap2 {

	public static void main(String[] args) {
		HashMap<Integer,String> map2=new HashMap<Integer,String>();
		map2.put(1,"Banana");
		map2.put(3,"Grapes");
		map2.put(2,"Apple");
		System.out.println("After invoking put() method");
		
		for(Map.Entry m:map2.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
		map2.putIfAbsent(4,"Mango");
		 System.out.println("After invoking putIfAbsent() method ");  
		 
	      for(Map.Entry m:map2.entrySet()){    
	           System.out.println(m.getKey()+" "+m.getValue()); 
		}	
	      HashMap<Integer,String> map=new HashMap<Integer,String>();
	      map.put(5,"Pineapple");
	      map.putAll(map2);
	      System.out.println("After invoking putAll() method");
	      for(Map.Entry m:map.entrySet()){    
	           System.out.println(m.getKey()+" "+m.getValue());    
	          }  
	    	  
	    	  
	      }
	      


	}


