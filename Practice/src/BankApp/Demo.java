package BankApp;

	import java.util.Scanner;

	class Axis
	{
	    float getRateOfInterest(float principal, float time, float rate)
	    {
	        return (principal * time * rate) / 100;
	    }
	}

	class Hdfc extends Axis
	{
	    @Override
	    float getRateOfInterest(float principal, float time, float rate)
	    {
	        return (principal * time * rate) / 100;
	    }
	}

	class Yes extends Hdfc
	{
	    @Override
	    float getRateOfInterest(float principal, float time, float rate)
	    {
	        return (principal * time * rate) / 100;
	    }
	}

	public class Demo
	{
	    public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter principal amount: ");
	        float principal = scanner.nextFloat();
	        System.out.print("Enter time: ");
	        float time = scanner.nextFloat();

	        System.out.print("Enter rate of interest for Axis Bank: ");
	        float rateAxis = scanner.nextFloat();

	        System.out.print("Enter rate of interest for HDFC Bank: ");
	        float rateHdfc = scanner.nextFloat();

	        System.out.print("Enter rate of interest for Yes Bank: ");
	        float rateYes = scanner.nextFloat();
	        System.out.println();

	        Axis axis = new Axis();
	        Hdfc hdfc = new Hdfc();
	        Yes yes = new Yes();

	        float axInt = axis.getRateOfInterest(principal, time, rateAxis);
	        float hdfcInt = hdfc.getRateOfInterest(principal, time, rateHdfc);
	        float yesInt = yes.getRateOfInterest(principal, time, rateYes);

	        float mainBalanceOfAxisBank = principal + axInt;
	        float mainBalanceOfHdfcBank = principal + hdfcInt;
	        float mainBalanceofYesBank = principal + yesInt;

	        System.out.println("Interest of axis bank is: " + axInt);
	        System.out.println("Main balance after interest of axis bank is: " + mainBalanceOfAxisBank);
	        System.out.println();

	        System.out.println("Interest of hdfc bank is: " + hdfcInt);
	        System.out.println("Main balance after interest of hdfc bank is: " + mainBalanceOfHdfcBank);
	        System.out.println();

	        System.out.println("Interest of yes bank is: " + yesInt);
	        System.out.println("Main balance after interest of yes bank is: " + mainBalanceofYesBank);
	        System.out.println();

	        scanner.close();
	    }
	}
