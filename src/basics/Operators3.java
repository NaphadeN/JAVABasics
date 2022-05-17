package basics;

public class Operators3 {

	public static void main(String[] args) {
		// Operators are used to perform operations on variables and values.
		// Arithmetic operators
				// Assignment operators
				// Comparison operators
				// Logical operators
				// Bitwise operators

		int sum1 = 100 + 50; // 150 (100 + 50)
		int sum2 = sum1 + 250; // 400 (150 + 250)
		int sum3 = sum2 + sum2; // 800 (400 + 400)
		
	
		

		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);

		
		// Java Assignment Operators
		int sum6 = ++sum1;

		int sum7=--sum2;
		
		System.out.println("Value for sum6 is  "+sum6);
		System.out.println("Value for sum6 is  "+sum7);

		
		int x = 10;
		x += 5;

		System.out.println("Value for x is "  +x);
	
	
		// Comparison operators
		
		String s= "Nikhil";
		String y ="QA Engineer";
		String s1 ="Nikhil";
		
		int Q=5;
		int R=10;
		
		System.out.println("My Equal to Equal value for s & y are  " +(s==y));
		
		System.out.println("My Equal to Equal value for s & s1 are  "+(s==s1));
		
		System.out.println("S and y Logical Not Value is " +(s!=y));//Reverse the result, returns false if the result is true
		
		System.out.println("My Q and R Values are "+(Q>R));

		System.out.println(Q<=R);
		
		System.out.println("Comparison operators are Working !!");

		// Logical operators
		
		double Z=12.45;
		
		double S=34.66;
		
		System.out.println("my && Opearator value is :"+((Z<S) && S>Z)); // Logical and :  Returns true if both statements are true	
		System.out.println("my && Opearator value is :"+((Z<S) || S<Z)); //Logical or : Returns true if one of the statements is true
		
		System.out.println("my && and OR Opearator value is :"+ !((Z<S) || S>Z)); //Logical Not : Reverse the result, returns false if the result is true  
		
		
		//Modulus 
		
		int L=50;
		int Y=4;
		
		System.out.println(L % Y);  //50/4 =12 and 2 is reminder
		
		
		

	}

}
