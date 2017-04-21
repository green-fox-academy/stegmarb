public class Game {
  public static void main(String[] args) {
    Deck deck = new Deck();
    deck.fillTheDeck();
//    System.out.println(deck);
  }

  public Card pullOneFromTop(Deck deck) {
    return deck.getDeck().get(deck.getDeck().size());
  }

  public static void
}
