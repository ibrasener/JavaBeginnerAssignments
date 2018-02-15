import java.util.Scanner;
	public class SalesTax {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
		
			System.out.print("Enter purchase amount: ");
			double price = input.nextDouble();
		
			double tax = (price* 0.13);
			System.out.println("Sales tax is $"+ tax +" in Ontario Province");
	}

}
