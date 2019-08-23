/*(Convert square meter into ping) Write a program that converts square meter into ping.
The program prompts the user to enter a number in square meter, converts it to ping,
and displays the result. One square meter is 0.3025 ping.*/

package bolum02;

import java.util.Scanner;

public class S_04 {
	public static void main(String[] args) {		
	    
		Scanner input = new Scanner(System.in);
	    
	    System.out.println("Enter a number in square meters: ");
	    double meters = input.nextDouble();
	    
	    System.out.println(meters + " square meters is " + (meters *0.3025) + " pings!");
	
		input.close();
	}
}
