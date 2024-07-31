package MultiThreadingByImplemets;

public class NumPrinting implements Runnable{

	public void run()
	{
		System.out.println("Number Printing Started");
		for(int i=1; i<=5; i++)
		{
			System.out.println(i);
			try
			{
			Thread.sleep(i);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Number Printing Ended");
	}
}
