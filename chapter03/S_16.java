package bolum03;

/*(Random point) Write a program that displays a random coordinate in a rectangle.
The rectangle is centered at (0, 0) with width 100 and height 200.*/

public class S_16 {

	public static void main(String[] args) {

		double width = (int) (Math.random() * 100) - 50;
		double height = (int) (Math.random() * 200) - 100;

		System.out.println("Random coordinate in rectangle centered at (0,0): ");
		System.out.println("with width 100 and height 200: (" + width + "," + height + ")");

	}

}
