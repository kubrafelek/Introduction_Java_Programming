package bolum04;

import java.util.Scanner;

/*(Vowel or consonant?) Write a program that prompts the user to enter a letter and
check whether the letter is a vowel or consonant.*/

public class S_13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a letter: ");
		String letter = input.nextLine();

		char ch = letter.charAt(0);
		
		if ('a' == ch || ch == 'e' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " is a vowel.");
		
		} else if ('B' <= ch || ch <= 'z') {
			System.out.println(ch + " is a constant.");
		
		} else {
			System.out.println(ch + " Invalid input...");
		}

		input.close();
	}

}
