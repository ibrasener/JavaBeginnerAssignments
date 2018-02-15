import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number= input.nextInt();
		
		boolean divisibleAnd = number%7==0 && number%13==0 ;
		boolean divisibleOr = number%7==0 || number%13==0 ;
		boolean divisibleNotBoth = number%7==0 ^ number%13==0 ;

	
			System.out.println("Is "+ number +" divisible by 7 and 13? "
				+ divisibleAnd );
	
		
			System.out.println("Is "+ number +" divisible by 7 or 13? "
					+ divisibleOr );
		
			System.out.println("Is "+ number +" divisible by 7 or 13, but not both? "
					+ divisibleNotBoth );
			}
					
	}


