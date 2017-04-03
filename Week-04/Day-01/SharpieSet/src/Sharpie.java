public class Sharpie {
  private String color;
  private double width;
  private double inkAmount;

  public Sharpie (String color, double width, double inkAmount) {
    this.color = color;
    this.width = width;
    this.inkAmount = inkAmount;
  }

  public double getValue() {
    return inkAmount;
  }

  public void use() {
    inkAmount--;
  }
}
