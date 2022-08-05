package programs;

import java.util.Scanner;

public class PalidromeNo {

	public static void main(String[] args) {    //PaindromeNumber 121 , 323 , 878
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a No");
		
		int  num=sc.nextInt();
		
		int rev=0;
		int orignalno=num;
		while(num!=0) {
			rev = rev*10 +num%10;
			num=num/10;
			
		}
		
		if(orignalno==rev) {
			
			System.out.println(orignalno +"Palidrome Number");
		}
		
		else {
			
			System.out.println("Not Palindrome");
		}
	}
	
	
}
