package csci201.class202516;

import java.util.Arrays;

public class Array2D {

	public static void main(String[] args) {
		
		//int[] is 1d array
		int[][] scores; //2d array or "array of arrays"
		scores = new int[4][3];
		//scores = new int[4][]; //still works
		System.out.println(scores);
		System.out.println(Arrays.toString(scores));
		print(scores);
		scores[1][1] = 5;
		scores[2][1] = 9;
		print2(scores);
		System.out.println(scores[2][1]);
		int[][] scores2 = 
		{
			{9, 8, 7, 6},
			{8, 7, 6, 5},
			{7, 6, 5, 4}
		};
		print2(scores2);
		int[][] scores3 = new int[4][];
		scores3[0] = new int[] {2, 5, 9};
		scores3[1] = new int[] {2, 3, 8};
		scores3[2] = new int[] {8, 3, 8, 1};
		scores3[3] = new int[] {9, 4};
		print2(scores3);
		System.out.println("Average of scores = " + average(scores));
		System.out.println("Average of scores2 = " + average(scores2));
		System.out.println("Average of scores3 = " + average(scores3));
		
		//watch video for last class
		//re watch this video and take notes on exam questions to expect
		
		double[] averages;
		averages = rowAverage(scores);
		print2(scores);
		for (int i = 0; i < averages.length; i++) {
			System.out.println("Average score for student " 
				+ (i + 1) + " is " + averages[i]);
		}
		
		averages = rowAverage(scores2);
		print2(scores2);
		for (int i = 0; i < averages.length; i++) {
			System.out.println("Average score for student " 
				+ (i + 1) + " is " + averages[i]);
		}
		
		averages = rowAverage(scores3);
		print2(scores3);
		for (int i = 0; i < averages.length; i++) {
			System.out.println("Average score for student " 
				+ (i + 1) + " is " + averages[i]);
		}
		
		averages = columnAverage(scores);
		print2(scores);
		for (int i = 0; i < averages.length; i++) {
			System.out.println("Average score for quiz " 
				+ (i + 1) + " is " + averages[i]);
		}
		
		averages = columnAverage(scores2);
		print2(scores2);
		for (int i = 0; i < averages.length; i++) {
			System.out.println("Average score for quiz " 
				+ (i + 1) + " is " + averages[i]);
		}
	}
	
	public static void print(int[][] array) {
		for (int[] row: array) {
			System.out.println(Arrays.toString(row));
		}
		System.out.println();
	}
	
	public static void print2(int[][] array) {
		for (int[] row: array) {
			System.out.print("[");
//			for (int col: row) {
//				System.out.print(col + ", ");
//			}
			for (int i = 0; i < row.length; i++) {
				System.out.print(row[i]);
				if (i != row.length - 1) {
					System.out.print(", ");
				}
			}
			System.out.print("]");
			System.out.println();
		}
		System.out.println();
	}
	

	public static double average(int[][] array) {
		int sum = 0, numOfElements = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				numOfElements++;
			}
		} 
//		return sum / numOfElements; //int division = int product and not double
		return sum / (double) numOfElements;
	}
	
	public static double[] rowAverage(int[][] array) {
		int numOfRows = array.length;
		double[] averages = new double[numOfRows];
		int numOfColumns;
		for (int row = 0; row < numOfRows; row++) {
			numOfColumns = array[row].length;
			int sum = 0;
			for (int col = 0; col < numOfColumns; col++) {
				sum += array[row][col];
			}
			averages[row] = sum / (double) numOfColumns;
		}
		return averages;
	}
	
	public static double[] columnAverage(int[][] array) {
		int numOfRows = array.length;
		int numOfColumns = array[0].length;
		double[] averages = new double[numOfColumns];
		for (int col = 0; col < numOfColumns; col++) {
			int sum = 0;			
			for (int row = 0; row < numOfRows; row++) {
				sum += array[row][col];
			}
			averages[col] = sum / (double) numOfRows;
		}
		return averages;
	}
}
