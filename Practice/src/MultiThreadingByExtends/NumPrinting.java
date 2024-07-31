package MultiThreadingByExtends;

public class NumPrinting extends Thread{

	public void run()
	{
		System.out.println("Number printing started");
		
		for(int i=1 ; i<=5; i++)
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
		System.out.println("Number printing Ended");
	}
}
