package bolum05;

import java.util.Scanner;

public class S_49 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = input.nextLine();
		int numberOfVowel = 0;
		int numberOfConst = 0;
		str = str.toLowerCase();

		for (int i = str.length() - 1; i >= 0; i--) {
			if (!Character.isLetter(str.charAt(i)))
				continue;
			switch (str.charAt(i)) {
			case 'a':
			case 'e':
			case 'o':
			case 'u':
			case 'i':
				numberOfVowel++;
				break;
			default:
				numberOfConst++;
				break;
			}
		}
		System.out.println("The number of vowels is " + numberOfVowel);
		System.out.println("The number of constant is " + numberOfConst);
		input.close();
	}

}
