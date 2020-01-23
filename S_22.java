package bolum03;

import java.util.Scanner;

/*(Geometry: point in a circle?) Write a program that prompts the user to enter a
point (x, y) and checks whether the point is within the circle centered at (0, 0)
with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the
circle, as shown in Figure 3.7a.*/

public class S_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a point with two coordinates: ");
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();

		final int radius = 10;

		double distance = Math.pow((x1 * x1) + (y1 * y1), 0.5);

		if (distance <= radius) {
			System.out.println("Point (" + x1 + "," + y1 + ") is in the circle !");
		} else {
			System.out.println("Point (" + x1 + "," + y1 + ") is not in the circle !!!");
		}

		input.close();
	}

}
