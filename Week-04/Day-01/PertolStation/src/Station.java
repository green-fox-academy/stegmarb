public class Station {
  private double gasAmount;

  public void refill(Car car) {
    this.gasAmount -= car.capaciy;
    car.gasAmount += this.gasAmount;
  }

  public static void main(String[] args) {
    Station station = new Station();
    station.gasAmount = 150;
    Car car = new Car();
    station.refill(car);
    System.out.println(station.gasAmount);
  }
}
