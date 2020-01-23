package bolum03;

import java.util.Scanner;

/*(Financial: compare costs) Suppose you shop for rice in two different packages.
You would like to write a program to compare the cost. The program prompts the
user to enter the weight and price of the each package and displays the one with
the better price.*/

public class S_33 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the weight and price for package1: ");
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();

		System.out.println("Enter the weight and price for package2: ");
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();

		if (weight1 < weight2 && price1 < price2) {
			System.out.println("Package 1 better other one!");
		} else if (weight1 > weight2 && price1 > price2) {
			System.out.println("Package 2 better other one!");
		} else if (weight1 / price1 == weight2 / price2) {
			System.out.println("Two package have the same price :/");
		}

		input.close();
	}
}
