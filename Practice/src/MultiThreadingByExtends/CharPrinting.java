package MultiThreadingByExtends;

public class CharPrinting extends Thread{

	public void run()
	{
		System.out.println("Character printing started");
		for(char i='A'; i<='E'; i++)
		{
			System.out.println(i);
			try
			{
			Thread.sleep(3000);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Character printing ended");
	}
}
