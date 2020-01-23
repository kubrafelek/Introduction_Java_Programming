package chapter06;

import java.util.Scanner;

public class S_34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = input.nextInt();
		System.out.println("Enter the month: 1-12: ");
		int month = input.nextInt();
		System.out.print("Enter the day of the month: ");
		int numberOfTheDay = input.nextInt();

		printMonth(year, month, numberOfTheDay);

		input.close();
	}

	public static void printMonth(int year, int month, int numberOfDay) {

		printMonthTitle(year, month);
		printMonthBody(year, month, numberOfDay);
	}

	public static void printMonthTitle(int year, int month) {
		System.out.println(" " + (getMonthName(month)) + " " + year);
		System.out.println("-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}

	public static String getMonthName(int month) {
		String monthName = "";
		switch (month) {
		case 1:
			monthName = ("January");
			break;
		case 2:
			monthName = ("February");
			break;
		case 3:
			monthName = ("March");
			break;
		case 4:
			monthName = ("April");
			break;
		case 5:
			monthName = ("May");
			break;
		case 6:
			monthName = ("June");
			break;
		case 7:
			monthName = ("July");
			break;
		case 8:
			monthName = ("August");
			break;
		case 9:
			monthName = ("September");
			break;
		case 10:
			monthName = ("October");
			break;
		case 11:
			monthName = ("November");
			break;
		case 12:
			monthName = ("December");
			break;
		}
		return monthName;
	}

	public static void printMonthBody(int year, int month, int numberOfDay) {
		int startDay = getStartDay(year, month);

		int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
		int i = 0;
		for (i = 0; i < startDay; i++)
			System.out.print("    ");
		for (i = 1; i <= numberOfDaysInMonth; i++) {
			System.out.printf("%4d", i);

			if ((i + startDay) % 7 == 0)
				System.out.println();
		}
		System.out.println();
		System.out.println(startDayOfMonth(year, month, numberOfDay));
	}

	public static int startDayOfMonth(int year, int month, int numberOfTheDay) {
		int j = year / 100;

		int k = year % 100;

		int h = (numberOfTheDay + ((26 * (month + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

		System.out.print("Day of the week is ");

		switch (h) {
		case 0:
			System.out.print("Saturday ");
			break;
		case 1:
			System.out.print("Sunday ");
			break;
		case 2:
			System.out.print("Monday ");
			break;
		case 3:
			System.out.print("Tuesday ");
			break;
		case 4:
			System.out.print("Wednesday ");
			break;
		case 5:
			System.out.print("Thursday ");
			break;
		case 6:
			System.out.print("Friday ");
			break;
		}
		return h + 1;
	}

	public static int getStartDay(int year, int month) {
		final int START_DAY_FOR_JAN_1_1800 = 3;
		int totalNumberOfDays = getTotalNumberOfDays(year, month);
		return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
	}

	public static int getTotalNumberOfDays(int year, int month) {
		int total = 0;
		for (int i = 1800; i < year; i++)
			if (isLeapYear(i))
				total = total + 366;
			else
				total = total + 365;

		for (int i = 1; i < month; i++)
			total = total + getNumberOfDaysInMonth(year, i);

		return total;
	}

	public static int getNumberOfDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;

		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;

		if (month == 2)
			return isLeapYear(year) ? 29 : 28;
		return 0;
	}

	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
			return true;

		return false;
	}
}
