package csci201.class20250428;

import java.util.Arrays;

/* Lesson mainly goes over overriding functions and comparison methods. */
public class CircleObjectTest {
	
	public static void main(String[] args) {
		CircleObject c1 = new CircleObject(2);
		System.out.println("c1 = " + c1);
		CircleObject c2 = new CircleObject(4);
		System.out.println("c2 = " + c2);
		CircleObject c3 = new CircleObject(2);
		System.out.println("c3 = " + c3);
		CircleObject c4 = c1;
		System.out.println("c4 = " + c4 + "\n");
		
		
		System.out.println(c1 + " == " + c2 + ": " + (c1 == c2));
		System.out.println(c1 + " == " + c3 + ": " + (c1 == c3));
		System.out.println(c1 + " == " + c4 + ": " + (c1 == c4));
		System.out.println(c1 + " != " + c4 + ": " + (c1 != c4) + "\n");
		
		
		String s1 = new String("A"), s2 = new String("B"), s3 = new String("A"), s4 = s1;

		System.out.println(s1 + " == " + s2 + ": " + (s1 == s2));
		System.out.println(s1 + " == " + s3 + ": " + (s1 == s3));
		System.out.println(s1 + " == " + s4 + ": " + (s1 == s4));
		System.out.println(s1 + " != " + s4 + ": " + (s1 != s4) + "\n");

		System.out.println(s1 + ".equals(" + s2 + "): " + s1.equals(s2));
		System.out.println(s1 + ".equals(" + s3 + "): " + s1.equals(s3));
		System.out.println(s1 + ".equals(" + s4 + "): " + s1.equals(s4) + "\n");
		
		System.out.println(c1 + ".equals(" + c2 + "):" + (c1.equals(c2)));
		System.out.println(c1 + ".equals(" + c3 + "):" + (c1.equals(c3)));
		System.out.println(c1 + ".equals(" + c4 + "):" + (c1.equals(c4)) + "\n");
		
		System.out.println(s1 + ".compareTo(" + s2 + "): " + s1.compareTo(s2));
		System.out.println(s2 + ".compareTo(" + s1 + "): " + s2.compareTo(s1));
		System.out.println(s1 + ".compareTo(" + s3 + "): " + s1.compareTo(s3));
		System.out.println(s1 + ".compareTo(" + s4 + "): " + s1.compareTo(s4) + "\n");
		
		System.out.println(c1 + ".compareTo(" + c2 + "): " + c1.compareTo(c2));
		System.out.println(c2 + ".compareTo(" + c1 + "): " + c2.compareTo(c1));
		System.out.println(c1 + ".compareTo(" + c3 + "): " + c1.compareTo(c3));
		System.out.println(c1 + ".compareTo(" + c4 + "): " + c1.compareTo(c4));
		
		String[] strArray= {s1, s2, s3, s4};
		System.out.println("strArray = " + Arrays.toString(strArray));
		Arrays.sort(strArray);
		System.out.println("strArray after sorting = " + Arrays.toString(strArray));
		
		CircleObject[] circArray= {c1, c2, c3, c4};
		System.out.println("circArray = " + Arrays.toString(circArray));
		Arrays.sort(circArray);
		System.out.println("circArray after sorting = " + Arrays.toString(circArray));
		
		
	}
}