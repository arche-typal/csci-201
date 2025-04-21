package csci201.asmt19;


public class MeanAndStandardDeviation {

	public static void main(String[] args) {
		int[] list1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double result = mean(list1);
		System.out.println("The mean of the list is " + result + ".");
		double result2 = standardDeviation(list1, result);
		System.out.println("The standard deviation of the list is " + result2 + ".");
		
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
		
		double added = 0;
		for (int i = 0; i <= numList.length-1; i++) {
			double num = (double) numList[i];
			double numSubMean = num - mean;
			double numSubMeanSquared = Math.pow(numSubMean, 2);
			added += numSubMeanSquared;
		}
		
		double standardDev = Math.sqrt(added/(numList.length-1));
		return standardDev;
	}
}
