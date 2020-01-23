package bolum03;

import java.util.Scanner;

/*(Science: day of the week) Zeller’s congruence is an algorithm developed by
Christian Zeller to calculate the day of the week.*/

public class S_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the year: ");
		int year = input.nextInt();

		System.out.println("Enter the month: 1-12: ");
		int m = input.nextInt();

		System.out.println("Enter the day of the month: 1-31: ");
		int q = input.nextInt();

		if (m == 1) {
			m = 13;
			year--;
		} else if (m == 2) {
			m = 14;
			year--;
		}
		
		int j = year / 100;

		int k = year % 100;

		int h = (q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
		
		System.out.print("Day of the week is ");
		
		switch (h) {
		case 0:System.out.print("Saturday"); break;
		case 1:System.out.print("Sunday"); break;
		case 2:System.out.print("Monday"); break;
		case 3:System.out.print("Tuesday"); break;
		case 4:System.out.print("Wednesday"); break;
		case 5:System.out.print("Thursday"); break;
		case 6:System.out.print("Friday"); break;
		}
		
		input.close();
	}
}
