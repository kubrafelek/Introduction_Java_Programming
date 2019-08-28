/*(Print a table) Write a program that displays the following table. Cast floatingpoint
numbers into integers.
a b pow(a, b)
1 2 1
2 3 8
3 4 81
4 5 1024
5 6 15625*/

package bolum02;

import java.util.Scanner;

public class S_18 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the two point for a: ");
		double p1 = input.nextDouble();
		double p2 = input.nextDouble();

		System.out.println("Enter the two point for b: ");
		double p3 = input.nextDouble();
		double p4 = input.nextDouble();

		System.out.println("(" + p1 + ", " + p2 + ")");
		System.out.println("(" + p3 + ", " + p4 + ")");
		System.out.println("(" + ((p1 + p3) / 2) + ", " + ((p2 + p4) / 2) + ")");

		input.close();
	}

}
