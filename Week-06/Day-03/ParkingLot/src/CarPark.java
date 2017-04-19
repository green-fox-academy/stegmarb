import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CarPark {
  private List<Car> cars = new ArrayList<>();
  private HashMap<Enum, Integer> counter = new HashMap<>();

  public void fillPark(int carNumber) {
    for (int i = 0; i < carNumber; i++) {
      cars.add(new Car());
    }
  }

  public void fillHashMap(List<Car> cars) {
    for (Car car : cars) {
      if (counter.containsKey(car.getType())) {
        counter.put(car.getType(), counter.get(car.getType()) + 1);
      }  else {
        counter.put(car.getType(), 1);
      }
      if (counter.containsKey(car.getColor())) {
        counter.put(car.getColor(), counter.get(car.getColor()) + 1);
      } else {
      counter.put(car.getColor(), 1);
      }
    }
  }

  public List<Car> getCars() {
    return cars;
  }

  public HashMap<Enum, Integer> getCounter() {
    return counter;
  }
}
