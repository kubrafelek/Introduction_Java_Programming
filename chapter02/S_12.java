/*Physics: finding runway length) Given an airplane’s acceleration a and take-off
speed v, you can compute the minimum runway length needed for an airplane to
take off using the following formula: length = v2 / 2a.
Write a program that prompts the user to enter v in meters/second (m/s) and the
acceleration a in meters/second squared (m/s2), and displays the minimum runway length.*/

package bolum02;

import java.util.Scanner;

public class S_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the speed and acceleration: ");
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();

		System.out.println("The minimum runway length for this airplane is " + (speed * speed) / (acceleration * 2));
		input.close();

	}
}
