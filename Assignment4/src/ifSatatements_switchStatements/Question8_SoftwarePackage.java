package ifSatatements_switchStatements;

import java.util.Scanner;

public class Question8_SoftwarePackage {

	public static void main(String[] args) {
		/*
		A software company sells a package that retails for $99. Quantity discounts are given according to the following table:
		Quantity	Discount
		10-19		20%
		20-49		30%
		50-99		40%
		100 or more	50%
		Write a program that lets the user declare the number of packages purchased. The program should then display the amount of 
		discounts(if any) and the total amount of the purchase after discount.		
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your number of packages:");
		int numberOfPackages = scan.nextInt();
		
		int packageFee = 99;
		double totalAmount = 0;
		double amount = 0;
		double amountOfDiscounts = 0;
		
		if(numberOfPackages>=10 && numberOfPackages<=19) {
			amount = numberOfPackages*packageFee;
			amountOfDiscounts = amount*0.20;
			totalAmount = amount - amountOfDiscounts;
			System.out.println("Your amount of discount: " + amountOfDiscounts + " $ and your total amount: " + totalAmount + " $");
			
		}else if(numberOfPackages>=20 && numberOfPackages<=49) {
			amount = numberOfPackages*packageFee;
			amountOfDiscounts = amount*0.30;
			totalAmount = amount - amountOfDiscounts;
			System.out.println("Your amount of discount: " + amountOfDiscounts + " $ and your total amount: " + totalAmount + " $");
			
		}else if(numberOfPackages>=50 && numberOfPackages<=99) {
			amount = numberOfPackages*packageFee;
			amountOfDiscounts = amount*0.40;
			totalAmount = amount - amountOfDiscounts;
			System.out.println("Your amount of discount: " + amountOfDiscounts + " $ and your total amount: " + totalAmount + " $");
			
		}if(numberOfPackages>=100) {
			amount = numberOfPackages*packageFee;
			amountOfDiscounts = amount*0.50;
			totalAmount = amount - amountOfDiscounts;
			System.out.println("Your amount of discount: " + amountOfDiscounts + " $ and your total amount: " + totalAmount + " $");
			
		}

	}

}
