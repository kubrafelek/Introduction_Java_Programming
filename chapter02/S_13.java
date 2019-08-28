/*(Financial application: compound value) Suppose you save $100 each month
into a savings account with the annual interest rate 5%. Thus, the monthly interest
rate is 0.05/12 = 0.00417. After the first month, the value in the account
becomes
        100 * (1 + 0.00417) = 100.417
After the second month, the value in the account becomes
        (100 + 100.417) * (1 + 0.00417) = 201.252
After the third month, the value in the account becomes
        (100 + 201.252) * (1 + 0.00417) = 302.507
and so on.
Write a program that prompts the user to enter a monthly saving amount and
displays the account value after the sixth month.*/

package bolum02;

import java.util.Scanner;

public class S_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the montly saving amount: ");
		double amount = input.nextDouble();

		double first = amount * (1 + 0.00417);
		double second = (amount + first) * (1 + 0.00417);
		double third = (amount + second) * (1 + 0.00417);
		double fourth = (amount + third) * (1 + 0.00417);
		double fifth = (amount + fourth) * (1 + 0.00417);
		double six = (amount + fifth) * (1 + 0.00417);

		System.out.println("After the first mounth, the account value is " + first);
		System.out.println("After the second mounth, the account value is " + second);
		System.out.println("After the third mounth, the account value is " + third);
		System.out.println("After the six mounth, the account value is " + six);

		input.close();
	}

}
