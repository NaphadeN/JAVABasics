package programs;

public class RemoveWhiteSpaces {
	public static void main (String [] args) {
		
		String Str= "Nage Bol Raha HAi ";
		//String Str2;
		Str=Str.replaceAll("\\s", "");
		System.out.println(Str);
		//System.out.println(Str2);
		}


}

