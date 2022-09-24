package classesandobjects;

public class AccountHolder {

	String firstname;
	String lastname;
	int age;
	float accountbalance;
	boolean elegibleForCreditCard;
	
	//function
	public void testelegibilityforcreditcard(){
		
		if(age>25 & accountbalance>=20000) {
			elegibleForCreditCard=true;
			
		}
			
	}
	

}