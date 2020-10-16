package ifSatatements_switchStatements;

import java.util.Scanner;

public class Question9_shippingCharges {

	public static void main(String[] args) {
		/*
		The Fast Freight Shipping Company charges the following rates:

		Weight of Package			Rate per 500 Miles Shipped
		2 pounds or less				$1.10
		Over 2 pounds but not more than 6 pounds	$2.20
		Over 6 pounds but not more than 10 pounds	$3.70
		Over 10 pounds					$3.8
		
		The shipping charges per 500 miles are not prorated. For example, if a 2-pound package is shipped 550 miles, the charges would be $2.20. 
		Write a program that lets the user declare the weight of a package and then displays the shipping charges.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the weight of your package:");
		double weightOfPackages = scan.nextDouble();
		
		System.out.println("Enter the miles:");
		int miles = scan.nextInt();
		
		if(weightOfPackages<=2) {
			if(miles<=500) {
				System.out.println("Your shipping fee is: $" + 1.10);
			}else {
				System.out.println("Your shipping fee is: $" + 2.20);
			}		
		}else if(weightOfPackages>2 && weightOfPackages<=6) {
			if(miles<=500) {
				System.out.println("Your shipping fee is: $" + 2.20);
			}else {
				System.out.println("Your shipping fee is: $" + 3.70);
			}		
		}else if(weightOfPackages>6 && weightOfPackages<=10) {
			if(miles<=500) {
				System.out.println("Your shipping fee is: $" + 3.70);
			}else {
				System.out.println("Your shipping fee is: $" + 3.80);
			}		
		}else if(weightOfPackages>10) {
				System.out.println("Your shipping fee is: $" + 3.80);
			
		}

	}

}
