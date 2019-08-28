/*Geometry: area of a triangle) Write a program that prompts the user to enter
three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area.
The formula for computing the area of a triangle is
         s = (side1 + side2 + side3) / 2;
    area = 2s(s - side1)(s - side2)(s - side3)*/

package bolum02;

import java.util.Scanner;

public class S_19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter three points for a triangle: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();

		double s1 = Math.pow((((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1))), 0.5);
		double s2 = Math.pow((((x3 - x1) * (x3 - x1)) + ((y3 - y1) * (y3 - y1))), 0.5);
		double s3 = Math.pow((((x3 - x2) * (x3 - x2)) + ((y3 - y2) * (y3 - y2))), 0.5);

		double side = (s1 + s2 + s3) / 2;
		double area = Math.pow((side * (side - s1) * (side - s2) * (side - s3)), 0.5);

		System.out.println("The area of the triangle is " + area);
		input.close();
	}
}
