package csci201.asmt18;

import java.util.Arrays;

public class Assignement18 {
    
    public static void print(int[][] array) {
	   // Your code starts here
    	for (int[] innerArray: array) {
    		System.out.print("[");
    		for  (int i = 0; i < innerArray.length; i++) {
    			System.out.print(innerArray[i]);
    			if (i != innerArray.length - 1) {
    				System.out.print(", ");
    			}
    		}
    		System.out.println("]");
        }
	    // Your code ends heres
    } 

    public static double average(int[][] array) {
       // Your code starts here
    	int sum = 0;
    	int itemCount = 0;
    	
    	for (int i = 0; i < array.length; i++) {
    		for (int j = 0; j < array[i].length; j++) {
    			sum += array[i][j];
    			itemCount++;
    		}
    	}
    	return sum / (double) itemCount;
       // Your code ends here
    }

    public static void main(String[] args) {                          
                   int[][] scores =
                                 {
                                                              {1, 2, 3},
                                                              {7, 8, 9}
                                 };
                   System.out.println("Bellow is a 2 dimensional array:");
                   print(scores);
                   System.out.println("Average of all cells = " + average(scores));
    }


}

//OUTPUT:
//
//Bellow is a 2 dimensional array:
//[1, 2, 3]
//[7, 8, 9]
//Average of all cells = 5.0
