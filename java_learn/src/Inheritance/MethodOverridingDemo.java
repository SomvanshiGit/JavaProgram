package Inheritance;


class bank
{
	double rateofInterest()
	{
		return 0;
		
	}
}
// method definition should not be change it should be same as main class but body should be change like what we return.
// For overriding we must have to user inheritance while for overloading it's not compulsory.
class SBI extends bank 
{
	double rateofInterest()  
	{
		return 10.5;
	}
}

class ICICI extends bank
{
	double rateofInterest()
	{
		return 9.6;
	}
}

class AXIS extends bank
{
	double rateofInterest()
	{
		return 9.6;
	}
}


public class MethodOverridingDemo {
	
	
	public static void main(String[] args) {
		
	SBI sbi= new SBI();
	
	System.out.println(sbi.rateofInterest());
	
	ICICI ic= new ICICI();
	System.out.println(ic.rateofInterest());
	
	AXIS ax= new AXIS();
	System.out.println(ax.rateofInterest());
	}

}
