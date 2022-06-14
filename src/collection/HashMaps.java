package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMaps {

	public static void main(String[] args) {
		// hashMap is class implements Map Interface
		// extends AbstractMap
		//It contains only unique elements 
		// store the - key - value pair 

		// It may have one null key and multiple null values 
		// It maintains no order 
		
		
		HashMap<Integer,String> hm = new HashMap<Integer,String> ();
		
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "SQL");
		
		System.out.println("My value for 1st Key is " +hm.get(1));
		
		System.out.println("My value for 4th Key is " +hm.get(4));

		// How to Print all values using Hashmaps
		
		for (Entry m : hm.entrySet()) {
			System.out.println(m.getKey() +" " +m.getValue());
			
		}
		
		
	}

}
