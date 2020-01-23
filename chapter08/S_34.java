package chapter08;

import java.util.Scanner;

public class S_34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double points[][] = new double[6][2];
		System.out.println("Enter 6 points: ");
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}

		double point[] = getRightmostLowestPoint(points);
		System.out.println("The rightmost lowest point is (" + point[0] + "," + point[1] + ")");
		input.close();

	}

	public static double[] getRightmostLowestPoint(double[][] points) {
		double coordinates[] = new double[2];

		double sub = 0;
		double rightMostPoint = 0;
		for (int i = 0; i < points.length; i++) {
			for (int j = 1; j < points[i].length; j++) {
				sub = Math.abs(points[i][j - 1]) + Math.abs(points[i][j]);
				if (sub > rightMostPoint) {
					rightMostPoint = sub;
					coordinates[0] = points[i][j - 1];
					coordinates[1] = points[i][j];
				}
			}
		}
		return coordinates;
	}
}
/*
 * 1,5 2,5 -3 4,5 5,6 -7 12,6 6,5 -7 13,5 8 1 7 10 2,5 7,5
 */
