package bolum05;

public class GSE_S_03 {

	public static void main(String[] args) {

		System.out.println("Celsius\tFahrenheit");
		System.out.println("-------------------");
		for (int celsius = 0; celsius <= 100; celsius += 2) {
			double fahrenheit = (celsius * 9 / 5) + 32;
			System.out.printf("%3d\t%4.1f\n", celsius, fahrenheit);
		}
	}

}
