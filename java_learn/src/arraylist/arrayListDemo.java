package arraylist;

import java.util.ArrayList;

public class arrayListDemo {

	public static void main(String[] args) {
		
		//how to declare array list 
		
		ArrayList list= new ArrayList(); // we can add any type of elements 
		
		ArrayList <String> list1= new ArrayList <String>();
		// ArrayList <Integer> list=new ArrayList <Integer>();
		
		//Adding value to array list 
		list1.add("deep"); //0
		list1.add("jay"); //1
		list1.add("veer");//2
		list1.add("heer");//3
		
		// size of array list 
		System.out.println(list1.size()); // 4
		System.out.println("before removing element:"+list1);
		
		// remove an element 
		list1.remove(2);
		System.out.println(list1.size()); // 3
		System.out.println("After removing element:" +list1);
		
		// add element 
		list1.add(1,"yog");
		System.out.println(list1.size());
		System.out.println("After inserting element:" +list1);
		
		//read the value from array list
		/*for(String s:list1)
		{
			System.out.println(s);
		}*/
		
		/*for(Object s:list1)  // object type can hold any type of value
		{
			System.out.println(s);
		}*/
	}

}
