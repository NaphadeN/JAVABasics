package constructor;

public class B extends A{
	
	public B(int i) {
		
	super(i);
	
	System.out.println("Child Class Constr");	
	}
	

	public B(int l,int n) {
	super(l,n);
		
	System.out.println("Child Class Constr with two Parameters");	
	}
	
	

	public static void main(String[] args) {
		
  B obj = new B(10);   
  B obj1 = new B(10,20);   
	}

}


// Parent constructor called first and after that Child class constructor is called.

// Super keyword use to call parent class constructor
// If we use Super keyword then default constructor will not be called. [i.e. : System.out.println("Parent Class");]
// Super Keyword use always inside child constructor always.Super Keyword is the first statement in the child constructor
// If you want to use arg 1 then  create new constructor for B and pass the arg there.


