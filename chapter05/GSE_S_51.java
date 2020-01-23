package bolum05;

import java.util.Scanner;

public class GSE_S_51 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter year: ");
		int year = input.nextInt();
		input.close();

		while (year != -1) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				System.out.println("It's leap year!");
			else
				System.out.println("It's not leap year!");
			break;
		}
		if (year == -1)
			System.out.println("OVER!");
	}
}
