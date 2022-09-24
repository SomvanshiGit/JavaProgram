package ClassObject;

public class ConstructorTypes {

	int x;
	int y;
	
	ConstructorTypes()  // Default cons.. bcoz we have not passed any value under ()
	{
		x=10;
		y=20;
	}
	
	ConstructorTypes(int a, int b)  // Parameterized Constructor as  we have  passed any value under ()
	{
		x=a;
		y=b;
	}
	
	void Display()
	{
		
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		
		/*ConstructorTypes cons=new ConstructorTypes(); // This will invokes default cons..bcoz we have not passed any value under ()
		cons.Display(); */
		
		ConstructorTypes cons=new ConstructorTypes(100,200); //This will invokes parameterized Constructor
		cons.Display();  // this called method call as explicitly 

	}

}
