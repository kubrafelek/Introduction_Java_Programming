package bolum03;

import java.util.Scanner;

/*(Financial application: monetary units) Modify Listing 2.10, ComputeChange.
java, to display the nonzero denominations only, using singular words for single
units such as 1 dollar and 1 penny, and plural words for more than one unit such as
2 dollars and 3 pennies.*/

public class S_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an amount: ");
		double amount = input.nextDouble();

		int remainingAmount = (int) (amount * 100);

		int numberOfOneDollar = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;

		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;

		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;

		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;

		int numberOfPennies = remainingAmount;

		System.out.println("Your amount " + amount + " consist of ");
		if (numberOfOneDollar == 1)
			System.out.println(" " + numberOfOneDollar + " dollar");
		else if (numberOfOneDollar > 1)
			System.out.println(" " + numberOfOneDollar + " dollars ");
		if (numberOfQuarters == 1)
			System.out.println(" " + numberOfQuarters + " quarter ");
		else if (numberOfQuarters > 1)
			System.out.println(" " + numberOfQuarters + " quarters ");
		if (numberOfDimes == 1)
			System.out.println(" " + numberOfDimes + " dim ");
		else if (numberOfDimes > 1)
			System.out.println(" " + numberOfDimes + " dimes ");
		if (numberOfNickels == 1)
			System.out.println(" " + numberOfNickels + " nickel ");
		else if (numberOfNickels > 1)
			System.out.println(" " + numberOfNickels + " nickels ");
		if (numberOfPennies == 1)
			System.out.println(" " + numberOfPennies + " penny ");
		else if (numberOfPennies > 1)
			System.out.println(" " + numberOfPennies + " pennies ");
		else
			System.out.println("Your amount is zero :(");

		input.close();
	}

}
