package arraylist;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
	
	//declaration 
	//HashMap hm= new HashMap();
	

	public static void main(String[] args) {
		
		HashMap <Integer,String> hm= new HashMap<Integer,String>();
		//Adding a pair in HashMap
		hm.put(101,"john");
		hm.put(102,"john2");
		hm.put(103,"john3");
		hm.put(104,"john4");
		hm.put(105,"john5");
		
		System.out.println(hm);
		
		// remove a element from a hashmap pair
		hm.remove(103);
		
		// print the element pair
		System.out.println("after removing the element from a pair: " +hm);
		
		// printing a hash map
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" " +m.getValue());
			
		}
		
		
	}

}
