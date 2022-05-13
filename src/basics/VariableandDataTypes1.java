package basics;

public class VariableandDataTypes1 {

	public static void main(String[] args) { // Main Method starting or Execution point of program

		// INTEGER means positive or negative number

		int i = 10;
		i = 20;
		int j = 30;
		int k = -50;

		byte L = 123;
		short M = 790;

		System.out.println("My Integer Value for i is " + i);

		System.out.println("My Value for j is " + j);

		System.out.println(L);

		// i,j, k are variables

		// System is a Class
		// out is a Variable
		// println() is a method

		// Long : This is used when int is not large enough to store the value. Note
		// that you should end the value with an "L":

		long Number = 1511119L;
		System.out.println(Number);

		// Float : The float data type can store fractional numbers

		float myNum = 85.75f;
		System.out.println(myNum);

		// Double means Double Value

		double d = 12.33;

		double w = 43.22;

		System.out.println(w);

		// char means a single character

		char c = 'A';
		char D = 'B';

		System.out.println(D);

		// booleans means true or false

		boolean a = true;
		boolean b = false;

		System.out.println(b);

		// char means a single character

		char cA = 'A';
		char DA = 'B';
		System.out.println("Valueeee " + cA);

		// String : is class , not data type

		String S = "My Name is Virat";
		String K = "My Name is Veer";

		// Java Print Variables using +

		String name = "John";
		System.out.println("Hello " + name);

		String firstName = "John";
		String lastName = "Doe";
		String fullName = firstName + lastName;
		System.out.println("My Fullname Value is " + fullName);

	}
}
