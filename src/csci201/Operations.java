package csci201;

public class Operations {

	public static void main(String[] args) {
		int i1, i2, i3;
		double d1, d2;
		
		// unary operation have highest precedence after ()
		
		i1 = -2;
		i1 = - 2;
		i2 = -i1;
		i2 = - i1;
		i3 = i1 - - i1;
		System.out.println("i1 = " + i1 + ", i2 = " + i2 + ", i3 = " + i3);
		
		i1 = +2;
		i2 = + i2;
		i3 = i1 * + i3;
		System.out.println("i1 = " + i1 + ", i2 = " + i2 + ", i3 = " + i3);
		i3 = - (i1 + i2);
		System.out.println("i1 = " + i1 + ", i2 = " + i2 + ", i3 = " + i3);
		
//		integer division and the remaider or modulus operation
		
		i1 = 5;
		i2 = i1 / 2;
		System.out.println("i1 = " + i1 + ", i2 = " + i2);
		i3 = i1 % 2;
		System.out.println("i1 = " + i1 + ", i2 = " + i2 + ", i3 = " + i3);
		
		d1 = 5.0/2.0;
		d2 = 5.0 % 2.0; //though allowed does not make much sense
		System.out.println("d1 = " + d1 + ", d2 = " + d2);
		d1 = 5.0/2.1;
		d2 = 5.0 % 2.1;
		System.out.println("d1 = " + d1 + ", d2 = " + d2);
		
		//operations of same precedence are performed left to right;
		
		System.out.println("(36 / 6/2) = " + (36 / 6/2));
		System.out.println("36 / 6/2 = " + 36 / 6/2);
		System.out.println("36 + 6/2 = " + 36 + 6/2); //Only + operation is defined for strings, not -; + as first character in expression will
			//concatenate not add integers
		System.out.println("36 / (6 / 2) = " + (36 / (6 / 2)));
		
		System.out.println("36 / 6*2 = " + (36 / 6*2));		
		
		//pp 2.7 Assignment 6
		
		int remainingSeconds = 9999;
		System.out.println("Init seconds = " + remainingSeconds);
		int hours = remainingSeconds / (60 * 60);
		System.out.println("Hours = " + hours);
		remainingSeconds = remainingSeconds % (60 * 60); 
		//
		//
		//
		System.out.println("2 + 3 = " + 2 + 3 );
		System.out.println(2 + 3 + " = 2 + 3");
		System.out.println("36 / 6*2 = " + 36 / 6*2);
		System.out.println("12 + 24 / 6 = " + 12 + 24 / 6);
		System.out.println("(12 + 24 / 6) = " + (12 + 24/6));
		System.out.println("((12 + 24) / ) = " + ((12 + 24) / 6));
		System.out.println("(12 + 24) / 6 = " + (12 + 24) / 6);
		
		//pp 2.6 : Assignment 5
		
		int hrs = 2, mins = 46, secs = 39;
		int totSecs = hrs * 60 * 60 + mins * 60 + secs;
		System.out.println("Total Seconds = " + totSecs);
		totSecs = (hrs * (60 * 60)) + (mins * 60) + secs; // good to use parenthesis
		System.out.println("Total Seconds = " + totSecs);
	}
}