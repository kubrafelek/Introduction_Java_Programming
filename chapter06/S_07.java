package chapter06;

import java.util.Scanner;

public class S_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("The amount invested: ");
		int amount = input.nextInt();
		System.out.print("\nAnnual Interest Rate: ");
		double annualInterestRate = input.nextDouble();

		System.out.println("Years\tFuture Value");
		System.out.println("---------------------\n");
		for (int i = 1; i < 31; i++) {
			double monthlyInterestRate = annualInterestRate / 1200;
			System.out.printf("%1d\t%6.2f\n", i, futureInvestmentValue(amount, monthlyInterestRate, i));
		}
		input.close();
	}

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		double futureValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (years * 12));
		return futureValue;
	}
}
