package week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck{
  List<Card> cards = new ArrayList<Card>();
  
  Deck() {
    String[] values = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
    
    for (String value : values) {
      int i = 2;
      for (String name : names) {
        Card card = new Card(name, i);
        this.cards.add(card);
        i++;
      }
    }
  }
  
  public void shuffle() {
    Collections.shuffle(this.cards);
  }
  
  public Card draw() {
    Card card = this.cards.remove(0);    
    return card;
  }
}
