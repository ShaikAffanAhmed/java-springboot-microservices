package InterfaceProject;

public class StudentApp {

		public static void doActivities(StudentActivities sa)
		{
			sa.attendClass();
			sa.study();
			sa.assigement();
		}
		
		public static void main(String[] args) {
			PhysicsStudent ps = new PhysicsStudent();
			ChemistryStudent cs = new ChemistryStudent();
			doActivities(ps);
			doActivities(cs);
		}
	}


