package MethodsUse;

public class Calculation {

	int x=10;
	int y=20;
	
/*	void sum() // Case 1: Not taking parameter and not return any value 
	{
		System.out.println(x+y);
	} */
	
/*	int sum() // Case 2: Not taking P but return V (Need to specify the datatype so we have used int.
	{
		return (x+y);
	}
	*/
	
/*	void sum(int a, int b) // Case 3: Taking P but not return V
	{
		System.out.println(a+b);
	}
	*/
	
	int sum(int a, int b) // Case 4.Taking P and return V
	{
		return(a+b);
	}
	
	
	public static void main(String[] args) {
		
		Calculation c1=new Calculation(); // always create object in main method not out side of main method
		
		//c1.sum(); // case 1 call direct sub method
		
		/*int res=c1.sum(); // case 2 store sum value in res and print Or we can direct specify c1.sum in print to avoid extra var creation 
		System.out.println(res);*/
		
		//c1.sum(100, 200);  // Case 3: assign value directly while you call method
		
		int res=c1.sum(50, 60); 
		System.out.println(res); // case 4
		// System.out.println(c1.sum(50, 60)); // for the case 4 we can print directly like this 
		
	}

}
