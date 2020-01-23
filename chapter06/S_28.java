package chapter06;

public class S_28 {

	public static void main(String[] args) {
		System.out.println("p\t\t" + "2^p-1");
		System.out.println("---------------------");
		for (int p = 2; p <= 31; p++) {
			System.out.println(p + "\t\t" + mersennePrime(p));
		}
	}

	public static int mersennePrime(int number) {
		int mersenneNumber = 0;
		mersenneNumber = (int) Math.pow(2, number) - 1;
		return mersenneNumber;
	}
}
