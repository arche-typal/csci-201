package csci201.asmt19;

import java.lang.reflect.Array;

//Design and implement an application that computes and prints the
//mean and standard deviation of a list of integers xi through x1Z.
//Assume that there will be no more than 50 input values. Compute
//both the mean and the standard deviation as floating point values,
//using the following formulas.

public class MeanAndStandardDeviation {

	public static void main(String[] args) {
		//***Enable user to make list
		int[] list1 = {1,2,3};
		double result = mean(list1);
		System.out.println(result);
		double result2 = standardDeviation(list1, result);
		System.out.println(result2);
		
	}
	
	public static double mean(int[] numList) {
		double added = 0;
		for (int i = 0; i <= numList.length-1; i++) {
			double num = (double) numList[i];
			added += num;
		}
		
		double mean = added/numList.length;
		return mean;
	}
	
	public static double standardDeviation(int[] numList, double mean) {
		//subtract mean from numbers
		//then square each number
		//then add the numbers
		//then divide by number of numbers
		
		double added = 0;
		for (int i = 0; i <= numList.length-1; i++) {
			double num = (double) numList[i];
			double numSubMean = num - mean;
			double numSubMeanSquared = Math.pow(numSubMean, 2);
			added += numSubMeanSquared;
		}
		
		double standardDev = added/numList.length;
		return standardDev;
	}
}
