package bolum05;

import java.util.Scanner;

public class S_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number: ");
		int number = input.nextInt();

		int d = 2;
		while (d <= number) {
			if (number % d == 0) {
				number /= d;
				System.out.print(d + " ");
			} else {
				d++;
			}
		}
		input.close();
	}

}