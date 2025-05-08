package csci201.class20250409;

import java.util.Arrays;

//Lecture on April 9th
public class ArrayFunc {
	
	//PassByValue
	public static void changeMe(int[] array) {
		System.out.println("In changeMe before changing: " + (array) + Arrays.toString(array));
		array = new int[] {2, 4, 3};
		//Doesn't update array ultimately because we create a new array object
			//with a different address.
		//The address of variable/array within function is different from the variable outside function
		System.out.println("In changeMe after changing: " + (array) + Arrays.toString(array));
	}
	
	public static void changeMeReally(int[] array) {
		System.out.println("In changeMe before changing: " + (array) + Arrays.toString(array));
		//this does ultimately update the array/variable because we are not creating a new array. 
		//instead we are updating the existing array. 
		array[3] = 100;
		System.out.println("In changeMe after changing: " + (array) + Arrays.toString(array));
	}

	//ArrayFunc
	public static void main(String[] args) {
		int[] array = {7, 9, 1, 5 , 4};
		System.out.println(Arrays.toString(array));
		print(array);
		System.out.println("Sum = " + sum(array));
		System.out.println("Average = " + average(array));
		System.out.println("Minimum = " + min(array));
		System.out.println("Maximum = " + max(array));
		System.out.println("Copy of " 
				+ Arrays.toString(array) + " is " 
				+ Arrays.toString(copy(array)));
		System.out.println("Reverse copy of " 
				+ Arrays.toString(array) + " is " 
				+ Arrays.toString(reverseCopy(array)));
		System.out.println("Reverse copy 2 of " 
				+ Arrays.toString(array) + " is " 
				+ Arrays.toString(reverseCopy(array)));
		reverse(array);
		System.out.println("After reversing: " 
				+ Arrays.toString(array));
		
		//Class of April 11th
		int key1 = 5;
		boolean contains = contains(array, key1);
		if (contains) {
			System.out.println(Arrays.toString(array) + " contains " + key1);
		} else {
			System.out.println(Arrays.toString(array) + " does not contain " + key1);
		}
		int key2 = 6;
		boolean contains2 = contains(array, key2);
		if (contains2) {
			System.out.println(Arrays.toString(array) + " contains " + key2);
		} else {
			System.out.println(Arrays.toString(array) + " does not contain " + key2);
		}
		
		int key3 = 9;
		int index = indexOf(array, key3);
		if (index < 0) {
			System.out.println(Arrays.toString(array) 
					+ " contains " + key3 + " at index " + index);
		} else {
			System.out.println(Arrays.toString(array) 
					+ " contains " + key3 + " at index " + index);
		}
		
		int key4 = 9;
		int index2 = indexOf(array, key4);
		if (index2 < 0) {
			System.out.println(Arrays.toString(array) 
					+ " contains " + key4 + " at index " + index2);
		} else {
			System.out.println(Arrays.toString(array) 
					+ " contains " + key4 + " at index " + index2);
			array[index]++;
			System.out.println(Arrays.toString(array) 
					+ " value at index " 
					+ index2 + " \nhas been incremented by 1.");
		}
		
		//PassByValue
		
			//changeMe
		System.out.println("\nIn main before calling changeMe: " + (array) + Arrays.toString(array));
		changeMe(array);
		//If you don't use Arrays.toString() it will print the address, instead of the contents of
		//'arrays' variable
		System.out.println("In main after calling changeMe: " + (array) +  Arrays.toString(array));
		
			//changeMeReally
		System.out.println("\nIn main before calling changeMeReally: " + (array) + Arrays.toString(array));
		changeMeReally(array);
		System.out.println("In main after calling changeMeReally: " + (array) +  Arrays.toString(array));
	}
	
	//doesn't keep track of indexes 
	//deciding to omit from studying
	public static void printZero(int[] array) {
		System.out.println("[");
		for (int element : array)
			System.out.print(element + ", ");
		System.out.println("]");
	}
	
	//////
	
	//keeps track of indexes
	public static void print(int[] array) {
		System.out.print("[");
		for  (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i != array.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
	
	public static int sum(int[] array) {
		int sum = 0;
		for (int element : array) {
			sum += element;
		}
		return sum;
	}
	
	public static double average(int[] array) {
		//*REMEMBER TO CHANGE INTO FLOATING POINT
		//as long as one in converted to floating point, 
		//the result will be floating point
		return (double) sum(array) / array.length;
		
		//same think just more parsed out for readability
//		int sum = sum(array);
//		double average = (double) sum / array.length;
//		return average;
	}
	
	public static int min(int[] array) {
		int min = array[0];
		//we start at index 1 because we already saved
		//the first element above (array[0])
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	
	public static int max(int[] array) {
		int max = array[0];
		//Again, we start at index 1 because we already saved
		//the first element above (array[0])
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	
	public static int[] copy(int[] array) {
		int[] copy = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			copy[i] = array[i];
		}
		return copy;
	}
	
	public static int[] reverseCopy(int[] array) {
		int[] copy = new int[array.length];
		for (int i = 0, j = array.length-1; i < array.length; i++, j--) {
			copy[j] = array[i];
		}
		return copy;
	}
	
	public static int[] reverseCopy2(int[] array) {
		int[] copy = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			
			copy[i] = array[array.length - 1 - i];
		}
		return copy;
	}
	
	//Don't forget to use Arrays.toString() to print all of these.
	//Just using arrays will print the object address
	public static void reverse(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			//need to use temp above to keep track of 'lost' values at beginning of array
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
	}
	
	public static boolean contains(int[] array, int key) {
		for (int element : array)
			if (element == key)
				return true;
		return false;
	}
	
	//if not found, return int that isn't an index, like a neg #
	//function aka 'find'
	public static int indexOf(int[] array, int key) {
		for (int i = 0; i < array.length; i++)
			if (array[i] == key)
				return i;
		return -1;
	}
}
