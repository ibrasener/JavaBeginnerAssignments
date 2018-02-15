import java.util.Scanner;
public class RockPaperScissorsLizardSpock {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("scissor (0), rock (1), paper (2), lizard(3), Mr.Spock(4): ");
		int User=input.nextInt();
		
		// Math.random() numbers 0.0<=numbers<1
		//0.0 - 0.1 x5 equal to int 0 , 0.2 - 0.3 x5 equal to int 1
		//0.4 - 0.5 x5 equal to int 2 , 0.6 - 0.7 x5 equal to int 3
		//0.0 - 0.1 x5 equal to int 4
		//// Generate a random ints 0, 1, 2,3,4
		int Computer =(int) (Math.random()*5);
		// paranthesess are important
		
		//  0 is rock, 1 is paper, 2 is scissors
		//, 3 is lizard , 4 is Mr. Spock.
		
		
		String ComputerGuess ="";
		
		switch(Computer) {
		
		case 0: ComputerGuess= "rock"; break;
		case 1:	ComputerGuess= "paper"; break;
		case 2: ComputerGuess= "scissors"; break;
		case 3: ComputerGuess= "lizard"; break;
		case 4: ComputerGuess= "Mr.Spock";
		}
		
		System.out.print("The computer is "+ ComputerGuess+".");

		String UserGuess ="";

		switch(User) {
		case 0: UserGuess= "rock"; break;
		case 1:	UserGuess= "paper"; break;
		case 2: UserGuess= "scissors"; break;
		case 3: UserGuess= "lizard"; break;
		case 4: UserGuess= "Mr.Spock";
		}
			

		System.out.print((UserGuess==ComputerGuess)? 
				"You are "+ UserGuess+" too. It is a draw": "You are "+ UserGuess+".");
	/*    (0)Scissors decapitates lizard
		  Scissors cuts paper
		  (1)Rock smashes lizard
		  Rock smashes scissors
		  Rock crushes scissors 
		  (2)Paper covers rock
		  Paper disproves Spock
	    	  (3)Lizard eats paper
		  Lizard poisons spock
		  (4)Spock vaporizes rock
		  Spock smashes scissors
		*/
		
		// it only shows the user results
		boolean win = (User==0 && Computer==3)||(User==0 && Computer==2)
				|| (User==1 && Computer==3)||(User==1 && Computer==0)
				||(User==2 && Computer==1)|| (User==2 && Computer==4)
				||(User==3 && Computer==2)||(User==3 && Computer==4)
				||(User==4 && Computer==1)||(User==4 && Computer==0);
		if (win) {
			System.out.print(" You won");
				}
		if(!win && UserGuess!= ComputerGuess) {
			System.out.print(" You lost");
	}

 }
}
