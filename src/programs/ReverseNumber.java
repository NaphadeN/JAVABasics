package programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");

		
		int num = sc.nextInt();
		int Rev = 0;
        while (num != 0) {
			Rev = Rev * 10 + num % 10;       //0+1234%10 = 4   ,  40+123%10 = 43 , 430+12%10 =  4320+1%10=  4321 
			num = num / 10;   //1234/10=123  , 123 / 10 = 12 , 12/10 = 1 
		}
		

		System.out.println("Reverse Number is " + Rev);

	}

}
