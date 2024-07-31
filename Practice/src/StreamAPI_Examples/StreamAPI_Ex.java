package StreamAPI_Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI_Ex 
{

	public static void main(String[] args) {

		// creating a list & filter all even number from list

		List<Integer> list1 = List.of(2, 4, 50, 37, 52, 67);

		List<Integer> list2 = new ArrayList<>();
		list2.add(12);
		list2.add(35);
		list2.add(23);
		list2.add(84);

		List<Integer> list3 = Arrays.asList(23, 567, 12, 677, 24);

		// list1
		// without stream
		List<Integer> listEven = new ArrayList<>();

		for (Integer i : list1) {
			if (i % 2 == 0) {
				listEven.add(i);
			}
		}
		System.out.println(list1);
		System.out.println(listEven);

		// using stream

//		Stream<Integer> stream = list1.stream();
//		List<Integer> newList1 = stream.filter(i -> i%2==0).collect(Collectors.toList());
//		System.out.println(newList1);

		List<Integer> newList2 = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(newList2);
		
		List<Integer> newList3 = list1.stream().filter(i->i>10).collect(Collectors.toList());
		System.out.println(newList3);
	}

}
