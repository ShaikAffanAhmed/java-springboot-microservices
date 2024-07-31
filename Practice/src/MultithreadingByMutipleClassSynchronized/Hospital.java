package MultithreadingByMutipleClassSynchronized;

public class Hospital {

	String res1 = "Docter";
	String res2 = "Bed";
	
	void tomTreatement()
	{
		try {
		
			synchronized (res1) {
				System.out.println("Tom is using " + res1);
				Thread.sleep(3000);
			
			synchronized (res2) {
				System.out.println("Tom is using " + res2);
				Thread.sleep(3000);
				}
			}	
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	void jerryTreatement()
	{
		try {
		
//			synchronized (res1) 
			//Dead Lock concept
			synchronized (res2){
				System.out.println("Jerry is using " + res2);
				Thread.sleep(3000);
			
//			synchronized (res2)	
			//Dead Lock concept
			synchronized (res1){
				System.out.println("Jerry is using " + res1);
				Thread.sleep(3000);
				}
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}


