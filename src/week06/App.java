package week06;

public class App {

  public static void main(String[] args) {
    
    // initialize classes
    Deck deck = new Deck();
    Player playerOne = new Player("Bob");
    Player playerTwo = new Player("Sally");
    
    // shuffle the deck
    deck.shuffle();
    
    // draw the deck between two players
    for (int i = 0; i < 52 / 2; i++) {
      playerOne.draw(deck);
      playerTwo.draw(deck);
    }
    
    // play the game! compare values and award a point to whoever's is higher, or print a draw message
    for (int i = 0; i < 26 / 2; i++) {
      Card cardOne = playerOne.flip();
      System.out.println(playerOne.getName() + " drew the " + cardOne.describe());
      Card cardTwo = playerTwo.flip();
      System.out.println(playerTwo.getName() + " drew the " + cardTwo.describe());
      cardTwo.describe();
      if (cardOne.getName().compareTo(cardTwo.getName()) > 0) {
        playerOne.incrementScore();
        System.out.println(playerOne.getName() + " +1! Score: " + playerOne.getScore());
      }
      else if (cardOne.getName().compareTo(cardTwo.getName()) < 0) {
        playerTwo.incrementScore();
        System.out.println(playerTwo.getName() + " +1! Score: " + playerTwo.getScore());
      }
      else {
        System.out.println("Tie! No point was awarded.");
      }
    }
    
    // compare final scores
    int playerOneFinalScore = playerOne.getScore();
    int playerTwoFinalScore = playerTwo.getScore();

    // print final scores and declare the winner, if any
    System.out.println("---------------------");
    System.out.println(playerOne.getName() + "'s final score: " + playerOne.getScore());
    System.out.println(playerTwo.getName() + "'s final score: " + playerTwo.getScore());
    if (playerOneFinalScore > playerTwoFinalScore) {
      System.out.println(playerOne.getName() + " wins!");
    }
    else if (playerOneFinalScore < playerTwoFinalScore) {
      System.out.println(playerTwo.getName() + " wins!");
    }
    else {
      System.out.println("It's a draw!");
    }
    
  }
}
