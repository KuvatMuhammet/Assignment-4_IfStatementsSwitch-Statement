package ifSatatements_switchStatements;

import java.util.Scanner;

public class Questionn10_percentageOfCalories {

	public static void main(String[] args) {
		/*
		Write a program that lets the user declare a number of calories and fat grams in a food item. 
		The program should display the percentage of calories that come from fat. One gram of fat has 9 calories; therefore:
                Calories from fat = Fat grams * 9
		The percentage of calories from fat can be calculated as follows:
                Calories from fat/Total Calories
		If the calories from fat are less than 30 percent of the total calories of the food, 
		it should also display a message indicating the food is low in fat.
		Note: The number of calories from fat can not be greater than the total number of calories in the food item. 
		If the program determines that the number of calories from fat is greater than the number of calories in the food item, 
		it should display an error message indicating that the input is invalid.
		*/
		
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
