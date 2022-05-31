package inheritence;

public class BMW extends Car{  //BMW is Child Class. BMW having all access in Car Method Class + Methods in BMW Class (theftsaftey)
	
	//When same methods present in child class as well as in parent class with same name and same name of argument , is called Method Overriding.
	
	
	public void start() {
		System.out.println("start");  //Overridden Method
	}
	
	public void stop() {
		System.out.println("stop");
		}

	
	public void theftsaftey() {
		System.out.println("thefstaftey");
	}
}
