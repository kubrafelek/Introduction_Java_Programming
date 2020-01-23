package bolum05;

public class S_06 {

	public static void main(String[] args) {

		System.out.println("Miles\tKilograms\t|\tKilograms\tMiles");
		for (double miles = 1, km1 = 20; miles <= 10 && km1 <= 65; miles++, km1 += 5) {

			double km = miles * 1.609;
			System.out.printf("%3.0f\t%3.3f\t\t|  ", miles, km);
			double mile = km1 / 1.609;
			System.out.printf("\t%4.0f\t\t%5.3f\n", km1, mile);

		}

	}
}