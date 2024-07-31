package GenericsExampple;

public class BoxMain {

	public static void main(String[] args) 
	{
	
		Box<String> box = new Box<String>("This is generics main class");
		System.out.println(box.getValue());
		System.out.println(box.container.getClass().getName());
		
		Box<Integer> box1 = new Box<Integer>(121);
		System.out.println(box1.getValue());
		
		Box<Double> box2 = new Box<Double>(20.145);
		System.out.println(box2.getValue());
	}
}
