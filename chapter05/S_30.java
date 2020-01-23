package bolum05;

import java.util.Scanner;

public class S_30 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter an amount: ");
		double amount = input.nextDouble();

		System.out.println("Enter an annual interest rate: ");
		double annualInterestRate = input.nextDouble();

		System.out.println("Enter the number of months: ");
		int numberOfMonths = input.nextInt();

		double monthlyInterestRate = annualInterestRate / 1200;

		
		double sum = 0;

		for (int i = 0; i < numberOfMonths; i++) {
			sum = amount + sum * (1 + monthlyInterestRate);
		}
		
		sum = sum * (1 + monthlyInterestRate);
		
		System.out.println("After the " + numberOfMonths + " months, the account values is " + sum);
		input.close();
	}

}
