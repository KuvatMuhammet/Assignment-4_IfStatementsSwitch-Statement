package ifSatatements_switchStatements;

import java.util.Scanner;

public class Questionn12_InternetCharges {

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
