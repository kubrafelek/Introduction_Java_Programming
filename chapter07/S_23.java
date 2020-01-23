package chapter07;

public class S_23 {

	public static void main(String[] args) {

		boolean array[] = new boolean[100];

		for (int i = 1; i <= 100; i++) {
             for (int j = i; j <= 100; j += i) {
				  array[j - 1] = !array[j - 1];
			}    
		}
		for (int i = 0; i < array.length; i++) {
			if(array[i])
			System.out.print(i + 1 + " ");
		}
	}
}
