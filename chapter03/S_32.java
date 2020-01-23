package bolum03;

import java.util.Scanner;

/*(Geometry: point position) Write a program that prompts the user to enter the three points for p0, p1, and p2
and displays whether p2 is on the left of the line from p0 to p1, on the right, or on
the same line.*/

public class S_32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the three points for p0 , x0 and y0 coordinates: ");

		double x0 = input.nextDouble();
		double y0 = input.nextDouble();

		System.out.println("Enter the three points for p1 , x1 and y1 coordinates: ");

		double x1 = input.nextDouble();
		double y1 = input.nextDouble();

		System.out.println("Enter the three points for p2 , x2 and y2 coordinates: ");

		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		double formul = ((x1 - x0) * (y2 - y0)) - ((x2 - x0) * (y1 - y0));

		if (formul > 0) {
			System.out.println("(" + x2 + "," + y2 + ")  is the left side on the line from (" + x0 + "," + y0 + ") to ("
					+ x1 + "," + y1 + ")");
		} else if (formul >= 0) {
			System.out.println(
					"(" + x2 + "," + y2 + ")  is on the same line (" + x0 + "," + y0 + ") to (" + x1 + "," + y1 + ")");
		} else if (formul < 0) {
			System.out.println("(" + x2 + "," + y2 + ") is on the right side on the line from (" + x0 + "," + y0
					+ ") to (" + x1 + "," + y1 + ")");
		}

		input.close();
	}

}
