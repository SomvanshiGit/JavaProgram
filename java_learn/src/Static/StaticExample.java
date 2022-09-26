package Static;

public class StaticExample {
	
	static int a=10; // static variable 
	int b=20; // non static variable 
	
	static void m1() // this is a static method 
	{
		StaticExample se= new StaticExample();
		System.out.println(se.b);
		System.out.println("This is m1 which is static method");
	}
	
	void m2() //this is non static method  
	{
		System.out.println("This is m2 which is non static menthod");
	}
	
	
	void m3() //this is non static method  and this can access both non and static variable and method.
	{
		System.out.println("This is non static menthod"); 
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
		
	}
	

	public static void main(String[] args) {
		
		//static methos can only access the static stuff 
		System.out.println(StaticExample.a);
		
		// Static method can also access the non static stuff but through object not directly.
		StaticExample se=new StaticExample();
		System.out.println(se.b);
		se.m2();
						
		StaticExample se1=new StaticExample();
		se.m3();
		
		
		System.out.println(a);  // we can directly call static variable without creating object and we can not access non static variable directly we have to create object to call non static method and variable .
		m1(); // we can directly call static method without creating object and we can not access directly non static method.
		
		//m2(); incorrect bcoz m2 is non static method
		
		
		// if main method in the another class file then we have to specify the class name like StaticExample.a to access static variable and same way for static method.
		
		
		
	}
}
