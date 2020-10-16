package ifSatatements_switchStatements;

import java.util.Scanner;

public class Question7_NumberInSeconds {

	public static void main(String[] args) {
		/*
		Write a program that lets the user declare a number in seconds.

		There are 60 seconds in a minute. If the number of seconds is greater than or equal to 60, 
		the program should display the number of minutes in that many seconds.
		There are 3600 seconds in an hour. If the number of seconds is greater than or equal to 3600, 
		the program should display the number of hours in that many seconds.
		There are 86400 seconds in a day. If the number of seconds is greater than or equal to 86400, 
		the program should display the number of days in that many seconds.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int seconds, minutes, hours, days;
		
		System.out.println("Enter number of seconds:");
		 seconds = scan.nextInt();
		
		if(seconds>=60 && seconds<3600) {
			 minutes = seconds/60;
			seconds = seconds%60;
			System.out.println(minutes + " minutes " + seconds + " seconds");
		
		}else if(seconds>=3600 && seconds<=86400) {
			 hours = seconds/3600;
			 minutes = seconds%3600/60;
			 seconds = seconds%60;
			System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds");
		
		}else if(seconds>86400) {
			 days = seconds/86400;
			 hours = seconds%86400/3600;
			 minutes = seconds%3600/60;
			 seconds = seconds%60;
			System.out.println(days + " days " + hours + " hours " + minutes + " minutes " + seconds + " seconds");
		}

	}

}
