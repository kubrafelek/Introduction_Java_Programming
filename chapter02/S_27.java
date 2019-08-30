package bolum02;

import java.util.Scanner;

public class S_27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number in pounds: ");
		double number = input.nextDouble();

		double kilograms = number * 0.454;
		System.out.println(number + " pounds  is " + kilograms + " kilograms");

		input.close();

	}

}
