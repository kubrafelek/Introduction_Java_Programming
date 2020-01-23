package bolum05;

import java.util.Scanner;

public class S_45 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		double number;

		double sum = 0;
		double standart = 0;

		for (int i = 0; i < 10; i++) {
			number = input.nextDouble();
			sum += number;
			standart += Math.pow(number, 2);
		}
		double mean = (sum / 10);
		
		standart = Math.sqrt((standart - (Math.pow(sum, 2) / 10)) / (10 - 1));

		System.out.println("The mean is " + mean);
		System.out.printf("Standart deviation is %.5f\n", standart);

		input.close();
	}

}
