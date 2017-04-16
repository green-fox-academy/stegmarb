public class Main {
  public static void main(String[] args) {
    Carrier ship = new Carrier(300);
    ship.addAircraft(new F16());
    ship.addAircraft(new F35());
    ship.addAircraft(new F35());
    ship.addAircraft(new F16());
    ship.addAircraft(new F35());
    ship.fill();
    ship.carrierStatus();
    ship.printOut();

  }
}
