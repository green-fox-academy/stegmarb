public class Flower extends Plant {
  private double absorbtion;
  private String name;


  public Flower() {
    setThirst(4);
    absorbtion = 0.75;
    setName("Flower");
  }

  public Flower(String color, int thirst) {
    super(color, thirst);
    absorbtion = 0.75;
    setName("Flower");
  }

  public double getAbsorbtion() {
    return absorbtion;
  }

  public void setAbsorbtion(double absorbtion) {
    this.absorbtion = absorbtion;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
