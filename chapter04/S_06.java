package bolum04;

/*(Random points on a circle) Write a program that generates three random points
on a circle centered at (0, 0) with radius 40 and display three angles in a triangle
formed by these three points,*/

public class S_06 {

	public static void main(String[] args) {

		final int radius = 40;

		double angle = Math.random() * 360;

		double x1 = radius * Math.cos(angle * Math.PI / 180);
		double y1 = radius * Math.sin(angle * Math.PI / 180);

		System.out.println(" (" + x1 + "," + y1 + ") ");

		angle = Math.random() * 360;

		double x2 = radius * Math.cos(angle * Math.PI / 180);
		double y2 = radius * Math.sin(angle * Math.PI / 180);

		System.out.println(" (" + x2 + "," + y2 + ") ");

		angle = Math.random() * 360;

		double x3 = radius * Math.cos(angle * Math.PI / 180);
		double y3 = radius * Math.sin(angle * Math.PI / 180);

		System.out.println(" (" + x3 + "," + y3 + ") ");

	}

}
