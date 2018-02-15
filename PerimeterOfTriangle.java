import java.util.Scanner;

public class PerimeterOfTriangle {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.print("Enter three sides of the triangle: ");
		double side1= input.nextDouble();
		double side2= input.nextDouble();
		double side3= input.nextDouble();
		// side1, side2 and side3 is valid only if the
		//sum of any two sides exceeds the remaining third side
		if(side1+side2>side3 && side2+side3>side1 && side1+side3>side2 ) {	
		System.out.print("The perimeter of the triangle is "
			+ (int)((side1+side2+side3)*10)/10.0 + "." );
		}
		else {
			System.out.print("The lengths do not define a triangle.");
		}
				
	}
}

