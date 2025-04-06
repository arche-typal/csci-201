package csci201.asmt16;

/*
PP 5.13 Design and implement a class called Card that represents a standard playing card. 
Each card has a suit and a face value. 
Create a program that deals five random cards. 
*/

public class Card {
	String suit;
	String face;	
	
	String suit() {
		return this.suit;
	}
	
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	String face() {
		return this.face;
	}
	
	public void setFace(String face) {
		this.face = face;
	}
	
}
