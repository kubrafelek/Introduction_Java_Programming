package chapter07;

import java.util.Scanner;

public class S_25 {

	public static void main(String[] args) {
		double constant[] = new double[3];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, and c: ");
		for (int i = 0; i < constant.length; i++) {
			constant[i] = input.nextDouble();
		}
		System.out.println(solveQuadratic(constant));
		input.close();
	}

	public static String solveQuadratic(double[] eqn) {
		double r1 = (-eqn[1] + Math.pow((eqn[1] * eqn[1]) - (4 * eqn[0] * eqn[2]), 0.5)) / (2 * eqn[0]);
		double r2 = (-eqn[1] - Math.pow((eqn[1] * eqn[1]) - (4 * eqn[0] * eqn[2]), 0.5)) / (2 * eqn[0]);

		double discriminant = (eqn[1] * eqn[1]) - (4 * eqn[0] * eqn[2]);

		if (discriminant > 0) {
			return "The equation has a two roots " + r1 + " and " + r2;
		} else if (discriminant == 0) {
			return "The equation has a one root " + r1;
		}
		return "The equation has no real roots!!! ";
	}

}
