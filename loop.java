import java.util.Scanner;

public class loop {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What is your first integer number? ");
		int firstNumber = input.nextInt();
		System.out.print("What is your second \t integer number? ");
		int secondNumber = input.nextInt();
		
		if (firstNumber>secondNumber) {
			int temp=firstNumber;
			firstNumber=secondNumber;
			secondNumber=temp;			
		}
		int count=firstNumber;
		while (count<=secondNumber) {
			if(count%2==1) {
			System.out.print(count+" " );
			count+=2; 
			}
			else {
			count = count+1;
			}
		}
		count=firstNumber;
		int sum=0;
		do {
			if(count%2==1) {
				sum += count;
				count+=2; 
				// adding always need to be last
				}
				else {
				count=count+1;
		}
			System.out.print("\nThe sum of the odd numbers is " + sum);

		}while(count<=secondNumber);
		
		
		//c
		int i;
		for (i=1;i<200;i+=4) {
			System.out.print("\n" + i+" "+i*i+" "+i*i*i);

		}
		//d
		int squareOfsum=0;
	//	int a;
		for(int a=firstNumber;a<=secondNumber;a++) {
			if (a%2==0) {
				squareOfsum +=a*a;
			}
			
		}
		System.out.println("\nThe sum of the squares of the even numbers is " + squareOfsum);
		
		char alphabet='A';
		while(alphabet<='Z') {
			System.out.print(alphabet+" ");
			alphabet+=2;
		}
		input.close();
		
		}
		

			
		}



