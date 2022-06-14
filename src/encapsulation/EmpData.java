package encapsulation;

public class EmpData {
	// how to implement Encapsulation 
	
//1. private data var.: so that cannot be accessed directly from outside the class
// 2. Encapsulation Variables always declared as private
//3. Hiding data members. It can be Var or Methods
//4. For use of high level security, we use Encapsulation
//5. Its not necessary to declare the getter and setter methods everytime, we can define only var as private.
//6. We can use private keyword only in class where we used the private keyword. Outside class we cannot use the private keyword.

	private int ssn;
	private String QA;

	
	// getter and setter : Rt click - Source - Getter and Setter
	
	
	public static void main(String[] args) {
		EmpData obj= new EmpData();
		
		obj.setQA("Peter");
		obj.setSsn(12);
		
		System.out.println(obj.getQA());
		System.out.println(obj.getSsn());

	}

//2. getter setter methods : to get and set the values of the fields
	
	public int getSsn() {
		return ssn;
	}


	public void setSsn(int ssn) {
		this.ssn = ssn;
	}


	public String getQA() {
		return QA;
	}


	public void setQA(String qA) {
		this.QA = qA;
	}

}


