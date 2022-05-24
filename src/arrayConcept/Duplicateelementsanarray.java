package arrayConcept;

public class Duplicateelementsanarray {

	public static void main(String[] args) {
//Initialize
int arr []= new int [] {3,5,4,4,5,10};		// First Iteration : Compare value to 3-5 , 3-4,3-4,3-5,3-10
                                        // Second Itration : Compare value to 5-4,5-4,5-5,5-10
                                       //Third Itration : Compare value to 4-4,4-5,4-10
                                    //Fourth Itration : Compare value to 4-5,4-10
 
System.out.println("Duplicate Element in Array" +arr.length);
     
      for(int i=0;i<arr.length;i++) {
    	  for(int j=i+1;j<arr.length;j++) {
    		  if(arr[i]==arr[j]) {
    			  System.out.println(arr[j]);
    			  
    		  }
    		  
    	  }
    	  
      }
		
		
	}

}
