import java.util.ArrayList;
import java.util.List;

public class Farm {
  private List<Animal> animals = new ArrayList();
  private int slots = 3;

  public void breed() {
    if (animals.size() < slots) {
      for (int i = 0; i < (slots - animals.size())+ animals.size(); i++) {
        animals.add(new Animal());
      }
    }
  }

  public void slaughter() {
    int position = 0;
    int countHunger = 0;
    for (int i = 0; i < animals.size(); i++) {
      if (animals.get(i).getHungerValue() > countHunger) {
        countHunger = animals.get(i).getHungerValue();
        position = i;
      }
    }
    animals.remove(position);
  }

  public static void main(String[] args) {
    Farm littleFarm = new Farm();
    littleFarm.animals.add(new Animal(25,15));
    littleFarm.animals.add(new Animal(42,15));
    littleFarm.animals.add(new Animal(15,15));
    littleFarm.slaughter();
    littleFarm.breed();

    System.out.println(littleFarm.animals.get(1).getHungerValue());
  }
}