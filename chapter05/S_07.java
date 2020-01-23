package bolum05;

public class S_07 {

	public static void main(String[] args) {
		double tuition = 10_000;
		double totalcost = 0;
		
		for (int year = 0; year < 10; year++) {
			double increase = tuition * 0.05;
			tuition += increase;
		}
		
		System.out.println("After ten years tuition is " + (int) tuition);
		
		for (int year = 0; year < 4; year++) {
			double increase = tuition * 0.05;
			tuition = (tuition + increase);

			totalcost += tuition;
		}

		System.out.println("After fourth year then ten years' tuition is " + (int) totalcost);
	}
}
