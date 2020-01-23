package bolum03;

import java.util.Scanner;

/*(Geometry: points in triangle?) Suppose a right triangle is placed in a plane as
shown below. The right-angle point is placed at (0, 0), and the other two points
are placed at (200, 0), and (0, 100). Write a program that prompts the user to enter
a point with x- and y-coordinates and determines whether the point is inside the
triangle.*/

public class S_27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a point's x- and y- coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		if (x <= 200.0 && y <= 100.0) {
			System.out.println("The point is in the rectangle.");
		} else if (x > 200.0 || y < 100.0) {
			System.out.println("The point x is not in the rectangle.");
		} else if (x < 200.0 || y > 100.0) {
			System.out.println("The point y is not in the rectangle.");
		} else {
			System.out.println("The all points are not in the rectangle!");
		}
		input.close();
	}

}
