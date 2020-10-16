package ifSatatements_switchStatements;

import java.util.Scanner;

public class Questionn10_percentageOfCalories {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of calories:");
		double numberOfCalories = scan.nextDouble();
		
		System.out.println("Enter the fat grams:");
		double fatGrams = scan.nextInt();
		
		double caloriesFromFat = fatGrams*9;
		double percentageOfCalories = caloriesFromFat/numberOfCalories;
		
		if (percentageOfCalories<=30) {			
			System.out.println("The food is low in fat");
			
		}else if(percentageOfCalories>numberOfCalories){
			System.out.println("The input is invalid");
		}

	}

}
