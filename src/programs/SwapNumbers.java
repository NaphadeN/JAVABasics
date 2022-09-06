package programs;

public class SwapNumbers {
 public static void main(String[] args) {
	 
	 int a=2;
	 int b=6;
	
	System.out.println("Before Swap " +a +" "+  +b); 
	 int t1=b;
	b=a;
	a=t1;
	System.out.println("After swap " +a +" "+ + b);
	 
	
	// Second way to Swap
	
	a=a+b;
	b=a-b;
	a=a-b;

	System.out.println("After swap " +a +" "+ + b);

	
 }

	
	
}
