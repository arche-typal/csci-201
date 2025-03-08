package csci201;

public class Realation {
	public static void main(String[] args) {
		int i1 = 2, i2 = 3, i3 = 2;
		boolean b1 = (i1 > i2);
		System.out.println("b1 = " + b1);
		b1 = i2 > i1;
		System.out.println("b1 = " + b1);
		
		System.out.println(i1 + " > " + i2 + ": " + (i1 > i2));
		System.out.println(i1 + " < " + i2 + ": " + (i1 < i2));
		System.out.println(i1 + " >= " + i2 + ": " + (i1 >= i2));
		System.out.println(i1 + " <= " + i2 + ": " + (i1 <= i2));
		System.out.println(i1 + " >= " + i3 + ": " + (i1 >= i3));
		System.out.println(i1 + " =< " + i3 + ": " + (i1 <= i2));
		System.out.println(i1 + " == " + i3 + ": " + (i1 == i3));
		System.out.println(i1 + " != " + i3 + ": " + (i1 != i3));	
		System.out.println(i1 + " == " + i2 + ": " + (i1 == i2));
		System.out.println(i1 + " != " + i2 + ": " + (i1 != i2));
		
		char c1 = 'A', c2 = 'B';
		System.out.println(c1 + " > " + c2 + ": " + (c1 > c2));
		System.out.println(c1 + " <= " + c2 + ": " + (c1 <= c2));
		System.out.println(c1 + " != " + c2 + ": " + (c1 != c2));
		
		System.out.println(i1 + " != " + c2 + ": " + (i1 != c2));
		
		double d1 = 2.0, d2 = 3.0;
		System.out.println(i1 + " == " + d2 + ": " + (i1 == d2));
		System.out.println(i1 + " != " + d2 + ": " + (i1 != d2));
		System.out.println(i1 + " == " + d1 + ": " + (i1 == d1));
		System.out.println(i1 + " != " + d1 + ": " + (i1 != d1));
		System.out.println(i1 + " >= " + d1 + ": " + (i1 >= d1));
		System.out.println(i1 + " <= " + d1 + ": " + (i1 <= d1));
		
		double d3 = 6;
		double d4 = Math.sqrt(d3);
		double d5 = Math.pow(d4, 2);
		
		b1 = d3 == d5;
		System.out.println("b1 = " + b1);
		System.out.println(d3 + " == " + d5 + ": " + (d3 == d5));
		
		final double TOLERANCE = 0.000001;
		b1 = Math.abs(d5 - d3) < TOLERANCE;
		System.out.println("b1 = " + b1);
		
		String s1 = new String("A"), 
				s2 = new String("B"), 
				s3 = new String("A"),
				s4 = s1;
		
		System.out.println(s1 + " == " + s2 + ": " + (s1 == s2));
		System.out.println(s1 + " != " + s2 + ": " + (s1 != s2));
		System.out.println(s1 + " == " + s4 + ": " + (s1 == s4));
		System.out.println(s1 + " != " + s4 + ": " + (s1 != s4));
		System.out.println(s1 + " == " + s3 + ": " + (s1 == s3));
		//^ check if same object vs .equals checks same value not object
		System.out.println(s1 + " != " + s3 + ": " + (s1 != s3));
		

		System.out.println(s1 + ".equals(" + s3 + "): " + (s1.equals(s3)));
		System.out.println(s1 + ".equals(" + s4 + "): " + (s1.equals(s4)));
		
		//b1 = s1 < s2;
		//does not complain for ==/!== operators and does for this operator
		

		System.out.println(s1 + ".compareTo(" + s3 + "): " + (s1.compareTo(s3)));
		System.out.println(s3 + ".compareTo(" + s1 + "): " + (s3.compareTo(s1)));
		
		System.out.println(s1 + ".compareTo(" + s4 + "): " + (s1.compareTo(s4)));
		System.out.println(s4 + ".compareTo(" + s1 + "): " + (s4.compareTo(s1)));
		
		System.out.println(s1 + ".compareTo(" + s2 + "): " + (s1.compareTo(s2)));
		System.out.println(s2 + ".compareTo(" + s1 + "): " + (s2.compareTo(s1)));
		
		
	}
}