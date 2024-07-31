package CollectionFramework;

import java.util.*;

public class StudentApp {

	public static void main(String[] args) {
		
		// Creating objects of Student class
		Student st1 = new Student(2, "Ahmed", 80.5f);
		Student st2 = new Student(1, "Bob", 95.2f);
		Student st3 = new Student(3, "Charty", 90.1f);
		
		// Creating ArrayList 
		ArrayList<Student> Al = new ArrayList<Student>();
		
		// Storing the student object in the ArrayList
		Al.add(st1);
		Al.add(st2);
		Al.add(st3);
		// Printing ArrayList to display student object details before sorting
		System.out.println(Al); // --> System.out.println(Al.toString());
		
		// Creating the object of SortingHelper class in which compare method is present
		SortingHelper sh = new SortingHelper();
		
		//sorting of the objects present in the Array List
		//sort() internally calls the comapreTo() present in the Student class
//		Collections.sort(Al);
		Collections.sort(Al, sh);
		
//		Collections.sort(Al, new SortingHelper());
		Collections.sort(Al, new Comparator<Student>() { 
				@Override
				public int compare(Student o1, Student o2) {
					if(o1.rollNo < o2.rollNo)
					{
						return -1;
					}
					else if(o1.rollNo > o2.rollNo){
						return 1;	
					}
					else {
						return 0;	
					}
				}
				});
		
		// Printing ArrayList to display student object details after sorting
		System.out.println(Al);
	}
}
