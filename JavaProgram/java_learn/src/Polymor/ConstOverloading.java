package Polymor;

public class ConstOverloading {

	// same method as class name
	
	ConstOverloading(int a, int b) //1
	{
		System.out.println(a+b);
	}
	
	ConstOverloading(int a, double b) //2
	{
		System.out.println(a+b);
	}
	
	ConstOverloading(double a, int b) //3
	{
		System.out.println(a+b);
	}
	
	ConstOverloading(int a, int b, int c) //4
	{
		System.out.println(a+b+c);
	}
	
	
	
	
	public static void main(String[] args) {
		 //1 cons method call , according to passing parameter is will call the methods.
		ConstOverloading CO=new ConstOverloading(10,20);
		
		
		
	}

}
