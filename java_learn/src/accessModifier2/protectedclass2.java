package accessModifier2;
import pack1.class1; // we can use variable and method of class from out side of another package 

public class protectedclass2 extends class1 {

	public static void main(String[] args) {
		
		protectedclass2 pc= new protectedclass2();
		pc.data=100;
		pc.m1();

	}

}
