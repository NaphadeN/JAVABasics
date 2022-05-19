package controlStatement;

public class BreakStatement {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++){  
	        if(i==9){  
	            //breaking the loop  
	            break;   // It breaks inner loop only if you use break statement inside the  loop.
	        }  
	        System.out.println(i);  
	        
	   
	    }  
	     System.out.println("Good");
	}

}
