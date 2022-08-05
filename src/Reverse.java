import java.util.Iterator;

public class Reverse {

	public static void main(String[] args) {
		String Rev = "India";

		char[] Reverse = Rev.toCharArray();
		for (int i = Reverse.length - 1; i >= 0; i--) {
			System.out.println(Reverse[i]);

		}

	}

}
