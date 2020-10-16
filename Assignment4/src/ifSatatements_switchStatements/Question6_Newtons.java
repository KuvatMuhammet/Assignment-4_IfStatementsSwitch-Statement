package ifSatatements_switchStatements;

import java.util.Scanner;

public class Question6_Newtons {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an object's mass: ");
		double mass = scan.nextInt();
		
		double weight = mass*9.8;
		
		System.out.println("The object is " + weight + " Newtons.");
		
		if(weight>1000) {
			System.out.println("The object is too heavy.");
		}else if(weight<10) {
			System.out.println("The object is too light.");
		}

	}

}
