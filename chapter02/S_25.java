package bolum02;

import java.util.Scanner;

public class S_25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the radius and length of a cylinder: ");
		double radius = input.nextDouble();
		double lengthOfCylinder = input.nextDouble();

		double area = radius * radius * Math.PI;

		double volume = area * lengthOfCylinder;

		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);

		input.close();
	}

}
