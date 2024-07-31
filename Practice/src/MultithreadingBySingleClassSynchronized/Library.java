package MultithreadingBySingleClassSynchronized;

public class Library implements Runnable{

	@Override
	synchronized public void run() {
		
		try {
			System.out.println(Thread.currentThread().getName()+" is taking the JAVA Book");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" is reading the JAVA Book");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" is returning the JAVA Book");
			Thread.sleep(3000);
		} 
		catch (Exception e) {
		e.printStackTrace();
		}
	}
}
