/**
 * Author:	Sam Cooney
 * Project:	Project7
 * Date:	Sep 27, 2017
 * I assert that the program I am submitting is the result of my own efforts.
 * General: Servant class.
 */

		//-----------------------------------Part A------------------------------------


public class Box {	// Public class Box.
	int projectNum;	// Global variable.
	
	public Box(int pnumb) {
		
		projectNum = pnumb;	// Assigns global variable the value of the passes number.
	}
	
	public String toString() {
		
		String result = "*************************************************************\n"
				+ "*                        Sam Cooney                         *\n"
				+ "*                         CSC 2014                          *\n"
				+ "*                        Project #" + projectNum + "                         *\n"
				+ "*************************************************************\n\n";	
		// Puts box into variable result.
		return result;	// Returns box in the form of variable result.
	}
}
