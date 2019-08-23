/*(Financial application: calculate tips) Write a program that reads the subtotal
and the gratuity rate and then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 12% for gratuity rate, the program displays $1.2
as gratuity and $11.2 as total.*/

package bolum02;

import java.util.Scanner;

public class S_05 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuity = input.nextDouble();

		System.out.println(
				"The gratuity is $" + (gratuity / subtotal) + " and total is $" + (subtotal + (gratuity / subtotal)));
		input.close();
	}
}
