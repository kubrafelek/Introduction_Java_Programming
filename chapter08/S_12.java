package chapter08;

import java.util.Scanner;

public class S_12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("(0-single filer, 1-married jointly, " + "2-married separately, 3-head of household)\n"
				+ "Enter the filing status: ");
		int status = input.nextInt();
		System.out.print("Enter the taxable income: ");
		double income = input.nextDouble();

		double[] rates = { 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 };
		int[][] brackets = { { 8350, 33950, 82250, 171550, 372950 }, // Single filer
				{ 16700, 67900, 137050, 20885, 372950 }, // Married jointly or qualifying widow)
				{ 8350, 33950, 68525, 104425, 186475 }, // Married separately
				{ 11950, 45500, 117450, 190200, 372950 } // Head of household
		};

		System.out.printf("Tax is $%6.2f\n", computeTax(status, income, rates, brackets));
		input.close();
	}

	public static double computeTax(int status, double income, double[] rates, int[][] brackets) {
		double tax = 0;
		double incomeTaxed = 0;
		for (int i = 4; i >= 0; i--) {
			if (income > brackets[status][i]) {
				tax += (incomeTaxed = income - brackets[status][i]) * rates[i + 1];
				income -= incomeTaxed;
			}
		}
		return tax += brackets[status][0] * rates[0];
	}

}
