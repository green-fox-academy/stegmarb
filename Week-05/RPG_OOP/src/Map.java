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
    int preX = ((int) (Math.random() * (map[0].length - 1)));
    int preY = ((int) (Math.random() * (map.length- 1)));
    if(isItFree(preX, preY) && preX != 0 && preY != 0) {
      return coordinates = Integer.toString(preX) + ";" + Integer.toString(preY);
    } else {
      return coordinates + randomPosition();
    }
  }

  public int[] getRandomCoordinates(String s) {
    String[] parts = s.split(";");
    int[] coordinates = {Integer.parseInt(parts[0]), Integer.parseInt(parts[1])};
    return coordinates;
  }

  public int[][] getMap() {
    return map;
  }
}
