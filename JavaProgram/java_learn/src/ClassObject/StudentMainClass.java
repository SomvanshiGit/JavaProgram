package ClassObject;

public class StudentMainClass {

	public static void main(String[] args) {
	
		// call value in Constructor object 
		Student stu1=new Student(101,"Deepak",'A');
		
		// call the object of method
		//Student stu1=new Student();
		
		//1. assign value by using ref variable
		/*stu1.sid=101;
		stu1.sname="Deepak";
		stu1.Grade='A'; */

		//2. assign values by using method  
		//stu1.getvalue(101, "Deepak", 'A'); 
	
		stu1.display(); 
		//


	}

}
