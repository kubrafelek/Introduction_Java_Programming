package chapter06;

public class S_12 {
	
	static int numberPerLine = 10;

	public static void main(String[] args) {
		printChars('1', 'Z');
	}

	public static void printChars(char ch1, char ch2) {
		for (char i = '1'; i <= 'Z'; i++) {
			System.out.print(i + " ");
			if ((i + 2) % numberPerLine == 0) {
				System.out.println();
			}
		}
	}
}
