package MultithreadingBySingleRunMethod;

//Achieving MultiThreading using single run method 
public class Program extends Thread {

	public void run() 
	{
		// Checking whether the thread name is "Number"
        if(Thread.currentThread().getName().equals("Number"))
       	{
        	// call numPrinting()
            numPrinting(); 	
       	}
        //otherwise
        else 
        {
        	// call charPrinting()
			charPrinting();
		}
	}
    
	//Method for numPrinting
	public void numPrinting() {
		System.out.println("Number printing started");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Number printing ended");
	}

	//Method for charPrinting
	public void charPrinting() {
		System.out.println("Character printing started");
		for (char i = 'A'; i <= 'E'; i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Character printing ended");
	}
}


