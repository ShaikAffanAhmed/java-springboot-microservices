package CollectionFramework;

import java.util.*;

public class TraditionalForLoopTraverse {

	public static void main(String[] args) {
		
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		for(int i=0; i<=al1.size()-1;i++)
		{
			System.out.print(al1.get(i)+ " ");
		}
		System.out.println("\n **********");
		// ************************************************
		
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		for(int i=0; i<=ll.size()-1;i++)
		{
			System.out.print(ll.get(i)+ " ");
		}
		System.out.println("\n **********");
		// ************************************************
		
		ArrayDeque ad1 = new ArrayDeque();
		ad1.add(10);
		ad1.add(20);
		ad1.add(30);
		ad1.add(40);
		ad1.add(50);
//		for(int i=0; i<=ad.size()-1;i++)
//		{
//			System.out.println(ad.get(i));
//		}
		
		int [] arr = new int [5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		for(int x:arr)
		{
			System.out.print(x + " ");
		}
		System.out.println("\n **********");
		
		ArrayDeque ad2 = new ArrayDeque();
		ad2.add(10);
		ad2.add(20);
		ad2.add(30);
		ad2.add(40);
		ad2.add(50);
		for (Object x:ad2)
		{
			System.out.print(x + " ");
		}
		System.out.println("\n **********");
		
		ArrayList al2 = new ArrayList();
		al2.add(10);
		al2.add(20);
		al2.add(30);
		al2.add(40);
		al2.add(50);
	
		Iterator itr = al2.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+ " ");
		}
		System.out.println("\n **********");
		
		ArrayList al3 = new ArrayList();
		al3.add(10);
		al3.add(20);
		al3.add(30);
		al3.add(40);
		al3.add(50);
	
		ListIterator litr = al3.listIterator();
		while(litr.hasNext())
		{
			System.out.print(litr.next()+ " ");
		}
		System.out.println("\n **********");
		
		// DescendingIterator
		ArrayDeque ad3 = new ArrayDeque();
		ad3.add(10);
		ad3.add(20);
		ad3.add(30);
		ad3.add(40);
		ad3.add(50);
		
		Iterator ditr = ad3.descendingIterator(); 
		{
			while (ditr.hasNext()) 
		{
			System.out.print(ditr.next()+ " "); 
		}
			System.out.println("\n **********");
		}
		
		ArrayList al4 = new ArrayList();
		al4.add(10);
		al4.add(20);
		al4.add(30);
		al4.add(40);
		al4.add(50);
		
		ListIterator Litr = al4.listIterator(al4.size()); 
		{
			while (Litr.hasPrevious()) 
		{
			System.out.print(Litr.previous()+ " "); 
		}
			System.out.println("\n **********");
		}
	}
	
}
