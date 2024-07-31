package AbstractionProject;

abstract class Car {

    void start()
	{
		System.out.println("Car is getting Started");
	}
	
	void stop()
	{
		System.out.println("Car is getting Stopped");
	}
	
	abstract void refule();
}

//What is Abstract class
//Ans: An abstract class is such a class for which objects cannot be created also according to rules of java if a class consist of
//abstract method then it is mandetory to declare the class as abstract class
//Ex :

class ProgramApp
{
  public static void main(String[] args) {
	
	  //cannot create the object of the abstract class
	  //Car cr = new Car();
}	
}

//Although we cannot create the object of the abstarct class but we can create the reference of the abstract class.
//This is allowed so that upcasting can be achive & polymorphism can be achive
//Q.Can we declare an abstract method is final?
//Ans. No. an abstract method cannot be declared as final method because if it is declared as final then it cannot be overriden. 
//Q.Can we declare an abstract class is a final class?
//Ans. No. abstarct class cannot be declared as final class because an abstarct class should be inherited by a child class to provide the
// body for its abstract methods And If it is declared as final than it cannot be inherited & hence the abstarct methods cannot be overriden.
//Q.Can an abstract class contains final concrete method?
//Ans. Yes. an abstract class can consist of final concrete methods.

//Limitations of Abstract class
//* An abstract class cannot be used to achive 100% abstraction means pure abstraction because it can contain concrete methods also.
//* By using the abstract class we cannot achive multiple inheritance beacuse java doesnot support multiple inheritance by using the class.
//* Because of above two disadvantages of abstract class interfaces were introduce because of using interfaces we can achive 100% abstraction
// And also multiple inheritance can be achive.
// * Interfaces are created by using the interface key word.
