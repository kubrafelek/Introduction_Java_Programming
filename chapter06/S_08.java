package chapter06;

public class S_08 {

	public static void main(String[] args) {

		System.out.println("Celsius\t\tFahrenheit\t|\tFahrenheit\tCelsius");
		System.out.println("---------------------------------------------------------------");
		for (int c = 40, f = 120; c > 30 && f >= 30; c--, f -= 10) {
			System.out.println(c + "\t\t" + String.format("%4.1f", celsiusToFahrenheit(c)) + "\t\t|\t" + f + "\t\t"
					+ String.format("%4.2f", fahrenheitToCelsius(f)));
		}
	}

	public static double celsiusToFahrenheit(double celsius) {
		double fahrenheit = (9.0 / 5) * celsius + 32;
		return fahrenheit;
	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		return celsius;
	}

}
