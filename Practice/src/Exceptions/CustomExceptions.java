package Exceptions;

import java.util.Scanner;

//Scenario 1 : Considered that there are 10000 rupees in an account & user trying to withdraw the amount if withdrawal amount is lesser 
//than 10000 then amount can be given otherwise an exception should be generated as "InsufficientBalanceException"

public class CustomExceptions {
 
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount to be withdrawn");
		int amount = scan.nextInt();
		try
		{
			//calling the transfer which throws custom exception 
			transfer(amount);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void transfer(int amount) throws Exception
	{
		if(amount<10000)
		{
			System.out.println("Amount is taken");
		}
		else {
			// Creating object of custom exception & throwing it to caller method
			   throw new InsufficientBalanceException();
		}
	}
}

// CustomExceptions : Java provides few inbuilt exception classes which are useful to handle the exceptions in few scenarios but if 
// programmer requires to create a new exception then it can be done by using CustomException.
// CustomExceptions are the user defined exceptions which are created by creating a normal java class & extending this class to in built 
// exception class.





