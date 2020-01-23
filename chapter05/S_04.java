package bolum05;

public class S_04 {

	public static void main(String[] args) {
		final double MILE_PER_KM = 1.609;

		System.out.println("Miles\t\tKilometers");

		for (int miles = 1; miles <= 10; miles++) {
			double kilometers = MILE_PER_KM * miles;
			System.out.printf("%3d\t\t%6.3f\n", miles,  kilometers);
		}
	}
}
