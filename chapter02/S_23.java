/*(Cost of driving) Write a program that prompts the user to enter the distance to
drive, the fuel efficiency of the car in miles per gallon, and the price per gallon,
and displays the cost of the trip.*/

package bolum02;

import java.util.Scanner;

public class S_23 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the driving distance: ");
		double distance = input.nextDouble();
		System.out.println("Enter miles per gallon: ");
		double miles = input.nextDouble();
		System.out.println("Enter price per gallon: ");
		double price = input.nextDouble();

		double cost = (distance * price) / miles;
		
		System.out.println("The cost of driving is $" + cost);
		
		input.close();
	}
}
