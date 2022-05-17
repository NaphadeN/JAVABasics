package basics;

public class SwitchStstements8 {

	public static void main(String[] args) {
		int day = 17;
		
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		    
		    
		 default:      // If we add case more 7 then default statement will executed.         
		   System.out.println("Looking forward to the Weekend");
			}
		}
		// Outputs "Thursday" (day 4)
	
	// While selecting City dropdown we can user Switch Statement.
	

	
}
