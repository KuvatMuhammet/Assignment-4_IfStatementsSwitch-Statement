package ifSatatements_switchStatements;

import java.util.Scanner;

public class Question9_shippingCharges {

	public static void main(String[] args) {
		
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
