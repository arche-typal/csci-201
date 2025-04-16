package csci201.class202509;

import java.util.Arrays;

public class ArrayFunc {

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
		System.out.println("After reversing: " 
				+ Arrays.toString(array) + " is " 
				+ Arrays.toString(reverse(array)));
	}
	
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
		return (double) sum(array) / array.length;
		
//		int sum = sum(array);
//		double average = (double) sum / array.length;
//		return average;
	}
	
	public static int min(int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	
	public static int max(int[] array) {
		int max = array[0];
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
	
	public static int[] reverse(int[] array) {
		int[] copy = new int[array.length];
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[1];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		return copy;
	}
}
