package MultithreadProducerConsumer;

public class Factory {

	int x;
	boolean status = false;
	
	synchronized public void put(int a)
	{
		try 
		{
			if(status == true)
			{
				x=a;
				System.out.println("The value stored in x is:" + x);
				status = true;
				notify();
			}
			else {
				wait();
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	
	synchronized public void get()
	{
		try 
		{
			if(status == true)
			{
				System.out.println("The value got from x is:"+ x);
				status = false;
				notify();
			}
			else {
				wait();
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
}
// Scenario:
// There are two threads producer consumer both are working in factory producer works is produce number & consumer works
// is to consume the number The problem is producer keeps on producing number without checking consumer has consumed or not
// & consumer keeps on consuming number without checking producer has produce or not this is happening because of there is 
// no Interthread communication

// Solution:
// In the above program we are providing producer_consumer scenario solution by creating Interthread communication using
// wait & notify method in the synchronized environment.

// wait method will send the thread to wait state & notify method will take out the thread from the wait state.

// In other words producer should produce the number if consumer has consume other wise it should wait & consumer should
// consume the number if producer has produced other wise it should wait.
