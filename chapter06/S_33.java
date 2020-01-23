package chapter06;

public class S_33 {
	public static void main(String[] args) {
		long totalMillisSeconds = System.currentTimeMillis();
		long totalSeconds = totalMillisSeconds / 1000;
		long seconds = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long minutes = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long hours = totalHours % 24;
		long day = totalHours / 24;
		int currentYear = (int) (day / 365) + 1970;

		long daysInCurrentYear = (day - numberOfLeapYearsSince1970(currentYear)) % 365;
		if (hours > 0) {
			daysInCurrentYear++;
		}
		// get current month number
		int currentMonthNum = getMonthFromDays(currentYear, (int) daysInCurrentYear);
		// getting current month name
		String month = getMonthName(currentMonthNum);
		// getting day of current month
		int daysTillCurrentMonth = getNumOfDaysToReachThatMonth(currentYear, currentMonthNum);

		int startDay = getStartDay(currentYear, currentMonthNum);
		int today = (int) daysInCurrentYear - daysTillCurrentMonth;
		String dayOfWeek = dayNameOfWeek(((startDay + today) % 7));

		// Display results
		System.out.println("Current date and time: " + dayOfWeek + " " + month + " " + today + ", " + currentYear + " "
				+ (hours + 3) + ":" + minutes + ":" + seconds);
	}

	public static String dayNameOfWeek(int dayOfWeek) {

		switch (dayOfWeek) {
		case 2:
			return "Monday";
		case 3:
			return "Tuesday";
		case 4:
			return "Wednesday";
		case 5:
			return "Thursday";
		case 6:
			return "Friday";
		case 7:
			return "Saturday";
		case 1:
			return "Sunday";
		default:
			return null;
		}
	}

	public static int numberOfLeapYearsSince1970(long year) {

		int count = 0;
		for (int i = 1970; i <= year; i++) {
			if (isLeapYear(i))
				count++;
		}
		return count;
	}

	public static int getMonthFromDays(int year, int days) {
		int dayTracker = 0;
		for (int i = 1; i <= 12; i++) {

			dayTracker += getNumberOfDaysInMonth(year, i);

			if (dayTracker > days)
				return i;
		}
		return 12;
	}

	public static int getNumOfDaysToReachThatMonth(int year, int month) {
		int dayTracker = 0;
		for (int i = 1; i < month; i++) {

			dayTracker += getNumberOfDaysInMonth(year, i);

		}
		return dayTracker;
	}

	/** Get the start day of month/1/year */
	public static int getStartDay(int year, int month) {
		final int START_DAY_FOR_JAN_1_1800 = 3;
		// Get total number of days from 1/1/1800 to month/1/year
		int totalNumberOfDays = getTotalNumberOfDays(year, month);

		// Return the start day for month/1/year
		return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
	}

	/** Get the total number of days since January 1, 1800 */
	public static int getTotalNumberOfDays(int year, int month) {
		int total = 0;

		// Get the total days from 1800 to 1/1/year
		for (int i = 1800; i < year; i++)
			if (isLeapYear(i))
				total = total + 366;
			else
				total = total + 365;

		// Add days from Jan to the month prior to the calendar month
		for (int i = 1; i < month; i++)
			total = total + getNumberOfDaysInMonth(year, i);

		return total;
	}

	/** Get the number of days in a month */
	public static int getNumberOfDaysInMonth(int year, int month) {

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;

		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;

		if (month == 2)
			return isLeapYear(year) ? 29 : 28;

		return 0; // If month is incorrect
	}

	/** Determine if it is a leap year */
	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}

	/** Get the English name for the month 1-12 */
	public static String getMonthName(int month) {
		String monthName = "";
		switch (month) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
		}

		return monthName;
	}

}
