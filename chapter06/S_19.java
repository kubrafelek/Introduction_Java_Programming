package chapter06;

import java.util.Scanner;

public class S_19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a three point: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();

		double s1 = Math.pow((((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1))), 0.5);
		double s2 = Math.pow((((x3 - x1) * (x3 - x1)) + ((y3 - y1) * (y3 - y1))), 0.5);
		double s3 = Math.pow((((x3 - x2) * (x3 - x2)) + ((y3 - y2) * (y3 - y2))), 0.5);

		System.out.println(isValid(s1, s2, s3));
		System.out.println("The area of the triangle is: " + area(s1, s2, s3));
		input.close();
	}

	public static boolean isValid(double side1, double side2, double side3) {

		double swap = side1;
		side1 = side2;
		side2 = side3;
		side3 = swap;

		if ((side1 + side2) < side3 || (side1 + side3) < side2 || (side3 + side2) < side1) {
			return true;
		}
		return false;
	}

	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}

}
