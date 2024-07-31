package MultithreadingByMutipleClassSynchronized;

public class Jerry implements Runnable{

	Hospital h;
	
	Jerry(Hospital h)
	{
		this.h = h;
	}
	
	public void run()
	{
		h.jerryTreatement();
	}
}
