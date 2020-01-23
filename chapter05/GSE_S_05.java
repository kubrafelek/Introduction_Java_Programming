package bolum05;

public class GSE_S_05 {

	public static void main(String[] args) {

		System.out.println("Celsius\tFahrenheit\t|\tFahrenheit\tCelsius");
		for (int celsius = 0, fahrenheit = 20; celsius <= 100 && fahrenheit <= 270; celsius += 2, fahrenheit += 5) {
			double fah = (celsius * 9 / 5) + 32;
			double cel = ((fahrenheit - 32) * 5 / 9);
			System.out.printf("%3d\t%2.3f\t\t\t%3d\t\t%2.3f\n", celsius, fah, fahrenheit, cel);
		}
	}

}
