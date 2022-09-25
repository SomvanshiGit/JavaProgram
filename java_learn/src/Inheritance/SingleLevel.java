package Inheritance;

class A
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}
class B extends A   // B is child class and A is parent class and to access A class stuff use extends
{
	int b;
	void print()
	{
		System.out.println(b);
	}
	
}
class C extends B
{
	int c;
	void show()
	{
		System.out.println(c);
	}
}

public class SingleLevel {

	
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
		
		/*C cobj=new C();
		cobj.a=10;
		cobj.b=20;
		cobj.c=30;
		*/

	}

}
