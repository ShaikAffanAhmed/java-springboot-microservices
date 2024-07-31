package practiceExamples;

import java.util.Scanner;

public class EMICalculator 
{
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		double p, r, n, e;
//		System.out.println("Enter the loan amount");
//		p=sc.nextDouble();
//		System.out.println("Enter the rate of interest");
//		r=sc.nextDouble();
//		System.out.println("Enter the time in year");
//		n=sc.nextDouble();
////		n=n*12;
////		r=(r/12)/100;
////		e=p*r*Math.pow((1+r),n)/(Math.pow((1+r),n)-1);
//		e=(p+r)/n;
//		System.out.println("EMI=" + e);
		
		   Scanner sc = new Scanner(System.in);

	        // Input variables
	        System.out.println("Enter the loan amount (Principal): ");
	        double p = sc.nextDouble();

	        System.out.println("Enter the annual interest rate (in percentage): ");
	        double annualInterestRate = sc.nextDouble();

	        System.out.println("Enter the loan tenure in years: ");
	        double n = sc.nextDouble();

	        // Convert annual interest rate to monthly interest rate
	        double monthlyInterestRate = annualInterestRate / (12 * 100);

	        // Calculate number of monthly installments
	        int numberOfMonths = (int) (n * 12);

	        // Calculate EMI using the formula
	        double emi = calculateEMI(p, monthlyInterestRate, numberOfMonths);

	        // Print the EMI
	        System.out.println("EMI: " + emi);

	        sc.close();
	    }

	    // Method to calculate EMI using the formula
	    public static double calculateEMI(double principal, double monthlyInterestRate, int numberOfMonths) {
	        double emi;
	        emi = principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)
	                / (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
	        return emi;
	    
	}
}
