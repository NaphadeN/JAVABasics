package interfacevsAbstract;

public class TestBank {

	public static void main(String[] args) {
		//USBank U= new USBank(); Not Allowed.Cannot create Object of Interface
		
		ICICI I= new ICICI();    // ICICI is class not interface so that we are creating Obj here.
		I.debit();
		I.credit();
		I.transfermoney();  // USBANK 
		
		
		I.carloan();
		I.educationloan();
		I.homeloan();   // RBI 
		
		
		I.insurance();
		I.mutualfund(); // ICICI Own Methods
		
		System.out.println(USBank.min_bal); // ClassName.variable Name
		
		USBank Us = new ICICI(); // I can Access only USBank Methods with Us Object reference
		
		Us.credit();
		Us.debit();
	Us.transfermoney();


	
	}

}
