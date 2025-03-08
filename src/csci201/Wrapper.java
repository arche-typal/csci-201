package csci201;

public class Wrapper {

	public static void main(String[] args) {
		int i1 = 2;
		Integer io = new Integer(i1);
		//older way of wrapping ^
		int i2 = io.intValue();
		System.out.println("i1 = " + i1 + ", i2 = " + i2 + ", io = " + io.toString());
		
		i1 = 2;
		io = new Integer(i1);
		i2 = io.intValue();
		System.out.println("i1 = " + i1 + ", i2 = " + i2 + ", io = " + io.toString());
		
		i1 = 2;
		io = i1; // io = new Integer(i1) : auto boxing
		i2 = io; // i2 = io.intValue() : auto unboxing
		System.out.println("i1 = " + i1 + ", i2 = " + i2 + ", io = " + io); //io.toString();
		
		double d2 = 2;
		Double dblObj = new Double(2);
		dblObj = 2.0;
	}
}
