package bolum03;

/*(Game: pick a card) Write a program that simulates picking a card from a deck
of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.
Here is a sample run of the program:  The card you picked is Jack of Hearts */

public class S_24 {

	public static void main(String[] args) {
		final int NUMBER_OF_CARDS = 52;

		int number = (int) (Math.random() * NUMBER_OF_CARDS);

		System.out.print("The card you picked is ");

		switch ((int) (Math.random() * 13)) {

		case 0:
			System.out.println("Ace");
			break;
		case 1:
			System.out.println("2");
			break;
		case 2:
			System.out.println("3");
			break;
		case 3:
			System.out.println("4");
			break;
		case 4:
			System.out.println("5");
			break;
		case 5:
			System.out.println("6");
			break;
		case 6:
			System.out.println("7");
			break;
		case 7:
			System.out.println("8");
			break;
		case 8:
			System.out.println("9");
			break;
		case 9:
			System.out.println("10");
			break;
		case 10:
			System.out.println("Jack");
			break;
		case 11:
			System.out.println("Queen");
			break;
		case 12:
			System.out.println("King");
			break;

		}

		System.out.print(number + " of ");

		switch ((int) (Math.random() * 4)) {
		case 0:
			System.out.println("Clubs,");
			break;
		case 1:
			System.out.println("Diamonds,");
			break;
		case 2:
			System.out.println("Hearts,");
			break;
		case 3:
			System.out.println("Spades,");
			break;
		}

	}

}
