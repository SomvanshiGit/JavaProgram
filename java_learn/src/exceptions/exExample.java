package exceptions;

public class exExample {

	public static void main(String[] args) {
		
		System.out.println("the program is started");
		System.out.println("The program is in prgress");
		
		int a= 100;
		
		try 
		{
		System.out.println(a/0); // throw arithmetic exception
		}
		catch(ArithmeticException e)
		{
			System.out.println("Enter into catch block ");
		}
		
		String s=null;
		//System.out.println(s.length()); // throws nullpointerexceptions
		
		String x="abc";
		//int i=Integer.parseInt(x); // NumberFormatExceptions
		
		//int arr[]=new int[5];
		//arr[10]=100; // ArrayIndexOutOfBoundsException
		
		System.out.println("the program is completed");
		System.out.println("The program is exited");
		
	}

}
