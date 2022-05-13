package basics;

public class Strings4 {

	public static void main(String[] args) {
		
		
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length()); //To find Length of String
		
		String txt2 = "Hello World";
		System.out.println(txt2.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(txt2.toLowerCase());   // Outputs "hello world...."
		
		System.out.println(txt2.concat(txt));
		
		System.out.println(txt2.indexOf("World")); // Outputs 6 : Value of W

		System.out.println(txt2.indexOf("ld")); // Outputs 7 : Value of l

	
	//	String Concatenation: The + operator can be used between strings to combine them. This is called concatenation:
	
	
	//First Solution : 
		
		String firstName = "John";
	String lastName = "Doe";
	System.out.println(firstName +" "+ lastName);
	
	//Second Solution : 

	System.out.println(firstName.concat(lastName));
	
	
	//String txt3 = "We are the so-called "Vikings" from the north.";  // Cannot write double quote inside strings
	
	String txt6 = "My Hobby is  \"FootBall\" Game.";  // This is right statement. Add '\'  inserts a single quote in a string if you want to write string inside string 

System.out.println(txt6);

	
	
	}

}
