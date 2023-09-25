package u3pp;

/**
 * checks if year is a leap year
 * 
 * @author //Jeremy John
 *
 */

public class LeapYear {
	
	/**
	 * Leap year determining:
	 * years before 1582 is not leap year
	 * years divisible by 4 are leap years
	 * years divisible by 100 and by 400 are leap years. If they are not divisible by 400 they are not leap years
	 * 
	 * 
	 */
	
	
	public static boolean isLeapYear(int year) {
		/* YOUR CODE HERE */
		
		
		if(year < 1582) {
			return false;
		}
		
		else if(!(year % 2 == 0)) {
			return false;
		}
		
		else if(year >= 1582 && year % 4 ==0 &&!(year % 100 == 0)) {
			return true;
		}
		else if(year >= 1582 && year % 100 == 0 && year % 400 == 0) {
			return true;
		}
		else {
			return false;
		}
		
		
		
	}
}