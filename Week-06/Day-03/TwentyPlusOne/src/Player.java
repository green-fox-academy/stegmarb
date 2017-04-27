import java.util.ArrayList;
import java.util.List;

public class Player {
  private List<Card> hand = new ArrayList();
  private String name;

  public Player(String name) {
    this.name = name;
  }

  public void pullOneFromTop(Deck deck) {
    hand.add(deck.getDeck().get(deck.getDeck().size()-1));
    deck.getDeck().remove(deck.getDeck().size()-1);
  }

  public List<Card> getHand() {
    return hand;
  }

  public int getBackValue() {
    int aceCounter = 0;
    int value = 0;
    for (Card card : hand) {
      if (card.getRank() == Rank.ACE) {
        aceCounter++;
      }
      value += card.getRank().getRankPoints();
    }
    if (value > 21 && aceCounter != 0) {
      return value - (aceCounter * 10);
    } else {
      return value;
    }
  }

  public void printCards() {
    System.out.println("\n" + name + "'s hand is:" + getBackValue());
    for (int i = 0; i < hand.size(); i++) {
      System.out.println(hand.get(i).getRank() + " of " + hand.get(i).getSuit());
    }
  }
}
