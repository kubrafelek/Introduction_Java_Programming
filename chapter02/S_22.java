/*(Financial application: monetary units) Rewrite Listing 2.10, ComputeChange
.java, to fix the possible loss of accuracy when converting a double value to an
int value. Enter the input as an integer whose last two digits represent the cents.
For example, the input 1156 represents 11 dollars and 56 cents.*/

package bolum02;

import java.util.Scanner;

public class S_22 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the n: ");
		int money = scn.nextInt();
		
		int dollar = money / 100;
		int cents = money % 100;
		
		System.out.println(dollar + " dollar " + cents + " cents ");
		
		scn.close();
	}
}