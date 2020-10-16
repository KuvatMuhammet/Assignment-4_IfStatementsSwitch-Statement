package ifSatatements_switchStatements;

import java.util.Scanner;

public class Questionn15_SwitchCaseProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int number = scan.nextInt();
		
		switch(number) {
		
		case 0: case 1: case 2:
			System.out.println("Low Number");
			break;
		case 3: case 4: case 5:
			System.out.println("Medium Number");
			break;
			default:
				System.out.println("Other Number");
		}

	}

}
