package week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck{
  
  // create a list of cards for the deck
  List<Card> cards = new ArrayList<Card>();
  
  // constructor. init the deck
  Deck() {
    String[] values = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
    
    // add each card to the deck
    for (String value : values) {
      int i = 2;
      for (String name : names) {
        Card card = new Card(name, i);
        this.cards.add(card);
        i++;
      }
    }
  }
  
  // shuffles the deck
  public void shuffle() {
    Collections.shuffle(this.cards);
  }
  
  // draw a card from the top of the deck
  public Card draw() {
    Card card = this.cards.remove(0);    
    return card;
  }
}
