package LambdaExpressionPractice;

public class Main {

	public static void main(String[] args) {

//		MyInter i = () -> System.out.println("Lambda using ");
//		i.sayHello();

		// Rule 1 using braces & type
		SumInter si1 = (int a, int b) -> {
			return a + b;
		};
		
		System.out.println("This is coming from rule 1 : " +si1.sum(2, 2));
		System.out.println("This is coming from rule 1 : " +si1.sum(4, 2));
		
		System.out.println("*********************************");
		//Rule 2 without using braces & type
		SumInter si2 = (a,b) -> a+b;

		System.out.println("This is coming from rule 2 : " +si2.sum(5, 2));
		System.out.println("This is coming from rule 2 : " +si2.sum(4, 4));
		
		LengthInter lengthInter = str -> str.length();
		System.out.println("Length of string is : " + lengthInter.getLength("Shaik"));
	}

}
