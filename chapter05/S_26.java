package bolum05;

public class S_26 {

	public static void main(String[] args) {

		double e = 1;
/*
		for (int i = 1; i <= 100_000; i++) {

			double fac = 1.0;
			for (int j = 1; j <= i; j++) {
				fac *= j;
			}

			e += 1 / fac;
		}

		System.out.println("The value of e " + e);		
		
		*/
		
		e = 1;
		double fac = 1.0;
		for (int i = 1; i <= 1_000_000_000; i++) {			
			fac *= i;
			e += 1 / fac;
		}

		System.out.println("The value of e " + e);
	}

}
