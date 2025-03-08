package csci201;

public class MathDemo {

	public static void main(String[] args) {
		//math.pow
		//math.pi
		
		int i1 = -2;
		int i2 = Math.abs(i1);
		double p = Math.PI; //all caps for const
		System.out.println("i2 = " + i2);
		double d1 = Math.pow(i1, i2);
		System.out.println("d1 = " + d1);
		double d2 = Math.sqrt(d1);
		System.out.println("d2 = " + d2);
		i2 = (int) Math.sqrt(16);
		System.out.println("i2 = " + i2);
	}
}
