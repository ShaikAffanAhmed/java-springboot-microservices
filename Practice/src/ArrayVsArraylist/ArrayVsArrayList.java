package ArrayVsArraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVsArrayList {

	public static void main(String[] args) {
		
		//Syntax
		//datatype[] variablename = new datatype[size];
		
		//Create Element
		String[] friendsArray = new String[3]; 
		
		friendsArray[0] = "Bob";
		friendsArray[1] = "praveen";
		friendsArray[2] = "Charty";
//		friendsArray[3] = "Tony";
		
		String[] friendsArray1 = {"Lokesh", "Praveen"};
		
		//Create Element
		ArrayList<String> friendArrayList = new ArrayList<>(Arrays.asList("Lokesh","Praveen","Charty")); 
		//List<String> friendArrayList = Arrays.asList("Lokesh","Praveen","Charty");
		
		//Get Element
		System.out.println(friendsArray[2]);
		System.out.println(friendArrayList.get(1));
		
		//Get Size
		System.out.println(friendsArray.length);
		System.out.println(friendArrayList.size());
		
		//Add an Element
		//But we can't do that with Arrays: (
		friendArrayList.add("Imran");
		System.out.println(friendArrayList.get(3));
		
		//Set an Element
		friendsArray[0] = "Loki";
		System.out.println(friendsArray[0]);
		friendArrayList.set(0, "Loki");
		System.out.println(friendArrayList.get(0));
		
		//Remove an Element
		//Can't do this with Arrays
		friendArrayList.remove(1);
		System.out.println(friendArrayList.get(1));
		
		//Print
		System.out.println(friendsArray);
		System.out.println(friendArrayList);
		
	}
}
