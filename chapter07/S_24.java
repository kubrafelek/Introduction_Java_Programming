package chapter07;

public class S_24 {

	public static void main(String[] args) {
		// final int NUMBER_OF_CARDS = 52;
		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		int suit;
		int rank;
		int count = 0;
		boolean found[] = new boolean[4];
		int numberOfPick = 0;
		while (count < 4) {
			numberOfPick++;
			suit = (int) (Math.random() * 4);
			if (!found[suit]) {
				found[suit] = true;
				rank = (int) (Math.random() * 13);
				System.out.println(suits[suit] + " of " + ranks[rank]);
			}
			count = 0;
			for (int i = 0; i < found.length; i++) {
				if (found[i] == true) {
					count++;
				}
			}
		}
		System.out.println("The total number of pick is " + numberOfPick);
	}

}
