package bolum04;

import java.util.Scanner;

/*(Corner point coordinates) Suppose a pentagon is centered at (0, 0) with one point
at the 0 o’clock position, as shown in Figure 4.7c. Write a program that prompts
the user to enter the radius of the bounding circle of a pentagon and displays the
coordinates of the five corner points on the pentagon.*/

public class S_07 {

	public static void main(String[] args) {

		System.out.println("Enter the radius of a bounding circle: ");

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the r: ");
		double r = input.nextDouble();
//beşgenin bir dik acısının ölçüsü 72 old için her seferinde 72 derece artar cordinatlar böyle belirlenir
//pentagon increasing 72dec every time		
		double a1 = Math.PI / 10;
		double a2 = Math.PI / 2;
		double a3 = Math.PI / 2 + 2 * Math.PI / 5;
		double a4 = Math.PI / 2 + 4 * Math.PI / 5;
		double a5 = Math.PI / 2 + 6 * Math.PI / 5;

		double x1 = r * Math.cos(a1);
		double y1 = r * Math.sin(a1);
		double x2 = r * Math.cos(a2);
		double y2 = r * Math.sin(a2);
		double x3 = r * Math.cos(a3);
		double y3 = r * Math.sin(a3);
		double x4 = r * Math.cos(a4);
		double y4 = r * Math.sin(a4);
		double x5 = r * Math.cos(a5);
		double y5 = r * Math.sin(a5);

		System.out.println("(" + x1 + "   ,   " + y1 + ")");
		System.out.println("(" + x2 + "   ,   " + y2 + ")");
		System.out.println("(" + x3 + "   ,   " + y3 + ")");
		System.out.println("(" + x4 + "   ,   " + y4 + ")");
		System.out.println("(" + x5 + "   ,   " + y5 + ")");

		input.close();
	}

}
