package csci201.asmt17;

import java.util.Arrays;

public class Assignment17 {
    private static int max(int[] array) {
        // Your code starts here
    	int maxItem = array[0];
    	for (int i = 1; i < array.length; i++) {
    		if (array[i] > maxItem) {
    			maxItem = array[i];
    		}
    	}
    	return maxItem;
        // Your code ends here
    }            

	private static int search(int[] array, int key) {
	    // Your code starts here
		for (int i = 0; i < array.length; i++) {
    		int item = array[i];
    		if (key == item) {
    			return i;
    		}
    	}
		return -1;
		// Your code ends here
	}            
	
	public static void main(String[] args) {
	        int[] scores = {4, 6, 8, 0, 2};
	        System.out.println("Max" + Arrays.toString(scores) + " = " + max(scores));
	
	
	        int toSearch = 7;
	        int index = search(scores, toSearch);
	        if (index < 0)
	                      System.out.println(toSearch + " is NOT in " + Arrays.toString(scores));
	        else
	                      System.out.println(toSearch + " is at index " +  index +
	                                                   " in " + Arrays.toString(scores));
	       
	
	        toSearch = 8;
	        index = search(scores, toSearch);
	        if (index < 0)
	                      System.out.println(toSearch + " is NOT in " + Arrays.toString(scores));
	        else
	                      System.out.println(toSearch + " is at index " +  index +
	                                                   " in " + Arrays.toString(scores));             
	}
}

//OUTPUT:
//
//Max[4, 6, 8, 0, 2] = 8
//7 is NOT in [4, 6, 8, 0, 2]
//8 is at index 2 in [4, 6, 8, 0, 2]
