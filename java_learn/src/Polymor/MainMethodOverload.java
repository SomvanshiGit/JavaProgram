package Polymor;

public class MainMethodOverload {

	public void main(int x)
	{
		System.out.println(x);
	}
	
	public void main(int x, int y)
	{
		System.out.println(x+y);
	}
	
	// JVM always look for this main method so execution will start from here .
	public static void main(String[] args) {
		MainMethodOverload Mo=new MainMethodOverload();
		Mo.main(100); // 1st main
		Mo.main(100, 200); //2nd main 
		
	}

}
