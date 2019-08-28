/*(Financial application: calculate interest) If you know the balance and the annual
percentage interest rate, you can compute the interest on the next monthly payment
using the following formula:interest = balance * (annualInterestRate/1200)
Write a program that reads the balance and the annual percentage interest rate and
displays the interest for the next month.*/

package bolum02;

import java.util.Scanner;

public class S_20 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter balance and interest rate: ");
		double balance = scn.nextDouble();
		double intrate = scn.nextDouble();

		double interest = balance * (intrate / 1200);
		System.out.println("The interest is " + interest);

		scn.close();

	}

}
