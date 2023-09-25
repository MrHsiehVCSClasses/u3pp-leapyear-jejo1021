package u3pp;

import java.util.Scanner;

/**S
 * YOUR COMMENTS HERE
 * 
 * @author YOUR NAME HERE
 */

class Main {

	public static void main(String[] args) {

		//YOUR CODE HERE
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year (or enter STOP to end): ");
		String input = sc.nextLine();		
		//int year = Integer.parseInt(input);
		//boolean check = LeapYear.isLeapYear(year);
		
		
		while (!input.toUpperCase().equals("STOP")) {
			/* YOUR CODE HERE */
			int year = Integer.parseInt(input);
			boolean check = LeapYear.isLeapYear(year);
			
			if(check == true) {
				System.out.println(input + " is a leap year");
				
			}
			else if(check == false) {
				System.out.println(year + " is not a leap year");
			}
			

			System.out.println("Enter a year (or enter STOP to end): ");
			
			//YOUR CODE HERE
			

			//if(input == "STOP") {
			//	sc.close();
				
			input = sc.nextLine();
			//}
		}
		//YOUR CODE HERE
		sc.close();
	}
}