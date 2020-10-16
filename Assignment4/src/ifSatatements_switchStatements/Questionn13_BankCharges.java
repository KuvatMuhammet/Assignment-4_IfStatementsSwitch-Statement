package ifSatatements_switchStatements;

import java.util.Scanner;

public class Questionn13_BankCharges {

	public static void main(String[] args) {
		
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
