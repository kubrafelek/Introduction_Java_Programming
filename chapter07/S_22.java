package chapter07;

public class S_22 {

	final static int FORBIDDEN = 5;
	final static int EMPTY = 0;
	final static int QUEEN = 1;
	final static int BOARD = 8;

	public static void main(String[] args) {

		int[][] matrix = new int[BOARD][BOARD];
		for (int i = 0; i < matrix.length; i++) {
			if (assignQueen(i, matrix) == false) {
				i = -1;
				matrix = new int[BOARD][BOARD];
			}
		}
		printLine(matrix);

	}

	private static boolean assignQueen(int rowIndex, int[][] matrix) {
		int colIndex;
		// gelen sütun ve satır sayısına sahip bloğun boş olup olmadığını kotrol
		// ediyoruz
		while (true) {
			colIndex = (int) (Math.random() * BOARD);
			if (matrix[rowIndex][colIndex] == EMPTY) {
				matrix[rowIndex][colIndex] = QUEEN;
				break;
			}
		}

		for (int i = rowIndex + 1; i < BOARD; i++) {
			matrix[i][colIndex] = FORBIDDEN;
		}
		for (int i = rowIndex + 1, j = colIndex - 1; i < BOARD && j >= 0; i++, j--) {
			matrix[i][j] = FORBIDDEN;
		}
		for (int i = rowIndex + 1, j = colIndex + 1; i < BOARD && j < BOARD; i++, j++) {
			matrix[i][j] = FORBIDDEN;
		}
		for (int i = rowIndex + 1; i < BOARD; i++) {
			if (isAllElementForbidden(matrix[i])) {
				return false;
			}
		}
		return true;
	}

	private static boolean isAllElementForbidden(int[] line) {
		for (int i = 0; i < line.length; i++) {
			if (line[i] == QUEEN || line[i] == EMPTY)
				return false;
		}
		return true;
	}

	private static void printLine(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			int[] line = matrix[i];
			System.out.print(" |");
			for (int e : line) {
				if (e == QUEEN) {
					System.out.print("Q|");
					// } else if (i == FORBIDEN) {
					// System.out.print("X|");
				} else {
					System.out.print(" |");
				}
			}
			System.out.println();
		}
	}

}
