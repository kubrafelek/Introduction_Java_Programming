package chapter07;

public class S_28 {

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < array.length; i++) {
			System.out.print("Combination " + (i) + ": ");
			for (int j = 0; j < array.length; j++) {
				System.out.print("(" + i + "-" + j + ") ");
			}
			System.out.println();
		}
	}

}
