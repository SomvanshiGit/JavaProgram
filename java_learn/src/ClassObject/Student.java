package ClassObject;

public class Student {

	int sid;
	String sname;
	char Grade;
	
	Student(int id, String name, char g)// Constructor 
	{

		sid=id;
		sname=name;
		Grade=g;
		
	}
	
	
	// create method
	void getvalue(int id, String name, char g) { 
		
		sid=id;
		sname=name;
		Grade=g;
	}
	
	
	void display()
	{
		System.out.println(sid+ " "+sname+" "+Grade);
	}

	

}


