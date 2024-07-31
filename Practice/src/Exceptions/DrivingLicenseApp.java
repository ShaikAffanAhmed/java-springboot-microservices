package Exceptions;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

//Scenario 2 : Considered that you are creating a project for applying driving license where you are asking age from the user.
//If age is lesser than 18 then under age exception should be created. If age is greater than 65 then over age exception is created.
//Otherwise driving license should be given.


//public class DrivingLicenseApp {
//
//	public static void main(String[] args) {
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the Age");
//		int age = scan.nextInt();
//		try
//		{
//			applylicense(age);
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());  //
//		}
//	}
//	
//	public static void applylicense(int age) throws Exception
//	{
//		if(age<18)
//		{
//			throw new UnderAgeException();
//		}
//		else if(age>65)
//		{
//			   throw new OverAgeException();
//		}
//		else {
//			System.out.println("Driving license issued");
//		}
//	}
//}

// Valid & InValid syntaxes of try,catch & finally

// Exception handling with method overriding 
// Rule 1: If parent class method is throwing an exception then the child class overriden method can throw the exception or don't throw Exception

//public class Parent {
//	public void display() throws Exception
//	{
//		System.out.println("Inside parent display");
//	}
//}
//
//public class Child1 extends Parent{
//	@Override
//	public void display()
//	{
//		System.out.println("Inside child1 display");
//	}
//}
//
//public class Child2 extends Parent{
//	@Override
//	public void display() throws Exception
//	{
//		System.out.println("Indide child2 display");
//	}
//}


//Rule 2: If parent class method is not throwing an exception then the child class overriden method can throw unchecked exception & it cannot
// throw checked exception.

//public class Parent {
//	public void display()    // parent method is not throwing an exception
//	{
//		System.out.println("Inside parent display");
//	}
//}
//
//class Child1 extends Parent{
//	@Override
//	public void display() throws RuntimeException   // can throw unchecked exception
//	{
//		System.out.println("Inside child1 display");
//	}
//}
//
//class Child2 extends Parent{
//	@Override
//	public void display() throws IOException   // Error, because cannot throw checked exception
//	{
//		System.out.println("Indide child2 display");
//	}
//}

//Rule 3: If parent class method is throwing an exception then child class method can throw same exception & it cannot throw a diff Exception

//Ex :

//public class Parent {
//	public void display()  throws IOException  
//	{
//		System.out.println("Inside parent display");
//	}
//}
//
//class Child1 extends Parent{
//	@Override
//	public void display() throws IOException    // can throw same exception
//	{
//		System.out.println("Inside child1 display");
//	}
//}
//
//class Child2 extends Parent{
//	@Override
//	public void display() throws SQLException    // cannot throw different exception
//	{
//		System.out.println("Indide child2 display");
//	}
//}


// Rule 4: If parent class method is throwing an exception then child class overriden methods can throw same or different exception provided
// they are unchecked exceptions.

//Ex :

//public class Parent {
//	public void display()  throws ArithmeticException  
//	{
//		System.out.println("Inside parent display");
//	}
//}
//
//class Child1 extends Parent{
//	@Override
//	public void display() throws ArithmeticException   
//	{
//		System.out.println("Inside child1 display");
//	}
//}
//
//class Child2 extends Parent{
//	@Override
//	public void display() throws ArrayIndexOutOfBoundsException   
//	{
//		System.out.println("Indide child2 display");
//	}
//}


// Rule 5: If parent class method is throwing an exception then child class method can throw a different exception which is not unchecked 
// Exception provided there is parent child relationship in between the exceptions.

//Ex :

//public class Parent {
//	public void display()  throws IOException  
//	{
//		System.out.println("Inside parent display");
//	}
//}
//
//class Child1 extends Parent{
//	@Override
//	public void display() throws FileNotFoundException    // can throw different exception bcz it is child class of IOException
//	{
//		System.out.println("Inside child1 display");
//	}
//}

