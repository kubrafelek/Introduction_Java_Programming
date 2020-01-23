package bolum04;

import java.util.Scanner;

/*(Process a string) Write a program that prompts the user to enter a string and displays
its length and its first character.*/

public class S_20 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = input.nextLine();

		System.out.println(str.length() + " " + str.charAt(0));

		input.close();

	}

}
