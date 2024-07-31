package MethodReferencesEx;

public class RefDemo {

	public static void main(String[] args) {

		System.out.println("Learning Method Reference");

		//referring static method
		//ClassName :: methodName
		WorkInter workInter = () -> { Stuff.dostuff();};
//				Stuff::dostuff;
		workInter.dotask();

		Runnable runnable = Stuff::threadTask;
		Thread t = new Thread(runnable);
		t.start();

		//referring non static method
		//Object :: methodName
//		Stuff st = new Stuff();
		Runnable runnable2 =  new Stuff()::printNumber;
		Thread t1 = new Thread(runnable2);
		t1.start();
	}
}
