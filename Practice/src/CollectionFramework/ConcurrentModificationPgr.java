package CollectionFramework;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationPgr {

	public static void main(String[] args) {
		
		/*
		// Concurrent Modification Or Structural Modification 
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		int count = 60;
		
		// Traditional for loop cannot detect the Structural modification hence it results in infinite loop 
//		for(int i=0; i<=al.size()-1; i++)
//		{
//			System.out.print(al.get(i)+ " ");
//			al.add(count);
//			count+=10;
//		}
		
		// ******  Fail fast *******
		for (Object x : al)
		{
		  System.out.print(x + " ");
		  al.add(count);
		  count+=10;
		}
		*/
		
		
		CopyOnWriteArrayList cwal = new CopyOnWriteArrayList();
		cwal.add(10);
		cwal.add(20);
		cwal.add(30);
		cwal.add(40);
		cwal.add(50);
		int count = 60;
		
		// Fail fast
		for (Object x : cwal)
		{
		  System.out.print(x + " ");   //  10 20 30 40 50 
		  cwal.add(count);
		  count+=10;
		}
		System.out.println();
		System.out.println(cwal);  //  [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
	}
}
