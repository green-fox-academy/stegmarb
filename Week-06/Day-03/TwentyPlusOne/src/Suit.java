public enum Suit {
  CLUBS(1), DIAMONDS(2), HEARS(3), SPADES(4);

  private int suitPoint;

  Suit(int point) {
    this.suitPoint = point;
  }

  public int getSuitPoint() {
    return suitPoint;
  }
}