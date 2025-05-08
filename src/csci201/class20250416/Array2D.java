package csci201.class20250416;

import java.util.Arrays;

public class Array2D {

	public static void main(String[] args) {
		
		//int[] is 1d array
		int[][] scores; //2d array or "array of arrays"
		//WHen to use 2d array.
		//ex. 3 srudents and 4 quizzes.
		//want to store scores of 4 quizzes for 3 student using only one place
		//then use 2d array.
		//
		
		/*
		"So when do we use a two-dimensional array? So say I have.
		For students, and I have
		or say, I have 3 students, and I have for quizzes.
		So I want to store the scores of those for for quizzes for
		those 3 students in one place, using only one variable. 
		Then I will use a 2 dimensional array."
		*/
		
		scores = new int[4][3];
		//[4][3] = 4 rows, 3 columns "ROW home, before it gets COLd."
		//scores = new int[4][]; //still works
		System.out.println(scores); //prints address/ref variable
		System.out.println(Arrays.toString(scores)); //prints list of ref variables
		//(Above) Arrays.toString() doesn't work with 2d arrays like it does with 1d arrays
			//Explain why to self
		
		//So, we need to make a custom method to print the 2d array.
		print(scores);
		//All 0's for each row[i].
			//Because you're specifying the rows and columns with [4][3], 4 rows + 3 cols:
//				[0, 0, 0] row 0
//				[0, 0, 0] row 1
//				[0, 0, 0] row 2
//				[0, 0, 0] row 3
//				col0, col1, col2
		
		
		scores[1][1] = 5;
//				[0, 0, 0]
//				[0, 5, 0]
//				[0, 0, 0]
//				[0, 0, 0]
		print2(scores);
		scores[2][1] = 9;
		print2(scores);
//				[0, 0, 0]
//				[0, 5, 0]
//				[0, 9, 0]
//				[0, 0, 0]
		System.out.println(scores[2][1]);
//		9
		
		System.out.println();
		System.out.println();
		
		int[][] scores2 = 
		{
			{9, 8, 7, 6},
			{8, 7, 6, 5},
			{7, 6, 5, 4}
		};
		print2(scores2);
		

		System.out.println();
		System.out.println();
		
		//You can make 2d arrays with different lengths of columns
		//could not use columnAverage on this, 
		//because missing columns would trigger 
		//array out of index error
		int[][] scores3 = new int[4][];
		scores3[0] = new int[] {2};
		scores3[1] = new int[] {2, 3, 8};
		scores3[2] = new int[] {8, 3, 8, 1};
		scores3[3] = new int[] {9, 4};
		print2(scores3);
//				[2]
//				[2, 3, 8]
//				[8, 3, 8, 1]
//				[9, 4]
		
		
		
		System.out.println("Average of scores = " + average(scores));
		System.out.println("Average of scores2 = " + average(scores2));
		System.out.println("Average of scores3 = " + average(scores3));
		

		System.out.println();
		System.out.println();
		
		//rowAverage
		System.out.println("rowAverage------------------");
		double[] averages;
		averages = rowAverage(scores);
		print2(scores);
		for (int i = 0; i < averages.length; i++) {
			System.out.println("Average score for student " 
				+ (i + 1) + " is " + averages[i]);
		}
		System.out.println();
		System.out.println();
		
		averages = rowAverage(scores2);
		print2(scores2);
		for (int i = 0; i < averages.length; i++) {
			System.out.println("Average score for student " 
				+ (i + 1) + " is " + averages[i]);
		}
		System.out.println();
		System.out.println();
		
		averages = rowAverage(scores3);
		print2(scores3);
		for (int i = 0; i < averages.length; i++) {
			System.out.println("Average score for student " 
				+ (i + 1) + " is " + averages[i]);
		}
		System.out.println();
		System.out.println();
		
		//colAverage
		System.out.println("colAverage------------------");
		averages = columnAverage(scores);
		print2(scores);
		for (int i = 0; i < averages.length; i++) {
			System.out.println("Average score for quiz " 
				+ (i + 1) + " is " + averages[i]);
		}
		System.out.println();
		System.out.println();
		
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
	
	//Based off of print function in ArrayFunc
	public static void print2(int[][] array) {
		for (int[] row: array) {
			System.out.print("[");
			
//			for (int col: row) {
//				System.out.print(col + ", ");
//			}
			//(Above) prints like this: [0, 0, 0, ]
			
			//For better formatting, we need to know
			//the index of each value
			//so we do it like this:
			for (int i = 0; i < row.length; i++) {
				System.out.print(row[i]);
				//if i does not equal last row - 1 (indexes start at zero)
				//then add comma and space
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
		//rows indexing
		for (int i = 0; i < array.length; i++) {
			//cols indexing
			//if j less than length of row indexed?
			//you don't add -1 to array[i].length because 
			//indexing starts at 0. 
			//So an array with just an index of 0 
			//has a row length of 1.
			for (int j = 0; j < array[i].length; j++) {
				//add the value indexed in this row:col combo/cell
				//to the sum var
				sum += array[i][j];
				//increase elements counter
				numOfElements++;
			}
		} 
//		return sum / numOfElements; //int division = int product and not double
		
		//average = sum / number of items being averaged
		//make sure to make one variable a double
		//so that the results return is a double
		return sum / (double) numOfElements; 
	}
	
	public static double[] rowAverage(int[][] array) {
		int numOfRows = array.length;
		int numOfColumns;
		double[] averages = new double[numOfRows];
		//for row less than numOfRows
		for (int row = 0; row < numOfRows; row++) {
			//get number of columns per row, by indexing row and checking it's length
			numOfColumns = array[row].length;
			int sum = 0;
			
			//for col's less than numOfColumns/length of row
			for (int col = 0; col < numOfColumns; col++) {
				//get cell of current col indexed in row.
				sum += array[row][col];
			}
			//update averages array for that row
			//in this example, each row represents a student
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
			//update averages array for that col
			//in this example, each col represents a quiz
			averages[col] = sum / (double) numOfRows;
		}
		return averages;
	}
}
