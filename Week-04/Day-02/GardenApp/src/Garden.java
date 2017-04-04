import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Plant> plants;

  public void addPlant(Plant p) {
    plants.add(p);
  }

  public boolean isThirsty(int t) {
      if (plants.get(t).getName() == "Flower" && plants.get(t).getThirst() < 5) {
        return true;
      } else if (plants.get(t).getName() == "Tree" && plants.get(t).getThirst() < 10) {
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

  public Garden() {
    this.plants = new ArrayList<>();
  }

}


