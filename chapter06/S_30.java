package chapter06;

public class S_30 {

	public static void main(String[] args) {
		int sum = 0;
		int dice1 = (int) (Math.random() * 6) + 1;
		int dice2 = (int) (Math.random() * 6) + 1;
		while (true) {
			sum = dice1 + dice2;
			if (sum == 2 || sum == 3 || sum == 12) {
				System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));
				System.out.println("You lose");
				break;
			}
			if (sum == 7 || sum == 11) {
				System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));
				System.out.println("You win");
				break;
			}
			if (sum != 2 || sum != 3 || sum != 12 || sum != 7 || sum != 11) {
				dice1 = (int) (Math.random() * 6) + 1;
				dice2 = (int) (Math.random() * 6) + 1;
				if (sum == 7) {
					System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));
					System.out.println("Point is " + sum);
					System.out.println("You lose");
					break;
				} else if (sum == (dice1 + dice2)) {
					System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));
					System.out.println("Point is " + sum);
					System.out.println("You win");
					break;
				}
			}
		}
	}
}
