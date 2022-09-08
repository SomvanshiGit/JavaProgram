package classesandobjects;

public class AccountHolderObjects {

	public static void main(String[] args) {
		
		//Crate object for all the acc holder 
		AccountHolder Tom = new AccountHolder();
		AccountHolder Henry = new AccountHolder();
		AccountHolder sarah = new AccountHolder();
		
		//call the  attributes , test
		Tom.firstname="Tom";
		Tom.lastname="Smith";
		Tom.age=20;
		Tom.accountbalance=10000;
		//call the function through object
		Tom.testelegibilityforcreditcard();
		
		System.out.println("Is tom elegible for credit card: " +Tom.elegibleForCreditCard);
		
		Henry.firstname="Henry";
		Henry.lastname="parmar";
		Henry.age=20;
		Henry.accountbalance=15000;
		Henry.testelegibilityforcreditcard();
		
		System.out.println("Is tom elegible for credit card: " +Henry.elegibleForCreditCard);
		
		sarah.firstname="sarah";
		sarah.lastname="rajput";
		sarah.age=31;
		sarah.accountbalance=25000;
		sarah.testelegibilityforcreditcard();
		
		System.out.println("Is tom elegible for credit card: " +sarah.elegibleForCreditCard);


	}

}