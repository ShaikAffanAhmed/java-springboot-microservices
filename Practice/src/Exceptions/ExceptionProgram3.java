package Exceptions;

import java.util.Scanner;

public class ExceptionProgram3 {

	public static void main(String[] args) {
		shop();
	}

	static void shop() {
		System.out.println("Shopping is started");
		
		try 
		{
			pay();   // this method id rethrowing the exception so keep it in try-catch block
		} 
		catch (Exception e) 
		{
			System.out.println("Exception is handled in shop method");
		}
		finally 
		{
			System.out.println("Shopping is completed");
		}
	}

	static void pay() throws Exception { // Providing the warning to the caller method
		try 
		{
			System.out.println("Payment is started");
			Scanner scan = new Scanner(System.in);
			System.out.println("Entered the amount to be paid");
			int amount = scan.nextInt();
		} 
		catch (Exception e) 
		{
			System.out.println("Exception is handled in pay method");
			throw e; // rethrow the exception to its caller method
		}
		finally 
		{
			System.out.println("Payment is completed");
		}
	}
}
	
// rethrow Exception : rethrowing an Exception 

// In few scenarios it is important for a method to inform about the exception occurred to its caller method. 
// In such scenarios rethrowing an exception should be used. an exception can be rethrowing by using throw key word 
// & the method which is rethrowing an exception should provide the warning to its caller method by using throws key word

// rethrowing an exception : Is the  process of handling an exception in the method & then rethrowing an exception to the caller method.
// ducking an exception : Is the  process of a method not handling an exception & just passing it to its caller method for handling.
// In this scenario the method which is ducking the exception should provide the warning to its caller method so that caller method
// can handle the exception.

// Ex:

//public class ExceptionProgram3 {
//
//	public static void main(String[] args) 
//	{
//		try
//		{
//			System.out.println("Calculation is started");
//			Scanner scan = new Scanner(System.in);
//			System.out.println("Enter the first number");
//			int a = scan.nextInt();
//			System.out.println("Enter the second number");
//			int b = scan.nextInt();
//            divide(a,b);
//		}
//		catch (Exception e) {
//			System.out.println("Exception is handled in main method");
//		}
//		System.out.println("Calculation is ended");
//	}
//		public static void divide(int a , int b) throws Exception  //ducking an exception
//		{
//			int divres = a/b;
//			System.out.println("Division result is "+ divres);
//		}
//		
//}
// Write a java program to create a calculator which performs four activities (+,-,/,*) addition activity should be kept inside the add method
// which should duck an exception, subtraction activity should be kept in the subtract method which should handled the exception 
// multiplication activity should be kept in the multiply method which should handled the exception
// & division activity should be kept in the divide method which should rethrow an exception


