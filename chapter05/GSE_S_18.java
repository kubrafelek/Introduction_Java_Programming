package bolum05;

public class GSE_S_18 {

	public static void main(String[] args) {

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < 7; i++) {
			for (int j = 6; j > i; j--) {
				System.out.print(" * ");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("   ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("   ");
			}
			for (int j = 6; j > i; j--) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
