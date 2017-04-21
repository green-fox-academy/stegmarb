import java.util.ArrayList;
import java.util.List;

public class Player {
  private List<Card> hand = new ArrayList();

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
}
