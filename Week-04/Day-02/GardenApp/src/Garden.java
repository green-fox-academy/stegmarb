import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Plant> plants;

  public void addPlant(Plant p) {
    plants.add(p);
  }

  public boolean isThirsty(int t) {
      if (plants.get(t) instanceof Flower && plants.get(t).getThirst() < 5) {
        return true;
      } else if (plants.get(t) instanceof Tree && plants.get(t).getThirst() < 10) {
        return true;
      } else {
        return false;
      }
    }

  public String writeContent() {
    String print = "";
    for (int i = 0; i < plants.size(); i++) {
      print = print + ("The " + plants.get(i).getColor() + " " + plants.get(i).getName() + " " + (isThirsty(i) ? "needs" : "doesn't need") + " water.\n");
    }
    return print;
  }
  
  public void water(double waterAmount) {
    System.out.println("Watering with " + waterAmount + " water.");
    double count = 0;
    for (int i = 0; i < plants.size(); i++) {
      if (isThirsty(i)) {
        count++;
      }
    }
    for (int j = 0; j < plants.size(); j++) {
      if(isThirsty(j)) {
        double addedWater = plants.get(j).getThirst() + waterAmount/count*plants.get(j).getAbsorption();
        plants.get(j).setThirst(addedWater);
      }
    }
  }

  public Garden() {
    this.plants = new ArrayList<>();
  }

  //  This pseudo method can print the values of thirst variable.

//  public void getValues() {
//    for (int i = 0; i < plants.size() ; i++) {
//      System.out.println(plants.get(i).getThirst());
//    }
//
//  }

}


