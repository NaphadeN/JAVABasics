package programs;

public class Countdigits {

	public static void main(String[] args) {
		int number = 123456; // Eliminate the last digit of the no
		int count = 0;

		while (number > 0) {
			number = number / 10;
			count++;

		}

		System.out.println("Count of the Number is " + count);
	}

}
