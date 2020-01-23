package bolum04;

import java.util.Scanner;

/*(Days of a month) Write a program that prompts the user to enter a year and the
first three letters of a month name (with the first letter in uppercase) and displays
the number of days in the month.*/

public class S_17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a year: ");
		int year = input.nextInt();

		System.out.println("Enter a month: ");
		String month = input.next();

		  int days = 0;
		  
		  switch (month) {
		  case "Feb":
		   if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
		    days = 29;
		    break;
		   }
		   days = 28;
		   break;
		 
		  case "Apr":
		  case "Jun":
		  case "Sep":
		  case "Nov":
		   days = 30;
		   break;
		 
		  case "Jan":
		  case "Mar":
		  case "May":
		  case "Jul":
		  case "Aug":
		  case "Oct":
		  case "Dec":
		   days = 31;
		   break;
		 
		  default:
		   System.out.println("Invalid month.");
		   System.exit(0);
		 
		  }
		 
		  System.out.println(month + " " + year + " has " + days + " days");
	
		  input.close();
	}


	/*	if (month == "Jan") {
			System.out.println(month + "" + year + " had 31 days ");

		} else if (month == "Feb") {
			System.out.println(month + "" + year + " had 29 days ");

			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.println(month + "" + year + " had 29 days ");
			} else {
				System.out.println(month + "" + year + " had 29 days ");
			}
		} else if (month == "Mar") {
			System.out.println(month + "" + year + " had 31 days ");

		} else if (month == "Apr") {
			System.out.println(month + "" + year + " had 30 days ");

		} else if (month == "May") {
			System.out.println(month + "" + year + " had 31 days ");

		} else if (month == "Jun") {
			System.out.println(month + "" + year + " had 30 days ");

		} else if (month == "Jul") {
			System.out.println(month + "" + year + " had 31 days ");

		} else if (month == "Aug") {
			System.out.println(month + "" + year + " had 31 days ");

		} else if (month == "Sep") {
			System.out.println(month + "" + year + " had 30 days ");

		} else if (month == "Oct") {
			System.out.println(month + "" + year + " had 31 days ");

		} else if (month == "Nov") {
			System.out.println(month + "" + year + " had 30 days ");

		} else if (month == "Dec") {
			System.out.println(month + "" + year + " had 31 days ");

		} else {
			System.out.println("Invalid input!!!");
		}
        */
		
	

	}


