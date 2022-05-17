package basics;

public class Strings4 {

	public static void main(String[] args) {
		
		
		String txt = "ABCDEFGHIJKLMNOPQRSTUXYZ";
		System.out.println("The length of the txt string is: " + txt.length()); //To find Length of String
	
		String RT="QW QW";
		System.out.println("RT" +RT.length());
		
		
		
		String txt2 = "Hello World";
		System.out.println("My Uppercase Value is : " +txt2.toUpperCase());   // Outputs "HELLO WORLD"
		
		System.out.println("My LowerCase Value is : "+txt2.toLowerCase());   // Outputs "hello world...."
		
		System.out.println("My Concat Valaues is : ---->  " +txt2.concat(txt));
		
		

		
		System.out.println("Values of W in World is "+txt2.indexOf("World")); // Outputs 6 : Value of W.  Index always starts with 0

		System.out.println("Value of l in World"+txt2.indexOf("ld")); // Outputs 9 : Value of l.  Index always starts with 0

	
	//	String Concatenation: The + operator can be used between strings to combine them. This is called concatenation:
	
	
	//First Solution : 
		
		String firstName = "John";
	String lastName = "Doe";
	
	String Middlename ="NNN";
	
	int IO=5;
	System.out.println(firstName +" "+ lastName);
	
	//Second Solution : 

	System.out.println("My Concat Value for John Doe is : --->"+firstName.concat(lastName).concat(Middlename));
	
	
	//String txt3 = "We are the so-called "Vikings" from the north.";  // Cannot write double quote inside strings
	
	String txt6 = "My Hobby is  \"FootBall\" Game.";  // This is right statement. Add '\'  inserts a single quote in a string if you want to write string inside string 

System.out.println(txt6);
	
	
	}

}
