package chapter06;

public class S_38 {

	public static void main(String[] args) {

		final int NUMBER_OF_CHARS = 100;
		final int CHARS_PER_LİNE = 10;
		for (int i = 0; i < NUMBER_OF_CHARS; i++) {
			if ((i + 1) % CHARS_PER_LİNE == 0) {
				System.out.println(getRandomCharacter('a', 'z'));
			}
			System.out.print(getRandomCharacter('a', 'z') + "  ");

		}
		System.out.println();
		for (int i = 0; i < NUMBER_OF_CHARS; i++) {
			if ((i + 1) % CHARS_PER_LİNE == 0) {
				System.out.println(getRandomDigitCharacter());
			}
			System.out.print(getRandomDigitCharacter() + " ");
		}
		/*
		 * System.out.println(getRandomCharacter('b', 'l'));
		 * System.out.println(getRandomLowerCaseCharacter());
		 * System.out.println(getRandomUpperCaseCharacter());
		 * System.out.println(getRandomDigitCharacter());
		 * System.out.println(getRandomCharacter());
		 */
	}

	public static char getRandomCharacter(char ch1, char ch2) {
		return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
	}

	public static char getRandomLowerCaseCharacter() {
		return getRandomCharacter('a', 'z');
	}

	public static char getRandomUpperCaseCharacter() {
		return getRandomCharacter('A', 'Z');
	}

	public static char getRandomDigitCharacter() {
		return getRandomCharacter('0', '9');
	}

	public static char getRandomCharacter() {
		return getRandomCharacter('\u0000', '\uFFFF');
	}
}
