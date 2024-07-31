package CollectionFramework;

//public class Student  implements Comparable<Student>{
public class Student  {
	int rollNo;
	String name;
	float percentage;
	
	public Student(int rollNo, String name, float percentage) 
	{
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;
	}

//		@Override
//		public int compareTo(Student o) {
//			
//			if(this.rollNo < o.rollNo)
//			{
//				return -1;
//			}
//			else if(this.rollNo > o.rollNo){
//				return 1;	
//			}
//			else {
//				return 0;	
//			}
//		}

		@Override
		public String toString() {
			return "Student [rollNo=" + rollNo + ", name=" + name + ", percentage=" + percentage + "]";
		}
		
}
