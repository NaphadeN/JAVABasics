package arrayConcept;

public class SingleDiementionForeachLoopforJavaArray3 {

	public static void main(String[] args) {
		int arr[]={33,3,4,5,89,73,111111};  
		//printing array using for-each loop  
		for(int i:arr)                         // Recommended because not showing ArrayIndexOutOfBoundsException
		System.out.println(i);  

	}

}
