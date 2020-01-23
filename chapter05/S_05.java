package bolum05;

public class S_05 {

	public static void main(String[] args) {

		System.out.println("Kilograms\tPounds\t | \tPounds\tKilograms");
		for (double kg1 = 1, pound2 = 20; kg1 < 200 && pound2 <= 515; kg1 += 2, pound2 += 5) {

			double pound1 = kg1 * 2.2;
			System.out.printf("%3d\t\t%6.1f\t | ", (int) kg1, (int) (pound1 * 100) / 100.0);

			double kg2 = pound2 / 2.2;
			System.out.printf("\t%3d\t%6.2f\n", (int) pound2, (int) (kg2 * 100) / 100.0);

		}

	}
}