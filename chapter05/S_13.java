package bolum05;

public class S_13 {

	public static void main(String[] args) {

		int n = 1;
		while (Math.pow(n, 3) < 12_000) {
			n++;
		}
		System.out.println(n);
	}

}
