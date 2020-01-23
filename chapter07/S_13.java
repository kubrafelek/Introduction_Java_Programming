package chapter07;

public class S_13 {

	public static void main(String[] args) {

		for (int i = 0; i < 20; i++) {
			System.out.println(getRandom(11, 21, 31, 41, 51, 61, 71, 81));
		}

	}

	public static int getRandom(int... numbers) {
		int randNumber;
		while (true) {
			randNumber = (int) (Math.random() * 54) + 1;

			boolean found = false;
			for (int i = 0; i < numbers.length; i++) {
				if (randNumber == numbers[i]) {
					found = true;
					break;
				}
			}
			if (found == false) {
				break;
			}
		}
		return randNumber;
	}

}
