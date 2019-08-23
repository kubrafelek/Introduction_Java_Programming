/*(Find the number of years) Write a program that prompts the user to enter the
minutes (e.g., 1 billion), and displays the number of years and remaining days for
the minutes. For simplicity, assume that a year has 365 days.*/

package bolum02;

import java.util.Scanner;

public class S_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter the number of minutes: ");
		int minutes = scn.nextInt();
		int years = minutes / (365 * 24 * 60);
		int remainingMinutes = (minutes % (365 * 24 * 60));
		int days = remainingMinutes / (24 * 60);

		// 365günde - (365*24*60)dk varsa
		// ? günde - remainingMinutes dk vardir ve ? orantidan bulduk!
		System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");

		scn.close();
	}
}
