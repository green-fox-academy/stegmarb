import java.util.List;

public class Main {
  public static void main(String[] args) {
    CarPark carPark = new CarPark();
    carPark.fillPark(256);
    carPark.fillHashMap(carPark.getCars());
    System.out.println(carPark.getCounter().get(Color.BLACK));


  }

}
