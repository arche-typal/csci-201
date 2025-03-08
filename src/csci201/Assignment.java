package csci201;

public class Assignment {

	public static void main(String[] args) {
		int i1 = 6, i2 = 3;
		
		i1 = i1 + i2;
		System.out.println("i1 = " + i1);		
		
		i1 = 6;
		i1 += i2; // shortcut for i1 = i1 + i2
		System.out.println("i1 = " + i1);
		
		i1 = 6;
		i1 += 5; // i1 = i1 + 5
		System.out.println("i1 = " + i1);
		
		i1 = 6;
		i1 += i2 - 5; // i1 = i1 + (i2 - 5)
		System.out.println("i1 = " + i1);
		
		i1 = 6;
		i1 -= i2 - 5; // i1 = i1 - (i2 - 5)
		System.out.println("i1 = " + i1);
		

		i1 = 6;
		i1 *= i2; // i1 = i1 * i2
		System.out.println("i1 = " + i1);
		//should be -12
		
		i1 = 6;
		i1 /= i2; // i1 = i1 / i2
		System.out.println("i1 = " + i1);

		i1 = 6;
		i1 %= i2; // i1 = i1 % i2
		System.out.println("i1 = " + i1);

		i1 = 6;
		i1 = i1 + 1;
		System.out.println("i1 = " + i1);

		i1 = 6;
		i1 += 1; // i1 = i1 + 1;
		System.out.println("i1 = " + i1);

		i1 = 6;
		i1++; // i1 = i1 + 1;
		System.out.println("i1 = " + i1);

		i1 = 6;
		++i1; // i1 = i1 + 1;
		System.out.println("i1 = " + i1);
		
		i1 = 6;
		i2 = ++i1; // i1 = i1 + 1;
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		

		i1 = 6; i2 = 3;
		i2 = i1++; // i2 is 6 instead of 7 like above, because assignment happens before i1 is incremented
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		
		i1 = 6; i2 = 3;
		System.out.println("i1 = " + ++i1);

		i1 = 6; i2 = 3;
		System.out.println("i1 = " + i1++); // System.out.println("i1 = " + i1); i1++ 
		System.out.println("i1 = " + i1);
		
		
		i1 = 6; i2 = 3;
		System.out.println("i1 = " + --i1);

		i1 = 6; i2 = 3;
		System.out.println("i1 = " + i1--); // System.out.println("i1 = " - i1); i1-- 
		System.out.println("i1 = " + i1);
					
	}

}
