package bolum04;

import java.util.Scanner;

/*(Find the character of an ASCII code) Write a program that receives an ASCII code
(an integer between 0 and 127) and displays its character.*/

public class S_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an ASCII code: ");
		int code = input.nextInt();

		char ch = (char) code;
		System.out.println("The character for ASCII code " + code + " is " + ch);

		input.close();
	}

}
