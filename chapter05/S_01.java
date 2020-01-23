package bolum05;

import java.util.Scanner;

public class S_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer, the input ends if it is 0: ");
		
		int positive = 0;
		int negative = 0;
		int count = 0;
		int sum = 0;

		while (true) {
			int number = input.nextInt();
			if (number == 0) {
				break;
			}

			if (number > 0) {
				positive++;
			} else if (number < 0) {
				negative++;
			}

			sum += number;
			count++;
		}

		System.out.println("The number of positives is " + positive);
		System.out.println("The number of negatives is " + negative);
		System.out.println("The total is " + sum);

		double average = (double) sum / count;
		System.out.println("The average is " + average);
		input.close();
	}

}
