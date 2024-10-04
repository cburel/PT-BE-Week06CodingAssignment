package week06;

public class Card {

  int value;
  String name;
  public Card() {}
  
  // constructor. create the card
  public Card(String name, int value) {
    this.name = name;
    this.value = value;
  }
  
  // get the value of a given card
  public int getValue() {
    return value;
  }
  
  // get the name of a given card
  public String getName() {
    return name;
  }
  
  // allow printing of the card
  public String describe() {
    return name + " of " + value ;
  }
}
