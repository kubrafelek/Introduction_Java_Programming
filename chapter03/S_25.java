package bolum03;

import java.util.Scanner;

/*(Geometry: intersecting point) Two points on line 1 are given as (x1, y1) and (x2,
y2) and on line 2 as (x3, y3) and (x4, y4), as shown in Figure 3.8a–b.
The intersecting point of the two lines can be found by solving the following
linear equation:
(y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
(y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
This linear equation can be solved using Cramer’s rule 
(see Programming Exercise 3.3). 
If the equation has no solutions, the two lines are parallel*/

public class S_25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the x1,y1,x2,y2,x3,y3,x4,y4: ");

		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();

		double a = y1 - y2;
		double b = -(x1 - x2);
		double c = y3 - y4;
		double d = -(x3 - x4);
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;

		double formul = (a * d) - (b * c);
		double x = ((e * d) - (b * f)) / formul;
		double y = ((a * f) - (e * c)) / formul;

		if (formul != 0) {
			System.out.println("The intersecting point is at (" + x + ") , (" + y + ")");
		} else {
			System.out.println("The two lines are parallel.");
		}
		input.close();
	}

}
