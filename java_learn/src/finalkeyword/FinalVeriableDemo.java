package finalkeyword;

public class FinalVeriableDemo {
	
	final int speed=400;  // final variable so it can not change the value 

	public static void main(String[] args) {
		FinalVeriableDemo fm= new FinalVeriableDemo();
		//fm.speed=100; // we can not assign / change value of final variable 
		System.out.println(fm.speed);

	}

}
