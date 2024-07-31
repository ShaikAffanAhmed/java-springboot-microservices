package Exceptions;

import java.util.Scanner;

public class ExceptionPrograms1 {

	public static void main(String[] args) {

		System.out.println("Program execution strated");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = scan.nextInt();
		System.out.println("Enter secont number");
		int b = scan.nextInt();
		int c = a / b;
		System.out.println(c);
		System.out.println("Program execution ended");
	}
}

// Exception : Exception is an event due to which a program is terminated abroply(abnormaly). In other words if in a program an exception 
// is created then control will be send outside the program to the default exception handler. Where default exception handler will handle
// the exception but the program will not be executed for that which results in abnormal termination of program.

// In the above program the exception is getting handled by default exception handler due to which the program is getting terminated
// abnormally hence it is always recommended for the programmer to handled the exception by using user defined exception handlers.

// User defined exception handlers are the meachanism which insures that if exceptions are occuring in the program then they are getting 
// handled by try & catch block & also program will not be terminated abnormally.
//Ex : 

//public class ExceptionPrograms1 {
//
//	public static void main(String[] args) {
//		try {
//		System.out.println("Program execution strated");
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter first number");
//		int a = scan.nextInt();
//		System.out.println("Enter secont number");
//		int b = scan.nextInt();
//		int c = a/b;
//		System.out.println(c);
//		}
//		catch(Exception e)
//		{
//			System.out.println("Exception is handled");
//		}
//		System.out.println("Program execution ended");
//	}
//}

// The statements which might generate the exception should be placed inside the try block. 
// The statements which has to be executed after handling the exception should be placed inside the catch block.
// try block is always executed irrespective of exception is generated or not.
// catch blocks are executed only if the exceptions are generated.

// finally block : the statements which are mandetory to get executed should be placed inside the finally block because finally blocks
// are always executed irrespective of exception are getting generated or not.

// Ex :

//public class ExceptionPrograms1 {
//
//	public static void main(String[] args) {
//		try {
// statements which might generate exception
//		System.out.println("Program execution strated");
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter first number");
//		int a = scan.nextInt();
//		System.out.println("Enter secont number");
//		int b = scan.nextInt();
//		int c = a/b;
//		System.out.println(c);
//		}
//		catch(Exception e)
//		{
// statements to be executed after handling the exception
//			System.out.println("Exception is handled");
//		}
//		finally
//      {
// critical statements which are mandetory to be executed
//          System.out.println("Program execution ended");
//      }
//	}
//}

// If an exception is handled by default exception handler then it will lead to abrop termination of program but it will display
// specific message for every exception.
// If an exception is handled by user defined exception handler then the program will not be terminated abnormally but it will not able 
// to display the specific messages for the exceptions.
// Hence in such scenarios where program should be terminated normally & specific messages should be displayed for all the exception 
// printstacktrace method should be used.

//Ex :

//public class ExceptionPrograms1 {
//
//	public static void main(String[] args) {
//		try {
//		System.out.println("Program execution is strated");
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter numerator");
//		int a = scan.nextInt();
//		System.out.println("Enter denominator");
//		int b = scan.nextInt();
//		int c = a/b;
//		System.out.println("Division result is " +c);
//      System.out.println("Enter the size to create an array");
//      int size = scan.nextInt();
//      int [] arr = new int[size];
//      System.out.println("Enter the element to be stored in array");
//      int elem = scan.nextInt();
//      System.out.println("Enter the index at which element has to be stored");
//      int index = scan.nextInt();
//  	arr[index] = elem;
//		System.out.println("Element is inserted in the array");
//		}
//		catch(Exception e)
//		{
//  	e.printStackTrace();
//		}
//		finally
//      {
//        System.out.println("Program execution is ended");
//      }
//	}
//}

// printStackTrace method will print the specific messages which are predefined. If programmer want to print the specific messages
// for every exception which is not predefined then multiple catch block hierarchy has to be used. 

//Ex :

//public class ExceptionPrograms1 {
//
//	public static void main(String[] args) {
//		try {
//			System.out.println("Program execution is strated");
//			Scanner scan = new Scanner(System.in);
//			System.out.println("Enter numerator");
//			int a = scan.nextInt();
//			System.out.println("Enter denominator");
//			int b = scan.nextInt();
//			int c = a / b;
//			System.out.println("Division result is " + c);
//			System.out.println("Enter the size to create an array");
//			int size = scan.nextInt();
//			int[] arr = new int[size];
//			System.out.println("Enter the element to be stored in array");
//			int elem = scan.nextInt();
//			System.out.println("Enter the index at which element has to be stored");
//			int index = scan.nextInt();
//			arr[index] = elem;
//			System.out.println("Element is inserted in the array");
//		} 
//       ===========================================================

           // specific catch block to handle ArithmeticException
//           catch(ArithmeticException ae)
//           {
//        	   System.out.println("Do not provide 0 in denominator");
//           }
   		   // specific catch block to handle ArrayIndexOutOfBoundsException
//          catch(ArrayIndexOutOfBoundsException aioe)
//          {
//        	  System.out.println("Provide valid index for array");
//          }

           //specific catch block to handle NegativeArraySizeException
//       	catch(NegativeArraySizeException nase)
//       	{
//       	  System.out.println("Do not provide negative size for array");
//       	}

            //generic catch block
//          catch(Exception e)
//          {
//            System.out.println("Exception is handled");
//          }
//          finally
//          {
//            System.out.println("Program execution is ended");
//          }
//	}
//}

// In the above program we are using the specific catch blocks to handle the specific exceptions & if any exception will not able to 
// handled by specific catch block, it will be handled by the generic catch block.
// The generic catch block should always be placed after the specific catch blocks. If it is placed before specific catch blocks then 
// it will generate compile time error. Because all the exceptions will be handled by generic catch block only then specific catch 
// blocks will not have any use.

// Errors are the events which happens due to incorrect logic of the program.
// Errors should not be handled

//class ExceptionPrograms1
//{
//   static void display()
//  {
//      display();
//  }
//  public static void main(String[] args) 
//  {
//    display();
// }
//}
//  Output: stackOverFlowError

// Types of exception : There are two types of exception 
// 1. Checked Exceptions  & 2. Unchecked Exceptions

// Checked Exceptions : Checked Exceptions are such exceptions which are mandetory for the programmer to handle, if these exceptions
// are not handled than it results in compile time error. 
// In other words Checked Exceptions are forced by the java compiler to be handled.

// UnChecked Exceptions : UnChecked Exceptions are such exceptions which are not mandetory to be hanlded & java compiler will not forced 
// to handled these exceptions. In other words if these exceptions are not handled then it will not result in compilation error & the
// Exceptions will be handled by default exceptions handler. 

