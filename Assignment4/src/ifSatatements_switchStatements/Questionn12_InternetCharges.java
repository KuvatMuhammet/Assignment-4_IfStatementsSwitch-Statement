package ifSatatements_switchStatements;

import java.util.Scanner;

public class Questionn12_InternetCharges {
		/*
		An internet service provider has three different subscription packages for its customers:
		Package A: For $9.95 per month 10 hours of access are provided. Additional hours are $2.00 per hour
		Package B: For $13.95 per month 20 hours of access are provided. Additional hours are $1.00 per hour
		Package C: For $19.95 per month unlimited access is provided
		Write a program that calculates a customer's monthly bill. It should let the user declare the letter of the package 
		the customer has purchased (A, B, or C) and the number of hours that were used. It should then display the total charges.
		*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the letter of package:");
		String letterOfPackage = scan.next();
		
		System.out.println("Enter the number of hours that were used:");
		int numberOfHours = scan.nextInt();
		
		double monthlyBill = 0;
		if(letterOfPackage.equals("A") || letterOfPackage.equals("a")) {
			monthlyBill = 9.95 + (numberOfHours-10)*2;
			System.out.println("Your monthly bill: $" + monthlyBill);
			
		}else if(letterOfPackage.equals("B") || letterOfPackage.equals("b")) {
			monthlyBill = 13.95 + (numberOfHours-20)*1;
			System.out.println("Your monthly bill: $" + monthlyBill);
			
		}if(letterOfPackage.equals("C") || letterOfPackage.equals("c")) {
			monthlyBill = 19.95;
			System.out.println("Your monthly bill: $" + monthlyBill);
		}

	}

}
