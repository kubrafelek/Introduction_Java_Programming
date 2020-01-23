package bolum03;

import java.util.Scanner;

/*(Financials: currency exchange) Write a program that prompts the user to enter
the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the user
to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from
Chinese RMB and U.S. dollars. Prompt the user to enter the amount in U.S. dollars
or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.*/

public class S_31 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the exchange rate from dollars to RMB: ");

		double exchangeRate = input.nextDouble();

		System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");

		int convert = input.nextInt();

		if (convert == 0) {
			System.out.println("Enter the dollar amount: ");
			double amount = input.nextDouble();
			double exchange = exchangeRate * amount;
			System.out.println(amount + "$ is " + exchange + " yuan");

		} else if (convert == 1) {
			System.out.println("Enter the RMB amount: ");
			double amount = input.nextDouble();
			double exchange = exchangeRate / amount;
			System.out.println(amount + " yuan is " + exchange + "$ dollars");
		
		} else {
			System.out.println("Incorrect input.");
		}

		input.close();
	}

}
