package ifSatatements_switchStatements;

import java.util.Scanner;

public class Questionn13_BankCharges {

	public static void main(String[] args) {
		/*
		A bank charges a base fee of $10 per month, plus the following check fees for a commercial checking account:
                $.10 each for less than 20 checks
                $.08 each for 20-39 checks  
                $.06 each for 40-59 checks
                $.04 each for 60 or more checks
		Write a program that lets the user declare the number of checks written for the month. 
		The program should then calculate and display the bank's service fees for the month. 
		*/
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Enter the number of checks:");
		int numberOfChecks = scan.nextInt();
		
		double bankServiceFees = 0;
		
		if(numberOfChecks<20) {
			bankServiceFees = 10 + numberOfChecks*0.10;
			System.out.println("Bank's service fees: $" + bankServiceFees);
			
		}else if(numberOfChecks>=20 && numberOfChecks<=39) {
			bankServiceFees = 10 + numberOfChecks*0.08;
			System.out.println("Bank's service fees: $" + bankServiceFees);
			
		}if(numberOfChecks>=40 && numberOfChecks<=59) {
			bankServiceFees = 10 + numberOfChecks*0.06;
			System.out.println("Bank's service fees: $" + bankServiceFees);
			
		}if(numberOfChecks>=60) {
			bankServiceFees = 10 + numberOfChecks*0.04;
			System.out.println("Bank's service fees: $" + bankServiceFees);
			
		}

	}

}
