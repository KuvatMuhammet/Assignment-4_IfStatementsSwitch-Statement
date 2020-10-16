package ifSatatements_switchStatements;

import java.util.Scanner;

public class Question4_TelephoneBill {
		/*
			Telephone Bill
			Write a Java program to calculate the monthly telephone bills as per the following rule: 
			Minimum $200 for up to 100 calls. 
			Plus $0.60 per call for the next 50 calls. 
			Plus $0.50 per call for the next 50 calls. 
			Plus $0.40 per call for any call beyond 200 calls.
		*/

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
