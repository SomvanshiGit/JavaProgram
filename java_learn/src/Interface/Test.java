package Interface;


interface A
{
	int a=10; // by default variable in interface is static and final (static means common and final value we can not change)
	
	void m1(); // this is abstract method and it will be treated as public
	
	
}




public class Test implements A 
{
	public void m1()  // when we implement interface method in class it will treat as default so to access methods we have to use public.
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
//		Test t=new Test();
//		t.m1();

		A a=new Test(); // "A a" is a variable and  "new Test" is intense so we have to call interface as variable and class name as intense
		a.m1();
	}

}
