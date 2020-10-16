package ifSatatements_switchStatements;

import java.util.Scanner;

public class Questionn14_BooksellersAwards {

	public static void main(String[] args) {
		/*
		ABC Booksellers has a book club that awards points to its customers based on the number of books purchased each month. 
		The points are awarded as follows:
		If a customer purchases 0 books, he or she earns 0 points.
		If a customer purchases 1 book, he or she earns 5 points.
		If a customer purchases 2 books, he or she earns 15 points.
		If a customer purchases 3 books, he or she earns 30 points.
		If a customer purchases 4 books or more books, he or she earns 60 points.
		Write a program that lets the user declare the number of books that he or she has purchased 
		this month and then display the number of points awarded.
		*/
		
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
