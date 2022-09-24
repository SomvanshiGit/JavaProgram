package StringMethod;

public class Str {
	
	public static void main(String[] args) {
		
		String s= "Welcome";
		String s1="Deepak";
		
		System.out.println(s.length());
		System.out.println(s.concat(s1));
		System.out.println(s1.trim());
		
		System.out.println(s.contains("Wel"));
		
		
		System.out.println(s.charAt(2)); 
		//s.contains("Wel");
		//s.equals("Welcome");
		//s.equals("welcome");
		System.out.println(s.equalsIgnoreCase("welcome")); // this will ignore case sensitive word 
		
		System.out.println(s.equals("Deepak"));
		System.out.println(s.replace("Welcome", "Hi Welcome"));
		System.out.println(s.replace('i', 'e'));
		System.out.println(s.substring(1,3)); // it will show 1 to 3 index value and index starts from zero 
		System.out.println(s.toLowerCase()); 
		
	}

}
