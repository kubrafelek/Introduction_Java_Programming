package bolum02;

import java.util.Scanner;

public class S_30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the value of a1 and an: ");
		int a1 = input.nextInt();
		int an = input.nextInt();

		int n = an - a1;

		double Sum = ((a1 + an) * n) / 2;

		System.out.println(Sum);
		input.close();
	}

}
