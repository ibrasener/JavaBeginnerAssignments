import java.util.Scanner;



public class DisplayTime {



public static void main(String[]args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter long milli seconds: ");

long milli_seconds = input.nextLong();

int remaining_MilliSeconds=(int) (milli_seconds % 1000);

long seconds = milli_seconds / 1000;

long remaining_seconds=seconds%60;

long minutes = seconds / 60;

long remaining_minutes = minutes %60;



long hours = minutes / 60;



System.out.println(milli_seconds+ " milli seconds is "+ hours + " hours "+ remaining_minutes +

" minutes and "+ remaining_seconds + " seconds and "+remaining_MilliSeconds +" milli seconds." );





}

}
