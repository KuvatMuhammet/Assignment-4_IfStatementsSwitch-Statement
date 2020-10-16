package ifSatatements_switchStatements;

import java.util.Scanner;

public class Question1_BMI_bodyMassIndex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your weight in pounds:");
		double pounds = scan.nextDouble();
		
		System.out.println("Enter your height in feet followed by a space then additional inches:");
		double feets = scan.nextDouble();
		double inches = scan.nextDouble();
		
		double BMI = 0;
		double poundsToKgs = pounds/2.2;
		double heightToMeters = (feets*12 + inches)*0.0254;
		
		BMI=poundsToKgs/(heightToMeters*heightToMeters);
		
		System.out.println("Your BMI is " + BMI );

		if(BMI<18.5) {
			System.out.println("Your risk factory is Underweight");
		}else if(BMI>=25 && BMI<25) {
			System.out.println("Your risk factory is Normal Weight");
		}else if(BMI>=25 && BMI<30) {
			System.out.println("Your risk factory is Overweight");
		}else {
			System.out.println("Your risk factory is Obese");
		}
		
	}

}
