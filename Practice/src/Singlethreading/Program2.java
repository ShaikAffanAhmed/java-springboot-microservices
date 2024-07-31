package Singlethreading;

public class Program2 {

	public static void main(String[] args) {
		
		printNum();
		printChar();
		
	}
	
	public static void printNum()
	{
		System.out.println("Number Printing Started");
		for(int i=1 ; i<=5 ; i++)
		{
			System.out.println(i);
			try 
			{
				Thread.sleep(3000);
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println("Number Printing Ended");
	}
	
	public static void printChar()
	{
		System.out.println("Character Printing Started");
		for(char i='A' ; i<='E' ; i++)
		{
			System.out.println(i);
			try 
			{
				Thread.sleep(3000);
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println("Character Printing Ended");
	}
}

//OutPut
//Number Printing Started
//1
//2
//3
//4
//5
//Number Printing Ended
//Character Printing Started
//A
//B
//C
//D
//E
//Character Printing Ended

//Disadvantage of single threaded  Application

// In the above program there are two independent activities i.e printing the numbers & printing the characters. Both independent activities 
// are getting executed by a single thread due to which the CPU time is not getting utilized efficiently. Hence to utilize the CPU time 
// efficiently we should write the independent activities in MultiTthreaded environment.

