
import java.util.Scanner;
public class ifStatement {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Where do you live(H-house, A-apartment, D-dormitory)?");
		char residence= input.next().toUpperCase().charAt(0);;
		
	//	System.out.print("On average, how many hours per day are you home? ");
	//	int hours= input.nextInt();
			if (residence == 'H') {
				System.out.print("On average, how many hours per day are you home? ");
				int hours= input.nextInt();
				
				if (hours>= 18 && hours < 24)
					System.out.print("You should get a A");
				else if (10 <= hours && hours< 18)
					System.out.print("You should get a B");
				else if (hours <10 && hours >=0)
					System.out.print("You should get a C");
				//else 
					//System.out.print("Invalid");
			}
			else if (residence == 'A') {
				System.out.print("On average, how many hours per day are you home? ");
				int hours= input.nextInt();
				
				if (hours>= 10 && hours < 24)
					System.out.print("You should get a D");
				else if (hours <10 && hours >=0)
					System.out.print("You should get a E");
				//else 
				//	System.out.print("Invalid");
			}
			else if (residence == 'D') {
				System.out.print("On average, how many hours per day are you home? ");
				int hours= input.nextInt();
				if (hours>= 6 && hours < 24) 
					System.out.print("You should get a F");
				else if (hours <6 && hours >=0)
					System.out.print("You should get a G");
				//else 
				//	System.out.print("Invalid");
				}
			else {
				System.out.print("Invalid");
			}
			}

}
