import java.util.Scanner;
public class DaysMonth {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year=input.nextInt();
		System.out.print("Enter a month: ");
		String month=input.next();
		String s1= month.substring(0, 1).toUpperCase();		
		String sumMonth= s1+ month.substring(1,3);
		
		//we need to find leap year
		//leap year formula is (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		boolean isLeapYear=(year%4==0)&&(year%100!=0)||(year%400==0);
		
		/*January - 31 days
		February - 28 days in a common year and 29 days in leap years
		March - 31 days
		April - 30 days
		May - 31 days
		June - 30 days
		July - 31 days
		August - 31 days
		September - 30 days
		October - 31 days
		November - 30 days
		December - 31 days */
		
		if ( 	sumMonth.equals("Jan") || sumMonth.equals("Mar") || 
				sumMonth.equals("May") || sumMonth.equals("Jul") ||
				sumMonth.equals("Aug") || sumMonth.equals("Oct") ||
				sumMonth.equals("Dec")) {
				System.out.println(sumMonth+" "+year+" has "+31 + " days");
		}
			else if (sumMonth.equals("Apr") || sumMonth.equals("Jun") || 
					sumMonth.equals("Sep") || sumMonth.equals("Nov")) {
				System.out.println(sumMonth+" "+year+" has "+30 + " days");
			}
			else {
				System.out.println(((isLeapYear) ? sumMonth+" "+year+" has "+29 +"days": 28 + " days"));	

			}
		
	}

}
