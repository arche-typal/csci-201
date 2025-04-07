package csci201.asmt16;

import java.util.ArrayList;
import java.util.Arrays;

/*
Suit	Cards
Hearts	A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K
Diamonds	A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K
Clubs	A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K
Spades	A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K
*/

public class CardDriver {

	public static void main(String[] args) {
		Card card = new Card();
		
		Card card1 = card.generateRandomCard();
		Card card2 = card.generateRandomCard();
		Card card3 = card.generateRandomCard();
		Card card4 = card.generateRandomCard();
		Card card5 = card.generateRandomCard();
		
		System.out.println("The random cards dealt are " + card1.face() + " of " + card1.suit() + ", " + card2.face() + " of " + card2.suit() + ", " + card3.face() + " of " + card3.suit() + ", " + card4.face() + " of " + card4.suit() + ", " + card5.face() + " of " + card5.suit() + ".");
	}
}
