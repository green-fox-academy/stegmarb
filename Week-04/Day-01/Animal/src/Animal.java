
public class Animal {
  private int hunger;
  private int thirst;

//  public Animal() {
//    this(50,50);
//  }

  public Animal() {
    hunger = 50;
    thirst = 50;
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

  public static void main(String[] args) {
    Animal animal = new Animal();
    System.out.println(animal.thirst);
  }
}
