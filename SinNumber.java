
import java.util.Scanner;

public class SinNumber {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		//String abc = 123-123;
		//System.out.print((abc.charAt(0)-48));

		System.out.print("Enter a SIN: ");
		String sin=input.nextLine();
		System.out.println((int)(sin.charAt(0)-48));

		int formula1 = (int)((sin.charAt(0)-48)*1)
			   	+ (int)(sin.charAt(2)-48)*1
				+ (int)((sin.charAt(5)-48)*1)
				+ (int)((sin.charAt(8)-48)*1)  
				+ (int)((sin.charAt(10)-48)*1) ;
		
		
		int a =((int)(sin.charAt(1)-48)*2);
		int formula2= (a>9) ? a%10 + 1: a ;

		int b=(((int)(sin.charAt(4)-48))*2);
		int formula3=(b>9) ? b%10 + 1: b ;
	
		int c=(((int)(sin.charAt(6)-48))*2);
		int formula4=(c>9) ? c%10 + 1: c ;
	
		int d=(((int)(sin.charAt(9)-48))*2);
		int formula5=(d>9) ? d%10 + 1: d ;

	 
		boolean sinValidFormula= (formula1+formula2+formula3+formula4+formula5)%10==0;
	
		boolean valid= (sin.length()==11)
				&& (Character.isDigit(sin.charAt(0))) 
				&&(Character.isDigit(sin.charAt(1))) 
				&& (Character.isDigit(sin.charAt(2)))
				&&((sin.charAt(3)=='-'))
				
				&&(Character.isDigit(sin.charAt(4))) 
				&&(Character.isDigit(sin.charAt(5))) 
				&& (Character.isDigit(sin.charAt(6)))
				&&(sin.charAt(7)=='-')
				
				&&(Character.isDigit(sin.charAt(8))) 
				&&(Character.isDigit(sin.charAt(9))) 
				&&(Character.isDigit(sin.charAt(10)));
	
		if (valid&&sinValidFormula) {
			System.out.print(sin +" is valid.");
			}
		else	 if(!sinValidFormula && valid)	{
			System.out.print(sin +" is invalid. The number is invalid.");
			
		}
		else		{
			System.out.print(sin +" is invalid. Format error.");		
		}
	}
}


