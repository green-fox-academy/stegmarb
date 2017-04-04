public class Plant {
  private double thirst;
  private String color;
  private String name;
  private double absorption;

  public double getThirst() {
    return thirst;
  }

  public void setThirst(double thirst) {
    this.thirst = thirst;
  }

  public String getColor() {
    return color;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAbsorption() {
    return absorption;
  }

  public void setAbsorption(double absorption) {
    this.absorption = absorption;
  }

  public Plant(String color, int thirst) {
    this.color = color;
    this.thirst = thirst;
  }
}
