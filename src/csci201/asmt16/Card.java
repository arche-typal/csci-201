package csci201.asmt16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Card {
	String suit;
	String face;	
	
	public String getSuit() {
		return this.suit;
	}
	
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public String getFace() {
		return this.face;
	}
	
	public void setFace(String face) {
		this.face = face;
	}
	
	public static Card generateRandomCard() {
		Card card = new Card();
		card.setSuit(generateRandomSuit());
		card.setFace(generateRandomFace());
		return card;
	}
	
	public static String generateRandomFace() {
		ArrayList<String> faces = new ArrayList<>(Arrays.asList("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"));
		Random rand = new Random();
        return faces.get(rand.nextInt(faces.size()));
	}
	
	public static String generateRandomSuit() {
		ArrayList<String> suits = new ArrayList<>(Arrays.asList("Hearts", "Diamonds", "Clubs", "Spades"));
		Random rand = new Random();
        return suits.get(rand.nextInt(suits.size()));
	}
}
