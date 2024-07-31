package Patterns;

import java.util.Scanner;

public class StarPatterns {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
//		for(int i =1; i<=n; i++) {
//			for(int j=1; j<=m;j++) {
//			    System.out.print("*");
//			}
//			    System.out.println();
//		}
		
		//Outer Loop
		for(int i =1; i<=n; i++) {
			//Inner Loop
			for(int j=1; j<=m; j++) {
				//cell -> (i,j)
				if(i == 1 || j ==1 || i == n || j == m) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
