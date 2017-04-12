public class Map {
  private int[][] map = {{0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
                         {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
                         {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                         {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
                         {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
                         {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
                         {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
                         {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
                         {0, 0, 0, 1, 0, 1, 1, 0, 0, 0}};

  public boolean isItFree(int posX, int posY) {
    if (posX >= 0 && posX < map[0].length && posY >= 0 && posY < map.length) {
      if (map[posY][posX] == 0) {
        return true;
      } else {
        return false;
      }
    } else {
        return false;
      }
    }


  public String randomPosition() {
    String coordinates = "";
    int preX = ((int) (Math.random() * (map[0].length - 2)) + 1);
    int preY = ((int) (Math.random() * (map.length- 2)) + 1);
    if(isItFree(preX, preY)) {
      return coordinates = Integer.toString(preX) + ";" + Integer.toString(preY);
    } else {
      return coordinates + randomPosition();
    }
  }
  public int[][] getMap() {
    return map;
  }
}
