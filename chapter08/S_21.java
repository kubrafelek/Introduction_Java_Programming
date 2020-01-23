package chapter08;

import java.util.Scanner;

public class S_21 {

	static final int X = 0;
	static final int Y = 1;
	static final int DISTANCE = 2;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of cities: ");
		int numberOfCities = input.nextInt();

		double city[][] = new double[numberOfCities][3];
		System.out.print("Enter the coordinates of the cities: ");
		for (int row = 0; row < city.length; row++) {
			for (int col = 0; col < city[row].length - 1; col++) {
				city[row][col] = input.nextDouble();
			}
		}
		double[] central = getCentralPoint(city);

		System.out.printf("The central city is at (%.1f, %.1f)\n", central[X], central[Y]);
		System.out.printf("The total distance to all other cities is %.2f", central[DISTANCE]);
		input.close();
	}

	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
	}

	public static double[] getCentralPoint(double[][] points) {

		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points.length; j++) {
				if (j != i) {
					points[i][DISTANCE] += distance(points[i][X], points[i][Y], points[j][X], points[j][Y]);
				}
			}
		}
		double[] central = points[0];
		for (int i = 1; i < points.length; i++) {
			if (points[i][DISTANCE] < central[DISTANCE]) {
				central = points[i];
			}
		}

		return central;

	}
}
/*
 * 2,5 5 5,1 3 1 9 5,4 54 5,5 2,1
 */