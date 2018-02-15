import java.text.DecimalFormat;
import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		// sideLength= the square root of ((x2-x1)^2 + (y2-y1)^2)) 
		// perimeter of the triangle is addition of side Lengths
		// area of the triangle  the square root of s(s-side1)*(s-side2)*(s-side3)
		
		Scanner input= new Scanner(System.in);
		System.out.print("Enter three points for a triangle: ");
		double x1= input.nextDouble();
		double y1= input.nextDouble();
		double x2= input.nextDouble();
		double y2= input.nextDouble();
		double x3= input.nextDouble();
		double y3= input.nextDouble();
		
		// show only a single decimal place
		DecimalFormat df= new DecimalFormat("0.0");
		
		double Side1= Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));
		double Side2= Math.sqrt(Math.pow((x3-x2),2)+ Math.pow((y3-y2),2));
		double Side3= Math.sqrt(Math.pow((x3-x1),2)+ Math.pow((y3-y1),2));
		
		//// area of the triangle  the square root of s(s-side1)*(s-side2)*(s-side3)
		double s = (Side1+ Side2 + Side3)/2 ;
		// Using the formula for computing the area of a triangle
		double area = Math.sqrt(s * (s-Side1)*(s-Side2)*(s-Side3));
		
		System.out.println("The area of the triangle is "+ df.format(area));
		System.out.print("The perimeter of the triangle is "
		+ df.format(Side1+Side2+Side3) );

	}


}
