package week6;

public class Card {
	
	private int value;
	private String name;
	
	public Card(String cardName, int cardValue) {
		// TODO Auto-generated constructor stub
	}

	public String describe() {
		return Card.class.getSimpleName() + "[name=" + name + ", value=" + value + "]";
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
