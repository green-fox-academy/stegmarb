public enum Color {
  BLACK(1), RED(2);

  private int colorPoint;

  Color(int point) {
    this.colorPoint = point;
  }

  public int getColorPoint() {
    return colorPoint;
  }
}