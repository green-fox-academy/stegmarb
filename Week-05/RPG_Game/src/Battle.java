public class Battle {
  Map map = new Map();
  Board positions = new Board();
  Hero hero = new Hero();
  Skeleton skeleton = new Skeleton();
  Boss boss = new Boss();

  public void battle() {
    if (map.getMap()[positions.getRowN()][positions.getColN()] == 3) {
      boss.hp-=hero.sp+(2*hero.rollingDice());
    } else if (map.getMap()[positions.getRowN()][positions.getColN()] == 2) {
      skeleton.hp-=hero.sp+(2*hero.rollingDice());
    } else {
      return;
    }

  }
}
