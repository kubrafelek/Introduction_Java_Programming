package bolum03;

import java.util.Scanner;

/*(Geometry: point on line segment) Programming Exercise 3.32 shows how to test
whether a point is on an unbounded line. Revise Programming Exercise 3.32 to
test whether a point is on a line segment. Write a program that prompts the user
to enter the three points for p0, p1, and p2 and displays whether p2 is on the line
segment from p0 to p1.*/

public class S_34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter three points for x- and y- coordinates: ");

		double x0 = input.nextDouble();
		double y0 = input.nextDouble();

		System.out.println("Enter three points for x- and y- coordinates: ");

		double x1 = input.nextDouble();
		double y1 = input.nextDouble();

		System.out.println("Enter three points for x- and y- coordinates: ");

		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		if ((x0 < x2 && x2 < x1) && (y0 < y2 && y2 < y1)) {
			System.out.println("(" + x2 + "," + y2 + ") is on the line segment from (" + x0 + "," + y0 + ") to (" + x1
					+ "," + y1 + ")");
		} else {
			System.out.println("(" + x2 + "," + y2 + ") is not on the line segment from (" + x0 + "," + y0 + ") to ("
					+ x1 + "," + y1 + ")");
		}

		input.close();
	}

}
