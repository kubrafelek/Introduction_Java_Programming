package bolum04;

import java.util.Scanner;

/*(Financial application: payroll) Write a program that reads the following information
and prints a payroll statement:
Employee’s name (e.g., Smith)
Number of hours worked in a week (e.g., 10)
Hourly pay rate (e.g., 9.75)
Federal tax withholding rate (e.g., 20%)
State tax withholding rate (e.g., 9%)*/

public class S_23 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter employee's name: ");
		String name = input.nextLine();

		System.out.println("Enter a number of hours in a week: ");
		double numberOfHours = input.nextDouble();

		System.out.println("Enter hourly pay rate: ");
		double hourlyPayRate = input.nextDouble();

		System.out.println("Enter federal tax withhoulding rate: ");
		double federalTaxRate = input.nextDouble();

		System.out.println("Enter state tax withhoulding rate: ");
		double stateTaxRate = input.nextDouble();

		System.out.println("Employee name: " + name);

		System.out.println("Hours Worked: " + numberOfHours);

		System.out.println("Pay Rate: " + (hourlyPayRate / numberOfHours));

		System.out.println("Gross Pay: " + (numberOfHours * hourlyPayRate));

		System.out.println("Deductions: \n");

		System.out.println("Federal Withhoulding (%20.0): " + federalTaxRate);
		federalTaxRate = (numberOfHours * hourlyPayRate) * 0.2;

		System.out.println("State Withhoulding (%9.0): " + stateTaxRate);
		stateTaxRate = (hourlyPayRate / numberOfHours) * 0.09;

		System.out.println("Total deduction: " + ((numberOfHours * hourlyPayRate) * 0.2)
				+ ((hourlyPayRate / numberOfHours) * 0.09));

		System.out.println("Net Pay: " + ((numberOfHours * hourlyPayRate)
				- (((numberOfHours * hourlyPayRate) * 0.2) + ((hourlyPayRate / numberOfHours) * 0.09))));

		input.close();
	}

}
