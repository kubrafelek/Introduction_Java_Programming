package bolum04;

import java.util.Scanner;

/*(Geometry: area of a regular polygon) A regular polygon is an n-sided polygon in
which all sides are of the same length and all angles have the same degree (i.e., the
polygon is both equilateral and equiangular).Write a program that prompts the user to enter the
number of sides and their length of a regular polygon and displays its area.*/

public class S_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of sides: ");
		double number = input.nextDouble();

		System.out.println("Enter the side: ");
		double sides = input.nextDouble();

		double area = (number * Math.pow(sides, 2)) / (4 * Math.tan(Math.PI / number));
		System.out.println("The area of the polygon is " + (int) (area * 100) / 100.0);

		input.close();
	}

}
