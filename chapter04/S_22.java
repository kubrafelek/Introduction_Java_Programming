package bolum04;

import java.util.Scanner;

/*(Check substring) Write a program that prompts the user to enter two strings and
reports whether the second string is a substring of the first string.*/

public class S_22 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string1: ");
		String str1 = input.next();
		
		System.out.println("Enter a string2: ");
		String str2 = input.next();
		
		if (str1.contains(str2)) {
			System.out.println(str2 + " is substring of " + str1);
		} else {
			System.out.println(str2 + " is not substring of " + str1);
		}
	
		input.close();
	}

}
