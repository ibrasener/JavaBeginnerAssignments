import java.util.Scanner;
public class VowelOrNotVowel {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a character: ");
		char character=input.next().charAt(0);
		
		//if()
		
		int num = (int)character;
		System.out.print("The character "+ character+" has the Unicode value of " 
		+ num );
		
		if (Character.toUpperCase(character) >= 65 && character<=90 ||
				character>= 97 && character<=122  ) {
		switch (character)
		{
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'u':
		case 'U':	
		case 'o':
		case 'O':  System.out.print(" and is a letter. Also, it is a vowel."); break;
		default :  System.out.print(" and is a letter. It is not a vowel."); break;
		
					
	 	  }
		
		}
		else if (character>= 48 && character<=57) {
			
			System.out.print(" and is a number"); 
		}
		else {
			System.out.print(" and is a symbol"); 

		}
		
	}

}
