package chapter07;

public class S_29 {

	public static void main(String[] args) {
		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		int suit;
		int rank;
		boolean found[] = new boolean[4];
		int numberOfPick = 0;

		while (true) {
			numberOfPick++;
			suit = (int) (Math.random() * 4);
			if (!found[suit]) {
				found[suit] = true;
				rank = (int) (Math.random() * 13);
				System.out.println(suits[suit] + " of " + ranks[rank]);
			}
			if (numberOfPick == 24) {
				System.out.println("The total number of pick is " + numberOfPick);
				break;
			}
		}

	}

}
