package Array;

public class SingleDimArray {

	public static void main(String[] args) {
		
		//int a[]=new int[5];  // declared arrow with size 5 , starting index is 0 and last index is 4
		
		// Inserting value into the arrows 
		/*a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500; */
		
		int a[]= {100,200,300,400,500};  // Declared an arrow without specifying size 
		
		System.out.println("The arrow length is:" +a.length); // prints the length / size of arrow 
		
		
		System.out.println(a[3]); // read a specific value 
		
		/*for(int i=0; i<a.length; i++)
		{
			System.out.println("The arrays values are:" +a[i]);
		}*/
		
		// read value by enhanced for loop
		
		for(int i:a) // search the value of a and assign to the i and this will continue till the end so until loop not find the value
		{
			System.out.println(i); //100,200,300,400,500
		}

	}

}
