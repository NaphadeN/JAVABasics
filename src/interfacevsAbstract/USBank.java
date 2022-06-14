package interfacevsAbstract;

public interface USBank {
	
	  int min_bal=100;
	
	public abstract void debit();
		
public abstract void credit();
		
                                                                       // System.out.println("Debit"); // Body not allowed
public abstract void transfermoney();
	
}


// No Method Body only declaration 
// Cannot create Object of Interface
// No Static Methods
// Interface is  Prototype
// Variables are static in nature by default. No need to write static in front of any var
// 100% Abstraction 
// All Above debit, credit,transfermoney are Abstract Methods without method Body


