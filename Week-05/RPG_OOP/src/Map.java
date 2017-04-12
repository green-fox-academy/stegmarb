public class Map {
  private static int[][] map = {{0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
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
    return (map[posX][posY] == 0);
  }

  public String randomPosition() {
    String coordinates = "";
    int preX = ((int) (Math.random() * (map[0].length - 2)) + 1);
    int preY = ((int) (Math.random() * (map.length- 2)) + 1);
    if(isItFree(preX, preY)) {
      return coordinates = Integer.toString(preX) + Integer.toString(preY);
    } else {
      return coordinates + randomPosition();
    }
  }

  public int[][] getMap() {
    return map;
  }
}
