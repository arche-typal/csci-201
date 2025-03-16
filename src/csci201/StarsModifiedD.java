package csci201;

public class StarsModifiedD {

	public static void main(String[] args) {
		final int MAX_ROWS = 5;
		String diamond = "*";
		for (int row = 1; row <= MAX_ROWS; row++) {
			for (int star = 5; star >= row; star--) {
				System.out.print(" ");
			}	
			for (int star = 1; star <= (2 * row - 1); star++) {
				System.out.print(diamond);
			}
		System.out.println();
		}
		for (int row = 1; row <= MAX_ROWS; row++) {
			for (int star = 1; star <= row; star++) {
				System.out.print(" ");
			}	
			for (int star = 9; star >= (2 * row - 1); star--) {
				System.out.print(diamond);
			}
		System.out.println();
		}
	}
}
