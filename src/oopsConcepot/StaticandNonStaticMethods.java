package oopsConcepot;

public class StaticandNonStaticMethods {
//Global Variable : scope of global variable is across the fuction or across the method
	
	String name ="QA";
	static int age =12;
	
	
	public static void main(String[] args) {
		
		// how to call static method & Variable
		// 1. by direct taking Name
                  Sum();
		/// 2. by Calling by Class Name
                  StaticandNonStaticMethods.Sum(); 
                  
     // How to call Variable
                  System.out.println(age);
                  System.out.println(StaticandNonStaticMethods.age);
                  
                  
       // How to call non-static methods 
                  StaticandNonStaticMethods S1= new StaticandNonStaticMethods();
     
                  S1.Sum();
                  //System.out.println(name);// Not possible as this is non static variable
	}
	
	public void sendEmail() {
		
		System.out.println("Send an Email");
	}

	public static void Sum() {
		
		System.out.println("Sum Method");
	}
}
