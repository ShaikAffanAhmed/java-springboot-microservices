package EclipseAppByThreading;

public class Saving extends Thread {

	public void run()
	{
		try
		{
			//step 1
			for( ; ; )
		//for(int i=1; i<=5; i++)
		{
		System.out.println("Saving the code");
		Thread.sleep(3000);
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
