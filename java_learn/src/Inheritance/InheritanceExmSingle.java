package Inheritance;

class A
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}
class B extends A   // B is child class and A is parent class and to acess A class stuff use extends
{
	int b;
	void print()
	{
		System.out.println(b);
	}
	
}

public class InheritanceExm {

	
	public static void main(String[] args) {
		A aobj=new A();
		aobj.a=100;
		aobj.display();
		
		//Class B can access the Class A variable and method becoz B is child class of parent A class 
		B bobj=new B();
		bobj.a=100;
		bobj.b=200;
		bobj.display();
		bobj.print();		

	}

}
