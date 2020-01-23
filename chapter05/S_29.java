package bolum05;

import java.util.Scanner;

public class S_29 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the year and first day of the year: ");
		int year = input.nextInt();
		int day = input.nextInt();

		int numberOfDaysInMonth = 0;

		for (int month = 1; month <= 12; month++) {

			switch (month) {
			case 1:
				System.out.println("\t\tJanuary " + year);
				numberOfDaysInMonth = 31;
				break;
			case 2:
				System.out.println("\t\tFebruary " + year);
				if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
					numberOfDaysInMonth = 29;
				else
					numberOfDaysInMonth = 28;
				break;
			case 3:
				System.out.println("\t\tMarch " + year);
				numberOfDaysInMonth = 31;
				break;
			case 4:
				System.out.println("\t\tApril " + year);
				numberOfDaysInMonth = 30;
				break;
			case 5:
				System.out.println("\t\tMay " + year);
				numberOfDaysInMonth = 31;
				break;
			case 6:
				System.out.println("\t\tJune " + year);
				numberOfDaysInMonth = 30;
				break;
			case 7:
				System.out.println("\t\tJuly " + year);
				numberOfDaysInMonth = 31;
				break;
			case 8:
				System.out.println("\t\tAugust " + year);
				numberOfDaysInMonth = 31;
				break;
			case 9:
				System.out.println("\t\tSeptember " + year);
				numberOfDaysInMonth = 30;
				break;
			case 10:
				System.out.println("\t\tOctober " + year);
				numberOfDaysInMonth = 31;
				break;
			case 11:
				System.out.println("\t\tNovember " + year);
				numberOfDaysInMonth = 30;
				break;
			case 12:
				System.out.println("\t\tDecember " + year);
				numberOfDaysInMonth = 31;
				break;
			}
			System.out.println("--------------------------------------------");

			System.out.printf("%6s%6s%6s%6s%6s%6s%6s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");

			day = (day) % 7;

			for (int i = 0; i < day; i++) {
				System.out.print("      ");
			}

			for (int i = 1; i <= numberOfDaysInMonth; i++) {
				System.out.printf("%6d", i);

				if (day % 7 == 6) {
					System.out.println();
				}
				day += 1;
			}

			System.out.println();
		}

		input.close();
	}

}
