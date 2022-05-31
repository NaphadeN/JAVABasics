package oopsConcepot;

public class MethodOverloading {
// MethodOverloading : When method name is same with different argument or different input parameters within same class
// Cannot create same method inside the method	
// duplicate Methods are allowed but different arguments or input parameters
// Can we Overload Main Method --> Yes by different argument 
	
	
	
	
	public static void main(String[] args) {
		MethodOverloading obj= new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(12, 12);
		obj.sum("N");
		
	}

	public void sum() { // 0 - input parameter

	
	}

	public void sum(int i) { // having 1 input parameters

		System.out.println("Sum Method -- one  Parameters : " +i);

	}

	public void sum(int j, int k) { // having 2 input parameters

		System.out.println("Sum Method -- two Parameters :" +(j+k));
	}
	
	
	
	public void sum(String L) { // having 1 input parameters

		System.out.println("Sum Method -- one  Parameters : " +L);

	}
	
	public static void main(String S) { // Rare case only.Can we Overload Main Method --> Yes by different argument
	
}
}
