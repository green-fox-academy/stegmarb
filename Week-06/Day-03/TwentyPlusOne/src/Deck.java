import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
  private List<Card> deck = new ArrayList<>();
  private Suit[] suits = Suit.values();
  private Rank[] ranks = Rank.values();

  public void fillTheDeck() {
    for (int i = 0; i < suits.length ; i++) {
      for (int j = 0; j < ranks.length; j++) {
        deck.add(new Card(suits[i], ranks[j]));
      }
    }
    Collections.shuffle(deck);
  }

  public String toString() {
    String out = "";
    for (Card card : deck) {
      out += card.getRank().toString() + " of " +card.getSuit().toString() + "\n";
    }
    return out;
  }
  public List<Card> getDeck() {
    return deck;
  }
}
