package Super;

public class animal {  // parent class 
	String color="white";
	
	void eating()  // method
	{
		System.out.println("eating...");
	}
	/*animal()  // contractor 
	{
		System.out.println("Animal contractor is created");
	}*/

}

class dog extends animal
{
	String color="black";
	
	
	void displaycolor() // method of child class 
	{
		System.out.println(color);	// Provide result black : as it will call current class instance.
		System.out.println(super.color);  // provide result (white) immediate parent class of instance variable 
	}	
	
	void eating()
	{
		System.out.println("eating pasta..."); //This will override the main class method while we call eating method through object of dog class.
		super.eating(); //print result (eating text) immediate parent class method 
	}
	
	/*dog() // contractor 
	{
		super(); // is user to invoke parent class contractor
		System.out.println("dog contractor is created");
	}*/
	
}
