package MultiThreadingByImplemets;

public class PrintingApplication {

	public static void main(String[] args) {

		NumPrinting np = new NumPrinting();
		CharPrinting cp = new CharPrinting();
		
		Thread t1 = new Thread(np);
		Thread t2 = new Thread(cp);
		
		t1.start();
		t2.start();
	}
}


// In the above approach we are achieving MutiThreading by implementing the runnable interface in which if we created the object 
// of the classes which is implementing the interface it will not create the object of the Thread class. Hence in this approach we 
// manually have to create the object of the Thread class & assign the activity which has to be done by the Thread.


// For achieving MultiThreading the interface should be used if along with MultiThreading Multiple inheritance also should be achieve.