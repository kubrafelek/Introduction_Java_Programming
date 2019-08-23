/*(Physics: acceleration) Average acceleration is defined as the change of velocity
divided by the time taken to make the change, as given by the following formula:
a = (v1 - v0) / t . Write a program that prompts the user to enter the starting velocity v0 in meters/
second, the ending velocity v1 in meters/second, and the time span t in seconds,
then displays the average acceleration. */

package bolum02;

import java.util.Scanner;

public class S_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter v0, v1 and t: ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double time = input.nextDouble();

		System.out.println("The average acceleration is " + ((v1 - v0) / time));
		input.close();
	}
}
