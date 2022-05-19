package controlStatement;

public class Dummy {

	public static void main(String[] args) {
		String Address = "31/b,somwar peth jogeswari building ,karad,pincode=415110";
	      if (Address.endsWith("building")){
	    	  System.out.println("my building name is jogeswari");
	    	  
	      } else if(Address.contains("satara")) {
	    		  System.out.println("my city name is satara");
	    		  
	      } else if (Address.contains("pune")) {
	    		  System.out.println("my city name is pune");
	    		  
	    		  
	    				  
	    			  }else if (Address.endsWith("peth")) {
	    				  System.out.println("my address is ....");
	    				  
	    			  }else if (Address.contains("bhopal")){
	    				  System.out.println("my city is bhopal");
	    			 
	    				  
	    			  }else
	    				  
	    			  {
	    				  System.out.println("above address is not mine....");
	    			  }
	    		  }
	    	  //my expected output is "above address is not mine"
	    	  
	    	  
	
	
}
