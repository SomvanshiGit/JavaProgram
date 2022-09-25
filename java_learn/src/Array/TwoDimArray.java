package Array;

public class TwoDimArray {

	public static void main(String[] args) {
		
		int a[][]=new int [3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		//int a[][]= { {100,200} ,{300,400}, {500,600} }; test.
		
		System.out.println("Numbers of raw: "+a.length); // count raws of arrays 
		
		System.out.println("Numbers of columns: " + a[0].length); // count the numbers of  column for specific  raw 
		
		// i = raw j=column
		// outer loop i<a.length it will find the total raws // when i value become 3 so 3<3(total length of raw) is not correct so it will stop else will jump to j loop and count the column value for each raw. .
//		for(int i=0; i<a.length; i++) // i= 0 , 1 , 2
//		{
//			// (To count columns for each and every raws) inner loop j<a[i].length this will count the number of column and it repeats how many number of column we have in raw
//			for(int j=0; j<a[i].length;j++) // j= 0 , 1 so i=0<j=0 is true so it will print the value of i and j array position. 
//				
//			{
//				System.out.println(a[i][j]);
//			}
//		}
		
		//Enhanced for loop 
		for(int r[]:a)  // a : first raw values (100,200) store in r[] single dim so now r[] has 100,200 value , loop run every time and value increase from 100,200 to 300,400. 
		{
			for(int i:r) // now r value is 100,200 and it will store in "i" so it will print first 100 then 200 like wise it will print all raws value  
			{
				System.out.println(i); //100,200,300,400,500,600
			}
		}
		
		}
		
		
		
		
		
	}


