package Static_NonStatic;

//In java A class can contains static variables, static blocks, static methods, non static variables , non static blocks,
//non static methods & Constructors.

public class Professor {

	static String univName = "VTU";  //Static Variable
	static int totalProf = 0;        //Static Variable
	
	int profId;                     // Non-Static Variable
	String subject;            		// Non-Static Variable
	
	//Static Block
	static {
		System.out.println("Welcome to " + univName);
	}
	
	//Non-Static Block
	{
		totalProf += 1;
		profId = totalProf;
		System.out.println("Hiring a new Professor...");
	}
	
	//Static Method
	public static int getTotalProf()
	{
		return totalProf;
	}
	
	//Non-Static Method
	public void teach()
	{
		System.out.println("Professor ID: " + profId + " is teaching " + subject);
	}
	
	//Constructor
	public Professor(String subject)
	{
		this.subject = subject;
	}
	
	//Main Method
	public static void main(String[] args) {
		System.out.println("Total professors at start: " + Professor.getTotalProf());
		System.out.println("---------------------------------");
		Professor prof1 = new Professor("Java");
		prof1.teach();
		Professor prof2 = new Professor("SQL");
		prof2.teach();
		System.out.println("---------------------------------");
		System.out.println("Total professor now: " + Professor.getTotalProf());
	}
}


