package InstagramAppByThreading;

public class InstagramApp {

	public static void main(String[] args) {

		try
		{
			System.out.println("Instagram app is opened");
		    Chatting ch = new Chatting();
		    Reel rl = new Reel();
		    ch.start();
		    rl.start();
		    ch.join();
		    rl.join();
			System.out.println("Instagram app is closed");
		}
		catch (Exception e) {
            e.printStackTrace();
		}
	}

}


// join method :  join method is used to join a thread with another thread in such a way that the thread with which another thread is 
// join will not complete its task until the joined thread will complete its task.
