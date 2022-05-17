package basics;

public class ControlStatementsIFNested {

	public static void main(String[] args) {
		String address = "Delhi India";    
	    
		if(address.endsWith("India")) { 
			
			System.out.println("Your city is India");
			
		if(address.contains("Meerut")) {  
			
		System.out.println("Your city is Meerut");    
		
		}else if(address.contains("Noida")) { 
			
		System.out.println("Your city is Noida");    
		}
		
		}else 
		
		{    
		System.out.println("You are not living in India");    
		}    

	}

}
