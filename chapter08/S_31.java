package chapter08;

import java.util.Scanner;

public class S_31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double points[][] = new double[4][2];
		System.out.print("Enter the x1,y1,x2,y2,x3,y3,x4,y4: ");
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}
		getIntersectingPoint(points);
		input.close();
	}

	public static double[] getIntersectingPoint(double[][] points) {
		double[] formul = new double[6];
		formul[0] = points[0][1] - points[1][1];
		formul[1] = -(points[0][0] - points[1][0]);
		formul[2] = points[2][1] - points[3][1];
		formul[3] = -(points[2][0] - points[3][0]);
		formul[4] = formul[0] * points[0][0] + formul[1] * points[0][1];
		formul[5] = formul[2] * points[2][0] + formul[3] * points[2][1];

		double result[] = new double[2];
		double res = ((formul[0] * formul[3]) - (formul[1] * formul[2]));
		result[0] = ((formul[4] * formul[3]) - (formul[1] * formul[5])) / res;
		result[1] = ((formul[0] * formul[5]) - (formul[4] * formul[2])) / res;
		if (res != 0) {
			System.out.println("The intersecting point x is " + result[0] + " and y " + result[1]);
		} else {
			System.out.println("The two lines are parallel.");
		}
		return result;
	}
}
//2 2 5 -1,0 4,0 2,0 -1,0 -2,0
//2 2 7 6,0 4,0 2,0 -1,0 -2,0