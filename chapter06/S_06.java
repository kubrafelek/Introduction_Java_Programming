package chapter06;

public class S_06 {

	public static void main(String[] args) {
		displayPattern(8);
	}

	public static void displayPattern(int n) {
		for (int i = n; i > 0; i--) {
			for (int k = i; k > 0; k--) {
				System.out.print(" " + " ");
			}
			for (int j = n- i ; j > 0; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
