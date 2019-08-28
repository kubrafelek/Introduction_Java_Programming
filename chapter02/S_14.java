/*(Health application: computing BMI) Body Mass Index (BMI) is a measure of
health on weight. It can be calculated by taking your weight in kilograms and
dividing by the square of your height in meters. Write a program that prompts the
user to enter a weight in pounds and height in inches and displays the BMI. Note
that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.*/

package bolum02;

import java.util.Scanner;

public class S_14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter weight in pounds: ");
		double weight = scn.nextDouble();

		System.out.println("Enter height in inches: ");
		double height = scn.nextDouble();

		System.out.println("BMI is " + (weight * 0.45359237) / (height * height * 0.0254 * 0.0254));

		scn.close();
	}

}
