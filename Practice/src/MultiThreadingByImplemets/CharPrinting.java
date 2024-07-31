package MultiThreadingByImplemets;

public class CharPrinting implements Runnable{

	public void run()
	{
		System.out.println("Character Printing Started");
		for(char i='A'; i<='E'; i++)
		{
			System.out.println(i);
			try
			{
			Thread.sleep(5000);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Character Printing Ended");
	}
}
