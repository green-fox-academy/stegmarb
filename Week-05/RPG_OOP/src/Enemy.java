public class Enemy extends Character{

  public String randomPosition() {
    String coordinates = "";
    Map map = new Map();
    int preX = ((int) (Math.random() * (map.getMap()[0].length - 2)) + 1);
    int preY = ((int) (Math.random() * (map.getMap().length- 2)) + 1);
    if(map.isItFree(preX, preY)) {
      return coordinates = Integer.toString(preX) + Integer.toString(preY);
    } else {
      return coordinates + randomPosition();
    }
  }
}
