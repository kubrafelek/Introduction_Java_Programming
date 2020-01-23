package bolum05;

public class S_03 {

	public static void main(String[] args) {

		final double POUNDS_PER_kg = 2.2;
		System.out.print("Kilograms\tPounds\n");

		for (int kg = 1; kg < 200; kg += 2) {
			double pounds = POUNDS_PER_kg * kg;
			System.out.printf("%3d\t\t%5.1f\n", kg, pounds);
		}

	}

}
