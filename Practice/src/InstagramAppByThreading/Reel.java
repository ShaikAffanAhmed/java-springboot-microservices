package InstagramAppByThreading;

public class Reel extends Thread{

	@Override
	public void run()
	{
		try
		{
			System.out.println("Creating a Reel");
			Thread.sleep(3000);
			System.out.println("Posting  the Reel");
			Thread.sleep(3000);
			System.out.println("Reel is uploaded");
			Thread.sleep(3000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
