package oopsConcepot;

public class localandglobalvariables {
    //Global Variables / Class variables
	 String name ="Tom";
	int age = 12;
	float R=12.22f;
	 static int M=99;
	 
	 static String A="Ashok";
	
	public static void main(String[] args) {
		int i=10; //local variable for main  method
		System.out.println(i); // Local Variable , we can access
		
	//In Order to access GLobal Varible we need to create Object first and then use the variables
		
		localandglobalvariables obj = new localandglobalvariables();
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(M);
		
		System.out.println(A);
		
		
      obj.sum();
	
	}

	public void sum() {
		
		int i=134;  // Local Variable for sum Method
		int age=5;
		System.out.println(R);
		System.out.println(M);
		System.out.println(age);
		System.out.println(i);

		

	}
	
}
