package bolum02;

import java.util.Scanner;

public class S_24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a degree in Celsius: ");
		int celsius = input.nextInt();

		double fahrenheith = ((9.0 / 5) * celsius + 32);

		System.out.println(celsius + " Celcius is " + fahrenheith + " Fahrenheith");

		input.close();
	}

}
