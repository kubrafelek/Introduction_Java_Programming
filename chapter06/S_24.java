package chapter06;

public class S_24 {

	public static void main(String[] args) {

		long totalMilliSeconds = System.currentTimeMillis();

		long milliSeconds = totalMilliSeconds / 1000;

		long seconds = milliSeconds % 60;

		long totalMinutes = milliSeconds / 60;

		long minutes = totalMinutes % 60;

		long totalHours = totalMinutes / 60;

		long hours = totalHours % 24;

		System.out.println("Current time is " + (hours + 3) + ":" + minutes + ":" + seconds);
	}

}
