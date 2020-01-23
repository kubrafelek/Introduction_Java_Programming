package chapter07;

public class S_32 {

	public static void main(String[] args) {

		int list[] = { 10, 1, 5, 16, 61, 9, 11, 1 };
		System.out.println(partition(list));
	}

	public static int partition(int[] list) {

		for (int k = 0; k < list.length; k++) {
			int min = list[k];
			int index = k;
			for (int i = k + 1; i <= list.length + 1; i++) {
				if (min > list[i]) {
					list[index] = list[i];
					list[i] = min;
				}
			}
		}
//devam edilecekS
		int partitionList = list[0];
		return partitionList;
	}
}
