package csci201.asmt16;

public class CardDriver {

	public static void main(String[] args) {
		System.out.println("Hello, this program will deal five random cards.\n");
		
		Card card1 = Card.generateRandomCard();
		Card card2 = Card.generateRandomCard();
		Card card3 = Card.generateRandomCard();
		Card card4 = Card.generateRandomCard();
		Card card5 = Card.generateRandomCard();
		
		System.out.println("The random cards dealt are:\n" 
		+ card1.getFace() + " of " + card1.getSuit() 
		+ "\n" + card2.getFace() + " of " + card2.getSuit() 
		+ "\n" + card3.getFace() + " of " + card3.getSuit() 
		+ "\n" + card4.getFace() + " of " + card4.getSuit() 
		+ "\n" + card5.getFace() + " of " + card5.getSuit());
	}
}
