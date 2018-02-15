import java.text.DecimalFormat;
import java.util.Scanner;

public class TheSphere {
	public static void main(String[] args) {
		
		final double  PI = 3.14159265359;
		// Typing the Pi Symbol is alt(option) + P
		double  π = PI ;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius of the sphere: ");
		double r = input.nextDouble();
		//The formula of The Sphere Area
		// and r represent the radius
		
		DecimalFormat df= new DecimalFormat("0.00000");
		
		double TheSphereArea = 4*π*Math.pow(r, 2);
		//The formula of The Sphere Volume
		double TheSphereVolume = ((4* π* Math.pow(r, 3))/3 );
		
		System.out.print("The surface area of the sphere is "+df.format(TheSphereArea) );
		
		System.out.print("\nThe volume of the sphere is "+ df.format(TheSphereVolume));
		
	}

}
