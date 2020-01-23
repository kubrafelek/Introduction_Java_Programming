package bolum05;

public class S_39 {

	public static void main(String[] args) {
		final double COMMISSION_SOUGHT = 25_000;

		double commission;
		double salesAmount = 0;

		do {
			salesAmount += 0.01;

			if (salesAmount < 5_000)
				commission = salesAmount * 0.08;
			else if (salesAmount < 10_000)
				commission = 5_000 * 0.08 + (salesAmount - 5_000) * 0.10;
			else
				commission = 5_000 * 0.08 + (10_000 - 5_000) * 0.10 + (salesAmount - 10_000) * 0.12;

		} while (commission < COMMISSION_SOUGHT);

		System.out.printf("Minimum sales to earn $30,000: $%.0f\n", salesAmount);

	}

}
