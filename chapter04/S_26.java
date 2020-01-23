package bolum04;

import java.util.Scanner;

/*(Financial application: monetary units) Rewrite Listing 2.10, ComputeChange.
java, to fix the possible loss of accuracy when converting a float value to an int
value. Read the input as a string such as "11.56". Your program should extract
the dollar amount before the decimal point and the cents after the decimal amount
using the indexOf and substring methods.*/

public class S_26 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Receive the amount
		System.out.print("Enter an amount in double, for example 11.56: ");
		String amount = input.next();

		int numberOfOneDollars = Integer.parseInt(amount.substring(0, amount.indexOf('.')));
		int numberOfCents = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));

		// Find the number of quarters in the remaining amount
		int numberOfQuarters = numberOfCents / 25;
		numberOfCents = numberOfCents % 25;

		// Find the number of dimes in the remaining amount
		int numberOfDimes = numberOfCents / 10;
		numberOfCents = numberOfCents % 10;

		// Find the number of nickels in the remaining amount
		int numberOfNickels = numberOfCents / 5;
		numberOfCents = numberOfCents % 5;

		// Find the number of pennies in the remaining amount
		int numberOfPennies = numberOfCents;
 
		// Display results
		System.out.println("Your amount " + amount + " consists of");
		System.out.println("\t" + numberOfOneDollars + " dollars");
		System.out.println("\t" + numberOfQuarters + " quarters ");
		System.out.println("\t" + numberOfDimes + " dimes");
		System.out.println("\t" + numberOfNickels + " nickels");
		System.out.println("\t" + numberOfPennies + " pennies");

		input.close();
	}

}
