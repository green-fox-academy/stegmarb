import java.util.List;

public class Main {
  public static void main(String[] args) {
    CarPark carPark = new CarPark();
    carPark.fillPark(256);
    carPark.fillHashMap(carPark.getCars());
    carPark.allTypesNumber(carPark.getCounter());
    System.out.println();
    carPark.allColorNumber(carPark.getCounter());

  }
  public static int reviseCounter(List<Car> cars) {
    int count = 0;
    for (int i = 0; i < cars.size(); i++) {
      if (cars.get(i).getColor() == Color.BLACK) {
        count++;
      }
    }
    return count;
  }

}
