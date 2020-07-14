package week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {

	List<Card> cards = new ArrayList<>();
	
	private static final String[] suits = {"Clubs", "Hearts", "Spades", "Diamonds"};
	
	private static final String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	
	public Deck() { 
		for(String suit : suits) {
			for(int i = 0; i < names.length; i++) {
				String name = names[i];
				String cardName = name + " of " + suit;
				int cardValue = i + 2;
				
				Card card = new Card(cardName, cardValue);
				cards.add(card);
			} // end inner For Loop
		}  // end outer For Loop

	} // end public Deck()
	
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		return cards.remove(0);
		
	}
	
}
