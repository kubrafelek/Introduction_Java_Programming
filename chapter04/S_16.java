package bolum04;

/*(Random character) Write a program that displays a random uppercase letter
using the Math.random() method.*/

public class S_16 {

	public static void main(String[] args) {

		int letter = (int) (Math.random() * 50) + 40;

		char ch = (char) letter;
		
		System.out.println("Input: " + ch);
	}

}
