
public class Sharpie {
  private String color;
  private double width;
  private double inkAmount;

  public Sharpie (String color, double width) {
    this.color = color;
    this.width = width;
    inkAmount = 100;
  }

  public void use() {
    inkAmount--;
  }

  public static void main(String[] args) {
    Sharpie sharpie = new Sharpie("green", 13.5);
    for (int i = 0; i < 45; i++) {
      sharpie.use();
    }

    System.out.println(sharpie.inkAmount);
  }
}
