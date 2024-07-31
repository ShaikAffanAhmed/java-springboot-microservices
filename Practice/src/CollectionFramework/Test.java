package CollectionFramework;

import java.lang.reflect.Array;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("Java");
		al.add(98.78f);
		al.add(true);
		System.out.println(al);
		
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add("Java");
		ll.add(98.78f);
		ll.add(true);
		System.out.println(ll);
		
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add("Java");
		ad.add(98.78f);
		ad.add(true);
		System.out.println(ad);
		
		ArrayList AL = new ArrayList();
		AL.add(10);
		AL.add(20);
		AL.add(30);
		AL.add(40);
		AL.add(50);
		System.out.println(AL);
		AL.add(2, 99);
		System.out.println(AL);
		
		LinkedList LL = new LinkedList();
		LL.add(10);
		LL.add(20);
		LL.add(30);
		LL.add(40);
		LL.add(50);
		System.out.println(LL);
		LL.add(2, 99);
		System.out.println(LL);
		
		ArrayDeque AD = new ArrayDeque();
		AD.add(10);
		AD.add(20);
		AD.add(30);
		AD.add(40);
		AD.add(50);
		System.out.println(AD);
		AD.addFirst(99);
		System.out.println(AD);
		AD.addLast(100);
		System.out.println(AD);
		
		PriorityQueue pq = new PriorityQueue();
		pq.add(40);
		pq.add(50);
		pq.add(20);
		pq.add(30);
		pq.add(10);  
		System.out.println(pq);
		
//		PriorityQueue PQ = new PriorityQueue();
//		PQ.add(10);
//		PQ.add(20);
//		PQ.add("Java");
//		PQ.add(98.45f);
//		PQ.add(true);
//		PQ.add('A');
//		System.out.println(PQ);	// Exception : ClassCastException
		
		PriorityQueue Pq = new PriorityQueue();
		Pq.add("JAVA");
		Pq.add("SQL");
		Pq.add("HTML");
		Pq.add("CSS");
		System.out.println(Pq);  // [CSS, HTML, JAVA, SQL]
		
		// Creating a PriorityQueue to store only integer values
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
//		pq1.add(10);
//		pq1.add("Java");  // Error
//		pq1.add(98.45f);  // Error
//		pq1.add(true);    // Error
//		System.out.println(pq1);
//		
//		// Creating a PriorityQueue to store only String values
//		PriorityQueue<String> pq2 = new PriorityQueue<String>();
//		pq2.add(10);      // Error
//		pq2.add("Java");  
//		pq2.add(98.45f);  // Error
//		pq2.add(true);    // Error
//		System.out.println(pq2);
		
		// Write a java program to create an object of Array List & store float type of values by using generics.
		ArrayList<Float> Al = new ArrayList<Float>();
		Al.add(12.45f);
		Al.add(18.35f);
		Al.add(98.42f);
		Al.add(24.21f);
		Al.add(81.57f);
		System.out.println(Al);
		Al.add(3, 27.21f);
		System.out.println(Al);
		
		// Write a java program to create an object of Linked List & store only Boolean type of values by using generics.
		LinkedList<Boolean> Ll = new LinkedList<Boolean>();
		Ll.add(true);
		Ll.add(false);
		Ll.add(false);
		Ll.add(true);
		System.out.println(Ll);
		Ll.add(1,true);
		System.out.println(Ll);
		
		// Write a java program to create object of Array Deque & store the character type of values by using generics.
		ArrayDeque<Character> Ad = new ArrayDeque<Character>();
		Ad.add('Z');
		Ad.add('A');
		Ad.add('C');
		System.out.println(Ad);
		Ad.addFirst('B');
		Ad.addLast('D');
		System.out.println(Ad);  
		
		TreeSet ts = new TreeSet();
		ts.add(30);
		ts.add(40);
		ts.add(20);
		ts.add(50);
		ts.add(10);
		System.out.println(ts);
		
//		TreeSet ts1 = new TreeSet();
//		ts1.add(30);
//		ts1.add(40);
//		ts1.add("Java");
//		ts1.add(48.32);
//		ts1.add(true);
//		System.out.println(ts1);  // ClassCastException
		
		TreeSet<Integer> ts2 = new TreeSet<Integer>();
//		ts2.add(30);
//		ts2.add(40);
//		ts2.add("Java");  // Error
//		ts2.add(48.32);	  // Error
//		ts2.add(true);    // Error
//		System.out.println(ts2);	
		
		
		//  AutoBoxing
		ArrayList AL1 = new ArrayList();
		//All the values stored in the ArrayList is getting stored
		// in the format of object by doing AutoBoxing
		
//		AL1.add(10);  // ---> AL1.add(new Integer(10));
//		AL1.add(20);  // ---> AL1.add(new Integer(20));
//		AL1.add(45.32F);  // ---> AL1.add(new Float(45.32F));
//		AL1.add(true);  // ---> AL1.add(new Boolean(true));
//		AL1.add("Java");  // ---> AL1.add(new String("Java"));
//		AL1.add('A');  // ---> AL1.add(new Character('A'));
	
		
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		al1.add(20);
		System.out.println(al1);  // [10, 30, 40, 50, 20]
		Collections.sort(al1);
		System.out.println(al1);  // [10, 20, 30, 40, 50]
		
		ArrayDeque ad3 = new ArrayDeque();
		ad3.add(10);
		ad3.add(30);
		ad3.add(40);
		ad3.add(50);
		ad3.add(20);
		System.out.println("ad3->" + ad3);    // ad3->[10, 30, 40, 50, 20]
		ArrayList al2 = new ArrayList();
		al2.addAll(ad3);  // [10, 20, 30, 40, 50]
		Collections.sort(al2);
		System.out.println("al2->" + al2);
		ad3.clear();
		ad3.addAll(al2);
		System.out.println("ad3->" + ad3);
		
		int RollNo = 1;
		String Name = "Shaik";
		float Percentage = 80.5f;
		
		ArrayList arr = new ArrayList();
		arr.add("Student RollNo is " +RollNo);
		arr.add("Student Name is " +Name);
		arr.add("Student Percentage is "+Percentage);
		System.out.println(arr);
	}
}


