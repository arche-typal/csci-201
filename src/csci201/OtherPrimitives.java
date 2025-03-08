package csci201;

public class OtherPrimitives {

	public static void main(String[] args) {
		//chars
		
		char c1 = 'A';
		System.out.println("c1 = " + c1);
		c1 = 66; //storing time narrowing conversion;
		System.out.println("c1 = " + c1);
		int i1 = 67;
//		c1 = i1;
		c1 = (char) i1; //explicit narrowing conversion / down casting
		System.out.println("c1 = " + c1);
//		c1 = c1 + 1; //operation time widening conversion
//		c1 = c1 + (char) 1; //result is integer
		c1 = (char) (c1 + 1);
		System.out.println("c1 = " + c1);
		char c2 = 1;
		System.out.println("c2 = " + c2);
//		c1 = c1 + c2; //result is integer
		c1 = (char) (c1 + c2);
		System.out.println("c1 = " + c1);
		c1++;
		System.out.println("c2 = " + c2);
		int i = 'A' + 'B';
		System.out.println("i = " + i);
		char c = 'A' + 'B';		
		System.out.println("c = " + c);
		c = 'A' + '0';		
		System.out.println("c = " + c);
		
		//booleans
		
		boolean b1 = true;
		System.out.println("b1 = " + b1);
		b1 = false;
		System.out.println("b1 = " + b1);
//		b1 = (boolean) 1;
		byte bt = 1;
//		b1 = (boolean) bt;
		boolean b2 = true;
		b1 = (boolean) b2;
		System.out.println(b2);
	}
}
