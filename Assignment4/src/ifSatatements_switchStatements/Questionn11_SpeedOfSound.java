package ifSatatements_switchStatements;

import java.util.Scanner;

public class Questionn11_SpeedOfSound {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a medium:");
		String medium = scan.next();
		
		System.out.println("Enter a distance:");
		int distance = scan.nextInt();
		
		double time = 0;
		if(medium.equals("Air") || medium.equals("air")) {			
			time = distance/1100;
			System.out.println(time);
			
		}else if(medium.equals("Water") || medium.equals("water")) {			
			time = distance/4900;
			System.out.println(time);
			
		}else if(medium.equals("Air") || medium.equals("air")) {			
			time = distance/16400;
			System.out.println(time);
		}

	}

}
