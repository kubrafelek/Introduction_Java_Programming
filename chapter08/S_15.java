package chapter08;

public class S_15 {

	public static void main(String[] args) {

        double line[][] = { { 3.4, 2 }, { 6.5, 9.5 }, { 2.3, 2.3 }, { 5.5, 5 }, { -5, 4 } };
		//double line[][] = { { 1, 1 }, { 2, 2 }, { 3, 3 }, { 4, 4 }, { 5, 5 } };

		if (sameLine(line) == false) {
			System.out.println("The five points are not on the same line");
		} else {
			System.out.println("The five points are on the same line");
		}

	}

	public static boolean sameLine(double[][] points) {

		double x0 = points[0][0];
		double y0 = points[0][1];
		double x1 = points[1][0];
		double y1 = points[1][1];
		for (int i = 2; i < points.length; i++) {
			double formul = ((x1 - x0) * (points[i][1] - y0)) - ((points[i][0] - x0) * (y1 - y0));
			if (formul != 0) {
				return false;
			}
		}
		return true;
	}
}
