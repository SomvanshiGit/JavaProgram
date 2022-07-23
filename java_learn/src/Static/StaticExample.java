package Static;

public class StaticExample {
	
	static int a=10; // static variable 
	int b=20; // non static variable 
	
	static void m1() // this is a static method 
	{
		System.out.println("This is m1 which is static method");
	}
	
	void m2() //this is non static method  
	{
		System.out.println("This is m2 which is non static menthod");
	}
	
	
	

	public static void main(String[] args) {
		System.out.println(a);  // we can directly call static variable without creating object and we can not access non static variable directly we have to create object to call non static method and variable .
		m1(); // we can directly call static method without creating object and we can not access directly non static method.
		
		//m2(); incorrect bcoz m2 is non static method
		
		
		// if main method in the another class file then we have to specify the class name like StaticExample.a to access static variable and same way for static method.
		
		// Static method can also non static stuff but through object.
		StaticExample se=new StaticExample();
		System.out.println(se.b);
		se.m2();
		
	}
}
