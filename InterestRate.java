import java.util.Scanner;

public class InterestRate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	

		
		System.out.print("Enter the monthly saving amount: ");
		double saving = input.nextDouble();

		System.out.print("Enter the annual interest rate (%): ");
		double annualInterestRate= input.nextDouble();
		double monthlyInterestRate = annualInterestRate/1200;

		
		
		// first month account 
		double balance = 100 * (1 + monthlyInterestRate);
		
		// Adding first month to second month then the balance
		balance = (saving + balance) * (1 + monthlyInterestRate);
		
		//  third month account balance
		balance = (saving + balance) * (1 + monthlyInterestRate);
		
		//  forth month account balance
		balance = (saving + balance) * (1 + monthlyInterestRate);
		
		//  fifth month account balance
		balance = (saving + balance) * (1 + monthlyInterestRate);
		
		//  sixth month account balance
		balance = (saving + balance) * (1 + monthlyInterestRate);
		
		//balance  = Math.round(balance);
		
		
		// After 6 months end balance
		System.out.println("At the end of the sixth month, the account value is $" 
		+ (int)(balance * 1000) / 1000.0);
		 

	}

}
