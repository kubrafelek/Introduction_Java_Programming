package bolum03;

import java.util.Scanner;

/*(Compute the perimeter of a triangle) Write a program that reads three edges for
a triangle and computes the perimeter if the input is valid. Otherwise, display that
the input is invalid. The input is valid if the sum of every pair of two edges is
greater than the remaining edge.*/

public class S_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the three edge for triangle: ");
		int edge1 = input.nextInt();
		int edge2 = input.nextInt();
		int edge3 = input.nextInt();

		if (edge1 + edge2 < edge3 || edge1 + edge3 < edge2 || edge2 + edge3 < edge1) {
			System.out.println("The input is valid...");
			int sum = (edge1 + edge2 + edge3);
			System.out.println("The sum the perimeter of a triangle " + sum);
		} else {
			System.out.println("The input is invalid...");
		}

		input.close();
	}

}
