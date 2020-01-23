package chapter06;

public class S_11 {

	public static void main(String[] args) {
		System.out.println("Sales Amount\tCommission");
		System.out.println("---------------------------");
		for (int salesAmount = 10_000; salesAmount <= 100_000; salesAmount += 5_000) {
			System.out.println(salesAmount + "\t\t" + String.format("%6.1f", computeCommission(salesAmount)));
		}
	}

	public static double computeCommission(double salesAmount) {
		double commission = 0;
		while (true) {
			if (salesAmount < 5_000)
				commission = (salesAmount * 0.08);
			else if (salesAmount < 10_000)
				commission = (5_000 * 0.08) + ((salesAmount - 5_000) * 0.10);
			else
				commission = (5_000 * 0.08) + ((10_000 - 5_000) * 0.10) + ((salesAmount - 10_000) * 0.12);
			return commission;
		}
	}

}
