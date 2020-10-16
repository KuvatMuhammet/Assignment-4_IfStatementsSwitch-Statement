package ifSatatements_switchStatements;

import java.util.Scanner;

public class Question5_MagicDate {

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
