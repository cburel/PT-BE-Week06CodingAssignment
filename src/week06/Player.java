package week06;

import java.util.ArrayList;
import java.util.List;

public class Player {
  List<Card> hand = new ArrayList<Card>();
  int score;
  String name;
  
  Player(String name){
    this.name = name;
    this.score = 0;
  }

  public String getName() {
    return name;
  }
  
  public int getScore() {
    return score;
  }
  
  public void describe(List<Card> hand) {
    System.out.println(name + " :");
    for (Card card : hand) {
      System.out.println(card);
    }
  }
  
  public Card flip() {
    Card card = this.hand.remove(0);    
    return card;
  }
  
  public void draw(Deck deck) {
    Card card = deck.draw();
    this.hand.add(card);
  }
  
  public void incrementScore() {
    this.score++;
  } 
}
