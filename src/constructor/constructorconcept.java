package constructor;

public class constructorconcept {

	String name;
	int g;
	
	
	public  constructorconcept() {   // 0 parameter constructor / Default Constructor
		System.out.println("Default");

	}

	public  constructorconcept(int g) {   // 1 parameter constructor 
		System.out.println("1 Parameter"); //Can we overload Constructor ? Yes //+g
		//this.g=g;
		

	}
	public  constructorconcept(int i,int j) {   // 2 parameter constructor 
		System.out.println("2 Parameter"); //Can we overload Constructor ? Yes 

	}
	
	public static void main(String[] args) {
		constructorconcept obj = new constructorconcept(); // It is hidden constructor
		constructorconcept obj1 = new constructorconcept(10); // calling constr. always create separate object 
		constructorconcept obj2 = new constructorconcept(30,40);
		
	}

}
