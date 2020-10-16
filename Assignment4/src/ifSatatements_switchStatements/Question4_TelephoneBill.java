package ifSatatements_switchStatements;

import java.util.Scanner;

public class Question4_TelephoneBill {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of calls:");
		int calls = scan.nextInt();
		double monthlyTelephoneBill = 0;

		if(calls<=100) {
			monthlyTelephoneBill = 200;
			System.out.println("Your monthly telephone bill is: " + monthlyTelephoneBill);
			
		}else if(calls>100 && calls <=150) {
			monthlyTelephoneBill = 200 + (calls-100)*0.6;
			System.out.println("Your monthly telephone bill is: " + monthlyTelephoneBill);
			
		}else if(calls>150 && calls <=200) {
			monthlyTelephoneBill = 200 + (calls-100)*0.5;
			System.out.println("Your monthly telephone bill is: " + monthlyTelephoneBill);
			
		}else if(calls>200) {
			monthlyTelephoneBill = 200 + (calls-100)*0.40;
			System.out.println("Your monthly telephone bill is: " + monthlyTelephoneBill);
			
		}  

	}

}
