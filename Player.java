package week6;

import java.util.ArrayList;
import java.util.List;

public class Player {
	List<Card> hand = new ArrayList<>();
	int score; 
	String name;

	public Player(String name) {
		this.name = name; 
	}
	
	public String describe() {
		return null;
		
	}
	
	public Card flip() {
		return null;
	}
	
	public void draw(Deck deck) {
		
	}
	
	public void incrementScore() {
		
	}
}
