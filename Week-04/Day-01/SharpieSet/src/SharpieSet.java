import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SharpieSet {
  private List<Sharpie> sharpies = new ArrayList<>();

  public int countUsable() {
    int count = 0;
    for (int i = 0; i < sharpies.size() ; i++) {
      if (sharpies.get(i).getValue() <= 0) {
        count++;
      }
    }
    return count;
  }

  public void removeTrash() {
    for (int i = 0; i < sharpies.size(); i++) {
      if (sharpies.get(i).getValue() <= 0) {
        sharpies.remove(i);
      }
    }
  }

  public static void main(String[] args) {
    SharpieSet nevermind = new SharpieSet();
    nevermind.sharpies.add(new Sharpie("green", 15, 17));
    nevermind.sharpies.add(new Sharpie("red", 17, 0));

    System.out.println(nevermind.countUsable());
    nevermind.removeTrash();
    System.out.println(nevermind.sharpies.size());
  }
}
