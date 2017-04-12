public class Skeleton extends Character {
  public Skeleton() {
    level = 2;
    maxHp = 2 * level *rollingDice();
    hp = maxHp;
    dp = level/2 * rollingDice();
    sp = level * rollingDice();
    name = "Skeleton";
  }
}
