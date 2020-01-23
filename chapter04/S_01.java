package bolum04;

import java.util.Scanner;

/*(Geometry: area of a pentagon) Write a program that prompts the user to enter
the length from the center of a pentagon to a vertex and computes the area of the
pentagon, as shown in the following figure.
where r is the length from the center of a pentagon to a vertex. Round up two digits
after the decimal point. Here is a sample run:*/

public class S_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the lenght from the center to a vertex: ");
		double vertex = input.nextDouble();

		double side = 2 * vertex * (Math.sin(Math.PI / 5));

		double area = (5 * side * side) / (4 * Math.tan(Math.PI / 5));

		System.out.println("The area is " + ((int)(area * 100 ))/ 100.0);

		input.close();
	}

}
