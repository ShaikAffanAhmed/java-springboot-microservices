package MultiThreadingByExtends;

public class PrintingApp {

	public static void main(String[] args) {
		
		NumPrinting np = new NumPrinting();
		CharPrinting cp = new CharPrinting();
		
		cp.start();
		np.start();
	}
}


//MultiThreading can be achieve in two different ways 
//1. By extending the thread class    2. By implementing the runnable interface

// Output cannot be expected because MultiThreading depends on the thread scheduler. MultiThreading is the process of creating multiple 
// threads to execute the independent activities.

// In MultiThreading the independent activities should be kept inside the individual run methods & the run method should be placed inside
// the classes that extends the thread class.
// Multiple Threads can be created by creating the object of the thread child classes.
// If an object is created of thread class or a Thread child class it results in creating an extra call stack & an extra Thread to execute
// the component is present in the extra call stack.
// After creating the object of thread class the overridden run method should be called by calling start method.
// Whenever a start method is called it will internally calls the overridden run method & place its activation record in the extra call stack.
// Also its starts the execution of the threads.

// Achieving MultiThreading by implementing the runnable interface. 


