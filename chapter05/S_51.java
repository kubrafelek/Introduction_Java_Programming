package bolum05;

import java.util.Scanner;

public class S_51 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String str1 = input.nextLine();
		System.out.print("Enter second string: ");
		String str2 = input.nextLine();

		int index = 0;
		String prefix = "";
		while (str1.charAt(index) == str2.charAt(index)) {
			prefix += str1.charAt(index);
			index++;
		}

		if (prefix.length() > 0)
			System.out.println("The common prefix is " + prefix);
		else
			System.out.println(str1 + " and " + str2 + " have no common prefix...");
		input.close();
	}

}
