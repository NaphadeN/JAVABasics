package inheritence;

public class TestCar {
	public static void main(String[] args) {
	
	// Compile Time Polymorphism /  Static Polymorphism (Poly means : one to many method)because at the time of compile JAVA decide which method needs to be call from Child / Parent class 
	BMW b = new BMW();
	b.start();
	b.stop();
	b.refuel();
	b.theftsaftey();
	b.engine();

	System.out.println("****SCOPE OF THE BMW CLASS****");
	
	Car c = new Car();
	c.start();
	c.stop();
	c.refuel();
	c.engine();
	//c.theftsaftey(); // Security Issue. Parent don't have access on Child class Methods.
	
	System.out.println("****SCOPE OF THE Car CLASS****");

	
	//TOP Casting : 
	Car c1 = new BMW(); // Child Class Object can be refereed by Parent class reference variable ---- dynamic polymorphism / Compile time polymorphism
	
	c1.start();
	c1.stop();
	c1.refuel();
	//c1.theftsaftey();// You(BMW) can my Object but can't use my methods. so only Overridden methods and parent class methods are allowed.
	                      // we can use/achieve by static polymorphism.
	c.engine();
	
	
	// Down Casting 
	
	BMW b1=(BMW) new Car(); // Not Allowed. Giving : java.lang.ClassCastException:
	
	
	
	}
}
