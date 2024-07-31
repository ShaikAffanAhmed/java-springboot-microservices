package AbstractionProject;

//Abstraction is the pillar of the OOPS which is use for the irralavent informations can be achive in two ways 
//1. Abstract class  2. Interface
//Achiving abstraction using abstract class


public class CarApp {
	
	public static void doAcivity(Car cr)
	{
		cr.start();
		cr.stop();
		cr.refule();
	}
	
 public static void main(String[] args) {

	 ElectricCar ec = new ElectricCar();
	 PetrolCar pc = new PetrolCar();
	 DieselCar dc = new DieselCar();
	 doAcivity(ec);
	 doAcivity(pc);
	 doAcivity(dc);
}
}
