package StreamAPI_Examples;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {

	public static void main(String[] args) {

		// Filter method

		List<String> names = List.of("Ankit", "Shaik", "Ahmed", "Ash", "Sha");
		List<String> filteredNames = names.stream().filter(i -> i.endsWith("a")).collect(Collectors.toList());
		System.out.println(filteredNames);

		// Map method

		List<Integer> numbers = List.of(23, 4, 5, 6, 8);
		List<Integer> squareNumbers = numbers.stream().map(i -> i * i).collect(Collectors.toList());
		System.out.println(squareNumbers);
		
		// forEach method
		
		squareNumbers.stream().forEach(System.out::println);
		
		// sort method
		numbers.stream().sorted().forEach(System.out::println);
		
		// min method
		Integer integer = numbers.stream().min((x,y) -> x.compareTo(y)).get();
		System.out.println("Minimum value " + integer);
	
		//max method
		Integer integer2 = numbers.stream().max((x,y) -> x.compareTo(y)).get();
		System.out.println("Maximum value " + integer2);
		
		
	}
}
