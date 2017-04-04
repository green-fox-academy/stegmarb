public class Flower extends Plant {

  public Flower(String color, int thirst) {
    super(color, thirst);
    setAbsorption(0.75);
    setName("Flower");
  }
}
