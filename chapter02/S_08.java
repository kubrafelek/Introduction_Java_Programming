/*(Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
the current time in GMT. Revise the program so it prompts the user to enter the
time zone offset to GMT and displays the time in the specified time zone.*/

package bolum02;

import java.util.Scanner;

public class S_08 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the time zone offset to GMT: ");
		long timeZoneOffset = input.nextInt();

		long totalMilliseconds = System.currentTimeMillis();

		long totalSeconds = totalMilliseconds / 1000;

		long currentSecond = totalSeconds % 60;

		long totalMinutes = totalSeconds / 60;

		long currentMinute = totalMinutes % 60;

		long totalHours = totalMinutes / 60;

		long currentHour = (totalHours + timeZoneOffset) % 24;

		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);

		input.close();
	}
}
