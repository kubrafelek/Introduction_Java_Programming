package chapter08;

public class S_16 {

	public static void main(String[] args) {
		int array[][] = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };

		sort(array);
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + " ");
			}
			System.out.println();
		}
	}

	public static void sort(int m[][]) {

		for (int i = 0; i < m.length; i++) {
			int max = m[i][0];
			int index = i;
			for (int j = i; j < m.length; j++) {
				if (max < m[j][0]) {
					max = m[j][0];
					index = j;
				}
			}
			if (index != i) {
				int swap1 = m[index][0];
				int swap2 = m[index][1];
				m[index][0] = m[i][0];
				m[index][1] = m[i][1];
				m[i][0] = swap1;
				m[i][1] = swap2;
			}
		}
	}
}
//{{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}
//1,7 - 4,2 - 4,5 - 1,2 - 1,1 - 4,1
//1,1 - 1,2 - 1,7 - 4,1 - 4,5 - 4,2 
//1,1 - 1,2 - 1,7 - 4,1 - 4,2 - 4,5 
