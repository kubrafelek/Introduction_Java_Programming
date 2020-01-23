package bolum03;

import java.util.Scanner;

/*(Find future dates) Write a program that prompts the user to enter an integer for
today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6). Also
prompt the user to enter the number of days after today for a future day and display
the future day of the week. Here is a sample run:*/

public class S_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the today's day: ");
		int day = input.nextInt();

		System.out.println("Enter the number of days elapsed since today: ");
		int elapsedDays = input.nextInt();

		int futureDay = (day + elapsedDays) % 7;

		String dayStr = findDayStr(day);
		String futureDayStr = findDayStr(futureDay);

		System.out.println(" Today is " + dayStr + " and the future day is " + futureDayStr);

		input.close();

	}

	private static String findDayStr(int day) {
		String dayStr;
		if (day == 0) {
			dayStr = "Sunday";
		} else if (day == 1) {
			dayStr = "Monday";
		} else if (day == 2) {
			dayStr = "Tuesday";
		} else if (day == 3) {
			dayStr = "Wednesday";
		} else if (day == 4) {
			dayStr = "Thursday";
		} else if (day == 5) {
			dayStr = "Friday";
		} else {
			dayStr = "Saturday";
		}
		return dayStr;
	}
}