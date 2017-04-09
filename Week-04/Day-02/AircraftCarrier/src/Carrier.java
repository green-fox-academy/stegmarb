import java.util.ArrayList;
import java.util.List;

public class Carrier {
  List<Aircraft> carrier = new ArrayList<>();
  int ammo;
  int healtPoint;

  public void addAircraft(Aircraft plane ) {
    carrier.add(plane);
  }

  public void printOut() {
    for (int i = 0; i < carrier.size(); i++) {
      System.out.println(carrier.get(i).getStatus());
    }
  }

  public void fill() {
    try {
    for (int i = 0; i < carrier.size(); i++) {
      if (carrier.get(i).getType().equals("F35")) {
          carrier.get(i).refill(ammo);
      }
    }
    for (int i = 0; i < carrier.size() ; i++) {
      carrier.get(i).refill(ammo);
    }
  } catch (Exception e) {
    if (ammo == 0) {
      System.out.println("There is no ammo");
    } else {
      System.out.println("Insufficient ammo");
    }
    }
  }

  public Carrier(int ammo) {
    this.ammo = ammo;
  }

  public List<Aircraft> getCarrier() {
    return carrier;
  }
}
