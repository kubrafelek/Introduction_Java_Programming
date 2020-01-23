package bolum05;

public class GSE_S_07 {

	public static void main(String[] args) {
		double tuition = 10_000;
		for (int year = 0; year < 10; year++) {
			tuition += tuition * 0.06;
		}
		System.out.println("After the ten year tuition is " + (int) tuition);

		int totalCost = 0;
		for (int year = 0; year < 4; year++) {
			tuition += tuition * 0.06;
			totalCost += tuition;
		}
		System.out.println("After the four year tuition is " + (int) totalCost);
	}
}
