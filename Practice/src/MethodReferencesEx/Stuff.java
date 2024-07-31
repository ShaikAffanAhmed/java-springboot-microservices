package MethodReferencesEx;

public class Stuff {

	public static void dostuff() {
		System.out.println("Coming from Stuff1 class");
	}

	public static void threadTask() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i * 2);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void printNumber() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
