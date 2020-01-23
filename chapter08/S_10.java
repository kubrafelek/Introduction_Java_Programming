package chapter08;

public class S_10 {

	public static void main(String[] args) {

		int matrix[][] = new int[4][4];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix.length; col++) {
				matrix[row][col] = (int) (Math.random() * 2);
			}
		}
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix.length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
		int largestRowIndex = 0;
		int max = 0;
		for (int row = 0; row < matrix.length; row++) {
			int sumOfRow = 0;
			for (int col = 0; col < matrix.length; col++) {
				sumOfRow += matrix[row][col];
				if (max < sumOfRow) {
					max = sumOfRow;
					largestRowIndex = row;
				}
			}
		}
		System.out.println("The largest row index: " + largestRowIndex);
		int largestColIndex = 0;
		int maxCol = 0;
		for (int row = 0; row < matrix.length; row++) {
			int sumOfCol = 0;
			for (int col = 0; col < matrix.length; col++) {
				sumOfCol += matrix[row][col];
				if (maxCol < sumOfCol) {
					maxCol = sumOfCol;
					largestColIndex = col;
				}
			}
		}
		System.out.println("The largest column index: " + largestColIndex);
	}

}
