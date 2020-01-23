package bolum04;

import java.util.Scanner;

/*(Decimal to hex) Write a program that prompts the user to enter an integer between
0 and 15 and displays its corresponding hex number.*/

public class S_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a decimal value (1-15): ");
		int value = input.nextInt();

		if (1 <= value && value <= 9) {
			System.out.println("The hex value is " + value);
		} else if (10 <= value && value <= 15) {
			int hex = ('A' + value - 10);
			System.out.println("The hex value is " + (char)hex);
		} else {
			System.out.println(value + " is invalid input :(");
		}
        
		input.close();
	}

}
