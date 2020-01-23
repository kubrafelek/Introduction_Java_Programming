package chapter07;

public class S_31 {

	public static void main(String[] args) {
//1 2 4 5 5 6 16 61 111
		int list1[] = { 1, 5, 16, 61, 111 };
		int list2[] = { 2, 4, 5, 6 };

		int list3[] = merge(list1, list2);
		System.out.print("Merge Sort List: ");
		for (int i = 0; i < list3.length; i++) {
			System.out.print(list3[i] + " ");
		}

	}

	public static int[] merge(int[] list1, int[] list2) {
		int list3[] = new int[list1.length + list2.length];

		int i1 = 0;
		int i2 = 0;
		int i3 = 0;
		while (i1 < list1.length && i2 < list2.length) {
			if (list1[i1] <= list2[i2]) {
				list3[i3++] = list1[i1++];
			} else {
				list3[i3++] = list2[i2++];
			}
		}
		while (i1 < list1.length) {
			list3[i3++] = list1[i1++];
		}
		return list3;
	}
}
