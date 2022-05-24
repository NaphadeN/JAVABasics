package arrayConcept;

public class LargestElement {

	public static void main(String[] args) {
		int arr[]=new int [] {11, 62, 13, 14,15};
		int max=arr[0];   // 11 ,62
		
	System.out.println("Array if  Length is : "+arr.length);
	
		for(int i=1;i<arr.length;i++) {      
			if(arr[i]>max) {                
			
			                                   // 62>11 , 13>62, 14>62, 15>62
				
				max=arr[i];
			}
		}
			System.out.println("Largest Number is " +max);
					
	}

}
