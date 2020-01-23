package bolum05;

import java.util.Scanner;

public class S_41 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int max = 0;
		int maxCount = 0;

		System.out.print("Enter the number: ");

		while(true) {
			int number = input.nextInt();
			if (number == 0)
				break;
			
			if (number > max) {
				max = number;
				maxCount = 0;
			} else if (number == max) {
				maxCount++;
			}
		}

		System.out.println(max + " is max number and " + maxCount + " times in the series.");

		input.close();
	}

}
