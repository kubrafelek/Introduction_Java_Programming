package bolum05;

import java.util.Scanner;

public class S_31 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter an amount: ");
		double amount = input.nextInt();

		System.out.println("Enter the annual percentage: ");
		double annualPercentage = input.nextDouble();

		System.out.println("Enter the number of months: ");
		int months = input.nextInt();

		System.out.print("Months\t\tCD value\n");
		for (int count = 1; count <= months; count++) {
			amount *= (1.0 + (annualPercentage / 1200));

			System.out.printf("%5d%20.3f\n", count, amount);
		}

		input.close();
	}

}
