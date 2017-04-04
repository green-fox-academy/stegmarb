public class Plant {
  private int thirst;
  private String color;
  private String name;

  public Plant() {
    this.thirst = 3;
    color = "blue";
  }

  public Plant(String color, int thirst) {
    this.color = color;
    this.thirst = thirst;
  }

  public int getThirst() {
    return thirst;
  }

  public void setThirst(int thirst) {
    this.thirst = thirst;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
