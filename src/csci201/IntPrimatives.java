package csci201;

public class IntPrimatives {

	public static void main(String[] args) {
		//bytes
		byte b1 = 2; //literals are read as int: storing time automating narrowing
//		System.out.println("b1 = " + b1);
		
		int i1 = 2;
		//int i1 = 200;
		//b1 = i1;
		b1 = (byte) i1; //explicit down casting;
//		System.out.println("b1 = " + b1);
		
//		b1 = 128; //byte ranges from -128 to +127, complains because 128 is out of range
//		b1 = 127;
//		b1 = -129;
		b1 = -128;
		System.out.println("b1 = " + b1);
		
		byte b2 = 2, b3 = 3; // declare and initialize more than 1 variable of the same
		//b1 = b2 + b3; //results comes as int because there's no arithmetic operations (+, -, *)
		//and the byte is converted into an int
		b1 = (byte) (b2 + b3);
		System.out.println("b1 = " + b1);

		b1 = (byte) (129); //becomes -127 because 2 over 127 (REVIWE)
		System.out.println("b1 = " + b1);
		

//		b1 = 127;
//		b1++;
//		System.out.println("b1 = " + b1);		
		
		short s1 = 2;
		System.out.println("s1 = " + s1);
		
		int i2 = 2;
//		s1 = i2; // errors
		s1 = (short) i2; //explicit down casting
		System.out.println("s1 = " + s1);
		
//		s1 = -32769; //errors
		s1 = -32768;
		System.out.println("s1 = " + s1);
		
		short s2 = 2, s3 = 3;
		s1 = s3;
		System.out.println("s1 = " + s1);
//		s1 = s2 + s3; //result comes as int
//		s1 = (short) (s2 + s3); explicit down casting
//		s1 = (short) s2 + s3; // errors
		System.out.println("s1 = " + s1);
		
		s1 = (short) 32769; //explicit down casting;
		s1++;
		System.out.println("s1 = " + s1);
		
//		long
		long l1 = 2;
		System.out.println("l1 = " + l1);
		
		l1 = 3L; // long literal; no conversion
		System.out.println("l1 = " + l1);
		
		l1 = 4l; //long literal; no conversion
		System.out.println("l1 = " + l1);
		
		int i3 = 5, i4 = 6;
		l1 = i3; // storing time widening conversion
		System.out.println("l1 = " + l1);
		
		l1 = i3 + i4; // storing time widening conversion
		System.out.println("l1 = " + l1);
		
		l1 = l1 + i3; // operation time widening conversion; no storing time conversion
		System.out.println("l1 = " + l1);
		
		//ALSO VIEW FLOATING POINTS CLASS IN VIDEO
		//QUIZ LATER OVER THIS AND FLOATING POINTS
		//In class or online?
	}
}
