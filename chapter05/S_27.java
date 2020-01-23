package bolum05;

public class S_27 {

	public static void main(String[] args) {

		final int NUMBER_OF_LEAPYEARS = 10;
		int count = 1;
		boolean isLeapYear;
		int sumOfLeapYear = 0;

		for (int year = 101; year <= 2100; year++) {

			isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

			if (isLeapYear) {
				System.out.printf(" %5d ", year);
				sumOfLeapYear += year;

				if (count % NUMBER_OF_LEAPYEARS == 0) {
					System.out.println();
				}
				count++;
			}
		}
		System.out.println("\nSum: " + sumOfLeapYear);
		System.out.println("Count is " + count);
	}

}
