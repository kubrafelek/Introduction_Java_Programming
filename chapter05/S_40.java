package bolum05;

public class S_40 {

	public static void main(String[] args) {

		int headCount = 0;
		int tailCount = 0;
		for (int i = 0; i < 1_000_000_000; i++) {
			switch ((int) (Math.random() * 2)) {
			case 0: headCount++; break;
			case 1:tailCount++; break;
			}
		}

		System.out.println("Head counter: " + headCount);
		System.out.println("Tail counter: " + tailCount);
	}

}
