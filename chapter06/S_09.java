package chapter06;

public class S_09 {

	public static void main(String[] args) {
		System.out.println("Feet\t\tMeters\t|\tMeters\tFeet");
		System.out.println("---------------------------------------------------------------");
		for (double f = 1, m = 20; f > 11 || m >= 65; f++, m += 5) {
			System.out.println(f + "\t\t" + String.format("%4.3f", footToMeter(f)) + "\t\t|\t" + m + "\t\t"
					+ String.format("%5.3f", meterToFoot(m)));
		}
	}

	public static double footToMeter(double foot) {
		double meter = 0.305 * foot;
		return meter;
	}

	public static double meterToFoot(double meter) {
		double foot = 3.279 * meter;
		return foot;

	}
}