package ifSatatements_switchStatements;

import java.util.Scanner;

public class Question5_MagicDate {
	/*
	The date June 10, 1960, is special because when we write it in the following format, the month times the day equals the year:  6/10/60
	Write a Java program that lets the user declare a month (in numeric form), a day, and a two-digit year. 
	The program should then determine whether the month times the day is equal to the year. If so, it should display a message saying the date is magic. 
	Otherwise, it should display a message saying the date is not magic.
	*/

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any date to determine it is Magic date or Not :))");
		System.out.println("Enter the month (in numeric format):");
		int month = scan.nextInt();
		System.out.println("Enter the day:");
		int day = scan.nextInt();
		System.out.println("Enter the year (in a two-digits):");
		int year = scan.nextInt();
		
		if(month*day==year) {
			System.out.println("The date is Magic");
		}else {
			System.out.println("The date is Not Magic");
		}

	}

}
