package ifSatatements_switchStatements;

import java.util.Scanner;

public class Question7_NumberInSeconds {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int seconds, minutes, hours, days;
		
		System.out.println("Enter number of seconds:");
		 seconds = scan.nextInt();
		
		if(seconds>=60 && seconds<3600) {
			 minutes = seconds/60;
			seconds = seconds%60;
			System.out.println(minutes + " minutes " + seconds + " seconds");
		
		}else if(seconds>=3600 && seconds<=86400) {
			 hours = seconds/3600;
			 minutes = seconds%3600/60;
			 seconds = seconds%60;
			System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds");
		
		}else if(seconds>86400) {
			 days = seconds/86400;
			 hours = seconds%86400/3600;
			 minutes = seconds%3600/60;
			 seconds = seconds%60;
			System.out.println(days + " days " + hours + " hours " + minutes + " minutes " + seconds + " seconds");
		}

	}

}
