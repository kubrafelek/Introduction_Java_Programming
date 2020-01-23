package chapter06;

import java.util.Scanner;

public class S_36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of sides: ");
		int numberOfSides = input.nextInt();
		System.out.print("\nEnter the side: ");
		double side = input.nextDouble();
		System.out.println("The area of the polygon is " + area(numberOfSides, side));
		input.close();
	}

	public static double area(int n, double side) {
		return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
	}

}
