package u3pp;

/**
 * YOUR COMMENTs HERE
 * 
 * @author //YOUR NAME HERE
 *
 */

public class LeapYear {
	
	/**
	 * YOUR COMMENTS HERE
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