package bolum02;

import java.util.Scanner;

/*(Convert meters into feet) Write a program that reads a number in meters, converts
it to feet, and displays the result. One meter is 3.2786 feet.*/

public class S_03 {
    
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    
		System.out.print("Enter a value for meter: ");
	    double meter = input.nextDouble();
	    
	    System.out.println(meter + " meters is " + meter * 3.2786 + " feet"); 
	
		input.close();
	}
}
