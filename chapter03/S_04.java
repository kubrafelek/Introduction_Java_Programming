package bolum03;

/*(Random month) Write a program that randomly generates an integer between 1
and 12 and displays the English month names January, February, . . . , December
for the numbers 1, 2, . . . , 12, accordingly.*/

public class S_04 {

	public static void main(String[] args) {

		int months = (int) ((Math.random() * 12) + 1);
        
		// int number = (int)((System.currentTimeMillis() % 12) + 1; 
		
		if (months == 1) {
			System.out.println(" January ");
		} else if (months == 2) {
			System.out.println(" February ");
		} else if (months == 3) {
			System.out.println(" March ");
		} else if (months == 4) {
			System.out.println(" April ");
		} else if (months == 5) {
			System.out.println(" May ");
		} else if (months == 6) {
			System.out.println(" June ");
		} else if (months == 7) {
			System.out.println(" July ");
		} else if (months == 8) {
			System.out.println(" August ");
		} else if (months == 9) {
			System.out.println(" September ");
		} else if (months == 10) {
			System.out.println(" October ");
		} else if (months == 11) {
			System.out.println(" November ");
		} else if (months == 12) {
			System.out.println(" December ");
		}
	}
}
