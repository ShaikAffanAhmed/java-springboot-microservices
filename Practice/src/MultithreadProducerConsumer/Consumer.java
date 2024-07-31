package MultithreadProducerConsumer;

public class Consumer extends Thread
{
     Factory f;
	
	public Consumer (Factory f)
	{
		this.f = f;
	}
	
	@Override
	public void run()
	{
		while(true)
		{
			f.get();
		}
   }
}

//Producer & Consumer problem :  