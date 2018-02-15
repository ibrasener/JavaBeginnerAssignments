import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class ConsoleInOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner input= new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name= input.nextLine();
		
		System.out.print("Please enter your favourite number: ");
		int number=input.nextInt();
		
		System.out.print("Please enter your favourite colour: ");
		String colour=input.next();
		
		System.out.print("What is the your answer of 17+ (3 x 4.6) =  ");
		double calculating=input.nextDouble();
		
		
		System.out.print("Your name is "+ name+", your favourite number is "
		+ number+ ", and favourite colour is "+ colour+
		" Your answer to 17+ (3 x 4.6) is "+ calculating+ 
		". The correct answer is "+ (17+ (3 * 4.6))+ "." );
*/
		
		//String string = JOptionPane.showInputDialog(null, "HELLO", "HOW U DOING",JOptionPane.QUESTION_MESSAGE);
		
		String name= JOptionPane.showInputDialog("Please Enter your name: ");
		
		String NumberString= JOptionPane.showInputDialog("Please enter your favourite number: ");
		
		// convert string to int (number)
		int number= Integer.parseInt(NumberString);
		
		String ColourString= JOptionPane.showInputDialog("Please enter your favourite colour: ");
		
		String AnswerString = JOptionPane.showInputDialog("Please enter the result of (17 + (3 x 4.6)) ");
		
		double answer = Double.parseDouble(AnswerString);
		
		DecimalFormat df = new DecimalFormat("0.00");
		//Display results
		String output= ("Your name is "+ name + ", your favourite number is "+ number
				+ " and your favourite colour is " + ColourString 
				+ ". Your answer to (17 + (3 x 4.6)) is "+ answer 
				+ " The correct answer is "+df.format(17 + (3 * 4.6)) + ".");
		JOptionPane.showMessageDialog(null,"Your name is "+ name + ", your favourite number is "+ number
				+ " and your favourite colour is " + ColourString 
				+ ". Your answer to (17 + (3 x 4.6)) is "+ answer 
				+ " The correct answer is "+df.format(17 + (3 * 4.6)) + ".");
		
	}

}
