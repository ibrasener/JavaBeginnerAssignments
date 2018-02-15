	import java.util.Scanner; 
		public class ComputeLoan {
			public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
		    System.out.print("Enter annual interest rate, e.g., 4.75%: ");
		    double annualInterestRate = input.nextDouble();

		    double monthlyInterestRate = annualInterestRate / 1200;
			// number of years
		    System.out.print("Enter number of years as an integer, e.g., 10: ");
			int numberOfYears = input.nextInt();
			// loan amount helps to calculate montly and total payment
			System.out.print("Enter loan amount, e.g., 123456.78: ");
			double loanAmount = input.nextDouble();
			
			double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
			
			double totalPayment = monthlyPayment * numberOfYears * 12;
			// Display results
			System.out.println("The monthly payment is $" + (int)(monthlyPayment * 100) / 100.0);
			System.out.println("The total payment is $" + (int)(totalPayment * 100) / 100.0);
	}

}
