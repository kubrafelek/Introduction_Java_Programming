package chapter08;

import java.util.Scanner;

public class S_33 {

	static final int X = 0;
	static final int Y = 1;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double[][] points = new double[4][2];
		System.out.print("Enter x1 y1 x2 y2 x3 y3 x4 y4: ");
		for (int i = 0; i < points.length; i++)
			for (int j = 0; j < points[i].length; j++)
				points[i][j] = input.nextDouble();

		double[] centerPoint = getIntersectingPoint(points);

		double[] area = new double[4];
		for (int i = 0; i < points.length; i++) {

			int j = ((i + 1) % points.length);
			double[][] triangle = new double[][] { points[i], points[j], centerPoint };
			double triangleArea = getTriangleArea(triangle);
			area[i] += triangleArea;
		}
		java.util.Arrays.sort(area);
		System.out.print("The areas are ");
		for (int i = 0; i < area.length; i++)
			System.out.printf("%2.2f ", area[i]);
		input.close();

	}

	public static double getTriangleArea(double[][] points) {
		double side1 = distanceBetweenTwoPoints(points[0][0], points[0][1], points[1][0], points[1][1]);
		double side2 = distanceBetweenTwoPoints(points[0][0], points[0][1], points[2][0], points[2][1]);
		double side3 = distanceBetweenTwoPoints(points[2][0], points[2][1], points[1][0], points[1][1]);
		double s = (side1 + side2 + side3) / 2;
		double area = s * (s - side1) * (s - side2) * (s - side3);

		if (area < 0.000001)
			return 0;
		else
			return Math.sqrt(area);
	}

	public static double distanceBetweenTwoPoints(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	}

	public static double[][] findTwoFurthestPoints(double[][] points) {

		double[][] p = new double[2][2];
		double distance = 0;
		for (int i = 0; i < points.length - 1; i++) {
			for (int j = 1 + i; j < points.length; j++) {
				double tDistance = distanceBetweenTwoPoints(points[i][0], points[i][1], points[j][0], points[j][1]);
				if (tDistance > distance) {
					p[0] = points[i];
					p[1] = points[j];
					distance = tDistance;
				}
			}
		}
		return new double[][] { p[0], p[1] };
	}

	public static double[] getIntersectingPoint(double[][] points) {

		double[][] p1 = findTwoFurthestPoints(points);
		double[][] p2 = exclude(points, p1);

		double a = p1[0][Y] - p1[1][Y]; // y1 - y2
		double b = -(p1[0][X] - p1[1][X]); // -(x1 - x2)
		double c = p2[0][Y] - p2[1][Y]; // y3 - y4
		double d = -(p2[0][X] - p2[1][X]); // -(x3 - x4)
		// (y1 - y2) * x1 - (x1 - x2) * y1
		double e = (p1[0][Y] - p1[1][Y]) * p1[0][X] - (p1[0][X] - p1[1][X]) * p1[0][Y];
		// (y3 - y4) * x3 - (x3 - x4) * y3
		double f = (p2[0][Y] - p2[1][Y]) * p2[0][X] - (p2[0][X] - p2[1][X]) * p2[0][Y];

		double ab_Minus_bc = a * d - b * c;

		if (ab_Minus_bc == 0)
			return null;
		double[] point = new double[2];
		point[X] = (e * d - b * f) / ab_Minus_bc;
		point[Y] = (a * f - e * c) / ab_Minus_bc;

		return point;
	}

	public static double[][] exclude(double[][] points, double[][] exclude) {

		double[][] p = new double[2][2];
		for (int i = 0; i < points.length - 1; i++) {
			for (int j = 1 + i; j < points.length; j++) {
				if (exclude[0] != points[i] && exclude[1] != points[j]) {
					p[0] = points[i];
					p[1] = points[j];
				}
			}
		}
		return new double[][] { p[0], p[1] };
	}
}
//-2,5 2 4 4 3 -2 -2 -3,5