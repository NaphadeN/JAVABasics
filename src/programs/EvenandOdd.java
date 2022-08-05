package programs;

import java.util.Scanner;

public class EvenandOdd {

	
	public static void main (String[] stgs) {
		
		int number = 2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No");
		number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.println("Even Number");

		} else {

			System.out.println("Odd Number");
		}

	}
	
}
