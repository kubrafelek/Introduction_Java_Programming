package chapter07;
import java.util.Scanner;

public class S_05 {

	public static void main(String[] args) {
		int[] array = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten numbers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		int countOfDistinct = 0;
		for (int k = 0; k < array.length; k++) {
			for (int i = k + 1; i < array.length; i++) {
				if (array[k] == array[i] && array[k] != 0) {
					countOfDistinct++;
					array[i] = 0;
				}
			}
		}
		System.out.println("The number of distinct number is " + (10 - countOfDistinct));
		System.out.print("Distinct numbers are ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				System.out.print(+(array[i]) + ", ");
			}
		}
		input.close();
	}

}
