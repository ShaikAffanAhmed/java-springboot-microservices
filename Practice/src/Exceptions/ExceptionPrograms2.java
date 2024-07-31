package Exceptions;

import java.util.Scanner;

public class ExceptionPrograms2 {

	public static void main(String[] args) {
		System.out.println("Calculation is started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = scan.nextInt();
		System.out.println("Enter second number");
		int b = scan.nextInt();
		multiply(a, b);
		System.out.println("Calculation is ended");
	}

	public static void multiply(int a, int b) {
		System.out.println("Multiplication is started");
		int mulres = a * b;
		System.out.println("Multiplication result is " + mulres);
		divide(a, b);
		System.out.println("Multiplication is Ended");
	}

	public static void divide(int a, int b) {
		System.out.println("Division is started");
		int divres = a / b;
		System.out.println("Division result is " + divres);
		System.out.println("Division is Ended");		
		}
}

// Propogation of Exception:Propogation of Exception is the process of transfering an exception generated in a method to its caller 
// method. This continues until the exception is handled by UDEH(userDefinedExceptionHandler) or If none of the methods are handeling
// the exception then the exception will be handled by default exception handler.
 
// Different ways of managing an exception. There are three different ways of managing exception
// 1.handling an exception  2. rethrowing an exception  3. ducking an exception

// 1.handling an exception : handling an exception is the process of managing the exception by using try & catch block in the same method
// were exception is genrated.

// Ex :
//public class ExceptionPrograms2 {
//
//	public static void main(String[] args) {
//		System.out.println("Calculation is started");
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter first number");
//		int a = scan.nextInt();
//		System.out.println("Enter second number");
//		int b = scan.nextInt();
//		multiply(a, b);
//		System.out.println("Calculation is ended");
//	}
//
//	public static void multiply(int a, int b) {
//		System.out.println("Multiplication is started");
//		int mulres = a * b;
//		System.out.println("Multiplication result is " + mulres);
//		divide(a, b);
//		System.out.println("Multiplication is Ended");
//	}
//
//	public static void divide(int a, int b) {
//		try {
//			System.out.println("Division is started");
//			int divres = a / b;
//			System.out.println("Division result is " + divres);
//		} catch (Exception e) {
//			System.out.println("Exception is handled in divide method");
//		}
//		System.out.println("Division is Ended");
//	}
//}


// In the above approch the exception is getting handled in the same method were it is generated & this information is not getting passed
// to its caller method.
// If this information above the exception has to be passed to its caller method then rethrowing the exception should be used.


