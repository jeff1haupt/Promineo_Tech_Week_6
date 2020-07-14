package week6;

import java.util.ArrayList;
import java.util.List;

public class Player {
	List<Card> hand = new ArrayList<>();
	int score = 0; 
	String name;

	public Player(String name) {
		this.name = name; 
	}
	
	public String describe() {
		StringBuilder playerDescribe = new StringBuilder(); 
		
		playerDescribe
			.append("Player's name: \n").append(name + "\n\n")
			.append("Player's hand: \n");
		
		for(Card card : hand) {
			playerDescribe.append(card.describe() + "\n");
		}
		return playerDescribe.toString();
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		score++;
	}
}
