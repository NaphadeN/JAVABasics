package constructor;

public class ConstructorwithThisKeyword {
	
	String name;
	int age=4;
	
	public ConstructorwithThisKeyword(String name,int age) {
		System.out.println(name);
		System.out.println(age);
		
		this.name=name; // this keyword use to initialize class var.in the constructor
		this.age=age;
		
	}

	public static void main(String[] args) {
		ConstructorwithThisKeyword obj = new ConstructorwithThisKeyword("Tom",3);
	
	
	}

}
