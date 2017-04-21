import java.util.Scanner;

public class Game {
  public static Player player = new Player();
  public static Player house = new Player();
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Deck deck = new Deck();
    deck.fillTheDeck();
    firstDraw(deck);
    System.out.println("House's hand is:");
    System.out.println("Hidden");
    System.out.println(house.getHand().get(1).getRank().toString() + " " + house.getHand().get(1).getSuit() + "\n");
    System.out.println("Your hand is:");
    System.out.println(player.getHand().get(0).getRank().toString() + " " + player.getHand().get(0).getSuit());
    System.out.println(player.getHand().get(1).getRank().toString() + " " + player.getHand().get(1).getSuit());
    if (scanner.equals("y")) {

    }
  }

  public static void firstDraw(Deck deck) {
    for (int i = 0; i < 4; i++) {
      if (i%2 == 0) {
        player.pullOneFromTop(deck);
      } else {
        house.pullOneFromTop(deck);
      }
    }
  }
}
