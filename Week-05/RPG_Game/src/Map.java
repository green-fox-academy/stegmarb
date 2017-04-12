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
          {0, 0, 0, 1, 0, 1, 1, 0, 1, 0},
          {0, 1, 0, 1, 0, 1, 0, 0, 0, 0}};

  public void skeletonDrop() {
    int skeletonX = 4;
    int skeletonY = 0;
    while (map[skeletonX][skeletonY] != 0) {
      skeletonX = ((int) (Math.random() * (map[0].length - 2)) + 1);
      skeletonY = ((int) (Math.random() * (map.length - 2)) + 1);
    }
    map[skeletonX][skeletonY] = 2;
  }

  public void threeSkeletonSpawn() {
    skeletonDrop();
    skeletonDrop();
    skeletonDrop();

  }

  public void boosDrop() {
    int bossX = 4;
    int bossY = 0;
    while (map[bossX][bossY] != 0) {
      bossX = ((int) (Math.random() * (map[0].length - 2)) + 1);
      bossY = ((int) (Math.random() * (map.length - 2)) + 1);
    }
    map[bossX][bossY] = 3;
  }

//  public void enemyMoving() {
//    for (int i = 0; i < map.length; i++) {
//      for (int j = 0; j < map[i].length; j++) {
//        if (map[i][j] == 2) {
//          if (map[i - 1][j] == 0 && i - 1 >= 0) {
//            map[i - 1][j] = 2;
//          } else {
//            if (map[i][j + 1] == 0 && j + 1 < map[0].length) {
//              map[i][j + 1] = 2;
//            } else {
//              if (map[i + 1][j] == 0 && i + 1 < map.length) {
//                map[i + 1][j] = 2;
//              } else {
//                map[i][j - 1] = 2;
//              }
//            }
//          }
//        }
//        map[i][j] = 0;
//      }
//    }
//  }

  public int[][] getMap() {
    return map;
  }
}
