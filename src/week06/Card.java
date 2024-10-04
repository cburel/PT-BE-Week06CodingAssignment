package week06;

public class Card {

  int value;
  String name;
  public Card() {}
  
  public Card(String name, int value) {
    this.name = name;
    this.value = value;
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
  public String describe() {
    return name + " of " + value ;
  }
}
