package Singlethreading;

public class Program1 {

	public static void main(String[] args) {
		
		//Accessing the currently executing Thread Object
		Thread t = Thread.currentThread();
		
		//Printing the Thread name, Thread priority & Thread Group name
		System.out.println(t);  // Thread[main,5,main]
		
	}
}

//MultiThreading : 
// In first Scenario the computer is having an operating system which can execute a single task at any given point of time
// bcz it is single tasking operating system. In this the working of computer becomes very slow bcz at any given time the computer was able to
// execute only single task.

// In second scenario the solution was provided for single tasking by including multiple processors but it created two other problems 
// 1. Computers cost was increased  2. Computers space was increased. 

// In third scenario a single operating system is used which is multitasking operating system & a single processor is used & we are able to
// achieve multitasking bcz of the operating system. Multitasking is the process of parallel execution of multiple task over a certain period 
// of time by switching b/w the task very very fast which is done by OS.
// This switching b/w the task are so fast that the programmer or user feels that multiple task are executed at the same time.

// Advantages
// 1. Multitasking is very efficient bcz its makes use of CPU time in the best way possible.
// 2. This approach is cost effective bcz single processor is used to perform multitasking.

// In fourth scenario we are achieving multitasking on the thread level i.e MultiThreading. 
// A thread level multitasking involves multiple threads of a single process executing parallelly sharing the same memory space yet executing
// independently. This approach improves the CPU time uses in more efficient way bcz any independent activity is wasting the time of CPU 
// then immediately the second independent activity in the same task will be executed.

//Ex 1: 

// While printing the details of a thread current thread method is used which will print three information about the thread that is 
// the thread name , priority of the thread & thread group name. Whenever program is executed by default automatically a thread will be 
// created whose responsibility is to execute the content is present in the call stack. this thread name by default will be main thread.
// By default this thread will have the priority have 5 (It is the normal priority)

//public class Program1 {
//
//	public static void main(String[] args) {
//		
//		//Accessing the currently executing Thread Object
//		Thread t = Thread.currentThread();
//		
//		//Printing the Thread name, Thread priority & Thread Group name
//		System.out.println(t);  // Thread[main,5,main]
//	}
//}



//Ex 2: Changing the thread name & thread priority

//public class Program1 {
//
//	public static void main(String[] args) {
//		
//		//Accessing the currently executing Thread Object
//		Thread t = Thread.currentThread();
//		
//		//Printing the Thread name, Thread priority & Thread Group name
//		System.out.println(t);  // Thread[main,5,main]
//		
//		//Changing the Thread name
//		t.setName("My Thread");
//		
//		//Changing the Thread priority
//		t.setPriority(9);
//		
//		//Printing the Thread name, Thread priority & Thread Group name
//		System.out.println(t); // Thread[My Thread,9,main]
//	}
//}


