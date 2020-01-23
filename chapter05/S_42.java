package bolum05;

import java.util.Scanner;

public class S_42 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter commission sought: ");
		int commissionSought = input.nextInt();
		input.close();

		double commission = 0;
		double salesAmount = 1;
		for (; commission < commissionSought; salesAmount++) {
			if (salesAmount < 5_000)
				commission = salesAmount * 0.08;
			else if (salesAmount < 10_000)
				commission = (5_000 * 0.08) + (salesAmount - 5_000) * 0.10;
			else
				commission = (5_000 * 0.08) + (10_000 - 5_000) * 0.10 + (salesAmount - 10_000) * 0.12;
		}
		System.out.printf("Minimum sales to earn $30,000: $%.0f\n", salesAmount);
	}

}
