package oopsConcepot;

public class MethodsORFunctions {
// Main Method is starting of Execution of Program
	public static void main(String[] args) {
		MethodsORFunctions obj = new MethodsORFunctions();
		obj.Test();
		
		
		int T = obj.pqr();
		System.out.println("My Test Method is" + T);

		String S = obj.qA();
		System.out.println("My Value for the qA Method is " + S);

		int Y = obj.div(12, 2);

		System.out.println("My value for QA Method is  " + Y);
	}

	// Non-Static Methods

	public void Test() {

		System.out.println("Test Method");
	}

	public int pqr() { // Void means does not return value

		System.out.println("pqr method");

		int a = 10;
		int b = 20;
		int c = a + b;
		return c;

	}

	public String qA() {
		String s = "PUNE";
		System.out.println("qA Method");
		return s;

	}

	public int div(int x, int y) {
		System.out.println("Division Method");
		int f = x / y;
		return f;

	}
}

//Return type of Test() method is void whereas Return type of pqr() method is int
//Return type of QA() is String,Return type of div() method is int
