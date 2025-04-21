package csci201.asmt19;

//Mean = 9.6
//Standard Deviation = 5.232377832092956

public class StandardDeviationInClass {

	public static void main(String[] args) {
		//int[] list1 = {12, 22, 13, 4, 5, 6, 7, 8, 9, 10};
		int[] list1 = {3, 4, 5, 6};
		double result = mean(list1);
		System.out.println("Mean = " + result);
		double result2 = standardDeviationInClass(list1);
		System.out.println("Standard Deviation = " + result2);
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
	
	public static double standardDeviationInClass(int[] numList) {
		double mean = mean(numList);
		double sum = 0;
		for (int element : numList)
			sum += Math.pow((element - mean),2);
		return Math.sqrt(sum / (numList.length - 1));
	}
	
}
