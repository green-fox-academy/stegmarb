public class Map {
  private int[][] map = {{0,0,0,1,0,1,0,0,0,0},
          {0,0,0,1,0,1,0,1,1,0},
          {0,1,1,1,0,1,0,1,1,0},
          {0,0,0,0,0,1,0,0,0,0},
          {1,1,1,1,0,1,1,1,1,0},
          {0,1,0,1,0,0,0,0,1,0},
          {0,1,0,1,0,1,1,0,1,0},
          {0,0,0,0,0,1,1,0,1,0},
          {0,1,1,1,0,0,0,0,1,0},
          {0,0,0,1,0,1,1,0,1,0},
          {0,1,0,1,0,1,0,0,0,0}};

  public void skeletonDrop() {
    int skeletonX = 4;
    int skeletonY = 0;
    while (map[skeletonX][skeletonY] != 0 && map[skeletonX][skeletonY] != 2) {
      skeletonX = ((int) (Math.random() * (map[0].length - 2))+1);
      skeletonY = ((int) (Math.random() * (map.length - 2))+1);
    }
    map[skeletonX][skeletonY] = 2;
  }

  public void skeletonSpawn() {
    skeletonDrop();
    skeletonDrop();
    skeletonDrop();
  }

  public void boosDrop() {
    int bossX = 4;
    int bossY = 0;
    while (map[bossX][bossY] != 0 && map[bossX][bossY] != 2) {
      bossX = ((int) (Math.random() * (map[0].length - 2))+1);
      bossY = ((int) (Math.random() * (map.length - 2))+1);
    }
    map[bossX][bossY] = 3;
  }

  public int[][] getMap() {
    return map;
  }
}
