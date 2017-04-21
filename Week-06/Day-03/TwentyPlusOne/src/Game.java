import javax.sound.midi.Soundbank;
import java.util.Scanner;

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
    while (!playerResponde.equals("n") && playerResponde.equals("y")) {
      player.pullOneFromTop(deck);
      player.printCards();
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
