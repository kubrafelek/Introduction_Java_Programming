package bolum03;

import java.util.Scanner;

/*(Geometry: two circles) Write a program that prompts the user to enter the center
coordinates and radii of two circles and determines whether the second circle is
inside the first or overlaps with the first, as shown in Figure 3.10. (Hint: circle2 is
inside circle1 if the distance between the two centers 6 = |r1 - r2| and circle2
overlaps circle1 if the distance between the two centers <= r1 + r2. Test your
program to cover all cases.)*/

public class S_29 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the circle1's center x- ,y- coordinates and radius: ");
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double radius1 = input.nextDouble();

		System.out.println("Enter the circle2's center x-, y- coordinates and radius: ");
		
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double radius2 = input.nextDouble();

		double distance = Math.pow((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2), 0.5);

		if (distance <= Math.abs(radius1 - radius2)) {
			System.out.println("Circle2 inside circle1");
		} else if (distance <= (radius1 + radius2)) {
			System.out.println("Cirle2 overlaps with circle1");
		} else {
			System.out.println("Cirle2 does not overlaps with circle1");
		}

		input.close();
	}

}
