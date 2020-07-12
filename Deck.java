package week6;

import java.util.List;


public class Deck {

	List<Card> cards;
	
	private static final String[] suits = {"Clubs", "Hearts", "Spades", "Diamonds"};
	
	private static final String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Jack", "Queen", "King", "Ace"};
	
	public Deck() {
		for(String suit : suits) {
			for(int i = 0; i < names.length; i++) {
				String name = names[i];
				String cardName = name + " of " + suit;
				int cardValue = i + 2;
				
				Card card = new Card(cardName, cardValue);
			}
		}
	}
	
	
	public void shuffle() {
		
		
	}
	
	public Card draw() {
		return null;
		
	}
	
}
