package CollectionFramework;

import java.lang.reflect.Array;
import java.util.*;

public class MapViewsExample {

	public static void main(String[] args) {
		
		TreeMap tm = new TreeMap();
		tm.put(1, 10);
		tm.put(3, 30);
		tm.put(5, 50);
		tm.put(2, 20);
		tm.put(4, 40);
		System.out.println(tm);   // {1=10, 2=20, 3=30, 4=40, 5=50}
		
		Set keys = tm.keySet();   // Accessing only Keys
		for (Object x:keys)
		{
			System.out.print(x + " ");  // 1 2 3 4 5 
		}
		System.out.println();
		
		Collection value = tm.values(); // Accessing only Values
		for (Object x : value) 
		{
		   System.out.print(x + " ");	//  10 20 30 40 50  
		}
		System.out.println();
		
		Set key_value = tm.entrySet();  // Accessing both Keys & Values
		for (Object x : key_value)
		{
		   System.out.print(x + " ");	// 1=10 2=20 3=30 4=40 5=50 
		}
		System.out.println();
						
	}
}
