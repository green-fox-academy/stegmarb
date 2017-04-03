
public class Animal {
  private int hunger;
  private int thirst;

  public Animal() {
    hunger = 50;
    thirst = 50;
  }

  public Animal(int hunger, int thirst) {
    this.hunger = hunger;
    this.thirst = thirst;
  }

  public void eat() {
    hunger--;
  }

  public void drink() {
    thirst--;
  }

  public void play() {
    hunger++;
    thirst++;
  }

  public int getHungerValue() {
    return hunger;
  }
}
