package bolum03;

import java.util.Scanner;

/*(Current time) Revise Programming Exercise 2.8 to display the hour using a
12-hour clock. 
Enter the time zone offset to GMT: -5
The current time is 4:50:34 AM
*/

public class S_30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the time zone offset to GMT:");

		int timeZone = input.nextInt();

		long totalMilliSeconds = System.currentTimeMillis();

		long totalSeconds = totalMilliSeconds / 1000;

		long currentSecond = totalSeconds % 60;

		long totalMinutes = totalSeconds / 60;

		long currentMinute = totalMinutes % 60;

		long totalHours = totalMinutes / 60;

		long currentHour = (totalHours + timeZone) % 24;

		String amPm = "AM";
		if (currentHour > 12) {
			amPm = "PM";
			currentHour -= 12;
		}

		System.out.println(
				"The current time is: " + currentHour + ":" + currentMinute + ":" + currentSecond + " " + amPm);

		input.close();
	}

}
