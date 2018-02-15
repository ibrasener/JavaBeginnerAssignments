import java.util.Scanner;
public class TwoDigitHexNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter a decimal value (0 to 255): ");
		int decimal = input.nextInt();
		
		//16 digits: same 0–9,
		// The letters A, B, C, D, E, and F 
		//the decimal numbers 10, 11, 12, 13, 14, and 15.
		
		int modular =  decimal%16;
		int result= decimal/16;
		
		if(decimal >=0) {
			//  - 10 comes because they are higher than 9 
			System.out.println("The hex value is " +
		  ((result>9)? (char)(result + 'A' - 10):(char)(result+'0'))
		  +
		  ((modular>9)? (char)(modular + 'A' - 10):(char)(modular+'0')));
		
		}
		else {
			System.out.println(decimal + " is an invalid input");
		}
	}

}
