package Interface;


interface abc  // parent 
{
	int x=10;
	void m1();
	}

interface xyz // parent 
{
	int y=20;
	void m2();
	
	}

// we can not use extends keyword to use multiple inheritance we have to use implement keyword and through class we can user multiple inheritance interfaces method and variable.
public class MultipleInheritance implements abc,xyz  // child class and called parent interface and use the parent interface methods and variable.

{
	public void m1()
	{
		System.out.println(x);
	}
	public void m2()
	{
		System.out.println(y);
	}
	

	public static void main(String[] args) {
		
		MultipleInheritance test= new MultipleInheritance();  // to user call class method we have to create class object
		test.m1();
		test.m2();
	}

}
