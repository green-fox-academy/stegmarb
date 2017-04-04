import java.util.ArrayList;
import java.util.List;

public class Demonstration {
  public static void main(String[] args) {
    Garden garden = new Garden();
    garden.addPlant(new Flower("yellow", 2));
    garden.addPlant(new Flower("blue", 3));
    garden.addPlant(new Tree("purple", 7));
    garden.addPlant(new Tree("orange", 8));


    System.out.println(garden.writeContent());
    garden.water(40);
    System.out.println(garden.writeContent());
    garden.water(70);
    System.out.println(garden.writeContent());
  }
}
