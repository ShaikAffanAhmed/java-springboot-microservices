package practiceExamples;

public class HighestMarks {

	public static void main(String[] args) {
		
		int[] marks = {10, 20, 30, 40, 50};
		
		int highestMarks = marks[0];
		
		for(int i = 1; i < marks.length; i++)
		{
			if(marks[i] > highestMarks)
			{
				highestMarks = marks[i];
			}
		}
		System.out.println(highestMarks);
	}
	
}
