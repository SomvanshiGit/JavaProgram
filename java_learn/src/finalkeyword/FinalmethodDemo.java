package finalkeyword;


class bike  // parent class 
{
	final void run()  // final method, so we can not override the final method in child class 
	{
		System.out.println("running...");
	}
	
	}

class honda extends bike  // honda is child class of bike class 
{
	//void run()  // compile time error 
	{
		System.out.println("start...");
	}
	
	}
public class FinalmethodDemo {

	public static void main(String[] args) {
		

	}

}
