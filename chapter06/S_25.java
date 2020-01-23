package chapter06;

public class S_25 {

	public static void main(String[] args) {
		System.out.println(convertMillis(5_500));
		System.out.println(convertMillis(100_000));
		System.out.println(convertMillis(555_550_000));
	}

	public static String convertMillis(long millis) {

		long totalSeconds = millis / 1000;

		long seconds = totalSeconds % 60;

		long totalMinutes = totalSeconds / 60;

		long minutes = totalMinutes % 60;

		long totalHours = totalMinutes / 60;

		// long hours = totalHours % 24;

		return totalHours + ":" + minutes + ":" + seconds;
	}
}
