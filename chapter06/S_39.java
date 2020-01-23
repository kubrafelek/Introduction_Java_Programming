package chapter06;

import java.util.Scanner;

public class S_39 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a three points for p0, p1, p2: ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		if (leftOfTheLine(x0, y0, x1, y1, x2, y2)) {
			System.out.println("(" + x2 + "," + y2 + ")  is the left side on the line from (" + x0 + "," + y0 + ") to ("
					+ x1 + "," + y1 + ")");
		} else if (RightOfTheLine(x0, y0, x1, y1, x2, y2)) {
			System.out.println("(" + x2 + "," + y2 + ") is on the right side on the line from (" + x0 + "," + y0
					+ ") to (" + x1 + "," + y1 + ")");
		} else if (onTheSameLine(x0, y0, x1, y1, x2, y2)) {
			if (onTheLineSegment(x0, y0, x1, y1, x2, y2)) {
				System.out.println("(" + x2 + "," + y2 + ")  is on the line segment (" + x0 + "," + y0 + ") to (" + x1
						+ "," + y1 + ")");
			} else {
				System.out.println("(" + x2 + "," + y2 + ")  is on the same line (" + x0 + "," + y0 + ") to (" + x1
						+ "," + y1 + ")");
			}
		}
		input.close();

	}

	private static boolean RightOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		double formul = ((x1 - x0) * (y2 - y0)) - ((x2 - x0) * (y1 - y0));
		if (formul < 0) {
			return true;
		}
		return false;
	}

	public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		double formul = ((x1 - x0) * (y2 - y0)) - ((x2 - x0) * (y1 - y0));
		if (formul > 0) {
			return true;
		}
		return false;
	}

	public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		double formul = ((x1 - x0) * (y2 - y0)) - ((x2 - x0) * (y1 - y0));
		if (formul >= 0) {
			return true;
		}
		return false;
	}

	public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {

		if (onTheSameLine(x0, y0, x1, y1, x2, y2)) {
			if ((x0 < x2 && x2 < x1) || (x1 < x2 && x2 < x0) || (y1 < y2 && y2 < y0) || (y0 < y2 && y2 < y1)) {
				return true;
			}
		}
		return false;
	}

}
