package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class LinkedList {

	public static <E> void main(String[] args) {
		// ArrayList is dynamic array and not static one 
		// Can contain duplicate value / elements 
		// maintain insertion order. i.e. 0the , 1st 2nd ....Index
		// allows random access to fetch element bcz it stores the values on the basis of indexes
		//next() : next() method returns the next element and also moves to the next element. 
		//hasNext() either returns true or false while next() will actually iterate to the record.


		
		int a [] = new int[3]; // static array as size is fixed
		
		ArrayList ar= new ArrayList(); // ArrayList is class. 
		
	
		ar.add(10);  //0th Index
		ar.add(20);  //1st Index
		ar.add(40);  //2nd Index
		ar.add(40);  //3rd Index
		ar.add("QA");//4th Index
		
		//how to print size of Index
		
		System.out.println("My Array Size is " +ar.size());
		
		// how to get teh values for perticular Index
		System.out.println("my first value for Index one is : " +ar.get(4));
		
		
		// how to print all values from Arrayist , we always use For Loop
		
		for(int i =0;i<ar.size();i++) {
			System.out.println(ar.get(i));
			
			
		}
		
		System.out.println("I am Good till Here ar!!!");
		//non-generic and generic : 
	                    	// ArrayList ar= new ArrayList(); : Non Generic as we can store any datatype value there
		
		 
		// Generic : If you want to add specifc data type like Integer , FLoat .....etc
		
		
		
		ArrayList <Integer>ar1	= new ArrayList<Integer>(); 
		
		ar1.add(90);
		ar1.add(190);	
		ar1.add(990);
		            // ar1.add("Engineer"); --> Showing Error as can accept only Integers

		for(int i =0;i<ar1.size();i++) {
			System.out.println(ar1.get(i));
			
			
		}
		
		System.out.println("I am Good till Here ar1!!!");
		
		ArrayList <String>ar2	= new ArrayList<String>(); 
		 ar2.add("Engineer"); 
		 ar2.add("Social");
		 
		 // Use For loop and get the values
		 for(int i =0;i<ar2.size();i++) {
				System.out.println(ar2.get(i));
				
				
		 
		 //If you don't know the datatype 
		
			ArrayList <E>ar3= new ArrayList<E>(); 
			
			Employee E1= new Employee("Nikhil",29,"QA");  // We can use Employee, bcz we have use the constructor of Employee
			
			
			Employee E2= new Employee("Tom",25,"JAVA");
			
			Employee E3= new Employee("Latham",28,"PHP");
			
			
			System.out.println("********************");
			
			// How to Create ArrayList
			
			ArrayList<Employee> ar4= new ArrayList<Employee>();
			
			ar4.add(E1);
			ar4.add(E2);
			ar4.add(E3);
			
			// Iterator to traverse the values 
			Iterator <Employee> it =ar4.iterator();
			while(it.hasNext()) {
				Employee emp=	it.next(); // we can store the Employee values by emp var.
				System.out.println(emp.name);
				System.out.println(emp.age);
				System.out.println(emp.dept);
			
		
			
	System.out.println("DDDDDDD");
	
		 }

	}
	}
}
