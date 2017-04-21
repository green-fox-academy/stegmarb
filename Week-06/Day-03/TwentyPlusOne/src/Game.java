import java.util.Scanner;
import java.util.SortedMap;

public class Game {
  public static Player player = new Player("Player");
  public static Player house = new Player("House");
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Deck deck = new Deck();
    deck.fillTheDeck();
    firstDraw(deck);
    house.printCards();
    player.printCards();
    System.out.println("Would you like to have one more card?");
    String playerResponde = scanner.nextLine();
    while (!playerResponde.equals("n")) {
      player.pullOneFromTop(deck);
      player.printCards();
      if (player.getBackValue() > 21) {
        System.out.println("You are going bust! House wins!");
        break;
      } else {
        System.out.println("Would you like to have one more card?");
        playerResponde = scanner.nextLine();
      }
    }
    while (house.getBackValue() < 17) {
      house.pullOneFromTop(deck);
      house.printCards();
      if (house.getBackValue() > 21) {
        System.out.println("The House going bust! You win");
        break;
      }
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
