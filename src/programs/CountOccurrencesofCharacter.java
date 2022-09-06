package programs;

public class CountOccurrencesofCharacter {
    // How many Times the a is repeated in the String.
	 public static void main(String[] srgs) {  
		 
		String S= "Java Program is Good Languages";
		int Totallength= S.length();                // Total Length is  5 
		int TotalCount_AfterremoveSpace= S.replace("a", "").length();  
		
		int Count = Totallength - TotalCount_AfterremoveSpace;
		System.out.println("Final Number of Occurance is " +Count );
	 }
	
	
}
