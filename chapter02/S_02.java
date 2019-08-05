package bolum02;

import java.util.Scanner;

/*(Compute the volume of a triangle) Write a program that reads in the length of
sides of an equilateral triangle and computes the area and volume using the following
formulas:
area = ((1/2)sqrt3 / 4) * (length of sides)2
volume = area * length
*/

public class S_02 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of sides and height of the Equilateral triangle: ");
		double length = input.nextDouble();
		double heigth = input.nextDouble();

		double area = Math.PI * length * length;
		double volume = area * heigth;
		System.out.println("The area is: " + area);
		System.out.println("The volume of the Triangular prism is " + volume);

		input.close();
	}
}
