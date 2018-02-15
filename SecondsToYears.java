import java.util.Scanner;
public class SecondsToYears {

	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	System.out.print("Please enter a seconds: ");
	long seconds=input.nextLong();
	
	long RemainingSeconds= seconds % 60;
	long minutes= seconds/60;
	long RemainingMinutes= minutes % 60;
	long hours= minutes/60;
	long RemainingHours= hours % 24;
	long days= hours/24;
	long RemainingDays= days % 365;
	long years= days/365;
	
	String defination=(seconds+ " seconds is approximately "
	+ years+ " years, "+ RemainingDays +" days,"+ RemainingHours+" hours,"
	+ RemainingMinutes+ " minutes and "+RemainingSeconds+" seconds.");
	System.out.println(defination);	
	}
}

