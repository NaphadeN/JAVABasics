package oopsConcepot;

public class CallByValueCallByReference {

	int p;
	int q;
	
	
	public static void main(String[] args) {
	
		CallByValueCallByReference obj = new CallByValueCallByReference();
		int x=90;
		int y =100;
		
		System.out.println("---"+obj.Cricket(x, y));
		
		
		// Call by Value or Pass by value. Values of a and b assigned to x and y 
		
		obj.p=88;
		obj.q=55;
		obj.swap(obj);
		
		//after swap
		System.out.println(+obj.p +" " +obj.q);
		
	}
	
	public int Cricket(int a , int b) {
	
		a=20;
		b=30;
	int c = a+b;
	return c;
		
		
	}
	
	public void swap(CallByValueCallByReference t) { // Pass reference of the class. t is class reference
		                                            // Call By Reference is Possible in Java : Yes with help of OBJECT.
		
		int temp;
		
		temp =t.p;  //temp =88
		t.p=t.q;   // t.p=55 ----> Value of p
		
		t.q= temp;   //t.q=88   ----> Value of q 
		
		
		
		
		
	}

}
