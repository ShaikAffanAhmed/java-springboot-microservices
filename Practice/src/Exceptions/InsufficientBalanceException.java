package Exceptions;

//Custom Exception
public class InsufficientBalanceException extends Exception{

	public InsufficientBalanceException()
	{
	super("Amount is more than balance");
	}
	
}
