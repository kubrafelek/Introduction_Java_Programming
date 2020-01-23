package chapter07;

public class S_16 {
	static final int SIZE = 100_000;

	public static void main(String[] args) {

		int[] numbers = new int[SIZE];
		int key = (int) (Math.random() * SIZE);
		for (int i = 0; i < SIZE; i++) {
			numbers[i] = (int) (Math.random() * SIZE);
		}

		long start = System.currentTimeMillis();
		int index = linearSearch(numbers, key);
		long finalTime = System.currentTimeMillis() - start;
		System.out.println("LinearSearch - Total time of search is: " + finalTime + " index = " + index);

		start = System.currentTimeMillis();
		System.out.println("Sorting array...");
		sort(numbers);
		System.out.println("Finished sorting.");
		int index2 = binarySearch(numbers, key);
		finalTime = System.currentTimeMillis() - start;
		System.out.println("BINARY - Total time of search is: " + finalTime + " index = " + index2);

	}

	public static int[] sort(int[] numbers) {

		for (int i = 0; i < numbers.length - 1; i++) {

			int swapIndex = i;
			int low = numbers[i];
			for (int k = i + 1; k < numbers.length; k++) {

				if (low > numbers[k]) {
					low = numbers[k];
					swapIndex = k;
				}
			}
			if (swapIndex != i) {
				numbers[swapIndex] = numbers[i];
				numbers[i] = low;
			}

		}
		return numbers;
	}

	public static int linearSearch(int[] numbers, int key) {

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == key)
				return i;
		}

		return -1;
	}

	public static int binarySearch(int[] numbers, int key) {
		int low = 0;
		int high = numbers.length;

		while (high >= low) {
			int mid = (high + low) / 2;
			if (key > numbers[mid]) {
				low = mid + 1;
			} else if (key == numbers[mid]) {
				return mid;
			} else {
				high = mid - 1;
			}
		}

		return -low - 1;
	}

}
