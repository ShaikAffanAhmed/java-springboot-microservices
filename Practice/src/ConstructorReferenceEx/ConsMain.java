package ConstructorReferenceEx;

public class ConsMain {

	public static void main(String[] args) {

		System.out.println("learning constructor reference");
		
		//through lambda expression
//		Provider provider = () -> {return new Student();};
		
		//through constructor 
		Provider provider = Student::new;
		
		Student student = provider.getStudent();
		student.display();
	}
}
