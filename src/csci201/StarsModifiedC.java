package csci201;

public class StarsModifiedC {

	public static void main(String[] args) {
		final int MAX_ROWS = 10;
		for (int row = 1; row <= MAX_ROWS; row++) {
			for (int star = 1; star <= row; star++) {
				System.out.print(" ");
			}	
			for (int star = 10; star >= row; star--) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
}
