package MultithreadingByMutipleClassSynchronized;

public class HospitalApp {

	public static void main(String[] args) {
		
		Hospital h = new Hospital();
		
		Tom t = new Tom(h);
		Jerry j = new Jerry(h);
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(j);
		
		t1.start();
		t2.start();
	}
}


// Dead Lock : Dead lock is the scenario in which multiple threads will get stuck in the block state forever. In this scenario
// the program execution will not proceed further means it will not be terminated & multiple threads will be in block state.

// It is the programmers responsibility to write the code in such a way that multiple threads will not have the dependency 
// on each other. So dead lock can only be resolved by writing the program in a correct way. 

// If dead lock is happening then it is the programmers mistake.


//Write a java program to create a calculator that performs four activities (+ - * /) your duty is to write a program in such a
//way that it takes input from the users & performs activities of the calculator parallelly ( Mutithreaded environment) 
//1. Achieve mutithreading by extending the thread class
//2. Achieve mutithreading by implementing the runnable interface
//3. Achieve mutithreading by using single run method



