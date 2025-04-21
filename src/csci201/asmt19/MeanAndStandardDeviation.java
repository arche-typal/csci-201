package csci201.asmt19;

//Design and implement an application that computes and prints the
//mean and standard deviation of a list of integers xi through x1Z.
//Assume that there will be no more than 50 input values. Compute
//both the mean and the standard deviation as floating point values,
//using the following formulas.

public class MeanAndStandardDeviation {

	public static void main(String[] args) {
		int[] list1 = {1,2,3};
		double result = mean(list1);
		System.out.println(result);
		
	}
	
	public static double mean(int[] numList) {
		double added = 0;
		for (int i = 0; i <= numList.length-1; i++) {
			double num = (double) numList[i];
			added = added + num;
		}
		
		double mean = added/numList.length;
		return mean;
	}

}
