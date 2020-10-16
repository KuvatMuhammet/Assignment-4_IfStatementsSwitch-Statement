package ifSatatements_switchStatements;

import java.util.Scanner;

public class Question2_TaxCalculator {

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
