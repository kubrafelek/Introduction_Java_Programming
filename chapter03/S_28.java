package bolum03;

import java.util.Scanner;

/*(Geometry: two rectangles) Write a program that prompts the user to enter the
center x-, y-coordinates, width, and height of two rectangles and determines
whether the second rectangle is inside the first or overlaps with the first, as shown
in Figure 3.9. Test your program to cover all cases.*/

public class S_28 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter r1's centers x-, y- coordinates width and height: ");

		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double w1 = input.nextDouble();
		double h1 = input.nextDouble();

		System.out.println("Enter r2's centers x- , y- coordinates width and height: ");

		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double w2 = input.nextDouble();
		double h2 = input.nextDouble();

		double xDistance = 0;
		double yDistance = 0;

		if (x1 >= x2) {
			xDistance = (x1 - x2);
		} else {
			xDistance = (x2 - x1);
		}

		if (y1 >= y2) {
			yDistance = (y1 - y2);
		} else {
			yDistance = (y2 - y1);
		}

		if (xDistance <= (w1 - w2) / 2 && yDistance <= (h1 - h2) / 2) {
			System.out.println("r2 is inside r1!");
		} else if (xDistance <= (w1 + w2) / 2 && yDistance <= (h1 + h2) / 2) {
			System.out.println("r2 is overlaps r1");
		} else {
			System.out.println("r2 does not overlaps r1");
		}
		
		

		input.close();
	}
}
