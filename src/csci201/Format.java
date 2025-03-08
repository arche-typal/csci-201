package csci201;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Format {

	public static void main(String[] args) {
		int i1 = 200;
		double d1 = Math.sqrt(i1);
		System.out.println("d1 = " + d1);
		
		DecimalFormat deciFormatter = new DecimalFormat("#.##");
		System.out.println("d1 = " + deciFormatter.format(d1));
		
		NumberFormat curFormatter = NumberFormat.getCurrencyInstance();
		System.out.println("d1 = " + curFormatter.format(d1));
		System.out.println("d1 = $" + deciFormatter.format(d1));
		
		NumberFormat percentFormatter = NumberFormat.getPercentInstance();
		System.out.println("d1 = " + percentFormatter.format(d1));
		System.out.println("d1 = " + deciFormatter.format(d1 * 100) + "%");
		
		System.out.println("d1 = " + percentFormatter.format(0.05));
		System.out.println("d1 = " + deciFormatter.format(0.05 * 100) + "%");
	}
}
