package programs;

public class Reversestring {

	public static void main(String[] args) {
		/*Independent
		String str= "Nikhil";

		String Rev= new StringBuffer(str).reverse().toString();
		System.out.println(Rev);
	}
*/
	String str = "Nik";

    // convert String to character array by using toCharArray

    char[] result = str.toCharArray();
    //iteration
 
    for (int i = result.length - 1; i >= 0; i--)

     // print reversed String

        System.out.print(result[i]);

	}
}
