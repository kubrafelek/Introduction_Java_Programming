package bolum05;

public class S_43 {

	public static void main(String[] args) {

		int count = 0;
		for (int i = 1; i <= 7; i++) {
			for (int j = i + 1; j <= 7; j++) {
				System.out.println(i + " - " + j);
				count++;
			}
		}

		System.out.println("The total number of all combinations is " + count);
		
		
		count = 0;
		for (int i = 1; i <= 7; i++) {
			for (int j = i + 1; j <= 7; j++) {
				for (int k = j + 1; k <= 7; k++) {
					System.out.println(i + " - " + j + " - " + k);
					count++;
				}
			}
		}
		System.out.println("The total number of all combinations is " + count);
	}

}
