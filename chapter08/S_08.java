package chapter08;

import java.util.Scanner;

public class S_08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of points: ");
		int numberOfPoints = input.nextInt();

		double points[][] = new double[numberOfPoints][2];
		System.out.print("Enter 8 points: ");
		for (int i = 0; i < points.length; i++) {
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}
		int p1 = -1;
		int p2 = -1;
		double closestDistance = Double.MAX_VALUE;
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distances = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
				if (closestDistance >= distances) {
					p1 = i;
					p2 = j;
					closestDistance = distances;
					System.out.println("The closest two points are (" + points[p1][0] + "," + points[p1][1] + ") and ("
							+ points[p2][0] + "," + points[p2][1] + ")");
				}
			}
		}
		System.out.print("Their distance is " + closestDistance);
		input.close();
	}

//0 0 1 1 -1 -1 2 2 -2 -2 -3 -3 -4 -4 5 5
	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
	}

}
