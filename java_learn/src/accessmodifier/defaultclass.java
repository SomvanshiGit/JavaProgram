package accessmodifier;

class B
{
	int data=10;  // this is default variable so it can access in every class in same package 
	void m1(){ // this is default method so it can access in every class in same package 
		
		System.out.println(data);
	} 
}



public class defaultclass {

	public static void main(String[] args) {
		B obj1=new B();
		obj1.data=10;  
		obj1.m1();
	}

}
