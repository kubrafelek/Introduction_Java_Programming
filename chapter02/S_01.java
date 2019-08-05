package bolum02;

import java.util.Scanner;

/*(Convert mile to kilometer) Write a program that reads a mile in a double value
from the console, converts it to kilometers, and displays the result. The formula
for the conversion is as follows: 1 mile = 1.6 kilometers 
*/

public class S_01 {
	public static void main(String[] args) {
        Scanner keybord = new Scanner(System.in);

        System.out.print("Enter miles: ");
        double miles = keybord.nextDouble();
        
        System.out.println(miles + " miles is " + (miles * 1.6) + " kilometres " );
	    //Closed scanner by using .close() in Eclipse Editor;
        keybord.close();
	}
}

