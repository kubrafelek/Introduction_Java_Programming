package bolum03;

import java.util.Scanner;

/*(Science: wind-chill temperature) Programming Exercise 2.17 gives a formula
to compute the wind-chill temperature. The formula is valid for temperatures in
the range between −58ºF and 41ºF and wind speed greater than or equal to 2.
Write a program that prompts the user to enter a temperature and a wind speed.
The program displays the wind-chill temperature if the input is valid; otherwise,
it displays a message indicating whether the temperature and/or wind speed is
invalid.*/

public class S_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");

		double temperature = input.nextDouble();

		System.out.println("Enter the wind speed (>=2) in miles per hour: ");

		double windSpeed = input.nextDouble();

		if (windSpeed == 2 || windSpeed > 2) {

			System.out.println("The input is valid.");
			double tempWindChill = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(windSpeed, 0.16))
					+ (0.4275 * temperature * Math.pow(windSpeed, 0.16));

			System.out.println("The wind-chill index is " + tempWindChill);

		} else {
			System.out.println("The input is invalid :(");
		}

		input.close();
	}

}
