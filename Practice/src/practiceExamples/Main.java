package practiceExamples;

public class Main {
	public static void main(String[] args) {
		
		/*
		 * class Example implements Runnable{ //funcational interface
		 * 
		 * public void run(){
		 * 
		 * }
		 * }
		 * */
		
		//lambda expression
		//	Runnable runnable	 = ()->System.out.println("child thread") ;

		
		//Thread t1 = new Thread(()->System.out.println("child thread"));
		Thread t1 = new Thread();
		
		t1.start();
		System.out.println("main thread ");

//annonymus class 
		Runnable runnable =  () -> {
			
			//statement 
			
		};
	}

}
