package practiceExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Practice {
	
	public static void main(String[] args) {
	//	Integer arr[] = {5 ,4,3,2,0};
		List<Integer> list = Arrays.asList(5 ,4,3,2,0,19) ;
		System.out.println(list);
		//1)map
		
		List<Integer> square = list.stream()
				.map( i -> i*i) //intermediate operation
				.collect(Collectors.toList());//terminal operation
		
		System.out.println(square);
		
		//2)filter()
		
		List<Integer> filtered  = list.stream()
				.map( i -> i*i)
				.filter( f -> f %2 ==0)//intermediate operation
				.collect(Collectors.toList());//terminal operation
		System.out.println(filtered);
		
		//3)sorted 
		List<Integer> sorted   = list.stream()
				.map( i -> i*i)
				.filter( f -> f %2 ==0)
				.sorted((o1 ,o2) -> o1-o2)//intermediate operation + ,-, 0
				.collect(Collectors.toList());//terminal operation
		System.out.println(sorted);
		
		//4)reduce
		
		Integer reduce = list.stream()
				.filter( l -> l%2 ==0)//2 ,4
				.reduce(0,(ans ,i) ->i+ans);  //ans =0  0+2 =2   2+4 =6
		System.out.println(reduce);
		
	}
	

}
