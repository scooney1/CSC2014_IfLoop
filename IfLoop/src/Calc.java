/**
 * Author:	Sam Cooney
 * Project:	UseIf
 * Date:	Oct 4, 2017
 * I assert that the program I am submitting is the result of my own efforts.
 * General: Servant class.
 */


public class Calc {		// Calc class.
	double gpa;

	public Calc() {		// Constructor method.
		
		System.out.println("The constructor of Calc.java has been called.");
	}	// End constructor.
	
	public String Calculate(double p4) {
		
		gpa = p4;
		if(gpa <= 100 && gpa >= 95) 	// Conditional for grade A.
			return("A");
		else if(gpa >= 90 && gpa < 95)	// Conditional for grade A-.
			return("A-");
		else if(gpa >= 87 && gpa < 90)	// Conditional for grade B+.
			return("B+");
		else if(gpa >= 83 && gpa < 87)	// Conditional for grade B.
			return("B");
		else if(gpa >= 80 && gpa < 83)	// Conditional for grade B-.
			return("B-");
		else							// To avoid error.
			return("NULL");
	}

}	// End class.
