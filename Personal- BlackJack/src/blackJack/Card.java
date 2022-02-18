package blackJack;
import java.util.Scanner;
import java.util.Random;

public class Card {
	//instance variables
	private int suit = -1;
	private int rank = -1;
	
	//constructors
	public Card() {
		this.suit = 0;
		this.rank = 0;
	}
	public Card(int suit, int rank) {
		//other constructor
	}
	
	//methods
	public void play() {
		System.out.println("Play Game");
	}
	//main function
	public static void main(String[] args) {
		Card c = new Card();
		c.play();
		
		
	}
}
