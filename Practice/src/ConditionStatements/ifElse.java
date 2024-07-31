package ConditionStatements;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int age = sc.nextInt();
//		
//		if (age > 18) {
//			System.out.println("Adult");
//		} else {
//     System.out.println("No Adult");
//		}
		
//		int x = sc.nextInt();
//		
//		if (x%2 == 0) {
//			System.out.println("Even Number");
//		} else {
//            System.out.println("odd Number");
//		}
		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		if (a == b) {
//			System.out.println("A is Equal to B");
//			
//		} else if (a > b) {
//            System.out.println("A is Greater than B");
//		}
//		else {
//			System.out.println("A is Less than B");
//		}
		
		int button = sc.nextInt();
		
//		if(button == 1){
//			System.out.println("Hi");
//		}
//		else if (button == 2) {
//			System.out.println("Wel Come");
//		}
//		else if (button == 3) {
//			System.out.println("Chalo");
//		}
//		else {
//			System.out.println("Invalid Button");
//		}
		
		switch (button) {
		case 1: System.out.println("Hi");
		break;

		case 2: System.out.println("Wel Come");
		break;
		
		case 3: System.out.println("Chalo");
		break;
		
		default: System.out.println("Invalid Button");
		}
	}
}
