package bolum04;

import java.util.Scanner;

/*(Find the Unicode of a character) Write a program that receives a character and
displays its Unicode.*/

public class S_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a character: ");

		String s = input.nextLine();
		char ch = s.charAt(0);

		System.out.println("The character entered is " + (int) ch);

		input.close();

	}

}
