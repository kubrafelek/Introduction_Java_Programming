package bolum03;

import java.util.Scanner;

/*(Cost of shipping) A shipping company uses the following function to calculate
the cost (in dollars) of shipping based on the weight of the package (in pounds).
			3.5, if 0 < w <= 1
c(w) = d    5.5, if 1 < w  <= 3
			8.5, if 3 < w <= 10
			10.5, if 10 < w <= 20
Write a program that prompts the user to enter the weight of the package and
display the shipping cost. If the weight is greater than 50, display a message “the
package cannot be shipped.”*/

public class S_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the weight of package: ");
		
		int weight = input.nextInt();

		if (0 < weight && weight <= 1) {
			System.out.println("Cost of shipping is " + (3.5 * weight));
		} else if (1 < weight && weight <= 3) {
			System.out.println("Cost of shipping is " + (5.5 * weight));
		} else if (3 < weight && weight <= 10) {
			System.out.println("Cost of shipping is " + (8.5 * weight));
		} else if (10 < weight && weight <= 20) {
			System.out.println("Cost of shipping is " + (10.5 * weight));
		} else {
			System.out.println("The package cannot be shipped!");
		}

		input.close();
	}

}
