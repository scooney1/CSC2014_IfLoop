/**
 * Author:	Sam Cooney
 * Project:	UseIf
 * Date:	Oct 4, 2017
 * I assert that the program I am submitting is the result of my own efforts.
 * General: Servant class.
 */

import java.text.DecimalFormat; // Allows use of DecimalFormat.

public class LetterB {			// Beginning of class. 
	DecimalFormat fmt = new DecimalFormat("0.00");
	String name, lettergrade;
	double grade;
	
	public LetterB(String p1, String p2, double p3) {			// Constructor method.
		
		name = p1;			// Placing values in global variables.
		lettergrade = p2;	// Placing values in global variables.
		grade = p3;			// Placing values in global variables.
	}	// End constructor.
	
	public String toString() {						// toString method.
		
		return("Dear " + name + ", Congratulations.\nYour grade point average is: "
				+ fmt.format(grade) + "\nThis means you will get a grade of " + lettergrade);
		// Returns a string when sop(obj); is executed.
	}
}	// End class.
