/**
 * Author:	Sam Cooney
 * Project:	IfLoop
 * Date:	Oct 18, 2017
 * I assert that the program I am submitting is the result of my own efforts.
 * General: Master class for project IfLoop.
 */

import java.util.Scanner;	// Import Scanner class.

public class IfLoop {

	public static void main(String[] args) {
		int countGood = 0;int countBad = 0;		// Counter integers.
		int numStud = 0;int counter = 0;		// Integers for loop.
		Box myBox = new Box(9);					// Instantiate object for class Box.java
		Calc myCalc = new Calc();				// Instantiate object for class Calc.java
		Scanner scan = new Scanner(System.in);	// Instantiate object for class Scanner
		
		System.out.println("Enter the number of students as an integer: ");
		numStud = scan.nextInt();				// Read in number of students. 
		scan.nextLine();						// Skip to the next line. 
		System.out.println(numStud);			// Print out number of students.
		while(counter < numStud) {				// Start while loop.
			
			System.out.println("Enter in the student's first and last name: ");
			String sname = scan.nextLine();		// Read in student name.
			System.out.println("Enter in the student's grade as a decimal: ");
			double sgrade = scan.nextDouble();	// Read in student grade.
			scan.nextLine();					// Skip to the next line.
			System.out.println("Student " + sname + " has a grade of " + sgrade + ".");
			if(sgrade < 80.00) {				// Begin if statement (Student grade less than 80).
				
				System.out.println("Student " + sname + " does not belong in group being processed.");
				countBad++;						// Increment counter for bad students. 
			} else {							// Begin else statement (Student grade greater than 80).
				
				countGood++;					// Increment counter for good students.
				String prtgrade = myCalc.Calculate(sgrade);				// Call Calculate method of class Calc.java
				LetterB myLetter = new LetterB(sname,prtgrade,sgrade);	// Instantiate object for class LetterB.java
				System.out.println(myLetter);							// Call toString method of class LetterB.java
			}
			counter++;	// Increment counter for loop.
		}	// End while loop.
		System.out.println("There were " + countGood + " good students and " + countBad + " bad students.\n");
		System.out.println(myBox);	// Calls toString method of class Box.java
		scan.close();	// Close scan.
	}

}
