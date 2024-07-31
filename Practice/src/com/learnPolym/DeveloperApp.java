package com.learnPolym;

class DeveloperApp {

	public static void main(String[] args) {

		Developer dev;
		
		BackEndDeveloper bd = new BackEndDeveloper();
		dev = bd; // upcasting -assigning BackEndDeveloper object to Developer dev reference
		dev.attendMeeting(); //calling inherited method
		dev.project();       //calling overridden method
		//performing downcasting - converting dev(parent ref) to BackEndDeveloper(child obj)
		((BackEndDeveloper)(dev)).learnJava();     //calling child-specific method
		
		DataBaseDeveloper dd = new DataBaseDeveloper();
		dev = dd; // upcasting -assigning DataBaseDeveloper object to Developer dev reference
		dev.attendMeeting(); //calling inherited method
		dev.project();       //calling overridden method
		//performing downcasting - converting dev(parent ref) to DataBaseDeveloper(child obj)
		((DataBaseDeveloper)(dev)).learnSQL();     //calling child-specific method
		
		WebDeveloper wd = new WebDeveloper();
		dev = wd; // upcasting -assigning WebDeveloper object to Developer dev reference
		dev.attendMeeting(); //calling inherited method
		dev.project();       //calling overridden method
		//performing downcasting - converting dev(parent ref) to WebDeveloper(child obj)
		((WebDeveloper)(dev)).learnHTML();     //calling child-specific method
			
	}

}