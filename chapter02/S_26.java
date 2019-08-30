package bolum02;

import java.util.Scanner;

public class S_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the value for feet: ");
		double feet = input.nextDouble();

		double meter = 0.305 * feet;
		System.out.println(feet + " feet is " + meter + " meters");

		input.close();

	}

}
