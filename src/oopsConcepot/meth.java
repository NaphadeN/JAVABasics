package oopsConcepot;

public class meth {

	public static void main(String[] args) {
		
		meth C1= new  meth();
		
		C1.test();
		
	
		int R= C1.XYZ();
		
		System.out.println("Value for R is "+R);
		
		     String Q=   C1.qA();
		
		System.out.println("My Value for Q is : "+Q);

		
		
		
	}

	public int[] test() {
		
		int  we[] =  {1,2,3,3};
		
		for(int i=0;i<we.length;i++)//length is the property of array  
			
            //for(int i=a.length-1;i>=0;i--) {
System.out.println(we[i]); 
	
	return we;
	
	}
	
	public int XYZ() {
		
		int a = 10;
		int b = 20;
		int c = a + b;
		
		return c;
	}
	
	
	public String qA() {
		String s = "PUNE";
		System.out.println("qA Method");
		return s;

	}
	public int div(int x, int y) {
		System.out.println("Division Method");
		int f = x / y;
		return f;

	}
}
