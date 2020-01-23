package chapter07;

import java.util.Scanner;

public class S_35 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String words[] = { "love", "book", "glass", "lock" };
		int randIndex = (int) (Math.random() * words.length);
		char[] myWord = words[randIndex].toCharArray();
		char[] mysteryWord = words[randIndex].toCharArray();
		for (int i = 0; i < mysteryWord.length; i++) {
			mysteryWord[i] = '*';
		}
		int missingCount = 0;
		while (true) {
			System.out.print("(Guess) Enter a letter in word ");
			System.out.print(mysteryWord);
			System.out.print(" > ");
			char user = input.next().charAt(0);
			if (isIn(mysteryWord, user)) {
				System.out.println(user + " is already in the word");
				continue;
			}
			if (isIn(myWord, user) == false) {
				System.out.println(user + " is not in the word");
				missingCount++;
				continue;
			}
			for (int i = 0; i < myWord.length; i++) {
				if (user == myWord[i]) {
					mysteryWord[i] = user;
				}
			}
			if (isCompleted(mysteryWord)) {
				System.out.print("the word is the ");
				System.out.print(myWord);
				System.out.print(". You miss " + missingCount);
				if (missingCount > 1)
					System.out.println(" times ");
				else
					System.out.println(" time ");
				System.out.println("Do you want to guess another word? Enter y or n >");
				char answer = input.next().charAt(0);
				if (answer == 'y') {
					myWord = words[(int) (Math.random() * words.length)].toCharArray();
					mysteryWord = new char[myWord.length];
					for (int i = 0; i < mysteryWord.length; i++) {
						mysteryWord[i] = '*';
					}
					continue;
				} else {
					System.out.println("GAME OVER...");
					break;
				}
			}
		}
		input.close();
	}

	private static boolean isCompleted(char[] secretWord) {
		for (int i = 0; i < secretWord.length; i++) {
			char ch = secretWord[i];
			if (ch == '*') {
				return false;
			}
		}
		return true;
	}

	private static boolean isIn(char[] secretWord, char ch) {
		for (int i = 0; i < secretWord.length; i++) {
			char c = secretWord[i];
			if (c == ch) {
				return true;
			}
		}
		return false;
	}

}
