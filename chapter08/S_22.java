package chapter08;

public class S_22 {

	public static void main(String[] args) {

		int matrix[][] = new int[6][6];

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix.length; col++) {
				matrix[row][col] = (int) (Math.random() * 2);
			}
		}
		for (int rows = 0; rows < matrix.length; rows++) {
			for (int cols = 0; cols < matrix.length; cols++) {
				System.out.print(matrix[rows][cols] + " ");
			}
			System.out.println();
		}
		int count = 0;
		int col = 0;
		int row = 0;
		for (row = 0; row < matrix.length; row++) {
			for (col = 0; col < matrix.length; col++) {
				if (matrix[row][col] == 1) {
					count++;
				}
			}
			if (count % 2 == 0) {
				System.out.println("Row " + row + " have even 1s.");
			}
		}
		for (col = 0; col < matrix.length; col++) {
			for (row = 0; row < matrix.length; row++) {
				if (matrix[row][col] == 1) {
					count++;
				}
			}
			if (count % 2 == 0) {
				System.out.println("Column " + col + " have even 1s.");
			}
		}
	}

}
//tam doğru çalışmıyor