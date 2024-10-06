package week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck{
  
  // create a list of cards for the deck
  List<Card> cards = new ArrayList<Card>();
  
  
  enum Value {CLUBS, DIAMONDS, HEARTS, SPADES}
  enum Name {TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE}
  
  // constructor. init the deck
  Deck() {
    
    // add each card to the deck
    for (Value value : Value.values()) {
      int i = 2;
      for (Name name : Name.values()) {
        Card card = new Card(name, value);
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
