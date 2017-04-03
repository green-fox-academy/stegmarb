
public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    fleet.add(new Thing("Get milk"));
    fleet.add(new Thing("Remove the obstacles"));
    fleet.add(new Thing("Stand up", true));
    fleet.add(new Thing("Eat lunch",true));
    System.out.println(fleet);
  }
}
