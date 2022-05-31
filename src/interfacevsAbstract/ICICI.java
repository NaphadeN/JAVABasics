package interfacevsAbstract;

public class ICICI implements RBI,USBank { //The type ICICI must implement the inherited abstract method RBI.educationloan()

	public static void main(String[] args) {
		
	}
	//Coming from USBank Interface
@Override
public void debit() {
	System.out.println("Debit");
}

@Override
public void credit() {
	System.out.println("C");
	
}

@Override
public void transfermoney() {
	System.out.println("T");
	
}


//Coming from RBI Interface
@Override
public void educationloan() {
	System.out.println("E");
	
}

@Override
public void carloan() {
	System.out.println("C");
	
}

@Override
public void homeloan() {
	System.out.println("H");
	
}
//ICICI class also having some Individual Methods which are not Overridden by other class


public void mutualfund() {
	System.out.println("M");

}
public void insurance() {
	System.out.println("I");

}
}
