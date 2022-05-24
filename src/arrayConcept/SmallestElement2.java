package arrayConcept;

public class SmallestElement2 {

	public static void main(String[] args) {
		int arr[]=new int [] {1, 2, 3,4,5};
		int min=arr[0]; //1 
		
		
		for(int i=1;i<arr.length;i++) {  
			if(min>arr[i]) {               // 1>2 , 3>1 v, 4>3       
				
				min=arr[i];
			}
		}
			System.out.println("Smallest Number is " +min);
			
		
		
	}

}
