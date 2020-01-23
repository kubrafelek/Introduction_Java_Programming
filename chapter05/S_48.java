package bolum05;

import java.util.Scanner;

public class S_48 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();

		for (int j = 0; j < str.length(); j += 2)
			System.out.print(str.charAt(j));
		input.close();
	}

}
