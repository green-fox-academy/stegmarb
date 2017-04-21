import java.util.Scanner;

public class Game {
  public static Player player = new Player("Player");
  public static Player house = new Player("House");
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String playerResponse = "";
    while (!playerResponse.equals("stop")) {
      player = new Player("Player");
      house = new Player("House");
      Deck deck = new Deck();
      deck.fillTheDeck();
      firstDraw(deck);
      house.printCards();
      player.printCards();
      System.out.println("Would you like to have one more card? (y/n)");
      playerResponse = scanner.nextLine();
      while (!playerResponse.equals("n")) {
        player.pullOneFromTop(deck);
        player.printCards();
        if (player.getBackValue() > 21) {
          System.out.println("You are going bust! House wins!");
          break;
        } else {
          System.out.println("Would you like to have one more card? (y/n)");
          playerResponse = scanner.nextLine();
        }
      }
      if (player.getBackValue() > 21) {
        System.out.println("Next round? (y/stop)");
        playerResponse = scanner.nextLine();
      } else {
          while (house.getBackValue() < 17) {
            house.pullOneFromTop(deck);
            house.printCards();
          }
          if (house.getBackValue() > 21) {
            System.out.println("The House going bust! Player wins!");
            break;
          } else if ((isBlackJack(player) && isBlackJack(house)) || house.getBackValue() == player.getBackValue() || house.getBackValue() > player.getBackValue()) {
            System.out.println("House wins!");
          } else if (house.getBackValue() < player.getBackValue()){
            System.out.println("Player wins!");
          }
          System.out.println("Next round? (y/stop)");
          playerResponse = scanner.nextLine();
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
  public static boolean isBlackJack(Player player) {
    if ((player.getHand().size() == 2 && player.getBackValue() == 21) && (player.getHand().get(0).getRank() == Rank.ACE || player.getHand().get(1).getRank() == Rank.ACE)) {
      return true;
    } else {
      return false;
    }
  }
}
