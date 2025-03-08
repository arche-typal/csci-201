package csci201;

import java.text.DecimalFormat;
import java.util.Scanner;

//Checked work with:
//	https://www.inchcalculator.com/herons-formula-calculator/

public class AreaOfTriangle {

	public static void main(String[] args) {
		double s, a, b, c, area;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Hello, we're going to calculate the area of a triangle using Heron's Formula."
				+ "\nLet's start by entering the length of the first side of the triangle: ");
		a = scanner.nextDouble();
		System.out.print("\nNow enter the length of the next side: ");
		
		b = scanner.nextDouble();
		
		System.out.print("\nNow enter the length of the last side: ");
		c = scanner.nextDouble();
		
		/*		
		 * Determine if valid triangle. Sum of 2 sides must be greater than third side.
		 * I know we haven't gone over while loops or operators yet. 
		 * I think they're useful right now for checking if the triangle is valid (even though that's not required in the assignment),
		 * so I decided to use them.
		 */
		while (!(a+b > c)||!(a+c>b)||!(b+c>a)) {
			System.out.print("\nSorry, that is not a valid triangle because the sum of lengths of any two sides "
					+ "\nis not greater than the value of the third side."
					+ "\nPlease re-enter the length of the first side: ");
			a = scanner.nextDouble();
			System.out.print("\nNow enter the length of the next side: ");
			
			b = scanner.nextDouble();
			
			System.out.print("\nNow enter the length of the last side: ");
			c = scanner.nextDouble();
		}
		
//		calculate semi-perimeter
		s = (a+b+c)/2.0;
		
//		calculate area
		area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
		
//		print the area to three decimal places
		DecimalFormat deciFormatter = new DecimalFormat("#.###");
		
		System.out.print("\nGreat, now let's first calculate the semi-perimeter, which is: " + s
				+ "\nAnd finally the area is " + deciFormatter.format(area));
		
		scanner.close();		

	}

}
