package practiceExamples;
import java.util.*;

public class Example {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,3,5,4,6);
		//1)
		Integer sum = list.stream()
				.reduce(0,(ans , i)->(ans+i)); //20
		
		//2)
		int sum1 =0;
		for(Integer list2 : list) {
			
			sum1 += list2;
			
		}
		int sum2 =0;
		for( int i =0; i < list.size() ; i++) { //0 1 2 3 4 
			sum2 +=list.get(i);
		}
		System.out.println(sum2);
		
		 Optional<Object> of = Optional.of(null);
		 if(of.isEmpty()) {
			 System.out.println("dhnddjd");
		 }else {
			 System.out.println("kjdjdjdfjdj");
		 }
	}
}
