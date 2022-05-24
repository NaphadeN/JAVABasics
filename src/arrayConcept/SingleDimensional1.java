package arrayConcept;

public class SingleDimensional1 {

	public static void main(String[] args) {
		int [] a=new int[5];//declaration  // also can write this :  int [] a
		a[0]=10;//initialization  
		a[1]=20;  
		a[2]=70;  
		a[3]=40;  
	    a[4]=50;  
    	//a[5]=90;   //ArrayIndexOutOfBoundsException
		//traversing array  
		for(int i=0;i<a.length;i++)//length is the property of array  [change value of i=1,22,3,....]
			                       //If we addi<=a.length. Equal then ArrayIndexOutOfBoundsException will appears
		System.out.println(a[i]);  
		System.out.println("Total Array Length are : "+a.length);
	}

}
