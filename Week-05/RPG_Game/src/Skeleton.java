public class Skeleton extends Character {
  public Skeleton() {
    hp = 2 * level *rollingDice();
    dp = level/2 * rollingDice();
    sp = level * rollingDice();
  }
}
