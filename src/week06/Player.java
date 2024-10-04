package week06;

import java.util.ArrayList;
import java.util.List;

public class Player {
  List<Card> hand = new ArrayList<Card>();
  int score;
  String name;
  
  Player(){
    this.score = 0;
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
  
  public Card draw(Deck deck) {
    Card card = deck.draw();
    return card;
  }
  
  public void incrementScore() {
    this.score++;
  }
  
}
