package MultithreadProducerConsumer;

public class FactoryApp {

	public static void main(String[] args) {

		Factory f = new Factory();
		Producer pr = new Producer(f);
		Consumer cr = new Consumer(f);
		
		pr.start();
		cr.start();
}
}

// Output

//The value of x is:498901
//The value of x is:498901
//The value of x is:498901
//The value of x is:498901
//The value of x is:498901
//The value of x is:498901
//The value of x is:498901
//The value stored in x is:498901
//The value stored in x is:498902
//The value stored in x is:498903
//The value stored in x is:498904
//The value stored in x is:498905
//The value stored in x is:498906

// The above scenario represents producer_consumer problem in which producer responsibility is to keep on producing a number
// & consumer responsibility is to keep on consuming the number produced by the producer.
// In this scenario the producer thread & consumer thread is not communicating with each other & hence producer thread keeps 
// Producing the number without checking whether consumer thread has consumed the number or not. In the same way 
// consumer thread keeps consuming the number without checking whether producer thread has produced the number or not.

