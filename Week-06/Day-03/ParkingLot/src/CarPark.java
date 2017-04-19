import java.util.ArrayList;
import java.util.List;

public class CarPark {
  private List<Car> cars = new ArrayList<>();

  public void fillPark(int carNumber) {
    for (int i = 0; i < carNumber; i++) {
      cars.add(new Car());
    }
  }
}
