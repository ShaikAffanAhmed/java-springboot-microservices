package Aggregation;

public class AirlineApp {

	public static void main(String[] args) {

		Pilot p = new Pilot("Raju");
		p.fly();
		Airline ar = new Airline("KodAir", p);
		ar.activity();
		
		ar=null;
		ar.activity(); //NullpointerException Error
		p.fly();
	}

}


//There are two types of has a relationship which is consider as aggrigation & composition. 
//Aggregation relationship in such a has-a relation ship which is weakly associated with the object.
//It means two objects are connected with each other but while creating or destroying the enclosing 
//object no effect will happen on the aggregate object.
//Ex: Student - enclosing object, Note Book is a aggregate object
//Ex:2 Mobile Phone - enclosing object, Charger is a aggregate object