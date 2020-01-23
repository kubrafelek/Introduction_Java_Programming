package bolum05;

import java.util.Scanner;

public class GSE_S_17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int n = input.nextInt();
		input.close();

		for (int k = 0; k < n; n -= 1) {
			for (int i = n; i >= 1; i--) {
				System.out.print(i + " ");
			}
			for (int i = 2; i <= n; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}
