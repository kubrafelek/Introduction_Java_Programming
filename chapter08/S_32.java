package chapter08;

import java.util.Scanner;

public class S_32 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double points[][] = new double[3][2];
		System.out.print("Enter the x1,y1,x2,y2,x3,y3: ");
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}
		if (getTriangleArea(points) == 0) {
			System.out.println("The three points are on the same line ");
		} else {
			System.out.println("The area of the triangle is " + getTriangleArea(points));
		}
		input.close();
	}

	public static double getTriangleArea(double[][] points) {
		double s1 = Math.pow((((points[1][0] - points[0][0]) * (points[1][0] - points[0][0]))
				+ ((points[1][1] - points[0][1]) * (points[1][1] - points[0][1]))), 0.5);
		double s2 = Math.pow((((points[2][0] - points[0][0]) * (points[2][0] - points[0][0]))
				+ ((points[2][1] - points[0][1]) * (points[2][1] - points[0][1]))), 0.5);
		double s3 = Math.pow((((points[2][0] - points[1][0]) * (points[2][0] - points[1][0]))
				+ ((points[2][1] - points[1][1]) * (points[2][1] - points[1][1]))), 0.5);

		double side = (s1 + s2 + s3) / 2;
		double area = Math.pow((side * (side - s1) * (side - s2) * (side - s3)), 0.5);
		if (area < 0.000001)
			return 0;
		else
			return area;
	}
}
