package MultipleInheritance;

public class DeveloperApp {

	public static void main(String[] args) {
	
		//Developer dv = new Developer();
		FrontEndTech fet = new Developer(); //Upcasting
        //dv.learnJava();
		//dv.learnHtml();
		fet.learnHtml();  //invoking the overridden method of child class
		//calling specialized method by doing downcasting
		((Developer)(fet)).learnJava();
	}
}

//Interface type reference can be used to achieve upcasting to support polymorphism, but using interface type reference the child specific 
//methods cannot be invoked directly. If child specific methods has to be called using the interface type reference then it can be done 
//by achiving downcasting.

//We cannot instantiate an interface 
//  Ex: public interface FronEndTech
//{  void learnHtml();}

//public class DeveloperApp
//{ public static void main(String args[]){
//{ FrontEndTech fet = new FrontEndTech();}}  Error because interfaces cannot be instantiated.


//If a class partially implement the interface the class must be declared as abstract class.
//Ex: public interface Vehicle
//{ void start();  
//  void stop();
//}

// Partially implements an interface
//abstract public class Car implements Vehicle
//{
//   providing the body for start()
//  public void start()  
//{ System.out.println("Car is getting Started");}
//   
//   not Providing the body for stop()
//} 


// Note1: In java a class can implement the interfaces & at the same time the class can extends another class provided first extends keyword
// is used & then implement key word is used.
// Note2: In java an empty interface can be created which do not have any variable or method. Such interfaces are also called as marker 
//interface & Tagged interface
//Ex:
//   public class Person implemetns Developer,Tester extends Musician  //Not Allowed
//   public class Person extends Musician implemetns Developer,Tester   // Allowed





