package constructor;

public class A {
	
  public A() {
	  
	  System.out.println("Parent Class");
  }
  
	public static void main(String[] args) {
		
	}
	
	
public A(int i) {
	System.out.println("My Parent Class Constructor with one Argument" +i );
	
}
public A(int l , int n) {
	
	System.out.println("My Parent Class Constructor with two Argument " +l +"and" +n);
}
}

// Can we Overload Constructor : ---> Yes 
