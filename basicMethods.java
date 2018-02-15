import java.util.Scanner;
public class basicMethods {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

//System.out.println("Sales tax is $" + (int)(1239 * 100) / 100.0);		
		System.out.print("What is your low value? ");
		int low=input.nextInt();
		System.out.print("What is your high value?");
		int high=input.nextInt();
		
		
		//System.out.println(average(300,19));
		int n=1, countOfnumbers=1,b= 0,c=high;
		int total=0;
		for(countOfnumbers=1; countOfnumbers<=100; countOfnumbers++) {
			int a=randomNum(low,high);
			System.out.println(countOfnumbers +"-)"+a);
			total+=a;
			b=largestNum(a,b);
			c=smallestNum(a,c);
			n++;
		}
		System.out.println("100 numbers between "+ 
						low+ "and "+ high+" were generated." );
		System.out.println("The total of the number is "+total);
		System.out.println("The largest number is "
				+b + " and the smallest number is "+ c+".");
		System.out.println("The average of the number is "
				+average(total, n));	
		
	}
	public static int randomNum (int low,int high) {
		int random=low +(int)(Math.random()*(high-low+1));
		return random;
	}
	public static int largestNum (int curLarge,int newNum) {
		if (curLarge>newNum) {
			return curLarge;
		}
		else {
		return newNum;	
	}
	}
	public static int smallestNum(int curSmall, int newNum) {
		
		if (curSmall<newNum) {
		return curSmall;
		}
		else {
		return newNum;	
		}
	}
	public static double average(int total,int count) {
		double avg=(double)total/count;
		return (int)(avg*1000)/1000.0;
	}
	
}
