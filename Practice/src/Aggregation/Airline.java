package Aggregation;

public class Airline {

	String airlineName;
	Pilot p;
	
	Airline(String airlineName, Pilot p)
	{
		this.airlineName = airlineName;
		this.p = p;
	}
	
	void activity()
	{
		System.out.println(airlineName+ " is doing the activity");
		p.fly();
	}
}
