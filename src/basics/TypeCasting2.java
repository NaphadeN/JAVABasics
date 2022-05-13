package basics;

public class TypeCasting2 {

	public static void main(String[] args) {
		    int myInt = 9;
		    double myDouble = myInt; // Automatic casting: int to double , called as Widening Casting

		    System.out.println(myInt);      // Outputs 9
		    System.out.println(myDouble);   // Outputs 9.0
		  

		    
		    double myValue = 9.78d;
		    int myIntvalue = (int) myValue; // Manual casting: double to int, called as Narrowing Casting

		    System.out.println(myValue);   // Outputs 9.78
		    System.out.println(myIntvalue);      // Output 9
		  }
	
}
