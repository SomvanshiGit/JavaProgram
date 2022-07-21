package Polymor;

public class ThisKeyword {

	int a,b; // instance variable / class variable 
	
	
	void getValue(int a, int b) // method variable or external variable 
	{
		// This keyword use when you want to use method variable same as instance / class variable(so to differentiate same name variable, we can use this keyword)
		this.a=a;  // this keyword always points to class variable 
		this.b=b;
	}
	
	void PrintValue()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		ThisKeyword th=new ThisKeyword();
		th.getValue(10,20);
		th.PrintValue();
	}

}
