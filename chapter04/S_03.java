package bolum04;

import java.util.Scanner;

/*(Geography: estimate areas) Find the GPS locations for Atlanta, Georgia;
Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina from
www.gps-data-team.com/map/ and compute the estimated area enclosed by these
four cities. (Hint: Use the formula in Programming Exercise 4.2 to compute the
distance between two cities. Divide the polygon into two triangles and use the
formula in Programming Exercise 2.19 to compute the area of a triangle.)*/

public class S_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();

		System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		System.out.println("Enter point 3 (latitude and longitude) in degrees: ");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();

		System.out.println("Enter point 4 (latitude and longitude) in degrees: ");
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();

		double s1 = Math.pow((((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1))), 0.5);
		double s2 = Math.pow((((x3 - x1) * (x3 - x1)) + ((y3 - y1) * (y3 - y1))), 0.5);
		double s3 = Math.pow((((x3 - x2) * (x3 - x2)) + ((y3 - y2) * (y3 - y2))), 0.5);

		double side = (s1 + s2 + s3) / 2;
		double area = Math.pow((side * (side - s1) * (side - s2) * (side - s3)), 0.5);

		s1 = Math.pow((((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1))), 0.5);
		s2 = Math.pow((((x4 - x1) * (x4 - x1)) + ((y4 - y1) * (y4 - y1))), 0.5);
		s3 = Math.pow((((x4 - x2) * (x4 - x2)) + ((y4 - y2) * (y4 - y2))), 0.5);

		side = (s1 + s2 + s3) / 2;
		area = Math.pow((side * (side - s1) * (side - s2) * (side - s3)), 0.5) + area;

		System.out.println("The distance between the two points is " + area + " km^2...");

		input.close();

		// 35,2270869
		// -80,84312669999997
		// 32,0835407
		// -81,09983419999998
		// 28,5383355
		// -81,37923649999999
		// 51,5138505182
		// -0,15690922737098845
	}

}
