package chapter06;

public class S_32 {

	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		int countOfWins = 0;

		int dice1 = (int) (Math.random() * 6) + 1;
		int dice2 = (int) (Math.random() * 6) + 1;

		while (count < 10_000) {
			sum = dice1 + dice2;
			if (sum == 2 || sum == 3 || sum == 12) {
				System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));
				System.out.println("You lose");
				count++;
			}
			if (sum == 7 || sum == 11) {
				System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));
				System.out.println("You win");
				count++;
				countOfWins++;
			}
			if (sum != 2 || sum != 3 || sum != 12 || sum != 7 || sum != 11) {
				dice1 = (int) (Math.random() * 6) + 1;
				dice2 = (int) (Math.random() * 6) + 1;
				if (sum == 7) {
					System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));
					System.out.println("Point is " + sum);
					System.out.println("You lose");
				} else if (sum == (dice1 + dice2)) {
					System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));
					System.out.println("Point is " + sum);
					System.out.println("You win");
					countOfWins++;
				}
				count++;
			}
		}
		System.out.println("Count of winning games are " + countOfWins);
	}

}
