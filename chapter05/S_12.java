package bolum05;

public class S_12 {

	public static void main(String[] args) {

		int n = 1;
		while (Math.pow(n, 2) < 12_000) {
			n++;
		}
		n--;
		System.out.println("The smallest number is " + n);
	}

}
