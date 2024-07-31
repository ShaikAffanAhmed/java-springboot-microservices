package EclipseAppByThreading;

public class EclipseApp {

	public static void main(String[] args) {
	
		Typing type = new Typing();
        Compilation comp = new Compilation();
        Saving sav = new Saving();
        
		//step 1
        //Daemon Thread
        comp.setDaemon(true);
        sav.setDaemon(true);
        
        type.start();
        comp.start();
        sav.start();

	}

}

// In the above program there are three activities that are typing, compilation & saving among these three activities the typing activity
// is considered as the main activity compilation and saving activities are considered as the background or supporting activities.

// Hence it means that after executing the main activity atleast once the background or supporting activities should be executed.
// This can be achieve by using the Daemon Threads.

//Daemon Threads: Daemon Threads are such Threads which are created to execute the background or supporting activities. In other words
// Daemon threads will be executed atleast once after executing the non-Daemon threads.

// Steps to created the Daemon Threads:
// 1. The Daemon thread activity should be placed in the infinite loop.
// 2. The Daemon thread status should be set as true.

// Achieving MultiThreding by using single run method

