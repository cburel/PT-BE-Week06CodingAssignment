package week06;

import java.util.ArrayList;
import java.util.List;

public class Player {
  
  // initialization
  List<Card> hand = new ArrayList<Card>();
  int score;
  String name;
  
  // constructor. initialize with given name and set score to 0
  Player(String name){
    this.name = name;
    this.score = 0;
  }

  // get the player's name
  public String getName() {
    return name;
  }
  
  // get the player's score
  public int getScore() {
    return score;
  }
  
  // print the player's hand
  public void describe(List<Card> hand) {
    System.out.println(name + " :");
    for (Card card : hand) {
      System.out.println(card);
    }
  }
  
  // get and remove the card at the front of the player's hand
  public Card flip() {
    Card card = this.hand.remove(0);    
    return card;
  }
  
  // draw a card from the deck and add it to the player's hand
  public void draw(Deck deck) {
    Card card = deck.draw();
    this.hand.add(card);
  }
  
  
  // add 1 to the player's score
  public void incrementScore() {
    this.score++;
  } 
}
