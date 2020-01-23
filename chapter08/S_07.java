package chapter08;

public class S_07 {

	public static void main(String[] args) {
		double[][] points = { { -1, 0, 3 }, { -1, -1, -1 }, { 4, 1, 1 }, { 2, 0.5, 9 }, { 3.5, 2, -1 }, { 3, 1.5, 3 },
				{ -1.5, 4, 2 }, { 5.5, 4, -0.5 } };

		int p1 = 0;
		int p2 = 1;
		double shorthestDistance = distance(points[p1][0], points[p1][1], points[p1][2], points[p2][0], points[p2][1],
				points[p2][2]);
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points[i].length; j++) {
				double distance = distance(points[i][0], points[i][1], points[i][2], points[j][0], points[j][1],
						points[j][2]);
				if (shorthestDistance > distance) {
					p1 = i;
					p2 = j;
					shorthestDistance = distance;
				}
			}
		}
		System.out.println("The closest two points are (" + points[p1][0] + ", " + points[p1][1] + ", " + points[p1][2]
				+ ") and" + " (" + points[p2][0] + ", " + points[p2][1] + ", " + points[p2][2] + ").");
	}

	public static double distance(double x1, double x2, double y1, double y2, double z1, double z2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2 - z1) * (z2 - z1));
	}

}
