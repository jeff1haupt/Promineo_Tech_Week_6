package week6;

import java.util.Collections;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck deck = new Deck();
		Player todd = new Player("Todd");
		Player mark = new Player("Mark");
		
		// shuffle the deck 
		deck.shuffle();
		
		// deal the cards 
		for(int i = 0; i < 52; i++) {
			if (i % 2 ==  0) { todd.draw(deck); } else { mark.draw(deck); }
		} // end deal for loop

		// flip cards and increment counter
		for(int j = 0; j < 26; j++) {
			int p1 = todd.flip().getValue();			
			int p2 = mark.flip().getValue();
			if (p1 > p2) {
				todd.incrementScore();
				System.out.println("Todd wins the flip\n");
			} else if (p1 < p2){
				mark.incrementScore();
				System.out.println("Mark wins the flip\n");
			} else {
				System.out.println("Push...\n");
			}
		} // end flip for loop
		
		if (todd.score > mark.score) {
			System.out.println("Todd WINS the game with a final score of " + todd.score + " to " + mark.score);
		} else if (mark.score > todd.score){
			System.out.println("Mark WINS the game with a final score of " + mark.score + " to " + todd.score);
		} else {
			System.out.println("The game ended in a draw with the final score: " + todd.score + " to " + mark.score);
		}

	}



}
