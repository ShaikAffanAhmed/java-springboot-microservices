package StreamAPI_Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObjectExample {

	public static void main(String[] args) {
		// Stream API - collection process
		// Collection / group of object

		// 1-blank
		Stream<Object> empStream = Stream.empty();
		empStream.forEach(e -> {
			System.out.println(e);
		});

		// 2-array, object, collection
		String names[] = { "Shaik", "Bob", "Dibya", "Sangam" };

		Stream<String> stream1 = Stream.of(names);
		stream1.forEach(e -> {
			System.out.println(e);
		});
		
		System.out.println("**********");

		// 3-builders

		Stream<Object> streamBuilder = Stream.builder().build();

		// 4
		IntStream stream = Arrays.stream(new int[] { 2, 4, 65, 3, 547 });
		stream.forEach(e -> {
			System.out.println(e);
		});
		System.out.println("**********");
		
		//5 - List , set
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(12);
		list2.add(34);
		list2.add(23);
		list2.add(78);
		
		Stream<Integer> stream2 = list2.stream();
		stream2.forEach(e -> {
			System.out.println(e);
		});
	}
}