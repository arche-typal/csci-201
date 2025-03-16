package csci201;


/*
 * Do the programming project: PP 4.10 on page 165 of your textbook.

	Submission Instructions: 
	
	Submit only the source code (*.java) file(s).
	
	
	
	
	
 * PP 4.10 Create modified versions of the stars program to print the following patterns. 
 * Create a separate program to produce each pattern. 
 * 
 * Hint: Parts b, c, and d require several loops, some of
	which print a specific number of spaces.*/


public class StarsModifiedDTroubleshooting {

	public static void main(String[] args) {
	int start = 1;
	    int increment = 2;
	
	    for (int i = 0; i < 4; i++) { 
	    	System.out.println(start);
	        start += increment;
	    }
	}
}
