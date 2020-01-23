package chapter07;

import java.util.Arrays;

public class S_34 {

	public static void main(String[] args) {
		System.out.print("SORT OF THE ARRAY---> ");
		System.out.print(sort("acb"));
	}

	public static String sort(String s) {
		char array[] = new char[3];
		for (int i = 0; i < array.length; i++) {
			array[i] = s.charAt(i);
		}
		Arrays.sort(array);
		return new String(array);
	}
}
