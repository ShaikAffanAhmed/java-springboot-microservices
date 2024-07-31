package LambdaExpressionPractice;

public class ThreadDemo {

	public static void main(String[] args) {
		// First Thread
		
		Runnable thread1 = ( ) -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Value of i is :" + i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread t1 = new Thread(thread1);
		t1.setName("Affan");
		t1.start();
		
		
		Runnable thread2 = ( ) -> {
			for(char i='A';i<='E';i++)
			{
				System.out.println("char is :"+ i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t2 = new Thread(thread2);
		t2.start();
	}
}
