package oopsConcepot;

public class ObjectandClassExample1 {

		//Object and Class Example: main within the class
		
		//defining fields  
		 int id=2;// id is field or data member or instance variable  
		 String name="QA";  
		 
		 //creating main method inside the ObjectandClassExample class  
		 public static void main(String args[]){  
		  //Creating an object or instance  
			 
			 ObjectandClassExample1 s1=new ObjectandClassExample1();//new ObjectandClassExample1() : ---> It is an Object. s1 is Reference Object
			 
		  //Printing values of the object. s1 is Reference Object
		  System.out.println("My Value for Id is : "+s1.id);//accessing member through reference Object
		   
		  System.out.println("My Value for name is  : "+s1.name);  
		 }  
	
}
