package bolum05;

import java.util.Scanner;

public class S_46 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String reverse = input.next();

		String result = "";
		for (int i = 0; i < reverse.length(); i++) {
			result = reverse.charAt(i) + result;
			// result'ý charAtten sonra yazmak harf eklenmesinin soldan yapýlmasýný saðlar
		}
		System.out.println("The reversed string is " + result);

		input.close();
	}

}
