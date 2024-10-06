package week06;

import week06.Deck.Name;
import week06.Deck.Value;

public class Card {

  Value value;
  Name name;
  
  // default constructor
  public Card() {}
  
  // constructor. create the card
  public Card(Name name, Value value) {
    this.name = name;
    this.value = value;
  }
  
  // get the value of a given card
  public Value getValue() {
    return value;
  }
  
  // get the name of a given card
  public Name getName() {
    return name;
  }
  
  // allow printing of the card
  public String describe() {
    return name + " of " + value;
  }
  
}
