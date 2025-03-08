package csci201;

public class FloatPrimitives {

	public static void main(String[] args) {
		// floats
		
//		float f1 = 2.5; //literals are read as double;
		float f1 = 2.5f; 
		System.out.println("f1 = " + f1);
		
		f1 = 3.5F; // float literal
		System.out.println("f1 = " + f1);
		
		f1 = (float) 4.5;
		System.out.println("f1 = " + f1);
		
		f1 = 1234567; //storing time widening conversion
		System.out.println("f1 = " + f1);
		
		f1 = 123456789; //storing time widening conversion but loses precision
		System.out.println("f1 = " + f1);
		
//		 f1 = 1.234567;
		 f1 = (float) 1.234567; //explicit narrowing conversion
		 System.out.println("f1 = " + f1);
		 
		 f1 = (float) 1.2345675923; //explicit narrowing conversion
		 System.out.println("f1 = " + f1);
		 
		 f1 = 2 + 3;
		 System.out.println("f1 = " + f1); //storing time widening
		 
//		 f1 = 2.5 + 3.5; //results of literals come out as double
		 f1 = (float) (2.5 + 3.5);
		 System.out.println("f1 = " + f1);
		 
		 float f2 = 2.5f, f3 = 3.5F;
		 //f1 = f2 + f3; //results of 2 floats is a float
		 System.out.println("f1 = " + f1);
		 
		 //continue on friday
		 //covered: floating points, integers
		 //tonight or tomorrow new assignment
		 //quiz probably next week and online and open book, can even use compiler to test logic
		 
		 //02/03/2025
		 
		 //f1 = f2 + 4.5; //mismatch due to being cast as double
		 f1 = f2 + (float) 4.5; //works because we force a convert to float
		 System.out.println("f1 = " + f1);
		 f1 = (float) (f2 + 4.5); //operation time widening conversion then explicit
		 System.out.println(f1);
		 
		 //doubles
		 
		 double d1 = 2.5;
		 System.out.println("d1 = " + d1);
		  
		 d1 = 2.5 + 3.5;
		 System.out.println("d1 = " + d1);
		 
		 d1 = 4; //storing time widening
		 System.out.println("d1 = " + d1);
		 
		 d1 = 1 + 4; //storing time widening
		 System.out.println("d1 = " + d1);
		 
		 d1 = d1 + 2; //operation time widening
		 System.out.println("d1 = " + d1);
		 
		 d1 = d1 + 3.5f; //operation time widening
		 System.out.println("d1 = " + d1);
		 
		 long l1 = 1234567891234567894l;
		 System.out.println("l1 = " + l1);
		 
		 d1 = l1; //storing time widening but loses precision //should flag that precision may be lost but doesn't
		 System.out.println("d1 = " + d1);
		 
		 int int1 = 3, int2 = 2;
		 int int3 = int1 / int2;
		 System.out.println("int3 = " + int3);
		 
		 double double1 = int1 / int2;
		 System.out.println("double1 = " + double1);
		 
		 double1 = (double) (int1 / int2); //after operation widening
		 System.out.println("double1 = " + double1);
		 
		 double1 = (double) int1 / int2; // ((double) int1) / int2
		 System.out.println("double1 = " + double1);
		 
		 double1 = int1 / (double) int2; // int1 / ((double) int2)
		 System.out.println("double1 = " + double1);
		 
		 int3 = 3 / 2;
		 System.out.println("int3 = " + int3);
		 
		 double1 = 3 / 2; //storing time widening
		 System.out.println("double1 = " + double1);
		 
		 double1 = (double) (3 / 2);
		 System.out.println("double1 = " + double1);
		 
		 double1 = (double) 3 / 2;
		 System.out.println("double1 = " + double1);
		 
		 double1 = 3 / ((double) 2);
		 System.out.println("double1 = " + double1);
		 
		 int3 = 3 / 2;
		 System.out.println("int3 = " + int3);
		 
		 double1 = 3 / 2; //storing time widening
		 System.out.println("double1 = " + double1);
		 
		 double1 = 3.0 / 2; //storing time widening
		 System.out.println("double1 = " + double1);
		 
		 double1 = 3.0 / 2.0; //storing time widening
		 System.out.println("double1 = " + double1);
		 
		 
	}
}