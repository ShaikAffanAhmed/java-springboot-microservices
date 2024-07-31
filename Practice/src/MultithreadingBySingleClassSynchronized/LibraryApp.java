package MultithreadingBySingleClassSynchronized;

public class LibraryApp {

	public static void main(String[] args) {
	 Library lb = new Library();
	 Thread t1 = new Thread(lb);
	 Thread t2 = new Thread(lb);
	 t1.setName("Tom");
	 t2.setName("Jerry");
	 t1.start();
	 t2.start();
	}
}


// Note: synchronized keyword : synchronized keyword is used to put a lock on the shared resource in Multithreading. This keyword
// can be used with a method or a block of code with which ever method or block the synchronized keyword is used they can be accessed
// by only single thread at any given point of time. Hence it works as a locking mechanism on the shared resourced.

// Output
//Tom is taking the JAVA Book
//Tom is reading the JAVA Book
//Tom is returning the JAVA Book
//Jerry is taking the JAVA Book
//Jerry is reading the JAVA Book
//Jerry is returning the JAVA Book

