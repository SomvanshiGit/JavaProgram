package accessmodifier;

class A
{
	private int data=10;  // private variable so it can not accessible out side of Class A 
	private void m1() {} // // private method so it can not accessible out side of Class A 
	}





public class privateclass {

	public static void main(String[] args) {
		A obj1=new A();
//		obj1.data=10;  // compile time error as this variable is private and it's not accessible out side of class 
//		obj1.m1();// compile time error as this method is private 
	}

}
