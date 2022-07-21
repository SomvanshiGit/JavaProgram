package ClassObject;

public class ClassMain {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.eid=101;
		emp1.ename="Deepak";
		emp1.sal=20000.00;
		emp1.deptno=10;
		emp1.job="QA";
		
		emp1.display();
		
		System.out.println("********");
		
		Employee emp2=new Employee();
		emp2.eid=103;
		emp2.ename="jay";
		emp2.sal=10000.90;
		emp2.deptno=12;
		emp2.job="jr QA";
		emp2.display();
		//

	}

}
