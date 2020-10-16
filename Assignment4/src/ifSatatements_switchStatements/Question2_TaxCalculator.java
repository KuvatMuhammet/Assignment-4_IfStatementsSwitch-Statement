package ifSatatements_switchStatements;

import java.util.Scanner;

public class Question2_TaxCalculator {
	/*
		Tax Calculator:
		    - Let user enter his income
		    - Calculate the tax amount according to below table
		    - Print the tax amount
		Income		     Tax Ratio
		income ≤150,000,000	%25
		income ≤ 300,000,000	%30
		income ≤ 600,000,000	%35
		income ≤ 1,200,000,000	%40
		income > 1,200,000,000	%50
		Sample Output-1
		Your Income : 1500
		The tax amount you have to pay : 375.0
		Sample Output-2
		Your Income : 1200000
		The tax amount you have to pay : 300000.0
		Note: IF Your Income is 200,000,000, your tax will be calculated this way: 
		%25 for 150,000,000 and %30 for the rest of the amount which is 50,000,000
	*/

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your income:");
		long income = scan.nextLong();
		
		long income1 = 150_000_000;
		long income2 = 300_000_000;
		long income3 = 600_000_000;
		long income4 = 1_200_000_000;
		
		if(income <= 150_000_000) {
			double taxRatio = income*0.25;
			System.out.println(taxRatio);			
					
		}else if(income <= 300_000_000) { 
			double taxRatio = (income1*0.25) + (income-income1)*0.3;
			System.out.println(taxRatio);
			
		}else if(income <= 600_000_000) {				
			double taxRatio = (income2*0.3) + (income-income2)*0.35;			
			System.out.println(taxRatio);
			
		}else if(income <= 1_200_000_000) {			
			double taxRatio = (income3*0.35) + (income-income3)*0.4;			
			System.out.println(taxRatio);
			
		}if(income > 1_200_000_000) {			
			double taxRatio = (income4*0.4) + (income-income2)*0.5;			
			System.out.println(taxRatio);
			
		}	
	}
}
