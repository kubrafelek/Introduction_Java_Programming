package bolum05;

import java.util.Scanner;

public class S_22 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the loan amount: ");
		double loanAmount = input.nextDouble();

		System.out.print("Enter the number of years: ");
		int numberOfYears = input.nextInt();

		System.out.print("Enter the Interest rate: ");
		double annualInterestRate = input.nextDouble();

		double monthlyInterestRate = annualInterestRate / 1200;

		double monthlyPayment = loanAmount * monthlyInterestRate
				/ (1 - Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12));

		double balance = loanAmount;
		double interest, principal;

		System.out.println("Monthly Payment: " + (int) (monthlyPayment * 100) / 100.0);
		System.out.println("Toatal Paymnet: " + (int) (monthlyPayment * 12 * numberOfYears * 100) / 100.0 + "\n");

		System.out.println("Payment#\tInterest\tPrincipal\tBalance");
		for (int payment = 1; payment <= numberOfYears * 12; payment++) {

			interest = (int) (monthlyInterestRate * balance * 100) / 100.0;
			principal = (int) ((monthlyPayment - interest) * 100) / 100.0;
			balance = (int) ((balance - principal) * 100) / 100.0;

			System.out.println(payment + "\t\t" + interest + "\t\t" + principal + "\t\t" + balance);
		}

		input.close();
	}

}
