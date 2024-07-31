package DemoInterface;

public interface Demo1Interface {

	//public abstract method
	void display1();
	
	//default concrete method
	default void display2()
	{
		System.out.println("Inside default method");
	}
	
	//static concrete method
	static void display3()
	{
		System.out.println("Inside display3 method");
	}
	
	//private concrete method
	private void display4() {
		System.out.println("Inside display4 method");
	}
}

//Q. Can an interface contain a static block.
//A. Cannot have static block
//Q. Can an interface contain non static block.
//A. Cannot have non static block
//Q. Can an interface contain a constructor.
//A. Cannot have constructor
//Q. Can an interface contain main method.
//A. Yes.contain main method

//Difference b/w Abstract class & Interface
//1. Abstract classes are created by using abstract & class keyword.
//1. Interfaces are created by using Interface keyword.
//2. Using abstract classes multiple inheritance cannot be achieved.
//2. Using Interfaces multiple inheritance can be achieved.
//3. Abstract classes does not promotes 100% abstraction.
//3. Interfaces promotes 100% abstraction.
//4. Methods of abstract class are not public & abstract by default.
//4. Methods in interfaces are public & abstract by default.
//5. Variables in abstract class are not public,static, final variables by default.
//5. Variables in interfaces are public,static, final variables by default.
//6. In Abstract class static blocks, non static blocks & constructors can be present.
//6. In interfaces static blocks, non static blocks & constructors cannot be present.
//7. Abstract classes will have object class as its parent class by default.
//7. Interfaces do not have any parent as object class.


