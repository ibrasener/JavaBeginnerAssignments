import java.util.Scanner;
public class RandomNumbers {
	
	public static void main(String[] args) {
		//low
		int A=1;
		//high
		int B=100;
		int changes = 0;
		int RandomNumber= A+(int)(Math.random()*(B-A+1));
		
		boolean guessing= true;
		while (guessing) {
			//System.out.println(RandomNumber);

			
			Scanner input=new Scanner(System.in);
			System.out.print("What is your guess between 1 and 100? ");
			int guess = input.nextInt();
			changes +=1;

			if (RandomNumber == guess) {
				System.out.println("Your guess is "+ guess+" correct");
				guessing= false;
			
			}
			else if (RandomNumber > guess) {
				System.out.println("The guess is too low");

			}	
			else {
				System.out.println("The guess is too high");
			}
			//System.out.println(RandomNumber);
	
			}
			System.out.println("You has tried "+changes+" times"
				+ " before finding correct number");			
		}
		
	}
