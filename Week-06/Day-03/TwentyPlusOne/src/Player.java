import java.util.ArrayList;
import java.util.List;

public class Player {
  private List<Card> hand = new ArrayList();
  private String name;

  public Player(String name) {
    this.name = name;
  }

  public void addCard(Card card) {
    hand.add(card);
  }

  public void pullOneFromTop(Deck deck) {
    hand.add(deck.getDeck().get(deck.getDeck().size()-1));
    deck.getDeck().remove(deck.getDeck().size()-1);
  }

  public List<Card> getHand() {
    return hand;
  }

  public int getBackValue() {
    int value = 0;
    for (Card card : hand) {
     value+=card.getRank().getRankPoints();
    }
    return value;
  }

  public void printCards() {
    System.out.println("\n" + name + "'s hand is:");
    for (int i = 0; i < hand.size(); i++) {
      System.out.println(hand.get(i).getRank() + " " + hand.get(i).getSuit());
    }
  }
}
