package programs;

public class CountNumberOfEVENODD {

	public static void main(String[] args) {
		//  Count Number Of EVEN & ODD Digits in A Number
		
		int num=123;  
		int even=0;
		int odd =0;
		while(num>0) {     //1234
			
			int rem = num%10;    // 4 3 2 1 
			if (rem%2==0) {           

				even++;               //1   2 
				
				
			}
			else {
				
				odd++;
				
			} 
			num= num/10;                //  123   12    1    0 
			
				
		}
		System.out.println("Number is " +even);
		System.out.println("Number is " +odd);

	}

}
