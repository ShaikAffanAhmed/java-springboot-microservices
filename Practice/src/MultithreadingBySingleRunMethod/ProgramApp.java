package MultithreadingBySingleRunMethod;

public class ProgramApp {

	public static void main(String[] args) {
		
		//Creating the Thread objects
		Program t1 = new Program();
		Program t2 = new Program();
		
		//Changing the thread object name
		t1.setName("Number");
		t2.setName("Char");
		
		//Calling the start() which calls run()
		t1.start();  //starting the thread for numPrinting
		t2.start();  //starting the thread for charPrinting
	}
}


// Thread life cycle or states of Threads