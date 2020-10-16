package ifSatatements_switchStatements;

import java.util.Scanner;

public class Question3_LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a year to determine whether it is Leap Year or NOT:");
		int year = scan.nextInt();
		
		if(year%4==0 && year%100!=0 || year%400==0)  {
			
			System.out.println(year + " is a Leap Year");
			
		}else {
			System.out.println(year + " is NOT a Leap Year");
		}
		

	}

}
