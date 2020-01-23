package bolum05;

public class GSE_S_50 {

	public static void main(String[] args) {

		/*
		 * Scanner input = new Scanner(System.in); System.out.print("Enter a string: ");
		 * String str = input.nextLine(); input.close();
		 */

		int j = 1;
		while (j < 10) {

			for (int i = 1; i <= 9; i++) { 
				System.out.print(i + "*" + j + "=" + (i * j) + "\t\t\t");
                
			}
			System.out.println();
			j++;
			

		}

	}

}
