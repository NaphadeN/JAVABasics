package programs;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String Str = sc.next();
		System.out.println("Enter Number");
        String Orgstr = Str;
		String rev = "";
		
		
		
		
		int TOtalLength = Str.length();
		System.out.println(+TOtalLength);

		for (int i = TOtalLength - 1; i >= 0; i--) {
			rev = rev + Str.charAt(i);

		}
		System.out.println(rev);

		if (Orgstr.equals(rev)) {
			System.out.println("Palindrome");

		}

		else {

			System.out.println("Not PAlindrome");
		}

	}
}
