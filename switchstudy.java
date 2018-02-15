import java.util.Scanner;
public class switchstudy {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.print("Enter hours worked this week: ");
		int hours=input.nextInt();
		
		if (hours<0) {
			System.out.print("Invalid number of hour");
			System.exit(1);
		}
		System.out.print("Enter employee classification: ");
		int classification=input.nextInt();
		
		
		double hourly_pay_rate = 0;
		String job ="";
		
		switch (classification) {
		case 1:
			 hourly_pay_rate= 11.00; job = "Floor Clerk"; break;
		case 2:
			 hourly_pay_rate= 11.50; job = "Cashier";break;
		case 3:
			 hourly_pay_rate= 12.50; job = "Head Cashier";break;
		case 4:
			 hourly_pay_rate=14.00; 
			 job="Departman Manager";
			 break;
		case 5:
			 hourly_pay_rate= 18.00; job="Store Manager";break;
		default:
			 System.out.println("Invalid classification code");
			 
		}
		if (1<= classification &&  classification < 6 )
			System.out.println("The employee ("+ job+") has a gross pay of: $"
		+ hourly_pay_rate * hours );
						
		}

	}

