package CollectionFramework;

import java.util.*;

public class MapExamples {

	public static void main(String[] args) {
		/*
		TreeMap tm1 = new TreeMap();
		tm1.put(1, "Java");
		tm1.put(4, "SQL");
		tm1.put(3, "HTML");
		tm1.put(2, "CSS");
		tm1.put(5, "Python");
		System.out.println(tm1);   // {1=Java, 2=SQL, 3=HTML, 4=CSS, 5=Python}
		
		TreeMap tm2 = new TreeMap();
		tm2.put(1, "Mango");
		tm2.put(3, 20);
		tm2.put(5, 40);
		tm2.put(2, true);
		tm2.put(4, 48.24f);
		System.out.println(tm2);  // {1=Mango, 2=true, 3=20, 4=48.24, 5=40}
		
		TreeMap tm3 = new TreeMap();
		tm3.put(1, "Mango");
		tm3.put("Key-1", 20);
		tm3.put(5, 40);
		tm3.put(34.5f, true);
		tm3.put(false, 48.24f);
		System.out.println(tm3);  // ClassCastException
		*/
		
//		TreeMap<Integer, String> tm4 = new TreeMap<Integer, String>();
//		tm4.put(1, "Mango");
//		tm4.put("Key-1", 20);   //Error
//		tm4.put(5, "Apple");
//		tm4.put(34.5f, true);   //Error
//		tm4.put(false, 48.24f);  //Error
//		System.out.println(tm3);
		
		// ****************************************************************************
		
		/*
		HashMap hm1 = new HashMap();
		hm1.put(11, "Java");
		hm1.put(42, "SQL");
		hm1.put(3, "HTML");
		hm1.put(21, "CSS");
		hm1.put(5, "Python");
		System.out.println(hm1);  // {3=HTML, 21=CSS, 5=Python, 42=SQL, 11=Java}
		
		HashMap hm2 = new HashMap();
		hm2.put(1, "Mango");
		hm2.put(3, 20);
		hm2.put(5, 40);
		hm2.put(2, true);
		hm2.put(4, 48.24f);
		System.out.println(hm2);  // {1=Mango, 2=true, 3=20, 4=48.24, 5=40}
		
		HashMap hm3 = new HashMap();
		hm3.put(1, "Mango");
		hm3.put("Key-1", 20);
		hm3.put(5, 40);
		hm3.put(34.5f, true);
		hm3.put(false, 48.24f);
		System.out.println(hm3);  // {1=Mango, Key-1=20, 5=40, false=48.24, 34.5=true}
		*/
//		HashMap<Integer, String> hm4 = new HashMap<Integer, String>();
//		hm4.put(1, "Mango");
//		hm4.put("Key-1", 20);   //Error
//		hm4.put(5, "Apple");
//		hm4.put(34.5f, true);   //Error
//		hm4.put(false, 48.24f);  //Error
//		System.out.println(hm4);
		
		// ****************************************************************************
		
		LinkedHashMap lhm1 = new LinkedHashMap();
		lhm1.put(11, "Java");
		lhm1.put(42, "SQL");
		lhm1.put(3, "HTML");
		lhm1.put(21, "CSS");
		lhm1.put(5, "Python");
		System.out.println(lhm1);  // {11=Java, 42=SQL, 3=HTML, 21=CSS, 5=Python}
		
		LinkedHashMap lhm2 = new LinkedHashMap();
		lhm2.put(1, "Mango");
		lhm2.put(3, 20);
		lhm2.put(5, 40);
		lhm2.put(2, true);
		lhm2.put(4, 48.24f);
		System.out.println(lhm2);  // {1=Mango, 3=20, 5=40, 2=true, 4=48.24}
		
		LinkedHashMap lhm3 = new LinkedHashMap();
		lhm3.put(1, "Mango");
		lhm3.put("Key-1", 20);
		lhm3.put(5, 40);
		lhm3.put(34.5f, true);
		lhm3.put(false, 48.24f);
		System.out.println(lhm3);  // {1=Mango, Key-1=20, 5=40, 34.5=true, false=48.24}
		
//		LinkedHashMap<Integer, String> lhm4 = new LinkedHashMap<Integer, String>();
//		lhm4.put(1, "Mango");
//		lhm4.put("Key-1", 20);   //Error
//		lhm4.put(5, "Apple");
//		lhm4.put(34.5f, true);   //Error
//		lhm4.put(false, 48.24f);  //Error
//		System.out.println(lhm4);
		
	}
}
