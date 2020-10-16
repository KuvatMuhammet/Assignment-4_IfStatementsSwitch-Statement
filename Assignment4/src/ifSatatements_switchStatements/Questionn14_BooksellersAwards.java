package ifSatatements_switchStatements;

import java.util.Scanner;

public class Questionn14_BooksellersAwards {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of books:");
		int numberOfBooks = scan.nextInt();
		
		switch(numberOfBooks) {
		
		case 0:
			System.out.println("Awarded points: 0");
			break;
		case 1:
			System.out.println("Awarded points: 5");
			break;
		case 2:
			System.out.println("Awarded points: 15");
			break;
		case 3:
			System.out.println("Awarded points: 30");
			break;
		default:
			System.out.println("Awarded points: 60");
				
		}

	}

}
