package bolum05;

import java.util.Scanner;

public class S_21 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the loan amount: ");
		double loanAmount = input.nextDouble();

		System.out.println("Enter the number of years for loan periods: ");
		int numberOfYears = input.nextInt();

		System.out.printf("%-18s%-18s%-18s\n", "Interest Rate", "Monthly Payment", "Total Payment");

		for (double annualInterestRate = 5.0; annualInterestRate <= 8.0; annualInterestRate = annualInterestRate +  (1.0 / 8)) {

			double monthlyInterestRate = annualInterestRate / 1200;

			double monthlyPayment = (loanAmount * monthlyInterestRate)
					/ (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));

			double totalPayment = monthlyPayment * numberOfYears * 12;

			System.out.printf("%-18.3f%-18.2f%-18.2f\n", annualInterestRate, monthlyPayment, totalPayment);
		}

		input.close();
	}

}
