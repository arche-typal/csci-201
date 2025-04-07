package csci201.asmt16;

public class CardDriver {

	public static void main(String[] args) {
		System.out.println("Hello, this program will deal five random cards.");
		
		Card card = new Card();
		
		Card card1 = card.generateRandomCard();
		Card card2 = card.generateRandomCard();
		Card card3 = card.generateRandomCard();
		Card card4 = card.generateRandomCard();
		Card card5 = card.generateRandomCard();
		
		System.out.println("The random cards dealt are:\n" 
		+ card1.face() + " of " + card1.suit() 
		+ "\n" + card2.face() + " of " + card2.suit() 
		+ "\n" + card3.face() + " of " + card3.suit() 
		+ "\n" + card4.face() + " of " + card4.suit() 
		+ "\n" + card5.face() + " of " + card5.suit());
	}
}
