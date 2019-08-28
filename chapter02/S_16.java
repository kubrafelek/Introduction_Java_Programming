/*(Geometry: area of a hexagon) Write a program that prompts the user to enter the
side of a hexagon and displays its area. The formula for computing the area of a
hexagon is
Area =  (3^(1/2)3 / 2) * s2 , s is the length of a side*/

package bolum02;

import java.util.Scanner;

public class S_16 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the side: ");
		double side = input.nextDouble();

		double area = ((3 * Math.pow(3, 0.5)) / 2) * side * side;
		System.out.println("The area of the hexagon is " + area);
		input.close();
	}

}
